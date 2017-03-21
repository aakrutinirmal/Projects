/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.DoctorRole.DoctorWorkAreaJPanel;
import userInterface.PatientRole.PatientWorkAreaJPanel;

/**
 *
 * @author aakrutinirmal
 */
public class PatientRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
    return new PatientWorkAreaJPanel(userProcessContainer, account, organization, enterprise,ecoSystem);
    }
     @Override
    public String toString() {
        return RoleType.Patient.getValue();
    }
}
