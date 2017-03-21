/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author aakrutinirmal
 */
public class PatientDirectory {
    private ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        patientDirectory = new ArrayList<>();
        
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    

     public Patient createPatient(Person p) {
        Patient patient = new Patient();
        Person p2=(Person)patient;
        p2=p;
        patient.setAge(p.getAge());
        patient.setPersonName(p.getPersonName());
        patientDirectory.add(patient);
        return patient;
    }

    public void deletePatient(Person p) {
        patientDirectory.remove(p);
    }
    
  
    
    
    public ArrayList<Patient> searchPatient(String key)
    {
        ArrayList<Patient> searchPatientDirectory = new ArrayList();
        for(Patient patient: patientDirectory)
        {
            if(patient.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPatientDirectory.add(patient);
            }
        }
        return searchPatientDirectory;
    }
}
