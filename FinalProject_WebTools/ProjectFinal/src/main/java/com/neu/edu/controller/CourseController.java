package com.neu.edu.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neu.edu.DAO.CourseDAO;
import com.neu.edu.DAO.UserAccountDAO;
import com.neu.edu.pojo.Course;
import com.neu.edu.pojo.Professor;
import com.neu.edu.pojo.UserAccount;


@Controller

public class CourseController {
	@Autowired
	@Qualifier("courseValidator")
	CourseValidator validator;

	@Autowired
    @Qualifier("userAccountDao")
    UserAccountDAO userAccountDao;
    
	@Autowired
    @Qualifier("courseDao")
    CourseDAO courseDao;
    
	
	
//	@InitBinder
//	private void initBinder(WebDataBinder binder) {
//		binder.setValidator(validator);
//	}
	@RequestMapping(value="addNewCourse.htm",method = RequestMethod.POST)
	public String addCourses(@ModelAttribute("course") Course course,BindingResult result,HttpServletRequest req, HttpServletResponse resp) throws Exception {
	      System.out.println("add new course ..professor controller 1");
	   
//	      validator.validate(course, result);
//			if(result.hasErrors())
//			{
//				return "home";
//			} 
//	      
	      Professor user=(Professor)req.getSession(false).getAttribute("user"); 
	   
	      	System.out.println("logged in"+user.getFirstName());
         //  CourseDAO courses = new CourseDAO();
           try
           {

          Course c = courseDao.create(course.getCourseName(),course.getCourseDescription(),course.getCreditHour(),user);
          req.getParameter("courseName");
          
          System.out.println("course name"+ req.getParameter("courseName"));
          user.addCourse(course);
          
          c.setProfessorId(user);

        //  CourseDAO courseDao = new CourseDAO(); 
          
          System.out.println("Added course 3");

      }
      catch (HibernateException e)
      {
    	  
    	  System.out.println(e.getMessage());
      }
      	
	
	return "addedCourse";
	}
	
	
	@RequestMapping(value="addCourses.htm", method = RequestMethod.POST)
	public ModelAndView forAddingCourses(HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
	 System.out.println("professor controller ...forAddingCourses...1");
	 ModelAndView mv=new ModelAndView();
     mv.addObject(courseDao);
     mv.setViewName("addCourse");
     
		return mv;
      }
	
	
	
}
