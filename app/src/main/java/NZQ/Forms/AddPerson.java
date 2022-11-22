package NZQ.Forms;

import ViewModel.AccountManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddPerson extends javax.swing.JFrame {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_TELL = Pattern.compile("[۰-۹0-9]+");
    public static final Pattern VALID_NATIONAL_ID_REGEX = Pattern.compile("[۰-۹0-9]+");
    private AccountManager accountManager;

    public AddPerson(AccountManager accountManager) {
        initComponents();
        this.accountManager = accountManager;
        validationErrorLabel.setVisible(false);
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
        submitPersonButton = new javax.swing.JButton();
        validationErrorLabel = new javax.swing.JLabel();
        nationalCodeTextField = new javax.swing.JTextField();
        addPersonLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("افزودن شخص یا گروه");

        nameLabel.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameLabel.setText("نام صاحب حساب / گروه");

        nationalCodeLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        nationalCodeLabel.setText("کد ملی / کد حقوقی");

        addressLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        addressLabel.setText("آدرس");

        telLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        telLabel.setText("تلفن");

        emailLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        emailLabel.setText("ایمیل");

        nameTextField.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        nameTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        addressTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        addressTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tellTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        tellTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        emailTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        submitPersonButton.setFont(new java.awt.Font("IRANSansX", 1, 13)); // NOI18N
        submitPersonButton.setText("ثبت");
        submitPersonButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitPersonButtonMouseClicked(evt);
            }
        });
        submitPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitPersonButtonActionPerformed(evt);
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

        addPersonLabel.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        addPersonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPersonLabel.setText("افزودن شخص / گروه");
        addPersonLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(validationErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tellTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addressTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nationalCodeTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nationalCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(telLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(addPersonLabel)
                        .addGap(96, 96, 96))))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(submitPersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPersonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nationalCodeLabel)
                    .addComponent(nationalCodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tellTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(40, 40, 40)
                .addComponent(validationErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitPersonButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitPersonButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitPersonButtonMouseClicked

    }//GEN-LAST:event_submitPersonButtonMouseClicked

    private void nationalCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalCodeTextFieldActionPerformed

    private void submitPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitPersonButtonActionPerformed
        if (isFieldsValid()) {
            if (!accountManager.isUserExist(nationalCodeTextField.getText())) {
                accountManager.add(accountManager.accounts.size() + 1,
                        nameTextField.getText(),
                        nationalCodeTextField.getText(),
                        addressTextField.getText(),
                        tellTextField.getText(),
                        emailTextField.getText());
                accountManager.save();
                setVisible(false);
            } else {
                validationErrorLabel.setText("این حساب قبلا ثبت شده");
                validationErrorLabel.setVisible(true);
            }
        }
    }//GEN-LAST:event_submitPersonButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AccountManager accountManager = new AccountManager();
                new AddPerson(accountManager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPersonLabel;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel nationalCodeLabel;
    private javax.swing.JTextField nationalCodeTextField;
    private javax.swing.JButton submitPersonButton;
    private javax.swing.JLabel telLabel;
    private javax.swing.JTextField tellTextField;
    private javax.swing.JLabel validationErrorLabel;
    // End of variables declaration//GEN-END:variables
}
