/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Caregiver;

import Business.Person.Person;

/**
 *
 * @author aakrutinirmal
 */
public class Caregiver extends Person{
    private int caregiverId;

     public Caregiver() {
        super(null);
       
    }

    public int getCaregiverId() {
        return caregiverId;
    }

    public void setCaregiverId(int caregiverId) {
        this.caregiverId = caregiverId;
    }
    

   
    
}
