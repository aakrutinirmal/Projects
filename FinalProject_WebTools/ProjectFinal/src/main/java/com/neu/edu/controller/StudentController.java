package com.neu.edu.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.neu.edu.DAO.CourseDAO;
import com.neu.edu.DAO.UserAccountDAO;
import com.neu.edu.pojo.Course;
import com.neu.edu.pojo.Professor;
import com.neu.edu.pojo.Student;
import com.neu.edu.pojo.UserAccount;


@Controller
public class StudentController {
	
	@Autowired
	@Qualifier("userValidator")
	UserValidator validator;

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


	@RequestMapping(value="displayCoursesToStudent.htm", method = RequestMethod.GET)
	public ModelAndView  doSubmitAction(HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
	      System.out.println("student controller 1");
	  
	  CourseDAO courses = null;
	  List courseList = null;
	  List<Course> showList = new ArrayList<Course>();	
	//  courses = new CourseDAO();
		
		courseList = courseDao.getCourses();

	  
	  Iterator courseIterator = courseList.iterator();
      System.out.println("student controller 2");
      while (courseIterator.hasNext())
      {
      	
      		Course course = (Course) courseIterator.next();
//      		if(course.getRole().equalsIgnoreCase("student")){
      		 
      		showList.add(course);
              System.out.println("student controller 3 Added  " +course.getCourseName());	
              
              
     // 	}
      }
      System.out.println("student controller 4 Added  " +showList);	
      ModelAndView mv = new ModelAndView("courseDisplay", "courses", showList);
	     // return "courseDisplay";
      return mv;
      }
	
	
	@RequestMapping(value="showCourses.htm", method = RequestMethod.POST)
	public ModelAndView forShowingCourses(HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
	 System.out.println("Student controller ...forShowingCourses...1");
	 ModelAndView mv=new ModelAndView();
     mv.addObject(new Student());
     mv.setViewName("showcourses");
     
		return mv;
      }
	
	@RequestMapping(value="addMarksToStudent.htm", method = RequestMethod.POST)
	public ModelAndView  addMarks(HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
	      System.out.println("addMarks..student controller 1");
	  
	      Professor prof=(Professor)req.getSession(false).getAttribute("user"); 
	    	System.out.println("logged in"+prof.getFirstName());
	    	
	    	Set<Course> courses=prof.getCrns();
	    	System.out.println("courses"+courses);
	    	
	    	 Iterator courseIterator = courses.iterator();
	    	System.out.println(req.getSession().getAttribute("students"));
		//    System.out.println("students list from session"+students);
		    
	    	while(courseIterator.hasNext()){
	    		
	    		Course course = (Course) courseIterator.next();
	   
	    		System.out.println("students"+course.getStudents());
	    	//	students.setMarks(marks);
	    	
	    	}
	    	
	     //   CourseDAO courses = new CourseDAO();
	      List<Course> showList = new ArrayList<Course>();	
	
		  
		  
		  
      System.out.println("addMarks...student controller 2");
      
     // System.out.println("student controller 4 Added  " +showList);	
      ModelAndView mv = new ModelAndView("courseDisplay", "courses", showList);
	 
      return mv;
      }
	
	@RequestMapping(value="enrolForCourse.htm", method = RequestMethod.POST)
	public ModelAndView enrollForCourses(@ModelAttribute("student")Student student,BindingResult result,HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
	 System.out.println("Student controller ...enrollForCourses...1");
	 ModelAndView mv=new ModelAndView();
     mv.addObject(new Student());
     mv.setViewName("showcourses");
     
		return mv;
      }

	@RequestMapping(value="addCourseToStudent.htm", method = RequestMethod.POST)
	public ModelAndView  addCourseToStudent(HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
	      System.out.println("addCourseToStudent..student controller 1");
	  
	   
	    Student student=(Student)req.getSession(false).getAttribute("user");
 
	    System.out.println("logged in"+student.getFirstName());
	    req.getParameter("selectCourse");
	   
	   // CourseDAO courseDao=new CourseDAO();
	    Course course=courseDao.get(req.getParameter("selectCourse"));
	    course.setStudents(student);
	    courseDao.updateCourseWithStudent(course);
	    
	      List<Course> showList = new ArrayList<Course>();	
      ModelAndView mv = new ModelAndView("enrolledCourse", "courses", showList);
	 
      return mv;
      }
	
	
	
}
