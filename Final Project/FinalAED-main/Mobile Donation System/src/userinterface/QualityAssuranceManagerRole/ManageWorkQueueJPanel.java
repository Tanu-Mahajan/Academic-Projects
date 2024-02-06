/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.QualityAssuranceManagerRole;

import Business.EcoSystem;
import Business.Enterprise.ScrapHubEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ScrapPoint;
import Business.Organization.QualityAssuranceCenter;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ScrapManagerWorkRequest;
import Business.WorkQueue.LaptopWorkRequest;
import Business.WorkQueue.InventoryWorkRequest;
import Business.WorkQueue.QualityCenterManagerWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;
import userinterface.ScrapManagerRole.ScrapManagerWorkAreaJPanel;


public class ManageWorkQueueJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkQueueJPanel
     */
    private JPanel userProcessContainer;
    private QualityAssuranceCenter organization;
    private Enterprise enterprise;
    private UserAccount account;
    private Network network;
//    private LaptopWorkRequest request;
    ManageWorkQueueJPanel(JPanel userProcessContainer, UserAccount account, QualityAssuranceCenter organization, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
        this.network=network;
        populateRequestTable();
    }
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblManageWorkQueue.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getStatus();
            int quantity = ((LaptopWorkRequest) request).getQuantity();
            row[2] = quantity;
            
            String result = ((LaptopWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
         //   this.request=(ServiceCenterWorkRequest)request;
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageWorkQueue = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnRequest = new javax.swing.JButton();
        btnRecycling = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 51));
        jScrollPane1.setForeground(new java.awt.Color(0, 255, 50));

        tblManageWorkQueue.setBackground(new java.awt.Color(204, 204, 204));
        tblManageWorkQueue.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblManageWorkQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status", "Quantity", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageWorkQueue);

        btnRefresh.setBackground(new java.awt.Color(204, 204, 255));
        btnRefresh.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
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

        btnRequest.setBackground(new java.awt.Color(255, 255, 102));
        btnRequest.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRequest.setText("Request Test");
        btnRequest.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });

        btnRecycling.setBackground(new java.awt.Color(153, 255, 153));
        btnRecycling.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRecycling.setText("Send for Recycling");
        btnRecycling.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRecycling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecyclingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Work Queue");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(btnRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRecycling)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addGap(104, 104, 104)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequest)
                    .addComponent(btnRecycling)
                    .addComponent(btnRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageWorkQueue.getSelectedRow();       
        
        if (selectedRow >= 0) {
            
            LaptopWorkRequest request = (LaptopWorkRequest) tblManageWorkQueue.getValueAt(selectedRow, 0);
            if(!request.getStatus().equalsIgnoreCase("Laptop Decomposed")){
                request.setStatus("Processing");

                RequestTestJPanel rtjp = new RequestTestJPanel(userProcessContainer, organization, request, account, network);
                userProcessContainer.add("RequestTestJPanel", rtjp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid request"); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a message to request."); 
            return;
        }
    }//GEN-LAST:event_btnRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRecyclingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecyclingActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageWorkQueue.getSelectedRow();       
        
        if (selectedRow >= 0) {
            LaptopWorkRequest request = (LaptopWorkRequest) tblManageWorkQueue.getValueAt(selectedRow, 0);
            if (request.getTestResult().equalsIgnoreCase("Bad Laptop")) {
                request.setStatus("Processing");
                //RecycleManagerWorkRequest recyclRequest = new ScrapManagerWorkRequest(); 
                request.setMessage(request.getMessage());
                request.setReceiver(request.getReceiver());
                request.setQuantity(request.getQuantity());
                request.setStatus("Sent");
                request.setTestResult("Waiting");
                Enterprise en= null;
                for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(e instanceof ScrapHubEnterprise){
                        en=e;
                        Organization org=null;
                        for(Organization o : en.getOrganizationDirectory().getOrganizationList()){
                            if(o instanceof ScrapPoint){
                                org=o;
                                break;

                            }
                        }
                        if(org!=null){
                            org.getWorkQueue().getWorkRequestList().add(request);
                            account.getWorkQueue().getWorkRequestList().add(request);
                        }
                    }
                }
                JOptionPane.showMessageDialog(null, "Request Sent to Recycling Manager");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Request");
            }        
        } else {
            JOptionPane.showMessageDialog(null, "Please select a message to send for recycling."); 
            return;
        }
    }//GEN-LAST:event_btnRecyclingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRecycling;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageWorkQueue;
    // End of variables declaration//GEN-END:variables
}
