/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InventoryManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Inventory;
import Business.Organization.HeadOffice;
import Business.Organization.RecordList;
import Business.Organization.Records;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LaptopWorkRequest;
import Business.WorkQueue.InventoryWorkRequest;
import Business.WorkQueue.HeadOfficeWorkRequest;
import Business.WorkQueue.StoreWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class InventoryManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InventoryManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Inventory organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem business;
    public InventoryManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Inventory organization, Enterprise enterprise,Network network, EcoSystem business) {
        initComponents();
        this.business=business;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network=network;
        txtStock.setText(Integer.toString(organization.getStock()));
        txtGiveAway.setText(Integer.toString(organization.getGiveAway()));
        if(organization.getStock()<20){
            btnGiveAway.setEnabled(false);
        }
        populateRequestTable();
    }
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblInventory.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getStatus();
            int quantity = ((LaptopWorkRequest) request).getQuantity();
            row[2] = quantity;
            String location = ((LaptopWorkRequest) request).getLocation();
            row[3] = location;
            String result = ((LaptopWorkRequest) request).getTestResult();
            row[4] = result == null ? "Waiting" : result;
            
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
        tblInventory = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnRequestWork = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnGiveAway = new javax.swing.JButton();
        btnDailySub = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtGiveAway = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 51));
        jScrollPane1.setForeground(new java.awt.Color(0, 255, 50));

        tblInventory.setBackground(new java.awt.Color(204, 204, 204));
        tblInventory.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status", "Quantity", "Location", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInventory);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRequestWork.setBackground(new java.awt.Color(102, 255, 204));
        btnRequestWork.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRequestWork.setText("Request Quality Assurance Center");
        btnRequestWork.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRequestWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestWorkActionPerformed(evt);
            }
        });

        btnProcess.setBackground(new java.awt.Color(255, 255, 102));
        btnProcess.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 0, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Available Stock Quantity:");

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtStock.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        btnGiveAway.setBackground(new java.awt.Color(153, 255, 102));
        btnGiveAway.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnGiveAway.setText("Donate");
        btnGiveAway.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGiveAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveAwayActionPerformed(evt);
            }
        });

        btnDailySub.setBackground(new java.awt.Color(204, 204, 255));
        btnDailySub.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDailySub.setText("Daily Contribution");
        btnDailySub.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDailySub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailySubActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(51, 0, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Donate :");

        txtGiveAway.setEditable(false);
        txtGiveAway.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtGiveAway.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Inventory Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtGiveAway, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnProcess)
                        .addGap(45, 45, 45)
                        .addComponent(btnGiveAway)
                        .addGap(48, 48, 48)
                        .addComponent(btnDailySub)
                        .addGap(42, 42, 42)
                        .addComponent(btnRequestWork)
                        .addGap(69, 69, 69)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtGiveAway, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnGiveAway)
                    .addComponent(btnDailySub)
                    .addComponent(btnRequestWork)
                    .addComponent(jButton1))
                .addContainerGap(171, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblInventory.getSelectedRow();

        if (selectedRow >= 0) {
            LaptopWorkRequest request = (LaptopWorkRequest) tblInventory.getValueAt(selectedRow, 0);

            request.setStatus("Processing");

            ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, network, request, organization);
            userProcessContainer.add("processWorkRequestIJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
            return;
        }
    }//GEN-LAST:event_btnProcessActionPerformed
    public void refreshButton(){
        txtStock.setText(String.valueOf(organization.getStock()));
    }
    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void btnRequestWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestWorkActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestWorkJPanel", new RequestWorkJPanel(userProcessContainer, userAccount,organization, enterprise, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestWorkActionPerformed

    private void btnDailySubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailySubActionPerformed
        // TODO add your handling code here:
        int ans = JOptionPane.showConfirmDialog(null, "Really want to add?","Warning", JOptionPane.YES_NO_OPTION);
        if (ans == 0) {
            int finalStock=organization.getFinalStock();
            int giveAwaycount= organization.getGiveAway();
            Records records=new Records();
            records.setLaptopDonated(finalStock);
            records.setLaptopGiven(giveAwaycount);
            records.setRequestDate(business.getCurrentDate());
    //        RecordList list=new RecordList();
    //        list.addRecords(records);
    //        organization.setRecordList(list);
            organization.getRecordList().addRecords(records);
            JOptionPane.showMessageDialog(null, "Daily Records Submitted Successfully");
        }                   
    }//GEN-LAST:event_btnDailySubActionPerformed
    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    private void btnGiveAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveAwayActionPerformed
        // TODO add your handling code here:
        int stock=organization.getStock();
        int giveAway=randInt(1,stock-20);
        int count= stock-giveAway;
        if(count<0){
            JOptionPane.showMessageDialog(null, "Not enough stock available for give away");
        }
        else{
        int existingGiveAway=organization.getGiveAway();
        int total=giveAway+existingGiveAway;
        organization.setGiveAway(total);
        int totalStock=stock-giveAway;
        organization.setStock(totalStock);
        txtStock.setText(String.valueOf(totalStock));
        txtGiveAway.setText(String.valueOf(total));
        JOptionPane.showMessageDialog(null, "Laptop Successfully donated to NGOs and Old-Aged Homes");
        }
    }//GEN-LAST:event_btnGiveAwayActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDailySub;
    private javax.swing.JButton btnGiveAway;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRequestWork;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTextField txtGiveAway;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
