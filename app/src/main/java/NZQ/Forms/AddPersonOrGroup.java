package NZQ.Forms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddPersonOrGroup extends javax.swing.JFrame {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_TELL = Pattern.compile("[۰-۹0-9]+");
    public static final Pattern VALID_NATIONAL_ID_REGEX = Pattern.compile("[۰-۹0-9]+");
    

    public AddPersonOrGroup() {
        initComponents();
        validationErrorLabel.setVisible(false);
        groupItemsList.setEnabled(false);
       groupItemsScrollPanel.setEnabled(false);
        //groupItemsScrollPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        nationalCodeLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        tellTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        validationErrorLabel = new javax.swing.JLabel();
        nationalCodeTextField = new javax.swing.JTextField();
        enableGroupsCheckBox = new javax.swing.JCheckBox();
        groupItemsScrollPanel = new javax.swing.JScrollPane();
        groupItemsList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("افزودن شخص یا گروه");

        nameLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        nameLabel.setText("نام و نام خانوادگی");

        nationalCodeLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        nationalCodeLabel.setText("کد ملی");

        addressLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        addressLabel.setText("آدرس");

        telLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        telLabel.setText("تلفن");

        emailLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        emailLabel.setText("ایمیل");

        nameTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        nameTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        addressTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        addressTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tellTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        tellTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        emailTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        submitButton.setFont(new java.awt.Font("IRANSansX", 1, 13)); // NOI18N
        submitButton.setText("ثبت");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitButtonMouseClicked(evt);
            }
        });

        validationErrorLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        validationErrorLabel.setForeground(new java.awt.Color(204, 0, 0));
        validationErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        validationErrorLabel.setText("Validation Error Text");

        nationalCodeTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nationalCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalCodeTextFieldActionPerformed(evt);
            }
        });

        enableGroupsCheckBox.setText("گروه");
        enableGroupsCheckBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enableGroupsCheckBoxMouseClicked(evt);
            }
        });
        enableGroupsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableGroupsCheckBoxActionPerformed(evt);
            }
        });

        groupItemsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        groupItemsScrollPanel.setViewportView(groupItemsList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(validationErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addressLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(groupItemsScrollPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(tellTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(emailLabel)
                                                .addComponent(telLabel))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                    .addComponent(enableGroupsCheckBox))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                        .addComponent(nationalCodeTextField))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nationalCodeLabel)
                                        .addComponent(nameLabel)))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalCodeLabel)
                    .addComponent(nationalCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tellTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enableGroupsCheckBox)
                    .addComponent(groupItemsScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(validationErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseClicked
        if (isFieldsValid()) {
            // TODO: implements account.
        }
    }//GEN-LAST:event_submitButtonMouseClicked

    private void nationalCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalCodeTextFieldActionPerformed

    private void enableGroupsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableGroupsCheckBoxActionPerformed
    
    }//GEN-LAST:event_enableGroupsCheckBoxActionPerformed

    private void enableGroupsCheckBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enableGroupsCheckBoxMouseClicked
      if(enableGroupsCheckBox.isSelected()) {
          groupItemsList.setEnabled(true);
      } else {
          groupItemsList.setEnabled(false);
      }
    }//GEN-LAST:event_enableGroupsCheckBoxMouseClicked

    private boolean isFieldsValid() {
        if (nameTextField.getText().equals("")) {
            validationErrorLabel.setText("لطفا نام را وارد نمایید.");
            validationErrorLabel.setVisible(true);
            return false;
        }

        if (nationalCodeTextField.getText().equals("")) {
            validationErrorLabel.setText("لطفا کد ملی را وارد نمایید.");
            validationErrorLabel.setVisible(true);
            return false;
        }

        if (addressTextField.getText().equals("")) {
            validationErrorLabel.setText("لطفا آدرس را وارد نمایید.");
            validationErrorLabel.setVisible(true);
            return false;
        }

        if (tellTextField.getText().equals("")) {
            validationErrorLabel.setText("لطفا تلفن را وارد نمایید.");
            validationErrorLabel.setVisible(true);
            return false;
        }

        if (emailTextField.getText().equals("")) {
            validationErrorLabel.setText("لطفا ایمیل را وارد نمایید.");
            validationErrorLabel.setVisible(true);
            return false;
        }

        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailTextField.getText());
        if (!matcher.find()) {
            validationErrorLabel.setText("ایمیل معتبر نیست.");
            validationErrorLabel.setVisible(true);
            return false;
        }
        Matcher tellTextFieldMatcher = VALID_TELL.matcher(tellTextField.getText());
        if (!tellTextFieldMatcher.find()) {
            validationErrorLabel.setText(".تلفن معتبر نیست");
            validationErrorLabel.setVisible(true);
            return false;
        }
        Matcher nationalIdTextFieldMatcher = VALID_NATIONAL_ID_REGEX.matcher(tellTextField.getText());
        if (!nationalIdTextFieldMatcher.find()) {
            validationErrorLabel.setText(".کد ملی معتبر نیست");
            validationErrorLabel.setVisible(true);
            return false;
        }

        return true;
    }

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
            java.util.logging.Logger.getLogger(AddPersonOrGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPersonOrGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPersonOrGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPersonOrGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPersonOrGroup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JCheckBox enableGroupsCheckBox;
    private javax.swing.JList<String> groupItemsList;
    private javax.swing.JScrollPane groupItemsScrollPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nationalCodeLabel;
    private javax.swing.JTextField nationalCodeTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel telLabel;
    private javax.swing.JTextField tellTextField;
    private javax.swing.JLabel validationErrorLabel;
    // End of variables declaration//GEN-END:variables
}
