/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.TechnicianRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.QualityAssuranceCenter;
import Business.Organization.Technician;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LaptopWorkRequest;
import Business.WorkQueue.TechnicianWorkRequest;
import Business.WorkQueue.QualityCenterManagerWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;

public class TechnicianWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TechnicianWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Technician lab;
    private Enterprise enterprise;
    private EcoSystem business;
    QualityCenterManagerWorkRequest request; 
    public TechnicianWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Technician lab, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.lab = lab;
        this.enterprise = enterprise;
        this.business = business;
        
        populateRequestTable();
    }
    
    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageWorkQueue.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
//            System.out.println("Request"+request.getMessage());
           // row[1] = ((ServiceCenterWorkRequest) request).getTechnicianName();
            row[1] = request.getStatus();
            int quantity = ((LaptopWorkRequest) request).getQuantity();
            row[2] = quantity;
            String result = ((LaptopWorkRequest) request).getTestResult();
            row[3] = result == null ? "Waiting" : result;
            
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
        btnProcess = new javax.swing.JButton();
        btnRefresh1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

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

        btnProcess.setBackground(new java.awt.Color(153, 255, 153));
        btnProcess.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnRefresh1.setBackground(new java.awt.Color(204, 204, 255));
        btnRefresh1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRefresh1.setText("Refresh");
        btnRefresh1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Technician Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnProcess)
                                .addGap(98, 98, 98)
                                .addComponent(btnRefresh1)
                                .addGap(174, 174, 174))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(190, 190, 190))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnRefresh1))
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageWorkQueue.getSelectedRow();        
        
        if (selectedRow >= 0) {
            LaptopWorkRequest request = (LaptopWorkRequest) tblManageWorkQueue.getValueAt(selectedRow, 0);
            if(!request.getStatus().equalsIgnoreCase("Laptop Decomposed")){
                request.setStatus("Processing");

                ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
                userProcessContainer.add("pwrjp", processWorkRequestJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid request"); 
            }
        } else {
           JOptionPane.showMessageDialog(null, "Please select a request message to process."); 
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
    }//GEN-LAST:event_btnRefresh1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManageWorkQueue;
    // End of variables declaration//GEN-END:variables
}
