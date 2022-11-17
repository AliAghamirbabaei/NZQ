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

    public DashboardForm(String username) {
        initComponents();
        menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        menuBar.setBackground(Color.BLUE);
        menuBar.setForeground(Color.BLUE);
        usernameLabel.setText(username);
        //addPersonMenuItem.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
        //addGroupMenuItem.setComponentOrientation( ComponentOrientation.RIGHT_TO_LEFT );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        AddPersonOrGroupMenuItem = new javax.swing.JMenu();
        addPersonMenuItem = new javax.swing.JMenuItem();
        addGroupMenuItem = new javax.swing.JMenuItem();
        newSanadMenu = new javax.swing.JMenu();
        gozareshaatMenu = new javax.swing.JMenu();
        tarazNamehMenuItem = new javax.swing.JMenuItem();
        daftarHesabMenuItem = new javax.swing.JMenuItem();
        AccountViewerMenuItem = new javax.swing.JMenuItem();
        exitMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nizek Q!");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        logoutButton.setBackground(new java.awt.Color(60, 63, 65));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logout.png"))); // NOI18N
        logoutButton.setBorder(null);
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/113a6199-e5b1-42b6-b9be-c8137caaf740-removebg.png"))); // NOI18N

        usernameLabel.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usernameLabel.setText("user name");

        jLabel3.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        jLabel3.setText("system time");

        menuBar.setBackground(new java.awt.Color(53, 103, 152));
        menuBar.setToolTipText("");

        AddPersonOrGroupMenuItem.setText("افزودن شخص/گروه");
        AddPersonOrGroupMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N

        addPersonMenuItem.setText("افزودن شخص");
        addPersonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonMenuItemActionPerformed(evt);
            }
        });
        AddPersonOrGroupMenuItem.add(addPersonMenuItem);

        addGroupMenuItem.setText("افزودن گروه");
        addGroupMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupMenuItemActionPerformed(evt);
            }
        });
        AddPersonOrGroupMenuItem.add(addGroupMenuItem);

        menuBar.add(AddPersonOrGroupMenuItem);

        newSanadMenu.setText("ثبت سند");
        newSanadMenu.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        newSanadMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSanadMenuActionPerformed(evt);
            }
        });
        menuBar.add(newSanadMenu);

        gozareshaatMenu.setText("گزارشات");
        gozareshaatMenu.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N

        tarazNamehMenuItem.setText("ترازنامه");
        gozareshaatMenu.add(tarazNamehMenuItem);

        daftarHesabMenuItem.setText("دفتر کل");
        daftarHesabMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarHesabMenuItemActionPerformed(evt);
            }
        });
        gozareshaatMenu.add(daftarHesabMenuItem);

        AccountViewerMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        AccountViewerMenuItem.setText("نمایش اشخاص");
        AccountViewerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountViewerMenuItemActionPerformed(evt);
            }
        });
        gozareshaatMenu.add(AccountViewerMenuItem);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1051, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        logout();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked
        logout();
    }//GEN-LAST:event_exitMenuMouseClicked

    private void AccountViewerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountViewerMenuItemActionPerformed
        AccountViewerForm accountViewerForm = new AccountViewerForm(accountManager);
        accountViewerForm.setVisible(true);
    }//GEN-LAST:event_AccountViewerMenuItemActionPerformed

    private void addGroupMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupMenuItemActionPerformed
        AddGroupForm addGroupForm = new AddGroupForm(accountManager);
        addGroupForm.setVisible(true);
    }//GEN-LAST:event_addGroupMenuItemActionPerformed

    private void addPersonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonMenuItemActionPerformed
        AddPerson addPersonOrGroup = new AddPerson(accountManager);
        addPersonOrGroup.setVisible(true);
    }//GEN-LAST:event_addPersonMenuItemActionPerformed

    private void newSanadMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSanadMenuActionPerformed
        NewSanad newSanad = new NewSanad(accountManager, paidManager, prePaidManager);
        newSanad.setVisible(true);
    }//GEN-LAST:event_newSanadMenuActionPerformed

    private void daftarHesabMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarHesabMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarHesabMenuItemActionPerformed

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
                new DashboardForm("Dummy User!").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AccountViewerMenuItem;
    private javax.swing.JMenu AddPersonOrGroupMenuItem;
    private javax.swing.JMenuItem addGroupMenuItem;
    private javax.swing.JMenuItem addPersonMenuItem;
    private javax.swing.JMenuItem daftarHesabMenuItem;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenu gozareshaatMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu newSanadMenu;
    private javax.swing.JMenuItem tarazNamehMenuItem;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}

//--------------------------------------------- Account viewer form ---------------------------------------------
//
//        AccountManager accountManager = new AccountManager();
//
//        for (int i = 0; i < 10; i++) {
//            accountManager.add(accountManager.accounts.size() + 1, "Ali", "12312413", "asdsef", "12334", "asdasd");
//        }
//
//        accountManager.save();
//        
//        AccountViewerForm accountViewerForm = new AccountViewerForm();
//        accountViewerForm.setAccountManager(accountManager);
//        
//        accountViewerForm.setVisible(true);