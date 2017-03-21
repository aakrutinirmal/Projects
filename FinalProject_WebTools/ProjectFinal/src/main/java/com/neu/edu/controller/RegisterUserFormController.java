package com.neu.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.edu.DAO.CourseDAO;
import com.neu.edu.DAO.UserAccountDAO;
import com.neu.edu.pojo.Professor;
import com.neu.edu.pojo.Student;
import com.neu.edu.pojo.UserAccount;



@Controller
@RequestMapping("/registerUser.htm")
public class RegisterUserFormController {
	@Autowired
	@Qualifier("enrollValidator")
	EnrollValidator validator;

	@Autowired
    @Qualifier("userAccountDao")
    UserAccountDAO userAccountDao;
    
	
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping(method = RequestMethod.POST)
	protected String doSubmitAction(@ModelAttribute("userAccount") UserAccount userAccount, BindingResult result) throws Exception {
		validator.validate(userAccount, result);
		if (result.hasErrors()) {
			return "home";
		
		}
		

		try {
			System.out.print("Inside Register User ");
		//	UserAccountDAO userAccountDao = new UserAccountDAO();
			
			System.out.println("test1");
			
			String username = userAccount.getUsername(); 
			String role=userAccount.getRole();
			
			UserAccount userAcc=userAccountDao.get(username);
			
			
			System.out.println("test2");
			
			//if(!username.equals(userAcc.getUsername())){
				System.out.print("Username NOT registered !!");
				if(role.equalsIgnoreCase("student")){
					
					userAccountDao.createStudent(userAccount.getFirstName(),userAccount.getLastName(),userAccount.getUsername(),userAccount.getPassword(),userAccount.getEmailId(),userAccount.getRole() );
				}
				else if(role.equalsIgnoreCase("professor")){
				
					userAccountDao.createProf(userAccount.getFirstName(),userAccount.getLastName(),userAccount.getUsername(),userAccount.getPassword(),userAccount.getEmailId(),userAccount.getRole());
				}
			
		
		//	}
			
//			else {
//				System.out.print("Username ALREADY registered!!");
//				return "Error";
//				
//			}
//			
		
			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}

		System.out.print("User Registered  ");
		
		return "home";
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public String initializeForm(@ModelAttribute("userAccount") UserAccount user, BindingResult result) {

		return "home";
		
	}
	
	
	
}
