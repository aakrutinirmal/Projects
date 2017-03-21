/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Caregiver;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author aakrutinirmal
 */
public class CaregiverDirectory {

    private ArrayList<Caregiver> caregiverDirectory;

    public CaregiverDirectory() {
        caregiverDirectory = new ArrayList<>();
    }

    public ArrayList<Caregiver> getCaregiverDirectory() {
        return caregiverDirectory;
    }

    public void setCaregiverDirectory(ArrayList<Caregiver> caregiverDirectory) {
        this.caregiverDirectory = caregiverDirectory;
    }

    public Caregiver createCaregiver(Person p) {
        Caregiver c = new Caregiver();
        Person p2 = (Person) c;
        p2 = p;
        c.setAge(p.getAge());
        c.setPersonName(p.getPersonName());
        caregiverDirectory.add(c);
        return c;
    }

}
