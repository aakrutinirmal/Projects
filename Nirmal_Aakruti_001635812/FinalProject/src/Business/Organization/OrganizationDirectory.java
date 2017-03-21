/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author aakrutinirmal
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }
    
    
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.HospitalAdmin.getValue())){
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SocietyAdmin.getValue())){
            organization = new SocietyAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FamilyAdmin.getValue())){
            organization = new FamilyAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Caregiver.getValue())){
            organization = new CaregiverOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FamilyMember.getValue())){
            organization = new FamilyMemberOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
   
    
    
}
