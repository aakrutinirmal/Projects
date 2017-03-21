/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;


import Business.Person.Person;

/**
 *
 * @author aakrutinirmal
 */
public class Doctor extends Person{
    private int doctorId;
  
    private static int count =1001;
    
    public Doctor() {
        super(null);
        doctorId = count;
        
        count++;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    
    
}
