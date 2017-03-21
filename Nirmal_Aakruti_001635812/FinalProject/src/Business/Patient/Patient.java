/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Caregiver.Caregiver;
import Business.Person.Person;
import Business.VitalSign.VitalSignHistory;


/**
 *
 * @author aakrutinirmal
 */
public class Patient extends Person{
   
  
    private String patientID;
    private String primaryDoctorName;
    private String prefferedPharmacy;
    private VitalSignHistory vitalSignHistory;
    private Caregiver caregiver;

    public Patient() {
        super(null);
     
        this.vitalSignHistory = new VitalSignHistory();
    }
  

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }


    public Caregiver getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(Caregiver caregiver) {
        this.caregiver = caregiver;
    }
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }

    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }

    public String getPrefferedPharmacy() {
        return prefferedPharmacy;
    }

    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.prefferedPharmacy = prefferedPharmacy;
    }
 @Override
    public String toString()
    {
        return String.valueOf(super.getPersonName());
    } 
    
    
}
