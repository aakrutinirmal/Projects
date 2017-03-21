package com.neu.edu.controller;

import org.springframework.validation.Validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.neu.edu.pojo.Course;


public class CourseValidator implements Validator{
	 public boolean supports(Class aClass)
	    {
	        return aClass.equals(Course.class);
	    }

	    public void validate(Object obj, Errors errors)
	    {
	    	Course course = (Course) obj;
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "courseName", "error.invalid.courseName", "courseName Required");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "courseDescription", "error.invalid.courseDescription", "courseDescription Required");
	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "creditHour", "error.invalid.creditHour", "creditHour Required");
//	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.invalid.user", "Last Name Required");
//	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "error.invalid.user", "Email Id Required");
//	        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "error.invalid.role.role", "Role Required");
	    }
}
