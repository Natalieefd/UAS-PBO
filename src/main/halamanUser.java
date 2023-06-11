package main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class halamanUser extends javax.swing.JFrame {

    Connection conn;
    Statement stm;
    ResultSet rs;
    String query;
    
    static loginGuruForm logG = new loginGuruForm();
    static loginSiswaForm logS = new loginSiswaForm();
    
    public halamanUser() {
        initComponents();
        config.koneksi DB = new config.koneksi();
        DB.config();
        conn = DB.conn;
        stm = DB.stm;
        
        setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.panelBorder();
        gradientPanelSide1 = new swing.gradientPanelSide();
        lblHome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMaPel = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblJadwalKBM = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(800, 500));

        lblHome.setFont(new java.awt.Font("TT Commons DemiBold", 1, 12)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHome.setText("HOME");
        lblHome.setIconTextGap(7);
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TT Commons DemiBold", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tut-wuri-handayani-32PX.png"))); // NOI18N
        jLabel2.setText("HOMEPAGE");
        jLabel2.setIconTextGap(10);

        lblMaPel.setFont(new java.awt.Font("TT Commons DemiBold", 1, 12)); // NOI18N
        lblMaPel.setForeground(new java.awt.Color(255, 255, 255));
        lblMaPel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMaPel.setText("MATA PELAJARAN");
        lblMaPel.setIconTextGap(7);
        lblMaPel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaPelMouseClicked(evt);
            }
        });

        lblLogout.setFont(new java.awt.Font("TT Commons DemiBold", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout-dark-24px.png"))); // NOI18N
        lblLogout.setText("LOGOUT");
        lblLogout.setIconTextGap(7);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        lblJadwalKBM.setFont(new java.awt.Font("TT Commons DemiBold", 1, 12)); // NOI18N
        lblJadwalKBM.setForeground(new java.awt.Color(255, 255, 255));
        lblJadwalKBM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJadwalKBM.setText("JADWAL KBM");
        lblJadwalKBM.setIconTextGap(7);
        lblJadwalKBM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblJadwalKBMMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gradientPanelSide1Layout = new javax.swing.GroupLayout(gradientPanelSide1);
        gradientPanelSide1.setLayout(gradientPanelSide1Layout);
        gradientPanelSide1Layout.setHorizontalGroup(
            gradientPanelSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                .addGroup(gradientPanelSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblLogout))
                    .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(gradientPanelSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblMaPel)
                            .addComponent(lblHome)
                            .addComponent(lblJadwalKBM))))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        gradientPanelSide1Layout.setVerticalGroup(
            gradientPanelSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addComponent(lblHome)
                .addGap(18, 18, 18)
                .addComponent(lblMaPel)
                .addGap(18, 18, 18)
                .addComponent(lblJadwalKBM)
                .addGap(252, 252, 252)
                .addComponent(lblLogout)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("TT Commons DemiBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 46, 61));
        jLabel6.setText("WELCOME");
        jLabel6.setIconTextGap(15);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profile-dark-128px.png"))); // NOI18N

        lblNama.setFont(new java.awt.Font("Vela Sans SemBd", 1, 24)); // NOI18N
        lblNama.setForeground(new java.awt.Color(38, 46, 61));
        lblNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNama.setText("nama");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(gradientPanelSide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addContainerGap(459, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lblNama)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(gradientPanelSide1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void getuser(){
        if (logG.getNama() != null){
            String WelcomeNameGuru = logG.getNama();
            lblNama.setText(WelcomeNameGuru);
        } else {
            String WelcomeNameSwiswa = logS.getNama();
            lblNama.setText(WelcomeNameSwiswa);
        }
    }
    
    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        new halamanUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblMaPelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaPelMouseClicked
        new lihatMapelUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblMaPelMouseClicked

    private void lblJadwalKBMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblJadwalKBMMouseClicked
        new lihatJadwalKBMUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblJadwalKBMMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(halamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamanUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.gradientPanelSide gradientPanelSide1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblJadwalKBM;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMaPel;
    private javax.swing.JLabel lblNama;
    private swing.panelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
