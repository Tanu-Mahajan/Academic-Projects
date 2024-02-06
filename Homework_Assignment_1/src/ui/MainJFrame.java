/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JFrame;
import model.Address;
import model.Doctor;
import model.Driver;
import model.InsuranceDetails;
import model.Patient;
import model.Person;
import model.VehicleRegistration;

/**
 *
 * @author tanujamahajan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Person person;
    Patient patient;
    VehicleRegistration vehicle;
    Driver driver;
    Doctor doctor;
    InsuranceDetails insurance;
    Address address;
    
    public MainJFrame() {
        initComponents();
        
        person = new Person();
        patient = new Patient();
        vehicle = new VehicleRegistration();
        driver = new Driver();
        doctor = new Doctor();
        insurance = new InsuranceDetails();
        address = new Address();
         
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnCreatePerson = new javax.swing.JButton();
        btnCreatePatient = new javax.swing.JButton();
        btnVehicleRegistration = new javax.swing.JButton();
        btnDriver = new javax.swing.JButton();
        btnCreateDoctor = new javax.swing.JButton();
        btnInsuranceDetails = new javax.swing.JButton();
        btnDisplayPatientReport = new javax.swing.JButton();
        txtAddress = new javax.swing.JButton();
        txtMenu = new javax.swing.JTextField();
        workArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        controlPanel.setBackground(new java.awt.Color(204, 255, 255));
        controlPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));

        btnCreatePerson.setBackground(new java.awt.Color(255, 204, 204));
        btnCreatePerson.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreatePerson.setText("Create Person");
        btnCreatePerson.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        btnCreatePatient.setBackground(new java.awt.Color(255, 204, 204));
        btnCreatePatient.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        btnVehicleRegistration.setBackground(new java.awt.Color(255, 204, 204));
        btnVehicleRegistration.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnVehicleRegistration.setText("Vehicle Registration");
        btnVehicleRegistration.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        btnVehicleRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehicleRegistrationActionPerformed(evt);
            }
        });

        btnDriver.setBackground(new java.awt.Color(255, 204, 204));
        btnDriver.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDriver.setText("Create Driver");
        btnDriver.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        btnDriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverActionPerformed(evt);
            }
        });

        btnCreateDoctor.setBackground(new java.awt.Color(255, 204, 204));
        btnCreateDoctor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreateDoctor.setText("Create Doctor");
        btnCreateDoctor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        btnCreateDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDoctorActionPerformed(evt);
            }
        });

        btnInsuranceDetails.setBackground(new java.awt.Color(255, 204, 204));
        btnInsuranceDetails.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnInsuranceDetails.setText("Create Health Insurance");
        btnInsuranceDetails.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        btnInsuranceDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsuranceDetailsActionPerformed(evt);
            }
        });

        btnDisplayPatientReport.setBackground(new java.awt.Color(255, 204, 204));
        btnDisplayPatientReport.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDisplayPatientReport.setText("Display Patient Report");
        btnDisplayPatientReport.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        btnDisplayPatientReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayPatientReportActionPerformed(evt);
            }
        });

        txtAddress.setBackground(new java.awt.Color(255, 204, 204));
        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtAddress.setText("Create Address");
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtMenu.setBackground(new java.awt.Color(255, 255, 153));
        txtMenu.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        txtMenu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMenu.setText("MENU");
        txtMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 51, 255)));
        txtMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDisplayPatientReport, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsuranceDetails)
                    .addComponent(btnCreateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVehicleRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDriver, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(txtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreatePerson)
                .addGap(18, 18, 18)
                .addComponent(txtAddress)
                .addGap(18, 18, 18)
                .addComponent(btnDriver)
                .addGap(18, 18, 18)
                .addComponent(btnVehicleRegistration)
                .addGap(18, 18, 18)
                .addComponent(btnCreatePatient)
                .addGap(18, 18, 18)
                .addComponent(btnCreateDoctor)
                .addGap(18, 18, 18)
                .addComponent(btnInsuranceDetails)
                .addGap(18, 18, 18)
                .addComponent(btnDisplayPatientReport)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(204, 255, 255));
        workArea.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
        
        CreatePersonJPanel createPanel = new CreatePersonJPanel(person);
        splitPane.setRightComponent(createPanel);
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel createPatientPanel = new CreatePatientJPanel(patient);
        splitPane.setRightComponent(createPatientPanel);
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnVehicleRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehicleRegistrationActionPerformed
        // TODO add your handling code here:
        VehicleRegistrationJPanel vehicleRegistrationPanel = new VehicleRegistrationJPanel(vehicle);
        splitPane.setRightComponent(vehicleRegistrationPanel);
    }//GEN-LAST:event_btnVehicleRegistrationActionPerformed

    private void btnDriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverActionPerformed
        // TODO add your handling code here:
        
        CreateDriverJPanel createDriverPanel = new CreateDriverJPanel(driver);
        splitPane.setRightComponent(createDriverPanel);
    }//GEN-LAST:event_btnDriverActionPerformed

    private void btnCreateDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDoctorActionPerformed
        // TODO add your handling code here:
        
        CreateDoctorJPanel createDoctorPanel = new CreateDoctorJPanel(doctor);
        splitPane.setRightComponent(createDoctorPanel);
    }//GEN-LAST:event_btnCreateDoctorActionPerformed

    private void btnInsuranceDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsuranceDetailsActionPerformed
        // TODO add your handling code here:
        CreateHealthInsuranceJPanel createInsurancePanel = new CreateHealthInsuranceJPanel(insurance);
        splitPane.setRightComponent(createInsurancePanel);
    }//GEN-LAST:event_btnInsuranceDetailsActionPerformed

    private void btnDisplayPatientReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayPatientReportActionPerformed
        // TODO add your handling code here:
        
        DisplayPatientReportJPanel displayPatientPanel = new DisplayPatientReportJPanel(patient, doctor, insurance, person, vehicle, address, driver);
        splitPane.setRightComponent(displayPatientPanel);
        
    }//GEN-LAST:event_btnDisplayPatientReportActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
        
        CreateAddressJPanel createAddressPanel = new CreateAddressJPanel(address);
        splitPane.setRightComponent(createAddressPanel);
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDoctor;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnDisplayPatientReport;
    private javax.swing.JButton btnDriver;
    private javax.swing.JButton btnInsuranceDetails;
    private javax.swing.JButton btnVehicleRegistration;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton txtAddress;
    private javax.swing.JTextField txtMenu;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}