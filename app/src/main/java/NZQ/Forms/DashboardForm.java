package NZQ.Forms;

import java.awt.ComponentOrientation;

public class DashboardForm extends javax.swing.JFrame {

    public DashboardForm() {
        initComponents();
        menuBar.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addAcountButton = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        reportButton = new javax.swing.JButton();
        addPersonOrGroupButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        AddPersonOrGroupMenuItem = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        exitMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nizek Q!");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(204, 255, 0));

        addAcountButton.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        addAcountButton.setText("افزودن حساب");

        welcomeLabel.setFont(new java.awt.Font("IRANSansX", 1, 48)); // NOI18N
        welcomeLabel.setText("خوش آمدید");

        reportButton.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        reportButton.setText("گزارش");
        reportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportButtonMouseClicked(evt);
            }
        });

        addPersonOrGroupButton.setFont(new java.awt.Font("IRANSansX", 0, 14)); // NOI18N
        addPersonOrGroupButton.setText("افزودن شخص/گروه");
        addPersonOrGroupButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPersonOrGroupButtonMouseClicked(evt);
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

        AddPersonOrGroupMenuItem.setText("افزودن شخص/گروه");
        AddPersonOrGroupMenuItem.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        AddPersonOrGroupMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPersonOrGroupMenuItemMouseClicked(evt);
            }
        });
        menuBar.add(AddPersonOrGroupMenuItem);

        jMenu1.setText("افزودن حساب");
        jMenu1.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        menuBar.add(jMenu1);

        jMenu2.setText("گزارش");
        jMenu2.setFont(new java.awt.Font("IRANSansX", 0, 13)); // NOI18N
        menuBar.add(jMenu2);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(reportButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addAcountButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addPersonOrGroupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addComponent(welcomeLabel)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(addPersonOrGroupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addAcountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeLabel))
                .addGap(26, 26, 26)
                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportButtonMouseClicked
        ReportFrom reportFrom = new ReportFrom();
        reportFrom.setVisible(true);
    }//GEN-LAST:event_reportButtonMouseClicked

    private void addPersonOrGroupButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPersonOrGroupButtonMouseClicked
        showAddPersonOrGroupForm();
    }//GEN-LAST:event_addPersonOrGroupButtonMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        logout();
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void AddPersonOrGroupMenuItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPersonOrGroupMenuItemMouseClicked
        showAddPersonOrGroupForm();
    }//GEN-LAST:event_AddPersonOrGroupMenuItemMouseClicked

    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked
        logout();
    }//GEN-LAST:event_exitMenuMouseClicked

    private void showAddPersonOrGroupForm() {
        AddPersonOrGroup addPersonOrGroup = new AddPersonOrGroup();
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
    private javax.swing.JButton addPersonOrGroupButton;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton reportButton;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
