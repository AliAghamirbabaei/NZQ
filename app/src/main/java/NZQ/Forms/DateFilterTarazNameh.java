/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NZQ.Forms;

import static NZQ.Forms.AddPerson.VALID_EMAIL_ADDRESS_REGEX;
import java.awt.ComponentOrientation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author muhamadtalebi
 */
public class DateFilterTarazNameh extends javax.swing.JFrame {
        public static final Pattern VALID_DATE_REGEX = Pattern.compile("[۰-۹0-9]+");
public static final Pattern VALID_DIGIT_REGEX = Pattern.compile("[\\d]{2}");
public static final Pattern VALID_DAY_REGEX = Pattern.compile("[\\d]{1,30}");
public static final Pattern VALID_MONTH_REGEX = Pattern.compile("[\\d]{1,12}");

    /**
     * Creates new form DateFilterTarazNameh
     */
    public DateFilterTarazNameh() {
        initComponents();
        dailyButton.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
        monthlyButton.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
        yearlyButton.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
        dateValidationErrorLabel.setVisible(false);
        
                
        //dayComboBox.setModel();
        //dayDateField.setColumns(2);
        
          
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        dailyButton = new javax.swing.JRadioButton();
        monthlyButton = new javax.swing.JRadioButton();
        yearlyButton = new javax.swing.JRadioButton();
        filterTarikhHeaderLabel = new javax.swing.JLabel();
        taarikhLabel = new javax.swing.JLabel();
        placeHolderDate2 = new javax.swing.JLabel();
        placeHolderDate1 = new javax.swing.JLabel();
        filterApply = new javax.swing.JButton();
        dateValidationErrorLabel = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox<>();
        monthComboBox = new javax.swing.JComboBox<>();
        yearTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(dailyButton);
        dailyButton.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        dailyButton.setSelected(true);
        dailyButton.setText("روزانه");
        dailyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(monthlyButton);
        monthlyButton.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        monthlyButton.setText("ماهانه");
        monthlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(yearlyButton);
        yearlyButton.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        yearlyButton.setText("سالانه");
        yearlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearlyButtonActionPerformed(evt);
            }
        });

        filterTarikhHeaderLabel.setFont(new java.awt.Font("IRANSansX", 1, 24)); // NOI18N
        filterTarikhHeaderLabel.setText("فیلتر تاریخ");

        taarikhLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        taarikhLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        taarikhLabel.setText("تاریخ :");

        placeHolderDate2.setText("/");

        placeHolderDate1.setText("/");

        filterApply.setFont(new java.awt.Font("IRANSansX", 1, 13)); // NOI18N
        filterApply.setText("اعمال");
        filterApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterApplyActionPerformed(evt);
            }
        });

        dateValidationErrorLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        dateValidationErrorLabel.setForeground(new java.awt.Color(250, 0, 0));
        dateValidationErrorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateValidationErrorLabel.setText("date validation!");

        dayComboBox.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthComboBox.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        yearTextField.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        yearTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        yearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filterTarikhHeaderLabel)
                            .addComponent(filterApply)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dailyButton)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(placeHolderDate1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(placeHolderDate2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(yearlyButton)
                                        .addComponent(taarikhLabel)
                                        .addComponent(monthlyButton))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(dateValidationErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterTarikhHeaderLabel)
                .addGap(59, 59, 59)
                .addComponent(dailyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthlyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearlyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taarikhLabel)
                    .addComponent(placeHolderDate2)
                    .addComponent(placeHolderDate1)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(filterApply)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateValidationErrorLabel)
                .addGap(14, 14, 14))
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

    private void filterApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterApplyActionPerformed
        System.out.println("Btest");
       // isDateValid();      // TODO add your handling code here:
    }//GEN-LAST:event_filterApplyActionPerformed

    private void yearlyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearlyButtonActionPerformed
        if(yearlyButton.isSelected()){
            dayComboBox.setEditable(false);
            monthComboBox.setEditable(false);
//            yearComboBox.setEditable(true);
        }
        else{
           dayComboBox.setEditable(true);
            monthComboBox.setEditable(true);
//            yearComboBox.setEditable(true);

        }

    }//GEN-LAST:event_yearlyButtonActionPerformed

    private void monthlyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyButtonActionPerformed
        if(monthlyButton.isSelected()){
            //dayDateField.setEditable(false);
            //dayDateField.setEnabled(false);
            //monthDateField.setEditable(true);
            //monthDateField.setEnabled(true);
        }
        else{
           // dayDateField.setEditable(true);
            //dayDateField.setEnabled(true);
        }
    }//GEN-LAST:event_monthlyButtonActionPerformed

    private void dailyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyButtonActionPerformed
        if(dailyButton.isSelected()){
           // dayDateField.setEditable(true);
           // dayDateField.setEnabled(true);
            //monthDateField.setEditable(true);
           // monthDateField.setEnabled(true);
        }
    }//GEN-LAST:event_dailyButtonActionPerformed

    private void yearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTextFieldActionPerformed
    /*
    private void isDateValid(){
    Matcher matcher = VALID_DATE_REGEX.matcher(dayDateField.getText());
    Matcher matcherDigitDay = VALID_DIGIT_REGEX.matcher(dayDateField.getText());
    Matcher matcherDigitMonth = VALID_DIGIT_REGEX.matcher(monthDateField.getText());
    Matcher matcherLimitMonth = VALID_MONTH_REGEX.matcher(monthDateField.getText());
    Matcher matcherLimitDay = VALID_DAY_REGEX.matcher(dayDateField.getText());
    Matcher matcherMonth = VALID_DATE_REGEX.matcher(monthDateField.getText());
    Matcher matcherYear = VALID_DATE_REGEX.matcher(yearDateField.getText());
       System.out.println("if test");
    if (!matcher.find() &&
                !matcherMonth.find() &&
                !matcherYear.find() &&
                !matcherLimitDay.find() &&
                !matcherLimitMonth.find() &&
                !matcherDigitDay.find() &&
                !matcherDigitMonth.find()) {
            dateValidationErrorLabel.setText("تاریخ معتبر نیست!");
            dateValidationErrorLabel.setVisible(true);
            System.out.println("valid test");
           // return false;
        }
       
    }
    */
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
            java.util.logging.Logger.getLogger(DateFilterTarazNameh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DateFilterTarazNameh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DateFilterTarazNameh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DateFilterTarazNameh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DateFilterTarazNameh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton dailyButton;
    private javax.swing.JLabel dateValidationErrorLabel;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JButton filterApply;
    private javax.swing.JLabel filterTarikhHeaderLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JRadioButton monthlyButton;
    private javax.swing.JLabel placeHolderDate1;
    private javax.swing.JLabel placeHolderDate2;
    private javax.swing.JLabel taarikhLabel;
    private javax.swing.JTextField yearTextField;
    private javax.swing.JRadioButton yearlyButton;
    // End of variables declaration//GEN-END:variables
}
