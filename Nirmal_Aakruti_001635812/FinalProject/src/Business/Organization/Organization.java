/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author aakrutinirmal
 */
public abstract class Organization {
    
    private String organizationName;
    private int organizationId;
    private static int counter=101;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    
    public Organization(String name){
    this.organizationName=name;
    personDirectory=new PersonDirectory();
    userAccountDirectory=new UserAccountDirectory();
    workQueue=new WorkQueue();
     organizationId = counter;
    counter++;
    }

    public enum Type{
    HospitalAdmin("HospitalAdmin"),SocietyAdmin("SocietyAdmin"),FamilyAdmin("FamilyAdmin"),FamilyMember("FamilyMember"),Patient("Patient"),
    Caregiver("Caregiver"),Doctor("Doctor"),;   
    private String value;
    private Type(String value){
    this.value=value;
    }
    
    public String getValue(){
    return value;
    }
    }
    
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
   

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }


    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
   
    public abstract  ArrayList<Role> getSupportedRole();

    @Override
    public String toString() {
        return organizationName;
    }
    
    
    
}
