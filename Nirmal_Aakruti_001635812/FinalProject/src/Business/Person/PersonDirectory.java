/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Caregiver.CaregiverDirectory;
import Business.Patient.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author aakrutinirmal
 */
public class PersonDirectory  {
 private ArrayList<Person> personHistory;
 private PatientDirectory patientDirectory;
 private CaregiverDirectory caregiverDirectory;
    public PersonDirectory() {
        personHistory = new ArrayList<>();
        patientDirectory= new PatientDirectory();
        caregiverDirectory=new CaregiverDirectory();
    }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public CaregiverDirectory getCaregiverDirectory() {
        return caregiverDirectory;
    }

    public void setCaregiverDirectory(CaregiverDirectory caregiverDirectory) {
        this.caregiverDirectory = caregiverDirectory;
    }

     public Person createPerson(String name) {
        Person person = new Person(name);
         person.setPersonName(name);
        personHistory.add(person);
        return person;
    }

    public void deletePerson(Person person) {
        personHistory.remove(person);
    }
    

    
    
    public ArrayList<Person> searchPerson(String key)
    {
        ArrayList<Person> searchPersonDirectory = new ArrayList();
        for(Person person: personHistory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }

   
    
    
}
