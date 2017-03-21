package com.neu.edu.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import com.neu.edu.pojo.Course;
import com.neu.edu.pojo.Professor;
import com.neu.edu.pojo.Student;
import com.neu.edu.pojo.UserAccount;





public class UserAccountDAO extends DAO{
	 public UserAccountDAO() {
	    }

	    public UserAccount get(String username)
	            throws HibernateException {
	        try {
	            begin();
	            Query q = getSession().createQuery("from UserAccount where username = :username");
	            q.setString("username", username);
	          System.out.println("inside DAO "+username);
	            UserAccount userAccount = (UserAccount) q.uniqueResult();
	            System.out.println(userAccount);
	            commit();
	            return userAccount;
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get user " + username, e);
	        }
	    }
	    
	   
	    
	    public UserAccount getStudent(String username)
	            throws HibernateException {
	        try {
	            begin();
	            System.out.println(username);
	            Query q = getSession().createQuery("from UserAccount where username=:username");
	            q.setString("username", username);
	            System.out.println(q);
	            UserAccount student = (UserAccount) q.uniqueResult();
	            System.out.println(student);
	            commit();
	            return student;
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get user " + username, e);
	        }
	    }
	    
 
	    
	    public UserAccount getProf(String username)
	            throws HibernateException {
	        try {
	            begin();
	            Query q = getSession().createQuery("from UserAccount where username = :username ");
	            q.setString("username", username);
	          // q.setString("role", role);
	            UserAccount prof = (UserAccount) q.uniqueResult();
	            commit();
	            return prof;
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get user " + username, e);
	        }
	    }

	    public List getUsers() throws HibernateException {
	        try {
	            begin();
	            Query q = getSession().createQuery("from UserAccount ");
//	            q.setString("username", username);
//	            q.setString("role", role);
//	            UserAccount userAccount = (UserAccount) q.uniqueResult();
	            List list = q.list();
	            commit();
	            return list;
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get user list " +  e);
	        }
	    }
	   
	    public Student createStudent(String firstName, String lastName,String username, String password,String emailId, String role) throws HibernateException {
	        try {
	            begin();
	            System.out.println("inside DAO");
	        
	            Student student=new Student();
	            
	            student.setUsername(username);
	            student.setPassword(password);
	            student.setEmailId(emailId);
	            student.setFirstName(firstName);
	            student.setLastName(lastName);
	            student.setRole(role);
//	            student.setMajor(major);
//	            student.setTa_crn(ta_crn);
//	            student.setMarks(marks);
//	            
	           
	            
	            getSession().save(student);
	            
	   
	            commit();
	            
	           
	           return student;
	        } catch (HibernateException e) {
	            rollback();
	            //throw new AdException("Could not create user " + username, e);
	            throw new HibernateException("Exception while creating student: " + e.getMessage());
	        }
	    }

	    
	    
	    public Professor createProf(String firstName, String lastName,String username, String password,String emailId, String role) throws HibernateException {
	        try {
	            begin();
	            System.out.println("inside Prof UserAccountDAO");
	            
	            Professor prof=new Professor();
	            prof.setUsername(username);
	            prof.setPassword(password);
	            prof.setFirstName(firstName);
	            prof.setLastName(lastName);
	            prof.setEmailId(emailId);
	            prof.setRole(role);
        
	         
	            getSession().save(prof);
	   
	            commit();
	            

	            return prof;
	            
	        } catch (HibernateException e) {
	            rollback();
	        
	            throw new HibernateException("Exception while creating prof: " + e.getMessage());
	        }
	    }
	    
	    
	    
	    public void delete(UserAccount userAccount)
	            throws HibernateException {
	        try {
	            begin();
	            getSession().delete(userAccount);
	            commit();
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not delete user " + userAccount.getUsername(), e);
	        }
	    }
	    
	    
	    public void save(Professor p) throws HibernateException {
	        try {
	            begin();
	            getSession().update(p);
	            commit();
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not save the prof", e);
	        }
	    }

	    public UserAccount updateStudent(Student student)
	            throws HibernateException {
	        try {
	        	begin();
	        //	course.setStudents(students);
	        	//System.out.println(course.getStudents().getUserId());
	        	getSession().update(student);
	        	System.out.println("updated Student"+student);
	        	commit();
	        
	        } catch (HibernateException e) {
	            rollback();
	            throw new HibernateException("Could not get student");
	        }
	        return null;
	    }
	    
	    
}
