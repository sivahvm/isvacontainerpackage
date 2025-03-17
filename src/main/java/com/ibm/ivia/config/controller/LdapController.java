package com.ibm.ivia.config.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.ivia.config.model.ConfigValidator;
import com.ibm.ivia.config.model.DBConfig;
import com.ibm.ivia.config.model.EnvConfig;
import com.ibm.ivia.config.model.LdapConf;
import com.ibm.ivia.config.user.UserValidator;

/**
 * @author lee_vettleson
 *
 */
@Controller
public class LdapController {
	private final Logger log = LoggerFactory.getLogger(getClass());
	private ConfigValidator confvalidator = new ConfigValidator();

	
	/**
	 * Handles the request to display the form.
	 * @param m spring-injected model object that gets filled and sent to the view
	 * @return the view to display
	 */
	@RequestMapping(value="/ldapform", method=RequestMethod.GET)
	public String getForm(Model m) {
		log.info("Calling ldapconfpage()");
		// lets add a user object to the model so the form can fill it
		m.addAttribute("ldapConf", new LdapConf());
		return "ldapconfpage";
	}
	
	
	@RequestMapping(value="/ldapform", method=RequestMethod.POST)
	public String commonConf(@ModelAttribute("ldapConf") LdapConf conf, BindingResult result, Model m,HttpServletRequest request) {
		log.info("Calling ldapConf()");
		 HttpSession session = request.getSession();
	    session.setAttribute("ldapConf", conf);
		confvalidator.validateLdap(conf, result);
		if (result.hasErrors()) {
			//\\ error occured, lets send them back to the form to re-enter their information
			return "ldapconfpage";
		}
		
		log.info("ldapConf "+((LdapConf)session.getAttribute("ldapConf")).toString());
		m.addAttribute("dbConf", new DBConfig());

		return "dbconfpage";
	}
}
