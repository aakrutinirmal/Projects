package com.neu.edu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.edu.DAO.UserAccountDAO;
import com.neu.edu.pojo.Professor;
import com.neu.edu.pojo.Student;
import com.neu.edu.pojo.UserAccount;

@Controller
@RequestMapping("/loginUser.htm")
public class LoginController {
	    @Autowired
		@Qualifier("userValidator")
		UserValidator validator;

	    @Autowired
	    @Qualifier("userAccountDao")
	    UserAccountDAO userAccountDao;
	    
	    
		@InitBinder
		private void initBinder(WebDataBinder binder) {
			binder.setValidator(validator);
		}

		@RequestMapping(method = RequestMethod.POST)
		protected String doSubmitAction(@ModelAttribute("userAccount") UserAccount userAccount, BindingResult result,HttpServletRequest req, HttpServletResponse resp) throws Exception {
			System.out.println("Inside Login ");
			validator.validate(userAccount, result);
			if (result.hasErrors()) {
				System.out.println("has error ");
			return "home";
			
			}
			System.out.println("Inside Login 1 ");
			 String flag="";
			 try {	
		
			
			 String username = userAccount.getUsername(); 
			
		//	UserAccountDAO users = new UserAccountDAO();
				
			UserAccount userAcc=userAccountDao.get(username);
			req.getSession().setAttribute("user",userAcc);
			   System.out.println("3 " + userAcc.getUserId());		   
			   
				 if(userAcc.getUsername().equals(username)){
				
					 
				//	 System.out.println("User exists" +session.getAttribute("user"));
				
			
					 if(userAcc.getRole().equalsIgnoreCase("STUDENT")){
						 System.out.println("Student Login");
						
						 
						 flag="student";
					 }
					 else if(userAcc.getRole().equalsIgnoreCase("PROFESSOR")){
						 System.out.println("Professor Login"); 
						 
						 flag="professor";
						
					 }
					 else{
						 System.out.println("Role Invalid"); 
					 }
				 }
				 else{
					 System.out.println("4 ");
					 System.out.println("User does not exist!");
				 }
				 
				 
			} catch (Exception e) {
				System.out.println("Exception: " + e.getMessage());
			}

			if(flag.equals("student")){
			return "student";	
			}
			else if(flag.equals("professor")){
		    return "professor";
			}
			else 
			return "home";	
			
		}

		@RequestMapping(method = RequestMethod.GET)
		public String initializeForm(@ModelAttribute("userAccount") UserAccount user, BindingResult result) {

			return "home";
			
		}
		
		
		
		
		
	}


