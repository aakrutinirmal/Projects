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
import userInterface.SocietyAdminWorkArea.SocietyAdminWorkAreaJPanel;

/**
 *
 * @author aakrutinirmal
 */
public class SocietyAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
        return new SocietyAdminWorkAreaJPanel(userProcessContainer,enterprise, ecoSystem);
    }
     @Override
    public String toString() {
        return RoleType.SocietyAdmin.getValue();
    }
   
}
