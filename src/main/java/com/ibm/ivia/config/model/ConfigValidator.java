/*
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Lesser General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Lesser General Public License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2013 eewiki.net
 */
package com.ibm.ivia.config.model;

import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Spring validator for our User object. It looks for any missing information.
 * 
 * @author lee_vettleson
 * 
 */
public class ConfigValidator implements Validator {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	public boolean supports(Class<?> clazz) {
		return EnvConfig.class.isAssignableFrom(clazz);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#validate(java.lang.Object,
	 * org.springframework.validation.Errors)
	 */
	public void validate(Object target, Errors errors) {
		
		// Spring uses a little magic here to check the target for its specific attributes.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lmiIp", "field.required", "LMI IP address field cannot be empty");
	}
	
public void validateLdap(Object target, Errors errors) {
		
		// Spring uses a little magic here to check the target for its specific attributes.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ldapDomain", "field.required", "Ldap Domain Name  field cannot be empty");
		

	}
public void rpValidate(Object target,List<RPConf> listObj, Errors errors) {
	
	// Spring uses a little magic here to check the target for its specific attributes.
	RPConf reqBean=(RPConf)target;
	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rpIp", "field.required", "Web Reverse Proxy IP address field cannot be empty");
if(null!=listObj && listObj.size()!=0) {
	for (RPConf rpConf : listObj) {
		System.out.println("Session:::::::"+rpConf.toString());
		System.out.println("B:::::::"+reqBean.toString());

		if(rpConf.getRpIp().equals(reqBean.getRpIp())) {
			ValidationUtils.invokeValidator(null, listObj, errors);
			
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rpIp", "field.duplicate", "Web Reverse Proxy IP address already added");

		}else if(rpConf.getRpInstanceName().equals(reqBean.getRpInstanceName())) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rpInstanceName", "field.duplicate", "Instance name already added");

		}else if(rpConf.getRphostname().equals(reqBean.getRphostname())) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rphostname", "field.duplicate", "rphostname name already added");

		}else if(rpConf.getRppodlabel().equals(reqBean.getRppodlabel())) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rppodlabel", "field.duplicate", "rppodlabel name already added");

		}
	}
	}
	

}




	

}
