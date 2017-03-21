/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorAppointmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aakrutinirmal
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {
private JPanel userprocesscontainer;
private EcoSystem ecoSystem;
private UserAccount account;
private Organization organization;
private Enterprise enterprise;
        
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userprocesscontainer, UserAccount account, Organization organization, EcoSystem ecoSystem,Enterprise enterprise) {
        initComponents();
        this.userprocesscontainer=userprocesscontainer;
        this.account=account;
        this.organization=(DoctorOrganization)organization;
        this.ecoSystem=ecoSystem;
        this.enterprise=enterprise;
       populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vitalSignsjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        vitalSignsjButton.setText("Patient Details");
        vitalSignsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalSignsjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Doctor Work Area");

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "hide", "Sender", "Receiver", "Status", "Booking Date", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setMinWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setPreferredWidth(0);
            workRequestJTable.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Appointments requested:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Doctor.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(processJButton)
                                .addGap(75, 75, 75)
                                .addComponent(vitalSignsjButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assignJButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(refreshJButton))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(refreshJButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitalSignsjButton)
                    .addComponent(processJButton)
                    .addComponent(assignJButton))
                .addGap(130, 130, 130))
        );
    }// </editor-fold>//GEN-END:initComponents

     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getPerson();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getPersonName();
            row[3] = request.getStatus();
            row[4] = request.getResolveDate();
            row[5] = request.getMessage();
            model.addRow(row);
        }
    }
    
    private void vitalSignsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalSignsjButtonActionPerformed
        // TODO add your handling code here:
          int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
              JOptionPane.showMessageDialog(this, "Please select a row from table.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        DoctorAppointmentWorkRequest request = (DoctorAppointmentWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        Person p =(Person)request.getSender().getPerson();
        Patient patient=(Patient)p;
        
        ViewVitalSignsJPanel viewVitalSignsJPanel = new ViewVitalSignsJPanel(userprocesscontainer,account,ecoSystem,patient,organization,enterprise);
        userprocesscontainer.add("ViewVitalSignsJPanel", viewVitalSignsJPanel);
        CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);
    }//GEN-LAST:event_vitalSignsjButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
             JOptionPane.showMessageDialog(this, "Please select a row from table.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        DoctorAppointmentWorkRequest request = (DoctorAppointmentWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userprocesscontainer, request);
        userprocesscontainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
        layout.next(userprocesscontainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
             JOptionPane.showMessageDialog(this, "Please select a row from table.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(account);
        request.setStatus("Pending");
        populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton vitalSignsjButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
