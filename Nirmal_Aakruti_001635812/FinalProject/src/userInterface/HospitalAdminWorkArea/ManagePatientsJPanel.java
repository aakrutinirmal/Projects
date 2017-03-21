/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HospitalAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.MyStringVerifier;
import Business.Network.Network;
import Business.Organization.FamilyMemberOrganization;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakrutinirmal
 */
public class ManagePatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form managePatientsJJPanel
     */
    private EcoSystem ecosystem;
   
    private Organization organization;
    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private ArrayList<Person> p1;

    public ManagePatientsJPanel(JPanel userProcessContainer, Organization organization,Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.enterprise=enterprise;
        p1=new ArrayList<>();
       
        this.organization = organization;
        for (Network n : ecosystem.getNetworkList()) {
        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
            if( enterprise.getOrganizationName().equalsIgnoreCase(e.getOrganizationName())){
                populatePatientsTable(e.getPersonDirectory().getPersonHistory());
            }
            }
        }
       
    }

    private void populatePatientsTable(ArrayList<Person> personList) {
           
        DefaultTableModel model = (DefaultTableModel) viewPersonsJTable.getModel();
        model.setRowCount(0);
        if (personList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Persons found. Please add Persons", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }  
        for (Network n : ecosystem.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof PatientOrganization) {
                        for (Patient patient : org.getPersonDirectory().getPatientDirectory().getPatientDirectory()) {
                             p1.add((Person)patient);
                            Object[] row = new Object[3];
                            row[0] = patient;
                            row[1] = patient.getAge();
                            if (patient.getPatientID() != null) {
                                row[2] = patient.getPatientID();
                            } else {
                                row[2] = "Patient Not Created";
                            }
                            model.addRow(row);
                        }
                    } 
            
                        if (org instanceof FamilyMemberOrganization) {
                        
                        for (Person person : org.getPersonDirectory().getPersonHistory()) {
                            int count=0;
                            if(p1.size()>0){
                             for(Person p:p1){
                              if(p.getPersonName().equals(person.getPersonName()))
                              {
                                  count=1;
                              }
                             }
                            }
                          if(count==0){
                            Object[] row = new Object[3];
                            row[0] = person;
                            row[1] = person.getAge();
                            row[2] = "Patient Not Created";
                            model.addRow(row);
                          }
                     
                    }
                }
            }

        }
        }  
       
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        viewPatientJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        createPatientJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewPersonsJTable = new javax.swing.JTable();
        assignCaregiverjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        setMinimumSize(new java.awt.Dimension(500, 700));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Patients");

        viewPatientJButton.setText("View Patient");
        viewPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        createPatientJButton.setText("Create Patient");
        createPatientJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatientJButtonActionPerformed(evt);
            }
        });

        viewPersonsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person Name", "Age", "Patient ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewPersonsJTable);

        assignCaregiverjButton.setText("Assign Caregiver");
        assignCaregiverjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignCaregiverjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createPatientJButton)
                        .addGap(104, 104, 104)
                        .addComponent(assignCaregiverjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewPatientJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(157, 157, 157)
                                    .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshJButton)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPatientJButton)
                    .addComponent(viewPatientJButton)
                    .addComponent(assignCaregiverjButton))
                .addGap(155, 155, 155)
                .addComponent(backJButton)
                .addContainerGap(244, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientJButtonActionPerformed
//        // TODO add your handling code here:
        int selectedRow = viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Person person = (Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        /*pass userProcessContainer and Patient*/
      //  Patient patient = person.getPatient();
        if (person instanceof Patient) {
            ViewUpdatePatientDetailsJPanel vupdJPanel = new ViewUpdatePatientDetailsJPanel(userProcessContainer, (Patient)person, Boolean.FALSE);
            userProcessContainer.add("vupdJPanel", vupdJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else {
            JOptionPane.showMessageDialog(this, "Patient not created, Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_viewPatientJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
       // searchBoxJTextField.setText("");
        for (Network n : ecosystem.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                
                for(Organization org: e.getOrganizationDirectory().getOrganizationList()){
              if(org instanceof FamilyMemberOrganization){
             populatePatientsTable(org.getPersonDirectory().getPersonHistory());
              }
          }
              
           }
       }
        
         
        
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void createPatientJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatientJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person = (Person) viewPersonsJTable.getValueAt(selectedRow, 0);
        if (person instanceof Patient) {
            JOptionPane.showMessageDialog(this, "Patient already exists.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        CreatePatientJPanel cpJPanel = new CreatePatientJPanel(userProcessContainer, ecosystem, enterprise,organization, person);
        userProcessContainer.add("cpJPanel", cpJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createPatientJButtonActionPerformed

    private void assignCaregiverjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignCaregiverjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewPersonsJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row from table.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        Person person = (Person) viewPersonsJTable.getValueAt(selectedRow, 0);
       
         if (person instanceof Patient) {
        AssignCaregiverJPanel assignCaregiverJPanel = new AssignCaregiverJPanel(userProcessContainer, ecosystem, enterprise,organization, person);
        userProcessContainer.add("AssignCaregiverJPanel", assignCaregiverJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                          
        }         
         else{
         JOptionPane.showMessageDialog(this, "Patient should be created before assigning Caregiver!!!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
         
         }
             
    }//GEN-LAST:event_assignCaregiverjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignCaregiverjButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createPatientJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton viewPatientJButton;
    private javax.swing.JTable viewPersonsJTable;
    // End of variables declaration//GEN-END:variables
}
