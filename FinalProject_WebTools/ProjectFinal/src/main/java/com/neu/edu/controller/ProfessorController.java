package com.neu.edu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.json.JSONException;
import org.json.JSONObject;
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
public class ProfessorController {
	@Autowired
	@Qualifier("userValidator")
	UserValidator validator;

	@Autowired
    @Qualifier("userAccountDao")
    UserAccountDAO userAccountDao;
    
	@Autowired
    @Qualifier("courseDao")
    CourseDAO courseDao;
	
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}
/* AJAX CALL*/
//	@RequestMapping(value="professorCourses.htm", method = RequestMethod.GET,headers="Accept=application/json")
//	public @ResponseBody List<UserAccount> doSubmitAction(HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
//	      System.out.println("professor controller 1");
//	   //   PrintWriter out = res.getWriter();
//	   //   res.setContentType("text/html");
//	  UserAccountDAO users = null;
//	  List userList = null;
//	  List<UserAccount> studentList = new ArrayList<UserAccount>();	
//	  users = new UserAccountDAO();
//		
//		userList = users.getUsers();
//
//	  
//	  Iterator studentIterator = userList.iterator();
//      System.out.println("professor controller 2");
//      while (studentIterator.hasNext())
//      {
//      	
//      		UserAccount userAcc = (UserAccount) studentIterator.next();
//      		if(userAcc.getRole().equalsIgnoreCase("student")){
//      		 
//              studentList.add(userAcc);
//              System.out.println("professor controller 3 Added  " +userAcc.getUsername());	
//              
//              
//      	}
//      }
//      
//     // req.getSession().setAttribute("students",studentList);
//      
//      System.out.println("professor controller 4 Added  " +studentList);	
//		
//		return studentList;
//      }

	
	@RequestMapping(value="professorCourses.htm", method = RequestMethod.GET,headers="Accept=application/json")
	public ModelAndView doSubmitAction(HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
	      System.out.println("professor controller 1");
	  
	  UserAccountDAO users = null;
	  List userList = null;
	  List<UserAccount> studentList = new ArrayList<UserAccount>();	
	 // users = new UserAccountDAO();
		
		userList = userAccountDao.getUsers();

	  
	  Iterator studentIterator = userList.iterator();
      System.out.println("professor controller 2");
      while (studentIterator.hasNext())
      {
      	
      		UserAccount userAcc = (UserAccount) studentIterator.next();
      		if(userAcc.getRole().equalsIgnoreCase("student")){
      		 
              studentList.add(userAcc);
              System.out.println("professor controller 3 Added  " +userAcc.getUsername());	
              
              
      	}
      }
      
      
      System.out.println("professor controller 4 Added  " +studentList);
      
    //  CourseDAO courseDao=new CourseDAO();
	   
      Iterator getCourseIterator = studentList.iterator();
      List<Course> courseList=new ArrayList<Course>();
      while (getCourseIterator.hasNext())
      {
      	
      		Student student = (Student) getCourseIterator.next();
      	req.getSession().setAttribute("currentStudent", student);
      		student.getCrns();
      		for(Course c: student.getCrns()){
      			c.getCourseName();
      			System.out.println("enrolled course:"+c.getCourseName());
      		}
      		System.out.println("enrolled courses:"+student.getCrns()); 
      		//courseList.add(e);
      } 
      
      ModelAndView mv = new ModelAndView("studentDisplay", "students", studentList);
		return mv;
      }
	
	@RequestMapping(value="assignMarks.htm", method = RequestMethod.POST,headers="Accept=application/json")
	public String assignMarks(HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
	      System.out.println("assignMarks...professor controller 1");
		

      System.out.println("Student:"+req.getParameter("studentShown"));
      System.out.println("Course:"+req.getParameter("crnShown"));
      
//      String tempName=req.getParameter("studentShown");
      String tempCourse=req.getParameter("crnShown");
      
      
      Student s=(Student)req.getSession().getAttribute("currentStudent");
      System.out.println("student" + s);
      

      
       Course ctemp=(Course)courseDao.getCourse(tempCourse);
      
      System.out.println("stemp"+s);
      System.out.println("ctemp"+ctemp);
          
     
      String username=s.getUsername();
      Student snew=(Student) userAccountDao.getStudent(username);// from DAO
   	System.out.println("*****"+snew);      

      
      req.getSession().setAttribute("currentStudent", s);
      req.getSession().setAttribute("currentCourse", ctemp);
      
      
      System.out.println("student"+req.getSession().getAttribute("currentStudent"));
      System.out.println("course"+req.getSession().getAttribute("currentCourse"));
      
		return "markesAssigned";
      }
	
	
	@RequestMapping(value="saveMarks.htm", method = RequestMethod.POST,headers="Accept=application/json")
	public String saveMarks(HttpServletRequest req,HttpServletResponse res) throws IOException, JSONException {
	      System.out.println("saveMarks.....professor controller 1");
		

	      System.out.println("Student:"+req.getSession().getAttribute("currentStudent"));
	      System.out.println("Course:"+ req.getSession().getAttribute("currentCourse"));
	      
	   
	      Student s=(Student)req.getSession().getAttribute("currentStudent");
	      Course c=(Course)req.getSession().getAttribute("currentCourse");
      
      
      Student someStu=(Student)userAccountDao.getStudent(s.getUsername());
      someStu.setMarks(req.getParameter("marks"));
      userAccountDao.updateStudent(someStu);
      
      
      CourseDAO courseDao=new CourseDAO();
     Course cnew=courseDao.getCourse(c.getCourseName());
      
      
      
	    Student student=(Student)userAccountDao.get(s.getUsername());
	    System.out.println("marksssssss111111111111"+student.getMarks());
	    System.out.println("marksss2222222"+s.getMarks());
	    
	    System.out.println("course"+cnew.getCourseName());
	    
	 //   s.setMarks(req.getParameter("marks"));
	// Course courses=s.getCrns(); 
	    
//	   Iterator getCourseIterator =s.getCrns().iterator();
//	    while(getCourseIterator.hasNext()){
	    	System.out.println("inside iterator");
	    	 courseDao.updateCourseWithStudent(cnew);	
	 //   }
	    
	   
      
      
    //  ModelAndView mv = new ModelAndView("markesAssigned", "students", studentList);
		return "marksSaved";
      }
	
}
