/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.InsuranceDetails;

/**
 *
 * @author tanujamahajan
 */
public class CreateHealthInsuranceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateHealthInsuranceJPanel
     */
    
    InsuranceDetails insurance;
    public CreateHealthInsuranceJPanel(InsuranceDetails insurance) {
        initComponents();
        
        this.insurance = insurance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInsuranceDetails = new javax.swing.JLabel();
        lblHealthInsuranceCompanyName = new javax.swing.JLabel();
        lblCorporateID = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPremium = new javax.swing.JLabel();
        lblDeductible = new javax.swing.JLabel();
        lblSOB = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtCorporateID = new javax.swing.JTextField();
        txtHealthInsuranceDetails = new javax.swing.JTextField();
        txtPremium = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDeductible = new javax.swing.JTextField();
        txtSOB = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));

        lblInsuranceDetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblInsuranceDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInsuranceDetails.setText("Health Insurance Details");
        lblInsuranceDetails.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 51, 255), null));

        lblHealthInsuranceCompanyName.setText("Health Insurance Company Name:");

        lblCorporateID.setText("Corporate ID: ");

        lblAddress.setText("Address:");

        lblPremium.setText("Premium:");

        lblDeductible.setText("Deductible:");

        lblSOB.setText("Statement of Benefits:");

        btnSave.setBackground(new java.awt.Color(204, 255, 204));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtCorporateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorporateIDActionPerformed(evt);
            }
        });
        txtCorporateID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCorporateIDKeyPressed(evt);
            }
        });

        txtHealthInsuranceDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthInsuranceDetailsActionPerformed(evt);
            }
        });
        txtHealthInsuranceDetails.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHealthInsuranceDetailsKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHealthInsuranceDetailsKeyReleased(evt);
            }
        });

        txtPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPremiumActionPerformed(evt);
            }
        });
        txtPremium.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPremiumKeyPressed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtDeductible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeductibleActionPerformed(evt);
            }
        });
        txtDeductible.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDeductibleKeyPressed(evt);
            }
        });

        txtSOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSOBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSOB)
                            .addComponent(lblDeductible)
                            .addComponent(lblPremium)
                            .addComponent(lblAddress)
                            .addComponent(lblCorporateID)
                            .addComponent(lblHealthInsuranceCompanyName))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCorporateID)
                                .addComponent(txtHealthInsuranceDetails)
                                .addComponent(txtPremium)
                                .addComponent(txtAddress)
                                .addComponent(txtDeductible)
                                .addComponent(txtSOB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblInsuranceDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(919, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblInsuranceDetails)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHealthInsuranceDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealthInsuranceCompanyName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorporateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorporateID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPremium))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeductible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeductible))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSOB))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(315, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        insurance.setHealthInsuranceCompany(txtHealthInsuranceDetails.getText());
        insurance.setCorporateIDNumber(txtCorporateID.getText());
        insurance.setAddress(txtAddress.getText());
        insurance.setPremium(txtPremium.getText());
        insurance.setDeductible(txtDeductible.getText());
        insurance.setStatementOfBenefits(txtSOB.getText());
        
        JOptionPane.showMessageDialog(this, "Health Insurance Details Saved.");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtCorporateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorporateIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorporateIDActionPerformed

    private void txtPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPremiumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPremiumActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtDeductibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeductibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeductibleActionPerformed

    private void txtSOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSOBActionPerformed

    private void txtHealthInsuranceDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthInsuranceDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthInsuranceDetailsActionPerformed

    private void txtHealthInsuranceDetailsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHealthInsuranceDetailsKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyChar()>='0' && evt.getKeyChar()<='9'))
        {
            txtHealthInsuranceDetails.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter a valid Health Insurance Company Name");
        }
        else
        {
            txtHealthInsuranceDetails.setEditable(true);
            
        }
    }//GEN-LAST:event_txtHealthInsuranceDetailsKeyPressed

    private void txtCorporateIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorporateIDKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyChar()>='0' && evt.getKeyChar()<='9'))
        {
            txtCorporateID.setEditable(true);
        }
        else
        {
            txtCorporateID.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter a valid Corporate ID");
            
        }
    }//GEN-LAST:event_txtCorporateIDKeyPressed

    private void txtPremiumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPremiumKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyChar()>='0' && evt.getKeyChar()<='9'))
        {
            txtPremium.setEditable(true);
        }
        else
        {
            txtPremium.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter a valid Premium");
            
        }
    }//GEN-LAST:event_txtPremiumKeyPressed

    private void txtDeductibleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeductibleKeyPressed
        // TODO add your handling code here:
        if((evt.getKeyChar()>='0' && evt.getKeyChar()<='9'))
        {
            txtDeductible.setEditable(true);
        }
        else
        {
            txtDeductible.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter a valid Deductible");
            
        }
    }//GEN-LAST:event_txtDeductibleKeyPressed

    private void txtHealthInsuranceDetailsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHealthInsuranceDetailsKeyReleased
        // TODO add your handling code here:
        
        int number = txtHealthInsuranceDetails.getCaretPosition();
        txtHealthInsuranceDetails.setText(txtHealthInsuranceDetails.getText().toUpperCase());
        txtHealthInsuranceDetails.setCaretPosition(number);
    }//GEN-LAST:event_txtHealthInsuranceDetailsKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCorporateID;
    private javax.swing.JLabel lblDeductible;
    private javax.swing.JLabel lblHealthInsuranceCompanyName;
    private javax.swing.JLabel lblInsuranceDetails;
    private javax.swing.JLabel lblPremium;
    private javax.swing.JLabel lblSOB;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCorporateID;
    private javax.swing.JTextField txtDeductible;
    private javax.swing.JTextField txtHealthInsuranceDetails;
    private javax.swing.JTextField txtPremium;
    private javax.swing.JTextField txtSOB;
    // End of variables declaration//GEN-END:variables
}
