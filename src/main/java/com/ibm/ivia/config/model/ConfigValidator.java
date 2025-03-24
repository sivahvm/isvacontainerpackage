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
		return RequestConfig.class.isAssignableFrom(clazz);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.validation.Validator#validate(java.lang.Object,
	 * org.springframework.validation.Errors)
	 */
	public void validate(Object target, Errors errors) {
		
		// Spring uses a little magic here to check the target for its specific attributes.
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ipaddress", "field.required", "LMI IP address field cannot be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "host",  "field.required", "Persistent Volume label  field cannot be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "repoUrl",  "field.required", "containerType field cannot be empty");

	}
	
public void validateLmi(Object target, Errors errors) {
		
		// Spring uses a little magic here to check the target for its specific attributes.
		/*
		 * ValidationUtils.rejectIfEmptyOrWhitespace(errors, "ipaddress",
		 * "field.required", "*"); ValidationUtils.rejectIfEmptyOrWhitespace(errors,
		 * "hostname", "field.required", "*");
		 * ValidationUtils.rejectIfEmptyOrWhitespace(errors, "repoUrl",
		 * "field.required", "*"); ValidationUtils.rejectIfEmptyOrWhitespace(errors,
		 * "imageVersion", "field.required", "*");
		 * ValidationUtils.rejectIfEmptyOrWhitespace(errors, "network",
		 * "field.required", "*");
		 */
		


	}
	

}
