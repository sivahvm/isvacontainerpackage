package com.ibm.ivia.config.controller;

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

import com.ibm.ivia.config.model.IviaopConf;
import com.ibm.ivia.config.model.RPConf;

/**
 * @author lee_vettleson
 *
 */
@Controller
public class iviaopController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	/**
	 * Handles the request to display the form.
	 * @param m spring-injected model object that gets filled and sent to the view
	 * @return the view to display
	 */
	@RequestMapping(value="/iviaop", method=RequestMethod.GET)
	public String getForm(Model m) {
		log.info("Calling ldapconfpage()");
		// lets add a user object to the model so the form can fill it
		m.addAttribute("iviaconf", new IviaopConf());
		return "iviaop";
	}
	
	
	@RequestMapping(value="/iviaop", method=RequestMethod.POST)
	public String commonConf(@ModelAttribute("iviaconf") IviaopConf conf, BindingResult result, Model m,HttpServletRequest request) {
		log.info("Calling iviaconf()");
		 HttpSession session = request.getSession();
	    session.setAttribute("iviaconf", conf);
		//confvalidator.validate(conf, result);
		//if (result.hasErrors()) {
			// error occured, lets send them back to the form to re-enter their information
		//	return "commonconfpage";
		//}
		
		log.info("ldapConf "+((IviaopConf)session.getAttribute("iviaconf")).toString());

		return "result";
	}
}
