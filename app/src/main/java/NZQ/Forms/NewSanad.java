/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NZQ.Forms;

import Model.Account;
import Model.Date;
import Model.Transaction.TransactionType;
import ViewModel.AccountManager;
import ViewModel.Transaction.PaidManager;
import ViewModel.Transaction.PrePaidManager;
import java.awt.ComponentOrientation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;

public class NewSanad extends javax.swing.JFrame {

    public static final Pattern VALID_PRICE = Pattern.compile("[0-9]+");
    public static final Pattern VALID_YEAR = Pattern.compile("[0-9]{4}");
    public static final Pattern VALID_DAY_DATE = Pattern.compile("([1-9]|1[0-9]|2[0-9]|3[0-1])");
    public static final Pattern VALID_MONTH_DATE = Pattern.compile("([1-9]|1[0-2])");
    private AccountManager accountManager;
    private PaidManager paidManager;
    private PrePaidManager prePaidManager;
    private int selectedAccount = 0;
    private TransactionType transactionType;
    private boolean isTransactionRadioButtonNull = true;

    public NewSanad(AccountManager accountManager, PaidManager paidManager, PrePaidManager prePaidManager) {
        this.accountManager = accountManager;
        this.paidManager = paidManager;
        this.prePaidManager = prePaidManager;
        initComponents();
        validatoinLabel.setVisible(false);
        paidTypeSanadButton.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        prepaidTypeSanadButton.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        bedehkaarTypeButton.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        bestankaarTypeButton.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        initList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        sabtSanadLabel = new javax.swing.JLabel();
        sanadOwnerAccount = new javax.swing.JLabel();
        sanadPriceLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountList = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        bedehkaarTypeButton = new javax.swing.JRadioButton();
        bestankaarTypeButton = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        paidTypeSanadButton = new javax.swing.JRadioButton();
        prepaidTypeSanadButton = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        sanadTypeLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        validatoinLabel = new javax.swing.JLabel();
        sanadTypeLabel1 = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        yearTextField = new javax.swing.JTextField();
        monthTextField = new javax.swing.JTextField();
        placeHolderDate2 = new javax.swing.JLabel();
        placeHolderDate3 = new javax.swing.JLabel();
        dayTextField = new javax.swing.JTextField();
        sanadTypeLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        sabtSanadLabel.setFont(new java.awt.Font("IRANSansX", 1, 24)); // NOI18N
        sabtSanadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sabtSanadLabel.setText("ثبت سند");

        sanadOwnerAccount.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        sanadOwnerAccount.setText("صاحب حساب");

        sanadPriceLabel.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        sanadPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        sanadPriceLabel.setText("مبلغ ");

        accountList.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        accountList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        accountList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                accountListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(accountList);

        buttonGroup2.add(bedehkaarTypeButton);
        bedehkaarTypeButton.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        bedehkaarTypeButton.setText("بدهکار");
        bedehkaarTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedehkaarTypeButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(bestankaarTypeButton);
        bestankaarTypeButton.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        bestankaarTypeButton.setText("بستانکار");
        bestankaarTypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bestankaarTypeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bestankaarTypeButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bedehkaarTypeButton, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bedehkaarTypeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bestankaarTypeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        buttonGroup1.add(paidTypeSanadButton);
        paidTypeSanadButton.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        paidTypeSanadButton.setText("نقدی");
        paidTypeSanadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidTypeSanadButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(prepaidTypeSanadButton);
        prepaidTypeSanadButton.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        prepaidTypeSanadButton.setText("اعتباری");
        prepaidTypeSanadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prepaidTypeSanadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prepaidTypeSanadButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paidTypeSanadButton, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paidTypeSanadButton)
                .addGap(18, 18, 18)
                .addComponent(prepaidTypeSanadButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        sanadTypeLabel.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        sanadTypeLabel.setText("نوع سند ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addComponent(sanadTypeLabel))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(sanadTypeLabel)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        submitButton.setFont(new java.awt.Font("IRANSansX", 1, 13)); // NOI18N
        submitButton.setText("ثبت");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        validatoinLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        validatoinLabel.setForeground(new java.awt.Color(204, 0, 0));
        validatoinLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        validatoinLabel.setText("Validation");

        sanadTypeLabel1.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        sanadTypeLabel1.setText("تاریخ");

        descriptionTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        descriptionTextField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        yearTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        yearTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        monthTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        monthTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        placeHolderDate2.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        placeHolderDate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        placeHolderDate2.setText("/");

        placeHolderDate3.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        placeHolderDate3.setText("/");

        dayTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        dayTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sanadTypeLabel2.setFont(new java.awt.Font("IRANSansX", 0, 18)); // NOI18N
        sanadTypeLabel2.setText("توضیحات");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sabtSanadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceTextField)
                            .addComponent(jScrollPane1))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sanadOwnerAccount)
                            .addComponent(sanadPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(yearTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(placeHolderDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(placeHolderDate3)
                                .addGap(17, 17, 17)
                                .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(descriptionTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sanadTypeLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sanadTypeLabel1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap())
            .addComponent(validatoinLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(sabtSanadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(sanadOwnerAccount)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sanadPriceLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(sanadTypeLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(placeHolderDate3)
                        .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sanadTypeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(placeHolderDate2)))
                .addGap(71, 71, 71)
                .addComponent(validatoinLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (isInputsAreValid()) {
            Date dateSelectedByUser = new Date(Integer.parseInt(yearTextField.getText()),
                    Integer.parseInt(monthTextField.getText()),
                    Integer.parseInt(dayTextField.getText()),
                    Date.getCurrentDate().getHour(), Date.getCurrentDate().getMinute());

            if (Date.isDateDead(dateSelectedByUser)) {
                validatoinLabel.setText("نمی‌توانید تاریخ گذشته را وارد کنید!");
                validatoinLabel.setVisible(true);
                return;
            }

            if (paidTypeSanadButton.isSelected()) {
                if (transactionType != null) {
                    transactionType = ((bedehkaarTypeButton.isSelected()) ? TransactionType.DEBT : TransactionType.CREDIT);
                    paidManager.add(paidManager.paids.size() + 1,
                            selectedAccount + 1,
                            dateSelectedByUser,
                            descriptionTextField.getText(),
                            Integer.parseInt(priceTextField.getText()),
                            transactionType);
                    paidManager.save();
                }
            }

            if (prepaidTypeSanadButton.isSelected()) {
                if (transactionType != null) {
                    transactionType = ((bedehkaarTypeButton.isSelected()) ? TransactionType.DEBT : TransactionType.CREDIT);
                    prePaidManager.add(prePaidManager.prePaids.size() + 1,
                            selectedAccount + 1,
                            dateSelectedByUser,
                            descriptionTextField.getText(),
                            Integer.parseInt(priceTextField.getText()),
                            transactionType);
                    prePaidManager.save();
                }
            }

            setVisible(false);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void accountListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_accountListValueChanged
        selectedAccount = accountList.getSelectedIndex();
    }//GEN-LAST:event_accountListValueChanged

    private void paidTypeSanadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidTypeSanadButtonActionPerformed
        isTransactionRadioButtonNull = false;
    }//GEN-LAST:event_paidTypeSanadButtonActionPerformed

    private void prepaidTypeSanadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prepaidTypeSanadButtonActionPerformed
        isTransactionRadioButtonNull = false;
    }//GEN-LAST:event_prepaidTypeSanadButtonActionPerformed

    private void bedehkaarTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedehkaarTypeButtonActionPerformed
        transactionType = TransactionType.DEBT;
    }//GEN-LAST:event_bedehkaarTypeButtonActionPerformed

    private void bestankaarTypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bestankaarTypeButtonActionPerformed
        transactionType = TransactionType.CREDIT;
    }//GEN-LAST:event_bestankaarTypeButtonActionPerformed

    private void initList() {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        accountList.setModel(listModel);
        for (Account account : accountManager.accounts) {
            listModel.addElement(getAccountNameAndNationalCode(account));
        }
    }

    private String getAccountNameAndNationalCode(Account account) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(account.getName());
        stringBuilder.append(" - ");
        stringBuilder.append(account.getNationalCode());
        return stringBuilder.toString();
    }

    private boolean isInputsAreValid() {
        if (isTransactionRadioButtonNull == true) {
            validatoinLabel.setText("لطفا چک یا نقدی را انتخاب کنید.");
            validatoinLabel.setVisible(true);
            return false;
        }

        if (transactionType == null) {
            validatoinLabel.setText("لطفا طرف حساب را وارد کنید.");
            validatoinLabel.setVisible(true);
            return false;
        }

        if (priceTextField.getText().equals("")) {
            validatoinLabel.setText("لطفا قیمت را وارد کنید.");
            validatoinLabel.setVisible(true);
            return false;
        }

        if (yearTextField.getText().equals("")
                && monthTextField.getText().equals("")
                && dayTextField.getText().equals("")) {
            validatoinLabel.setText("تاریخ را وارد کنید.");
            validatoinLabel.setVisible(true);
            return false;
        }

        Matcher priceTextFieldMatcher = VALID_PRICE.matcher(priceTextField.getText());
        if (!priceTextFieldMatcher.matches()) {
            validatoinLabel.setText(".قیمت معتبر نیست");
            validatoinLabel.setVisible(true);
            return false;
        }

        // day digits and value validation
        if (dayTextField.getText().length() > 2
                || Integer.parseInt(dayTextField.getText()) < 1
                || Integer.parseInt(dayTextField.getText()) > 31) {
            validatoinLabel.setText(".روز معتبر نیست");
            validatoinLabel.setVisible(true);
            return false;
        }

        // month digits and value validation
        if (monthTextField.getText().length() > 2
                || Integer.parseInt(monthTextField.getText()) < 1
                || Integer.parseInt(monthTextField.getText()) > 12) {
            validatoinLabel.setText(".ماه معتبر نیست");
            validatoinLabel.setVisible(true);
            return false;
        }

        // year digits validation
        if (yearTextField.getText().length() > 4) {
            validatoinLabel.setText(".سال معتبر نیست");
            validatoinLabel.setVisible(true);
            return false;
        }
        // days of monthes validation 1

        if (Integer.parseInt(dayTextField.getText()) >= 1) {
            if ((Integer.parseInt(monthTextField.getText()) == 4
                    || Integer.parseInt(monthTextField.getText()) == 6
                    || Integer.parseInt(monthTextField.getText()) == 9
                    || Integer.parseInt(monthTextField.getText()) == 11)
                    && Integer.parseInt(dayTextField.getText()) <= 30) {
                return true;
            }
        }
        // days of monthes validation 2
        if ((Integer.parseInt(monthTextField.getText()) == 1
                || Integer.parseInt(monthTextField.getText()) == 3
                || Integer.parseInt(monthTextField.getText()) == 5
                || Integer.parseInt(monthTextField.getText()) == 7
                || Integer.parseInt(monthTextField.getText()) == 8
                || Integer.parseInt(monthTextField.getText()) == 10
                || Integer.parseInt(monthTextField.getText()) == 12)
                && Integer.parseInt(dayTextField.getText()) <= 31) {
            return true;
        }

        // leap year validation 
        if (Integer.parseInt(monthTextField.getText()) == 2) {
            if (Integer.parseInt(dayTextField.getText()) <= 28) {
                return true;
            }

            if (Integer.parseInt(yearTextField.getText()) % 4 == 0) {
                if (Integer.parseInt(yearTextField.getText()) % 100 == 0) {
                    if (Integer.parseInt(yearTextField.getText()) % 400 == 0) {
                        validatoinLabel.setText(".سال کبیسه است");
                        validatoinLabel.setVisible(true);
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    validatoinLabel.setText(".سال کبیسه است");
                    validatoinLabel.setVisible(true);
                    return false;
                }
            }
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(NewSanad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewSanad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewSanad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewSanad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AccountManager accountManager = new AccountManager();
                PaidManager paidManager = new PaidManager();
                PrePaidManager prePaidManager = new PrePaidManager();
                new NewSanad(accountManager, paidManager, prePaidManager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> accountList;
    private javax.swing.JRadioButton bedehkaarTypeButton;
    private javax.swing.JRadioButton bestankaarTypeButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField dayTextField;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthTextField;
    private javax.swing.JRadioButton paidTypeSanadButton;
    private javax.swing.JLabel placeHolderDate2;
    private javax.swing.JLabel placeHolderDate3;
    private javax.swing.JRadioButton prepaidTypeSanadButton;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel sabtSanadLabel;
    private javax.swing.JLabel sanadOwnerAccount;
    private javax.swing.JLabel sanadPriceLabel;
    private javax.swing.JLabel sanadTypeLabel;
    private javax.swing.JLabel sanadTypeLabel1;
    private javax.swing.JLabel sanadTypeLabel2;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel validatoinLabel;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables

}
