/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NZQ.Forms;

import Model.Date;
import Model.Transaction.PrePaidStatus;
import Model.Transaction.TransactionType;
import ViewModel.AccountManager;
import ViewModel.Transaction.PaidManager;
import ViewModel.Transaction.PrePaidManager;
import java.awt.ComponentOrientation;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author AliAghamirbabaei
 */
public class NewGroupSanad extends javax.swing.JFrame implements TableModel {

    private AccountManager accountManager;
    private PaidManager paidManager;
    private PrePaidManager prePaidManager;
    private boolean isPaidShows = true;

    public NewGroupSanad(AccountManager accountManager, PaidManager paidManager, PrePaidManager prePaidManager) {
        this.accountManager = accountManager;
        this.paidManager = paidManager;
        this.prePaidManager = prePaidManager;
        initComponents();
        transactionTable.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        transactionTable.setModel(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        showTypeButtonGroup = new javax.swing.ButtonGroup();
        daftarKolPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transactionTable = new javax.swing.JTable();
        ShowPaidRadioButton = new javax.swing.JRadioButton();
        showPrePaidRadioButton = new javax.swing.JRadioButton();
        deleteButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("IRANSansX", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ثبت سند گروهی");

        transactionTable.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        transactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "صاحب حساب", "تاریح", "مبلغ", "بدهکار", "لستانکار"
            }
        ));
        jScrollPane1.setViewportView(transactionTable);

        showTypeButtonGroup.add(ShowPaidRadioButton);
        ShowPaidRadioButton.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        ShowPaidRadioButton.setSelected(true);
        ShowPaidRadioButton.setText("نمایش نقدی");
        ShowPaidRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPaidRadioButtonActionPerformed(evt);
            }
        });

        showTypeButtonGroup.add(showPrePaidRadioButton);
        showPrePaidRadioButton.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        showPrePaidRadioButton.setText("نمایش چک");
        showPrePaidRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPrePaidRadioButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        deleteButton.setText("حذف");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout daftarKolPanelLayout = new javax.swing.GroupLayout(daftarKolPanel);
        daftarKolPanel.setLayout(daftarKolPanelLayout);
        daftarKolPanelLayout.setHorizontalGroup(
            daftarKolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, daftarKolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daftarKolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(daftarKolPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(daftarKolPanelLayout.createSequentialGroup()
                        .addComponent(ShowPaidRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(showPrePaidRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );
        daftarKolPanelLayout.setVerticalGroup(
            daftarKolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftarKolPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(daftarKolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addGroup(daftarKolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ShowPaidRadioButton)
                        .addComponent(showPrePaidRadioButton)))
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(daftarKolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(daftarKolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowPaidRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPaidRadioButtonActionPerformed
        isPaidShows = true;
        transactionTable.updateUI();
    }//GEN-LAST:event_ShowPaidRadioButtonActionPerformed

    private void showPrePaidRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPrePaidRadioButtonActionPerformed
        isPaidShows = false;
        transactionTable.updateUI();
    }//GEN-LAST:event_showPrePaidRadioButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (isPaidShows) {
            paidManager.delete(transactionTable.getSelectedRow() + 1);
        }else {
            prePaidManager.delete(transactionTable.getSelectedRow() + 1);
        }
        
        transactionTable.updateUI();
    }//GEN-LAST:event_deleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewGroupSanad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewGroupSanad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewGroupSanad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGroupSanad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AccountManager accountManager = new AccountManager();
                PaidManager paidManager = new PaidManager();
                PrePaidManager prePaidManager = new PrePaidManager();
                new NewGroupSanad(accountManager, paidManager, prePaidManager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ShowPaidRadioButton;
    private javax.swing.JPanel daftarKolPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JRadioButton showPrePaidRadioButton;
    private javax.swing.ButtonGroup showTypeButtonGroup;
    private javax.swing.JTable transactionTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public int getRowCount() {
        if (isPaidShows) {
            return paidManager.paids.size();
        } else {
            return prePaidManager.prePaids.size();
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
        if (isPaidShows) {
            return switch (columnIndex) {
                case 0 ->
                    false;
                case 1 ->
                    true;
                case 2 ->
                    true;
                case 3 ->
                    true;
                case 4 ->
                    true;
                case 5 ->
                    true;
                default ->
                    false;
            };
        } else {
            return switch (columnIndex) {
                case 0 ->
                    false;
                case 1 ->
                    true;
                case 2 ->
                    true;
                case 3 ->
                    true;
                case 4 ->
                    true;
                case 5 ->
                    true;
                case 6 ->
                    true;
                default ->
                    false;
            };
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String name = "";

        if (isPaidShows) {
            if (columnIndex == 1) {
                name = accountManager.accounts.get(paidManager.paids.get(rowIndex).getAccountId()).getName();
            }
            
            return switch (columnIndex) {
                case 0 -> paidManager.paids.get(rowIndex).getId();
                case 1 -> name;
                case 2 -> paidManager.paids.get(rowIndex).getTime();
                case 3 -> paidManager.paids.get(rowIndex).getDescription();
                case 4 -> paidManager.paids.get(rowIndex).getPrice();
                case 5 -> paidManager.paids.get(rowIndex).getTransactionType();
                default -> "";
            };
        } else {
            if (columnIndex == 1) {
                name = accountManager.accounts.get(prePaidManager.prePaids.get(rowIndex).getAccountId()).getName();
            }
            
            return switch (columnIndex) {
                case 0 -> prePaidManager.prePaids.get(rowIndex).getId();
                case 1 -> name;
                case 2 -> prePaidManager.prePaids.get(rowIndex).getTime();
                case 3 -> prePaidManager.prePaids.get(rowIndex).getDescription();
                case 4 -> prePaidManager.prePaids.get(rowIndex).getPrice();
                case 5 -> prePaidManager.prePaids.get(rowIndex).getTransactionType();
                case 6 -> prePaidManager.prePaids.get(rowIndex).isPrePaidPassed();
                default -> "";
            };
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (isPaidShows) {
            switch (columnIndex) {
                case 0 ->
                    paidManager.paids.get(rowIndex).setId((int) aValue);
                case 1 ->
                    paidManager.paids.get(rowIndex).setAccountId((int) aValue);
                case 2 ->
                    paidManager.paids.get(rowIndex).setTime(Date.stringToDate(aValue.toString()));
                case 3 ->
                    paidManager.paids.get(rowIndex).setDescription(String.valueOf(aValue));
                case 4 ->
                    paidManager.paids.get(rowIndex).setPrice((int) aValue);
                case 5 ->
                    paidManager.paids.get(rowIndex).setTransactionType(TransactionType.findByName(String.valueOf(aValue)));
            }
            paidManager.save();
        } else {
            switch (columnIndex) {
                case 0 ->
                    prePaidManager.prePaids.get(rowIndex).setId((int) aValue);
                case 1 ->
                    prePaidManager.prePaids.get(rowIndex).setAccountId((int) aValue);
                case 2 ->
                    prePaidManager.prePaids.get(rowIndex).setTime(Date.stringToDate(aValue.toString()));
                case 3 ->
                    prePaidManager.prePaids.get(rowIndex).setDescription(String.valueOf(aValue));
                case 4 ->
                    prePaidManager.prePaids.get(rowIndex).setPrice((int) aValue);
                case 5 ->
                    prePaidManager.prePaids.get(rowIndex).setTransactionType(TransactionType.findByName(String.valueOf(aValue)));
                case 6 ->
                    prePaidManager.prePaids.get(rowIndex).setPrePaidPassed(PrePaidStatus.findByName(String.valueOf(aValue)));
            }
            prePaidManager.save();
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
}
