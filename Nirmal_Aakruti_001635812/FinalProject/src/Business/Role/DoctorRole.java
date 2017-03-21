/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author aakrutinirmal
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
      return new DoctorWorkAreaJPanel( userProcessContainer,  account,  organization,  ecosystem,enterprise);
    }
     @Override
    public String toString() {
        return RoleType.Doctor.getValue();
    }
}
