/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NZQ.Forms;

import Model.Date;
import Model.Transaction.TransactionType;
import ViewModel.AccountManager;
import ViewModel.Transaction.PaidManager;
import ViewModel.Transaction.PrePaidManager;
import java.awt.Color;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

/**
 *
 * @author muhamadtalebi
 */
public class TarazNamehForm extends javax.swing.JFrame implements TableModel {

    AccountManager accountManager = new AccountManager();
    PaidManager paidManager = new PaidManager();

    public TarazNamehForm(AccountManager accountManager, PaidManager paidManager) {
        this.accountManager = accountManager;
        this.paidManager = paidManager;
        initComponents();
        taraznamehTable.setModel(this);
        taraznamehMenuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        //centerRenderer.setBackground(Color.red);
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        taraznamehTable.setDefaultRenderer(java.lang.String.class, centerRenderer);

        taraznamehTable.getTableHeader().setDefaultRenderer(centerRenderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        taraznamehTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        taraznamehMenuBar = new javax.swing.JMenuBar();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taraznamehTable.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        taraznamehTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "بستانکار", "بدهکار", "نام حساب", "شناسه", "تاریخ ثبت"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(taraznamehTable);

        jLabel1.setFont(new java.awt.Font("IRANSansX", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ترازنامه");
        setJMenuBar(taraznamehMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TarazNamehForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarazNamehForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarazNamehForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarazNamehForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AccountManager accountManager = new AccountManager();
                PaidManager paidManager = new PaidManager();
                new TarazNamehForm(accountManager, paidManager).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar taraznamehMenuBar;
    private javax.swing.JTable taraznamehTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public int getRowCount() {
        return paidManager.paids.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return switch (columnIndex) {
            case 0 ->
                "شناسه";
            case 1 ->
                "نام حساب";
            case 2 ->
                "تاریخ";
            case 3 ->
                "بدهکار";
            case 4 ->
                "بستانکار";
            default ->
                "";
        };
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 ->
                Integer.class;
            case 1 ->
                String.class;
            case 2 ->
                Date.class;
            case 3 ->
                Integer.class;
            case 4 ->
                Integer.class;
            default ->
                String.class;
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch (rowIndex) {
            case 1:
                paidManager.paids.get(rowIndex).getId();
            case 2:
        }
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String name = "";
        int price = 0;
        if (columnIndex == 1) {
            name = accountManager.accounts.get(paidManager.paids.get(rowIndex).getAccountId()).getName();
        }

        if (columnIndex == 3 || columnIndex == 4) {
            price = paidManager.paids.get(rowIndex).getPrice();
        }

        switch (columnIndex) {
            case 0 -> {
                return paidManager.paids.get(rowIndex).getId();
            }
            case 1 -> {
                return name;
            }
            case 2 -> {
                return paidManager.paids.get(rowIndex).getTime();
            }
            case 3 -> {
                if (paidManager.paids.get(rowIndex).getTransactionType() == TransactionType.DEBT) {
                    return price;
                } else {
                    return "-";
                }
            }
            case 4 -> {
                if (paidManager.paids.get(rowIndex).getTransactionType() == TransactionType.CREDIT) {
                    return price;
                } else {
                    return "-";
                }
            }
            default -> {
                return "";
            }
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
