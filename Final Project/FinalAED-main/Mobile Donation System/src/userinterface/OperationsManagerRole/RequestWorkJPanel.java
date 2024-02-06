/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OperationsManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.CentralHubEnterprise;
import Business.Enterprise.LogisticsNexusEnterprise;
import Business.Network.Network;
import Business.Organization.HeadOffice;
import Business.Organization.Organization;
import Business.Organization.Logistics;
import Business.UserAccount.UserAccount;
import Business.Validations;
import Business.WorkQueue.LaptopWorkRequest;
import Business.WorkQueue.HeadOfficeWorkRequest;
import Business.WorkQueue.LogisticsWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class RequestWorkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private LaptopWorkRequest request;
    private Network network;
    private Organization organization;

    /**
     * Creates new form RequestWorkJPanel
     */
    public RequestWorkJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization, EcoSystem business, LaptopWorkRequest request, Network network) {
        initComponents();
        this.organization = organization;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.request = request;
        this.network = network;
        txtQuantity.setText(Integer.toString(request.getQuantity()));
        txtLocation.setText(request.getLocation());
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
        txtMessage = new javax.swing.JTextField();
        btnRequestWork = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Message: ");

        txtMessage.setBackground(new java.awt.Color(242, 242, 242));
        txtMessage.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        btnRequestWork.setBackground(new java.awt.Color(153, 255, 153));
        btnRequestWork.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRequestWork.setText("Submit Work Request");
        btnRequestWork.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRequestWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestWorkActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(153, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Quantity:");

        txtQuantity.setBackground(new java.awt.Color(242, 242, 242));
        txtQuantity.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Location:");

        txtLocation.setBackground(new java.awt.Color(242, 242, 242));
        txtLocation.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Request Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(194, 194, 194))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnRequestWork)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addComponent(btnRequestWork)
                .addGap(184, 184, 184)
                .addComponent(btnBack)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestWorkActionPerformed
        // TODO add your handling code here:
        boolean msgFlag = false;
        boolean qtyFlag = false;
        boolean locFlag = false;
        if (txtMessage.getText().isEmpty()) {
            msgFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter your message", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (txtQuantity.getText().isEmpty()) {
            qtyFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter quantity", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!Validations.isDigit(txtQuantity.getText())) {
            qtyFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter quantity as integer", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (txtLocation.getText().isEmpty()) {
            locFlag = true;
            JOptionPane.showMessageDialog(null, "Please enter location", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (!msgFlag & !qtyFlag & !locFlag){
            //TransportWorkRequest request=new LogisticsWorkRequest();
            request.setSender(userAccount);
            request.setSenderOrganization(organization);
            request.setMessage(txtMessage.getText());
            request.setQuantity(Integer.valueOf(txtQuantity.getText()));
            request.setLocation(txtLocation.getText());
            request.setStatus("Request sent to transport");

            Enterprise en = null;
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println("Enterprise" + enterprise.getName());
                if (enterprise instanceof LogisticsNexusEnterprise) {
                    System.out.println("Yes");
                    en = enterprise;
                    Organization org = null;
                    for (Organization organization : en.getOrganizationDirectory().getOrganizationList()) {

                        if (organization instanceof Logistics) {
                            System.out.println("Yes Organization");
                            org = organization;
                            break;
                        }
                    }
                    if (org != null) {
                        System.out.println("Org" + org.getName());
                        System.out.println("User Account" + userAccount.getUsername());
                        org.getWorkQueue().getWorkRequestList().add(request);
                        System.out.println("Orga" + org.getWorkQueue().getWorkRequestList());
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        JOptionPane.showMessageDialog(null, "Request sent successfully.");
                        txtMessage.setText("");
                        txtQuantity.setText("");
                        txtLocation.setText("");
                    }

                }
            }
        }
    }//GEN-LAST:event_btnRequestWorkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OperationsManagerWorkAreaJPanel omwajp = (OperationsManagerWorkAreaJPanel) component;
        omwajp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequestWork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}