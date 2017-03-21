/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import userInterface.FamilyAdminRole.FamilyAdminWorkAreaJPanel;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author aakrutinirmal
 */
public class FamilyAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FamilyAdminWorkAreaJPanel(userProcessContainer,enterprise);
    }
     @Override
    public String toString() {
        return RoleType.FamilyAdmin.getValue();
    }
   
    
}
