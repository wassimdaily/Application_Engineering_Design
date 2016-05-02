/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Patient;
import Business.Person;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hpanjwani
 */
public class ViewPersonPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ManageProfilePanel managePanel;
    private Person person;
    
    private String ePattern = "^[a-zA-Z0-9.'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    
    /**
     * Creates new form ViewPersonPanel
     */
    public ViewPersonPanel(Person person, JPanel userProcessContainer, ManageProfilePanel managePanel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.managePanel = managePanel;
        this.person = person;
        
        populateForm();
    }
    
    public void populateForm()  {
        
        firstName.setText(person.getFirstName());
        
        firstNameTextField.setText(person.getFirstName());
        lastNameTextField.setText(person.getLastName());
        middleNameTextField.setText(person.getMiddleName());
        streetAddressTextField.setText(person.getStreetAddress());
        townTextField.setText(person.getTown());
        zipCodeTextField.setText(String.valueOf(person.getZipCode()));
        dobTextField.setText(person.getDob());
        occupationTextField.setText(person.getOccupation());
        emailTextField.setText(person.getEmail());
        phoneNumberTextField.setText(String.valueOf(person.getPhoneNumber()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        middleNameTextField = new javax.swing.JTextField();
        dobTextField = new javax.swing.JTextField();
        streetAddressTextField = new javax.swing.JTextField();
        townTextField = new javax.swing.JTextField();
        zipCodeTextField = new javax.swing.JTextField();
        occupationTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        firstName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("First Name:");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("EDIT PERSON PROFILE #");

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Last Name:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Middle Name:");

        jLabel12.setBackground(new java.awt.Color(255, 255, 204));
        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setText("Date of Birth (YYYY/MM/DD):");

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Street Address:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 204));
        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Town:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 204));
        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("Zip Code:");

        jLabel10.setBackground(new java.awt.Color(255, 255, 204));
        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("Occupation:");

        jLabel11.setBackground(new java.awt.Color(255, 255, 204));
        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setText("Email ID:");

        jLabel14.setBackground(new java.awt.Color(255, 255, 204));
        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel14.setText("Phone Number:");

        firstNameTextField.setEditable(false);

        lastNameTextField.setEditable(false);

        middleNameTextField.setEditable(false);

        dobTextField.setEditable(false);

        streetAddressTextField.setEditable(false);

        townTextField.setEditable(false);

        zipCodeTextField.setEditable(false);

        occupationTextField.setEditable(false);

        emailTextField.setEditable(false);

        phoneNumberTextField.setEditable(false);

        backBtn.setBackground(new java.awt.Color(255, 255, 204));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(255, 255, 204));
        saveBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(255, 255, 204));
        updateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        firstName.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        firstName.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(firstName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backBtn)
                        .addGap(77, 77, 77)
                        .addComponent(saveBtn)
                        .addGap(50, 50, 50)
                        .addComponent(updateBtn)))
                .addContainerGap(253, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(middleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(occupationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(streetAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(townTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(backBtn)
                    .addComponent(saveBtn))
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(middleNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(streetAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(townTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(zipCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(occupationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(85, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        managePanel.populateTable();
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
        streetAddressTextField.setEditable(true);
        townTextField.setEditable(true);
        zipCodeTextField.setEditable(true);
        dobTextField.setEditable(true);
        occupationTextField.setEditable(true);
        emailTextField.setEditable(true);
        phoneNumberTextField.setEditable(true);
        
        //enable the save button
        saveBtn.setEnabled(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
        if(firstNameTextField.getText().trim().isEmpty())   {
            JOptionPane.showMessageDialog(this, "First Name cannot be blank!", "Error", JOptionPane.OK_OPTION);
            firstNameTextField.setBackground(Color.red);
        } 
        else if (!firstNameTextField.getText().matches("[a-zA-Z]*")){
            JOptionPane.showMessageDialog(this, "Please enter valid First Name!", "Error", JOptionPane.OK_OPTION);
            firstNameTextField.setBackground(Color.red);
        }
        else if(lastNameTextField.getText().trim().isEmpty())   {
            JOptionPane.showMessageDialog(this, "Last Name cannot be blank!", "Error", JOptionPane.OK_OPTION);
            lastNameTextField.setBackground(Color.red);
        }
        else if (!lastNameTextField.getText().matches("[a-zA-Z]*")){
            JOptionPane.showMessageDialog(this, "Please enter valid Last Name!", "Error", JOptionPane.OK_OPTION);
            lastNameTextField.setBackground(Color.red);
        }
        else if(middleNameTextField.getText().trim().isEmpty())   {
            JOptionPane.showMessageDialog(this, "Middle Name cannot be blank!", "Error", JOptionPane.OK_OPTION);
            middleNameTextField.setBackground(Color.red);
        }
        else if (!middleNameTextField.getText().matches("[a-zA-Z]*")){
            JOptionPane.showMessageDialog(this, "Please enter valid Middle Name!", "Error", JOptionPane.OK_OPTION);
            middleNameTextField.setBackground(Color.red);
        }
        else if(streetAddressTextField.getText().trim().isEmpty())   {
            JOptionPane.showMessageDialog(this, "Street Address  cannot be blank!", "Error", JOptionPane.OK_OPTION);
            streetAddressTextField.setBackground(Color.red);
        }
        else if(townTextField.getText().trim().isEmpty())   {
            JOptionPane.showMessageDialog(this, "Town cannot be blank!", "Error", JOptionPane.OK_OPTION);
            townTextField.setBackground(Color.red);
        }
        else if (townTextField.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(this, "Please enter valid Town name!", "Error", JOptionPane.OK_OPTION);
            townTextField.setBackground(Color.red);
        }
        else if(zipCodeTextField.getText().trim().isEmpty())   {
            JOptionPane.showMessageDialog(this, "Zip Code cannot be blank!", "Error", JOptionPane.OK_OPTION);
            zipCodeTextField.setBackground(Color.red);
        }
        else if (!zipCodeTextField.getText().matches("\\d{5}")){
            JOptionPane.showMessageDialog(this, "Please enter valid 5 digit Zip Code!", "Error", JOptionPane.OK_OPTION);
            zipCodeTextField.setBackground(Color.red);
        }
        else if(occupationTextField.getText().trim().isEmpty())   {
            JOptionPane.showMessageDialog(this, "Please enter Occupation!", "Error", JOptionPane.OK_OPTION);
            occupationTextField.setBackground(Color.red);
        }
        else if(emailTextField.getText().trim().isEmpty())   {
            JOptionPane.showMessageDialog(this, "Email ID  cannot be blank!", "Error", JOptionPane.OK_OPTION);
            emailTextField.setBackground(Color.red);
        }
        else if(!emailTextField.getText().matches(ePattern))   {
            JOptionPane.showMessageDialog(this, "Please enter valid Email ID!", "Error", JOptionPane.OK_OPTION);
            emailTextField.setBackground(Color.red);
        }
        else if(phoneNumberTextField.getText().trim().isEmpty())   {
            JOptionPane.showMessageDialog(this, "Phone Number field cannot be blank!", "Error", JOptionPane.OK_OPTION);
            phoneNumberTextField.setBackground(Color.red);
        }
        else if (!phoneNumberTextField.getText().matches("\\d{10}")){
            JOptionPane.showMessageDialog(this, "Please enter valid 10 digit Phone Number!", "Error", JOptionPane.OK_OPTION);
            phoneNumberTextField.setBackground(Color.red);
        }
        else if(!dobTextField.getText().matches("((?:19|20)\\d\\d)/(0?[1-9]|1[012])/([12][0-9]|3[01]|0?[1-9])")) {
            JOptionPane.showMessageDialog(this, "Please enter valid Date of Birth in format (YYYY/MM/DD)!", "Error", JOptionPane.OK_OPTION);
            dobTextField.setBackground(Color.red);
        }
        else    {
            
            person.setFirstName(firstNameTextField.getText());
            person.setLastName(lastNameTextField.getText());
            person.setMiddleName(middleNameTextField.getText());
            person.setDob(dobTextField.getText());
            person.setStreetAddress(streetAddressTextField.getText());
            person.setTown(townTextField.getText());
            person.setZipCode(Integer.parseInt(zipCodeTextField.getText()));
            person.setOccupation(occupationTextField.getText());        
            person.setEmail(emailTextField.getText());        
            person.setPhoneNumber(Long.parseLong(phoneNumberTextField.getText()));
            
            JOptionPane.showMessageDialog(this, "Person Information is successfully updated!", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstName;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField middleNameTextField;
    private javax.swing.JTextField occupationTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField streetAddressTextField;
    private javax.swing.JTextField townTextField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}