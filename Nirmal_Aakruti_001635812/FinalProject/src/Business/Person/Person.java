/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Patient.Patient;

/**
 *
 * @author aakrutinirmal
 */
public class Person {
    private String personName;
    private int age;
    //private Patient patient;
    private int ssn;
    private static int counter= 700000001;

    public Person(String name){
     ssn = counter;
     this.personName=name;
     //should i include patient/ employee or caregiver here???
     //as in create objects of them?
     counter++;
    }
    
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Patient getPatient() {
//        return patient;
//    }
//
//    public void setPatient(Patient patient) {
//        this.patient = patient;
//    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    
    @Override
    public String toString()
    {
        return this.personName;
    }
    
}
