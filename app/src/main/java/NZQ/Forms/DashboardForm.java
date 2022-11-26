package NZQ.Forms;

import Model.Date;
import ViewModel.AccountManager;
import ViewModel.Report.DebtCreditReport;
import ViewModel.Transaction.PaidManager;
import ViewModel.Transaction.PrePaidManager;
import java.awt.ComponentOrientation;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DashboardForm extends javax.swing.JFrame {

    private AccountManager accountManager = new AccountManager();
    private PaidManager paidManager = new PaidManager();
    private PrePaidManager prePaidManager = new PrePaidManager();
    private Timer timer = new Timer();
    private TimerTask task = new TimerHandler();

    public DashboardForm(String username) {
        initComponents();
        menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        usernameLabel.setText(username);
        timer.schedule(task, 1, 5000);
        timerLabel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        timerLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        AddPersonOrGroupMenuItem = new javax.swing.JMenu();
        addPersonMenuItem = new javax.swing.JMenuItem();
        newSanadMenu = new javax.swing.JMenu();
        newTransactionMenuItem = new javax.swing.JMenuItem();
        newGroupTransactionMenuItem = new javax.swing.JMenuItem();
        gozareshaatMenu = new javax.swing.JMenu();
        tarazNamehMenuItem = new javax.swing.JMenuItem();
        daftarKolMenuItem = new javax.swing.JMenuItem();
        transactionFilter = new javax.swing.JMenuItem();
        AccountViewerMenuItem = new javax.swing.JMenuItem();
        vertexMenuItem = new javax.swing.JMenuItem();
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

        timerLabel.setFont(new java.awt.Font("IRANSansFaNum", 0, 13)); // NOI18N
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("system time");

        menuBar.setBackground(new java.awt.Color(53, 103, 152));
        menuBar.setToolTipText("");

        AddPersonOrGroupMenuItem.setText("افزودن شخص/گروه");
        AddPersonOrGroupMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N

        addPersonMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK));
        addPersonMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        addPersonMenuItem.setText("افزودن شخص");
        addPersonMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        addPersonMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonMenuItemActionPerformed(evt);
            }
        });
        AddPersonOrGroupMenuItem.add(addPersonMenuItem);

        menuBar.add(AddPersonOrGroupMenuItem);

        newSanadMenu.setText("ثبت سند");
        newSanadMenu.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N

        newTransactionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newTransactionMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        newTransactionMenuItem.setText("ثبت سند جدید");
        newTransactionMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        newTransactionMenuItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        newTransactionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTransactionMenuItemActionPerformed(evt);
            }
        });
        newSanadMenu.add(newTransactionMenuItem);

        newGroupTransactionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newGroupTransactionMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        newGroupTransactionMenuItem.setText("ثبت سند گروهی");
        newGroupTransactionMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        newGroupTransactionMenuItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        newGroupTransactionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGroupTransactionMenuItemActionPerformed(evt);
            }
        });
        newSanadMenu.add(newGroupTransactionMenuItem);

        menuBar.add(newSanadMenu);

        gozareshaatMenu.setText("گزارشات");
        gozareshaatMenu.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N

        tarazNamehMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        tarazNamehMenuItem.setText("ترازنامه");
        tarazNamehMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tarazNamehMenuItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        tarazNamehMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarazNamehMenuItemActionPerformed(evt);
            }
        });
        gozareshaatMenu.add(tarazNamehMenuItem);

        daftarKolMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        daftarKolMenuItem.setText("دفتر کل");
        daftarKolMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        daftarKolMenuItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        daftarKolMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarKolMenuItemActionPerformed(evt);
            }
        });
        gozareshaatMenu.add(daftarKolMenuItem);

        transactionFilter.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        transactionFilter.setText("فیلتر اسناد");
        transactionFilter.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        transactionFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionFilterActionPerformed(evt);
            }
        });
        gozareshaatMenu.add(transactionFilter);

        AccountViewerMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        AccountViewerMenuItem.setText("اشخاص");
        AccountViewerMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AccountViewerMenuItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        AccountViewerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountViewerMenuItemActionPerformed(evt);
            }
        });
        gozareshaatMenu.add(AccountViewerMenuItem);

        vertexMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        vertexMenuItem.setText("راس چک‌ها");
        vertexMenuItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        vertexMenuItem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        vertexMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vertexMenuItemActionPerformed(evt);
            }
        });
        gozareshaatMenu.add(vertexMenuItem);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timerLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        AccountViewerForm accountViewerForm = new AccountViewerForm(accountManager, paidManager, prePaidManager);
        accountViewerForm.setVisible(true);
    }//GEN-LAST:event_AccountViewerMenuItemActionPerformed

    private void addPersonMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonMenuItemActionPerformed
        AddPerson addPersonOrGroup = new AddPerson(accountManager);
        addPersonOrGroup.setVisible(true);
    }//GEN-LAST:event_addPersonMenuItemActionPerformed

    private void daftarKolMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarKolMenuItemActionPerformed
        DaftarKolForm daftarKolForm = new DaftarKolForm(accountManager, paidManager, prePaidManager);
        daftarKolForm.setVisible(true);
    }//GEN-LAST:event_daftarKolMenuItemActionPerformed

    private void newTransactionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTransactionMenuItemActionPerformed
        NewSanad newSanad = new NewSanad(accountManager, paidManager, prePaidManager);
        newSanad.setVisible(true);
    }//GEN-LAST:event_newTransactionMenuItemActionPerformed

    private void tarazNamehMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarazNamehMenuItemActionPerformed
        TarazNamehForm tarazNamehForm = new TarazNamehForm(accountManager, paidManager);
        tarazNamehForm.setVisible(true);
    }//GEN-LAST:event_tarazNamehMenuItemActionPerformed

    private void newGroupTransactionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGroupTransactionMenuItemActionPerformed
        NewGroupSanad newGroupSanad = new NewGroupSanad(accountManager, paidManager, prePaidManager);
        newGroupSanad.setVisible(true);
    }//GEN-LAST:event_newGroupTransactionMenuItemActionPerformed

    private void vertexMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vertexMenuItemActionPerformed
        DebtCreditReport debtCreditReport = new DebtCreditReport(paidManager.paids, prePaidManager.prePaids);
        StringBuilder dialogMessage = new StringBuilder();

        if (debtCreditReport.getVertex() != -1) {
            dialogMessage.append("راس چک‌ها برابر است با: ");
            dialogMessage.append(String.valueOf(debtCreditReport.getVertex()));
        } else {
            dialogMessage.append("هیچ چکی موجود نیست!");
        }

        try {
            ImageIcon dialogBoxIcon = new ImageIcon(ImageIO.read(getClass().getClassLoader().getResource("Images/Chart.png")));
            JOptionPane.showMessageDialog(null, dialogMessage.toString(), "راس چک‌ها", 1, dialogBoxIcon);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, dialogMessage.toString(), "راس چک‌ها", 1);
        }
    }//GEN-LAST:event_vertexMenuItemActionPerformed

    private void transactionFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transactionFilterActionPerformed
        FilterForm filterForm = new FilterForm(accountManager, paidManager, prePaidManager);
        filterForm.setVisible(true);
    }//GEN-LAST:event_transactionFilterActionPerformed

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

    public class TimerHandler extends TimerTask {

        public void run() {
            timerLabel.setText(Date.getCurrentDate().toString());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AccountViewerMenuItem;
    private javax.swing.JMenu AddPersonOrGroupMenuItem;
    private javax.swing.JMenuItem addPersonMenuItem;
    private javax.swing.JMenuItem daftarKolMenuItem;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenu gozareshaatMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newGroupTransactionMenuItem;
    private javax.swing.JMenu newSanadMenu;
    private javax.swing.JMenuItem newTransactionMenuItem;
    private javax.swing.JMenuItem tarazNamehMenuItem;
    private javax.swing.JLabel timerLabel;
    private javax.swing.JMenuItem transactionFilter;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JMenuItem vertexMenuItem;
    // End of variables declaration//GEN-END:variables

}
