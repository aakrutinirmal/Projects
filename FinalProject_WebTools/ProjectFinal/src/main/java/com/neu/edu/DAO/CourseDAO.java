package com.neu.edu.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.neu.edu.pojo.Course;
import com.neu.edu.pojo.Professor;
import com.neu.edu.pojo.UserAccount;


public class CourseDAO extends DAO {

	public CourseDAO(){}
	
	   public Course get(int crn)
	            throws HibernateException {
	        try {
	            begin();
	            Query q = getSession().createQuery("from Course = :crn ");
	            q.setInteger("crn", crn);
	           // q.setString("role", role);
	            Course course = (Course) q.uniqueResult();
	            commit();
	            return course;
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get course " + crn, e);
	        }
	    }
	   
	   public Course get(String crn)
	            throws HibernateException {
	        try {
	            begin();
	            Query q = getSession().createQuery("from Course where crn = :crn ");
	            q.setString("crn", crn);
	           // q.setString("role", role);
	            Course course = (Course) q.uniqueResult();
	            commit();
	            return course;
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get course " + crn, e);
	        }
	    }
	   
	   
	   public Course getCourse(String courseName)
	            throws HibernateException {
	        try {
	            begin();
	            Query q = getSession().createQuery("from Course where courseName = :courseName ");
	            q.setString("courseName", courseName);
	           // q.setString("role", role);
	            Course course = (Course) q.uniqueResult();
	            commit();
	            return course;
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get course " + courseName, e);
	        }
	    } 
	   
	   
	   
	   
	   
	   
	
	   public Course updateCourseWithStudent(Course course)
	            throws HibernateException {
	        try {
	        	begin();
	        //	course.setStudents(students);
	        	System.out.println(course.getStudents().getUserId());
	        	getSession().update(course);
	        	commit();
	        
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get course");
	        }
	        return null;
	    }
	   
	   
	   public List getCourses() throws HibernateException {
	        try {
	            begin();
	            Query q = getSession().createQuery("from Course ");
//	            q.setString("username", username);
//	            q.setString("role", role);
//	            UserAccount userAccount = (UserAccount) q.uniqueResult();
	            List list = q.list();
	            commit();
	            return list;
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get course list " +  e);
	        }
	    }
	   
	   
	   
	   
	   
	   
	   public Course create(String courseName , String  courseDescription, int creditHour, Professor p)
	            throws HibernateException {
	        try {
	        	begin();
	            System.out.println("inside CourseDAO");
	        
	            Course course=new Course();
	            
	            course.setCourseName(courseName);
	            course.setCourseDescription(courseDescription);
	            course.setCreditHour(creditHour);
	           // course.setUserId(tempId);
	            course.setProfessorId(p);
	      //      course.setStudents(students);
	            getSession().save(course);
	         //   course.setStudents();
	            
	            commit();
	            System.out.println(" Course adDed");
	            return course;
	        	
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Exception while creating course: " + e.getMessage());
	        }
	    }
	   
	   
	   
	
}
