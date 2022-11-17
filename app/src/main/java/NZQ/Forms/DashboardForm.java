package NZQ.Forms;

import ViewModel.AccountManager;
import ViewModel.Transaction.PaidManager;
import ViewModel.Transaction.PrePaidManager;
import java.awt.Color;
import java.awt.ComponentOrientation;

public class DashboardForm extends javax.swing.JFrame {

    AccountManager accountManager = new AccountManager();
    PaidManager paidManager = new PaidManager();
    PrePaidManager prePaidManager = new PrePaidManager();

    public DashboardForm() {
        initComponents();
        menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        menuBar.setBackground(Color.BLUE);
        menuBar.setForeground(Color.BLUE);
        //addPersonMenuItem.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
        //addGroupMenuItem.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        addAcountButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        addPersonOrGroupButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        AddPersonOrGroupMenuItem = new javax.swing.JMenu();
        addPersonMenuItem = new javax.swing.JMenuItem();
        addGroupMenuItem = new javax.swing.JMenuItem();
        newSanadMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        gozareshaatMenu = new javax.swing.JMenu();
        tarazNamehMenuItem = new javax.swing.JMenuItem();
        daftarHesabMenuItem = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nizek Q!");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        addAcountButton.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        addAcountButton.setText("افزودن حساب");

        reportButton.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        reportButton.setText("گزارش");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        addPersonOrGroupButton.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        addPersonOrGroupButton.setText("افزودن شخص/گروه");
        addPersonOrGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonOrGroupButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(60, 63, 65));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        logoutButton.setBorder(null);
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/113a6199-e5b1-42b6-b9be-c8137caaf740-removebg.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("user name");

        jLabel3.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        jLabel3.setText("system time");

        menuBar.setBackground(new java.awt.Color(53, 103, 152));
        menuBar.setToolTipText("");

        AddPersonOrGroupMenuItem.setText("افزودن شخص/گروه");
        AddPersonOrGroupMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        AddPersonOrGroupMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPersonOrGroupMenuItemMouseClicked(evt);
            }
        });

        addPersonMenuItem.setText("افزودن شخص");
        AddPersonOrGroupMenuItem.add(addPersonMenuItem);

        addGroupMenuItem.setText("افزودن گروه");
        AddPersonOrGroupMenuItem.add(addGroupMenuItem);

        menuBar.add(AddPersonOrGroupMenuItem);

        newSanadMenu.setText("ثبت سند");
        newSanadMenu.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N

        jMenuItem2.setText("jMenuItem2");
        newSanadMenu.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        newSanadMenu.add(jMenuItem3);

        menuBar.add(newSanadMenu);

        gozareshaatMenu.setText("گزارشات");
        gozareshaatMenu.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N

        tarazNamehMenuItem.setText("ترازنامه");
        gozareshaatMenu.add(tarazNamehMenuItem);

        daftarHesabMenuItem.setText("دفتر کل");
        gozareshaatMenu.add(daftarHesabMenuItem);

        menuBar.add(gozareshaatMenu);

        exitMenu.setText("خروج");
        exitMenu.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        exitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuMouseClicked(evt);
            }
        });
        menuBar.add(exitMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(addAcountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPersonOrGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addPersonOrGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(addAcountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        logout();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void AddPersonOrGroupMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPersonOrGroupMenuItemMouseClicked
        showAddPersonOrGroupForm();
    }//GEN-LAST:event_AddPersonOrGroupMenuItemMouseClicked

    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked
        logout();
    }//GEN-LAST:event_exitMenuMouseClicked

    private void addPersonOrGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonOrGroupButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPersonOrGroupButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        //ReportFrom reportFrom = new ReportFrom();
        //reportFrom.setVisible(true);
    }//GEN-LAST:event_reportButtonActionPerformed

    private void showAddPersonOrGroupForm() {
        AddPerson addPersonOrGroup = new AddPerson();
        addPersonOrGroup.setVisible(true);
    }

    private void logout() {
        LoginForm loginform = new LoginForm();
        loginform.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddPersonOrGroupMenuItem;
    private javax.swing.JButton addAcountButton;
    private javax.swing.JMenuItem addGroupMenuItem;
    private javax.swing.JMenuItem addPersonMenuItem;
    private javax.swing.JButton addPersonOrGroupButton;
    private javax.swing.JMenuItem daftarHesabMenuItem;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenu gozareshaatMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JButton logoutButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu newSanadMenu;
    private javax.swing.JButton reportButton;
    private javax.swing.JMenuItem tarazNamehMenuItem;
    // End of variables declaration//GEN-END:variables

    private void initModel() {

    }
}
