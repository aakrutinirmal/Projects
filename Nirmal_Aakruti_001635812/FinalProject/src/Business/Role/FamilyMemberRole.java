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
import userInterface.FamilyMemberRole.FamilyMemberWorkAreaJPanel;
/**
 *
 * @author aakrutinirmal
 */
public class FamilyMemberRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem ecoSystem) {
      return new FamilyMemberWorkAreaJPanel(userProcessContainer, account, organization, enterprise,ecoSystem);
    }
     @Override
    public String toString() {
        return RoleType.FamilyMember.getValue();
    }
}
