package com.ibm.ivia.config.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.ivia.config.model.ConfigValidator;
import com.ibm.ivia.config.model.EnvConfig;
import com.ibm.ivia.config.model.LdapConf;
import com.ibm.ivia.config.process.FileProcessing;
import com.ibm.ivia.config.user.UserValidator;

/**
 * @author lee_vettleson
 *
 */
@Controller
public class RequestHandler {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	private Validator validator = new UserValidator();
	private ConfigValidator confvalidator = new ConfigValidator();
	private static final int BUFFER_SIZE = 4096;

@Autowired
FileProcessing fileupdate;


@Value("${iviaapp.docker.zipLPath}")
private String dockerZipPath;

@Value("${iviaapp.docker.output}")
private String dockeroutput;
	/**
	 * Handles the request to display the form.
	 * @param m spring-injected model object that gets filled and sent to the view
	 * @return the view to display
	 */
	@RequestMapping(value="/getform", method=RequestMethod.GET)
	public String getForm(Model m) {
		log.info("Calling commonconfpage()");
		// lets add a user object to the model so the form can fill it
		m.addAttribute("envConfig", new EnvConfig());		

		return "commonconfpage";
	}
	
	/**
	 * Process the form submission.
	 * 
	 * @param u user object that was filled out on the form page
	 * @param result handles error messages to send back to the view, if necessary
	 * @param m spring-injected model object that gets filled and sent togenConf the view
	 * @return the view to display
	 */
	@RequestMapping(value="/getform", method=RequestMethod.POST)
	public String commonConf(@ModelAttribute("envConfig") EnvConfig conf, BindingResult result, Model m,HttpServletRequest request) {
		log.info("Calling commonConf()");
		 HttpSession session = request.getSession();
	    session.setAttribute("genConf", conf);
		confvalidator.validate(conf, result);
		if (result.hasErrors()) {
			// error occured, lets send them back to the form to re-enter their information
			return "commonconfpage";
		}
		
		log.info("General Conf"+((EnvConfig)session.getAttribute("genConf")).toString());

		
		//m.addAttribute("status", "Your submission was a success!");
		m.addAttribute("ldapConf", new LdapConf());

		return "ldapconfpage";
	}
	
	@RequestMapping(value="/createConfig", method=RequestMethod.GET)
	public void createConfig(Model m,HttpSession sesion,HttpServletRequest request,            HttpServletResponse response) throws Exception {
		log.info("Update env File commonconfpage()");
		fileupdate.updateEnvFileData(sesion);		
		fileupdate.writetoConfFile(sesion);	
		String currentDate=getCurrentTime();

		Path sourcepath = (Path)Paths.get(dockeroutput);
		String dockerZipName=dockerZipPath+"ivia_container_deploy_script_"+currentDate+".zip";
		Path destpath = (Path)Paths.get(dockerZipName);
		fileupdate.zipFolder(sourcepath,destpath);	
        File downloadFile = new File(dockerZipName);
        FileInputStream inputStream = new FileInputStream(downloadFile);
         
        // get MIME type of the file
        String mimeType = null;
        if (mimeType == null) {
            // set to binary type if MIME mapping not found
            mimeType = "application/octet-stream";
        }
        System.out.println("MIME type: " + mimeType);
 
        // set content attributes for the response
        response.setContentType(mimeType);
        response.setContentLength((int) downloadFile.length());
 
        // set headers for the response
        String headerKey = "Content-Disposition";
        String headerValue = String.format("attachment; filename=\"%s\"",
                downloadFile.getName());
        response.setHeader(headerKey, headerValue);
 
        // get output stream of the response
        OutputStream outStream = response.getOutputStream();
 
        byte[] buffer = new byte[BUFFER_SIZE];
        int bytesRead = -1;
 
        // write bytes read from the input stream into the output stream
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outStream.write(buffer, 0, bytesRead);
        }
 
        inputStream.close();
        outStream.close();
	
	
	}
	
	private String getCurrentTime() {
		SimpleDateFormat ft     = new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss"); 

    String str = ft.format(new Date()); 

    // Printing the formatted date 
    System.out.println("Formatted Date : " + str);
    return str;
	}
    
	
}
