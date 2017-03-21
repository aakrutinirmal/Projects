package com.neu.edu.controller;

import org.springframework.validation.Validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.neu.edu.pojo.UserAccount;



public class UserValidator implements Validator{

	 public boolean supports(Class aClass)
	    {
	        return aClass.equals(UserAccount.class);
	    }

	    public void validate(Object obj, Errors errors)
	    {
	    	UserAccount userAccount = (UserAccount) obj;
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.invalid.user", "User Name Required");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
//	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.invalid.user", "First Name Required");
//	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.invalid.user", "Last Name Required");
//	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "error.invalid.user", "Email Id Required");
//	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "error.invalid.role.role", "Role Required");
	    }
}
