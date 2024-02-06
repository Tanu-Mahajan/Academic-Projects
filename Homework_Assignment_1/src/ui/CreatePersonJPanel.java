/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;



import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Person;

/**
 *
 * @author tanujamahajan
 */


public class CreatePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    
    Person person;
    public CreatePersonJPanel(Person person) {
        initComponents();
        
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNationality = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();
        lblSSN = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        txtMonth = new javax.swing.JComboBox<>();
        txtDay = new javax.swing.JComboBox<>();
        txtYear = new javax.swing.JComboBox<>();
        lblProfilePicture = new javax.swing.JLabel();
        lblWebsiteURL = new javax.swing.JLabel();
        txtWebsiteURL = new javax.swing.JTextField();
        btnUploadPicture = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(400, 300));

        lblTitle.setBackground(new java.awt.Color(204, 255, 255));
        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Personal Details");
        lblTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 51, 255), null));

        lblName.setText("Name:");

        lblDOB.setText("Date of Birth:");

        lblNationality.setText("Nationality:");

        lblEmailID.setText("Email ID:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtNationality.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNationalityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNationalityKeyReleased(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(204, 255, 204));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblAddress.setText("Address:");

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
        });

        lblPhoneNo.setText("Phone No:");

        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });
        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNoKeyPressed(evt);
            }
        });

        lblGender.setText("Gender:");

        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });

        lblSSN.setText("SSN:");

        txtSSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSSNKeyPressed(evt);
            }
        });

        txtMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        txtMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMonthActionPerformed(evt);
            }
        });

        txtDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        txtYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

        lblProfilePicture.setText("Profile Picture");

        lblWebsiteURL.setText("Website URL:");

        btnUploadPicture.setText("Upload Picture");
        btnUploadPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPictureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmailID)
                            .addComponent(lblNationality)
                            .addComponent(lblDOB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblAddress)
                            .addComponent(lblPhoneNo)
                            .addComponent(lblGender)
                            .addComponent(lblSSN)
                            .addComponent(lblProfilePicture)
                            .addComponent(lblWebsiteURL))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNationality)
                                    .addComponent(txtEmailID)
                                    .addComponent(txtAddress)
                                    .addComponent(txtPhoneNo)
                                    .addComponent(txtSSN)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtName)
                                    .addComponent(txtWebsiteURL, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnUploadPicture)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(751, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDOB)
                            .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNationality)
                            .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailID)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPhoneNo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProfilePicture)
                    .addComponent(btnUploadPicture))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWebsiteURL)
                    .addComponent(txtWebsiteURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        person.setName(txtName.getText());
//        person.setDateofbirth(txtMonth.getSelectedIndex());
//        person.setDateofbirth(txtDay.getSelectedIndex());
//        person.setDateofbirth(txtYear.getSelectedIndex());
        person.setEmailid(txtEmailID.getText());
        person.setNationality(txtNationality.getText());
        person.setAddress(txtAddress.getText());
        person.setPhonenumber(txtPhoneNo.getText());
        person.setGender(txtGender.getSelectedItem().toString());
        person.setSsn(txtSSN.getText());
       // product.setProfilepicture(txtProfilePicture.getText());
        person.setWebsiteURL(txtWebsiteURL.getText());
        String dateofbirth = txtMonth.getSelectedIndex()+1 + "/" + txtDay.getSelectedItem().toString() + "/" + txtYear.getSelectedItem().toString();
        person.setDateofbirth(dateofbirth);
        
        JOptionPane.showMessageDialog(this, "Personal Details Saved.");
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUploadPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPictureActionPerformed
        // TODO add your handling code here:
        
        JFileChooser browseImageFile = new JFileChooser();
        
        FileNameExtensionFilter ext = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(ext);
        
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION)
        {
           // Graphics g = new Graphics();
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();   
            JOptionPane.showMessageDialog(null, "Image Uploaded Successfully");
        }
    }//GEN-LAST:event_btnUploadPictureActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
          if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
            {
                txtName.setEditable(false);
                JOptionPane.showMessageDialog(this, "Enter a valid Name");
            }
          else
          {
              txtName.setEditable(true);
          }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtPhoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNoKeyPressed
        // TODO add your handling code here:
            String phone_number = txtPhoneNo.getText();
            int length = phone_number.length();
            char ch = evt.getKeyChar();
            
            if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
            {
                if(length<10)
                {
                    txtPhoneNo.setEditable(true);
                }
                else
                {
                    txtPhoneNo.setEditable(false);
                    JOptionPane.showMessageDialog(this, "Enter a valid Phone Number");
                }
            }
            else
            {
                if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                {
                    txtPhoneNo.setEditable(true);
                }
                else
                {
                    txtPhoneNo.setEditable(false);
                    JOptionPane.showMessageDialog(this, "Enter a valid Phone Number");
                }
            }
    }//GEN-LAST:event_txtPhoneNoKeyPressed

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyPressed

    private void txtNationalityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNationalityKeyPressed
        // TODO add your handling code here:
        
        char name = evt.getKeyChar();
        if(Character.isDigit(name) || Character.isSpaceChar(name) )
        {
            txtNationality.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please Enter Valid Characters.");
        }
        else
        {
            txtNationality.setEditable(true);
        }
    }//GEN-LAST:event_txtNationalityKeyPressed

    private void txtSSNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNKeyPressed
        // TODO add your handling code here:
            String ssn = txtSSN.getText();
            int length = ssn.length();
            char ch = evt.getKeyChar();
            if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
            {
                if(length<9)
                {
                    txtSSN.setEditable(true);
                }
                else
                {
                    txtSSN.setEditable(false);
                    JOptionPane.showMessageDialog(this, "Enter a valid SSN");
                }
            }
            else
            {
                if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
                {
                    txtSSN.setEditable(true);
                }
                else
                {
                    txtSSN.setEditable(false);
                    JOptionPane.showMessageDialog(this, "Enter a valid SSN");
                }
            }
    }//GEN-LAST:event_txtSSNKeyPressed

    private void txtMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonthActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        int number = txtName.getCaretPosition();
        txtName.setText(txtName.getText().toUpperCase());
        txtName.setCaretPosition(number);
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNationalityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNationalityKeyReleased
        // TODO add your handling code here:
        
        int number = txtNationality.getCaretPosition();
        txtNationality.setText(txtNationality.getText().toUpperCase());
        txtNationality.setCaretPosition(number);
    }//GEN-LAST:event_txtNationalityKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUploadPicture;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWebsiteURL;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JComboBox<String> txtDay;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JComboBox<String> txtMonth;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtWebsiteURL;
    private javax.swing.JComboBox<String> txtYear;
    // End of variables declaration//GEN-END:variables

}
