package com.ibm.ivia.config.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.ivia.config.model.ConfigValidator;
import com.ibm.ivia.config.model.IviaopConf;
import com.ibm.ivia.config.model.RPConf;
import com.ibm.ivia.config.model.ReverseProxyConf;

/**
 * @author lee_vettleson
 *
 */
@Controller
public class rpController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	private ConfigValidator confvalidator = new ConfigValidator();

	/**
	 * Handles the request to display the form.
	 * @param m spring-injected model object that gets filled and sent to the view
	 * @return the view to display
	 */
	@RequestMapping(value="/rpform", method=RequestMethod.GET)
	public String getForm(Model m) {
		log.info("Calling ldapconfpage()");
		// lets add a user object to the model so the form can fill it
		m.addAttribute("rpConf", new RPConf());
		m.addAttribute("rplconf", new ReverseProxyConf());
		return "rp";
	}
	
	
	@RequestMapping(value="/rpform", method=RequestMethod.POST)
	public String commonConf(@ModelAttribute("ldapConf") ReverseProxyConf rplconf, BindingResult result, Model m,HttpServletRequest request) {
		log.info("Calling ldapConf()");
   	 HttpSession session = request.getSession();

		
	
	    rplconf.setRpConf(((List<RPConf>)session.getAttribute("listObj"))); 

	    if(null!= rplconf.getDeleteRp() && "Delete".equals(rplconf.getDeleteRp())) {
		    	List <RPConf> objectList =rplconf.getRpConf();
		    	objectList.remove(objectList.size()-1);	    
			    session.setAttribute("rplconf", rplconf);
		    	m.addAttribute("rpConf", new RPConf());
				m.addAttribute("rplconf", new ReverseProxyConf());
				return "rp";

			}else {
			    session.setAttribute("rplconf", rplconf);
			    
				log.info("rplconf "+((ReverseProxyConf)session.getAttribute("rplconf")).toString());
				m.addAttribute("iviaconf", new IviaopConf());
				return "iviaop";
				
			}	    
	
	}
	
	@RequestMapping(value="/addRP", method=RequestMethod.POST)
	public String addReveseProxr(@ModelAttribute("rpConf") RPConf conf, BindingResult result, Model m,HttpServletRequest request) {
		log.info("Calling ldapConf()");
		 HttpSession session = request.getSession();
		 List<RPConf> listObj=( List<RPConf>)session.getAttribute("listObj");	
		 
			/*
			 * confvalidator.rpValidate(conf, listObj,result); if (result.hasErrors()) { //
			 * error occured, lets send them back to the form to re-enter their information
			 * m.addAttribute("rplconf", new ReverseProxyConf()); return "rp"; }
			 */
		 	 
		if(listObj==null || listObj.size()==0 ) {
			listObj=new ArrayList<RPConf>();
			listObj.add(conf);
		    session.setAttribute("listObj", listObj);
		}else {	
		    listObj.add(conf);
		    session.setAttribute("listObj", listObj);
		}
		//confvalidator.validate(conf, result);
		//if (result.hasErrors()) {
			// error occured, lets send them back to the form to re-enter their information
		//	return "commonconfpage";
		//}
		
		log.info("listObj "+((List<RPConf>)session.getAttribute("listObj")).toString());
		m.addAttribute("rpConf", new RPConf());
		m.addAttribute("rplconf", new ReverseProxyConf());
		return "rp";
	}
}
