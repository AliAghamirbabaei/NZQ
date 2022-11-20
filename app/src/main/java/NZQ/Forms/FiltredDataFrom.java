/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NZQ.Forms;

import Model.Account;
import Model.Date;
import Model.Transaction.Paid;
import Model.Transaction.PrePaid;
import Model.Transaction.PrePaidStatus;
import Model.Transaction.TransactionType;
import ViewModel.AccountManager;
import ViewModel.Transaction.PaidManager;
import ViewModel.Transaction.PrePaidManager;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author aliaghamirbabaei
 */
public class FiltredDataFrom extends javax.swing.JFrame implements TableModel {

    private final ArrayList<Account> accounts;
    private final ArrayList<Paid> paids;
    private final ArrayList<PrePaid> prePaids;
    private boolean isPaidShows = true;

    public FiltredDataFrom(ArrayList<Account> accounts, ArrayList<Paid> paids, ArrayList<PrePaid> prePaids) {
        initComponents();
        this.accounts = accounts;
        this.paids = paids;
        this.prePaids = prePaids;
        if (accounts.isEmpty() && paids.isEmpty() && prePaids.isEmpty()) {
            titleLabel.setText("سندی یافت نشد!");
        }
        fillteredTable.setModel(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transactionTypeButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        ShowPaidRadioButton = new javax.swing.JRadioButton();
        showPrePaidRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fillteredTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("IRANSansX", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("سندهای یافت شده");

        transactionTypeButtonGroup.add(ShowPaidRadioButton);
        ShowPaidRadioButton.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        ShowPaidRadioButton.setSelected(true);
        ShowPaidRadioButton.setText("نمایش نقدی");
        ShowPaidRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPaidRadioButtonActionPerformed(evt);
            }
        });

        transactionTypeButtonGroup.add(showPrePaidRadioButton);
        showPrePaidRadioButton.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        showPrePaidRadioButton.setText("نمایش چک");
        showPrePaidRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrePaidRadioButtonActionPerformed(evt);
            }
        });

        fillteredTable.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        fillteredTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(fillteredTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ShowPaidRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showPrePaidRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowPaidRadioButton)
                    .addComponent(showPrePaidRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowPaidRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPaidRadioButtonActionPerformed
        isPaidShows = true;
        fillteredTable.updateUI();
    }//GEN-LAST:event_ShowPaidRadioButtonActionPerformed

    private void showPrePaidRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrePaidRadioButtonActionPerformed
        isPaidShows = false;
        fillteredTable.updateUI();
    }//GEN-LAST:event_showPrePaidRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FiltredDataFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FiltredDataFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FiltredDataFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FiltredDataFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AccountManager accountManager = new AccountManager();
                PaidManager paidManager = new PaidManager();
                PrePaidManager prePaidManager = new PrePaidManager();

                new FiltredDataFrom(accountManager.accounts, paidManager.paids, prePaidManager.prePaids).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ShowPaidRadioButton;
    private javax.swing.JTable fillteredTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton showPrePaidRadioButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.ButtonGroup transactionTypeButtonGroup;
    // End of variables declaration//GEN-END:variables

    @Override
    public int getRowCount() {
        if (isPaidShows) {
            return paids.size();
        } else {
            return prePaids.size();
        }
    }

    @Override
    public int getColumnCount() {
        if (isPaidShows) {
            return 6;
        } else {
            return 7;
        }
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (isPaidShows) {
            return switch (columnIndex) {
                case 0 ->
                    "شناسه";
                case 1 ->
                    "نام حساب";
                case 2 ->
                    "تاریخ";
                case 3 ->
                    "توضیحات";
                case 4 ->
                    "مبلغ";
                case 5 ->
                    "طرف حساب";
                default ->
                    "";
            };
        } else {
            return switch (columnIndex) {
                case 0 ->
                    "شناسه";
                case 1 ->
                    "نام حساب";
                case 2 ->
                    "تاریخ";
                case 3 ->
                    "توضیحات";
                case 4 ->
                    "مبلغ";
                case 5 ->
                    "طرف حساب";
                case 6 ->
                    "آیا وصول شده؟";
                default ->
                    "";
            };
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (isPaidShows) {
            return switch (columnIndex) {
                case 0 ->
                    Integer.class;
                case 1 ->
                    String.class;
                case 2 ->
                    Date.class;
                case 3 ->
                    String.class;
                case 4 ->
                    Integer.class;
                case 5 ->
                    TransactionType.class;
                default ->
                    String.class;
            };
        } else {
            return switch (columnIndex) {
                case 0 ->
                    Integer.class;
                case 1 ->
                    String.class;
                case 2 ->
                    Date.class;
                case 3 ->
                    String.class;
                case 4 ->
                    Integer.class;
                case 5 ->
                    TransactionType.class;
                case 6 ->
                    PrePaidStatus.class;
                default ->
                    String.class;
            };
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String name = "";

        if (isPaidShows) {
            if (columnIndex == 1) {
                name = accounts.get(paids.get(rowIndex).getAccountId()).getName();
            }

            return switch (columnIndex) {
                case 0 ->
                    paids.get(rowIndex).getId();
                case 1 ->
                    name;
                case 2 ->
                    paids.get(rowIndex).getTime();
                case 3 ->
                    paids.get(rowIndex).getDescription();
                case 4 ->
                    paids.get(rowIndex).getPrice();
                case 5 ->
                    paids.get(rowIndex).getTransactionType();
                default ->
                    "";
            };
        } else {
            if (columnIndex == 1) {
                name = accounts.get(prePaids.get(rowIndex).getAccountId()).getName();
            }

            return switch (columnIndex) {
                case 0 ->
                    prePaids.get(rowIndex).getId();
                case 1 ->
                    name;
                case 2 ->
                    prePaids.get(rowIndex).getTime();
                case 3 ->
                    prePaids.get(rowIndex).getDescription();
                case 4 ->
                    prePaids.get(rowIndex).getPrice();
                case 5 ->
                    prePaids.get(rowIndex).getTransactionType();
                case 6 ->
                    prePaids.get(rowIndex).isPrePaidPassed();
                default ->
                    "";
            };
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
}