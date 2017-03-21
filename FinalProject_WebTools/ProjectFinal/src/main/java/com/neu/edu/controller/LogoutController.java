package com.neu.edu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neu.edu.pojo.UserAccount;

@Controller
@RequestMapping("/logout.htm")
public class LogoutController {
	 @Autowired
		@Qualifier("userValidator")
		UserValidator validator;

		@InitBinder
		private void initBinder(WebDataBinder binder) {
			binder.setValidator(validator);
		}
	@RequestMapping(method = RequestMethod.GET)
	//public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	public String doSubmitAction(HttpServletRequest request,HttpServletResponse response){
	//public String doSubmitAction(@ModelAttribute("userAccount") UserAccount userAccount, BindingResult result) throws Exception {
//	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//	    if (auth != null){    
//	        new SecurityContextLogoutHandler().logout(request, response, auth);
//	    }
//	    return "redirect:/login?logout";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	System.out.println("Inside Logout");
		 request.getSession().invalidate();
		 return "loggedOut";
	}
}
