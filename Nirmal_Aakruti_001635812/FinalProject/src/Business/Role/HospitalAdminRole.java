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
import userInterface.HospitalAdminWorkArea.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author aakrutinirmal
 */
public class HospitalAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
            return new HospitalAdminWorkAreaJPanel(userProcessContainer,organization,enterprise,ecosystem);
    }
     @Override
    public String toString() {
        return RoleType.HospitalAdmin.getValue();
    }
    
}
