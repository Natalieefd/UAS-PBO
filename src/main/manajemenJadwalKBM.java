package main;

public class manajemenJadwalKBM extends javax.swing.JFrame {

    public manajemenJadwalKBM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.panelBorder();
        gradientPanelSide1 = new swing.gradientPanelSide();
        lblManajemenAkun = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblManajemenMaPel = new javax.swing.JLabel();
        lblManajemenJadwalKBM = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        panelLihatJadwal = new swing.panelBorder();
        panelLihatData2 = new swing.panelLihatData();
        panelTambahJadwal = new swing.panelBorder();
        panelTambahData2 = new swing.panelTambahData();
        paneUbahJadwal = new swing.panelBorder();
        panelUbahData2 = new swing.panelUbahData();
        panelHapusJadwal = new swing.panelBorder();
        panelHapusData2 = new swing.panelHapusData();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(800, 500));

        lblManajemenAkun.setFont(new java.awt.Font("TT Commons DemiBold", 1, 12)); // NOI18N
        lblManajemenAkun.setForeground(new java.awt.Color(255, 255, 255));
        lblManajemenAkun.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManajemenAkun.setText("MANAJEMEN AKUN");
        lblManajemenAkun.setIconTextGap(7);
        lblManajemenAkun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManajemenAkunMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TT Commons DemiBold", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/human-white.png"))); // NOI18N
        jLabel2.setText("STAF DASHBOARD");
        jLabel2.setIconTextGap(10);

        lblManajemenMaPel.setFont(new java.awt.Font("TT Commons DemiBold", 1, 12)); // NOI18N
        lblManajemenMaPel.setForeground(new java.awt.Color(255, 255, 255));
        lblManajemenMaPel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManajemenMaPel.setText("MANAJEMEN MATA PELAJARAN");
        lblManajemenMaPel.setIconTextGap(7);
        lblManajemenMaPel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManajemenMaPelMouseClicked(evt);
            }
        });

        lblManajemenJadwalKBM.setFont(new java.awt.Font("TT Commons DemiBold", 1, 12)); // NOI18N
        lblManajemenJadwalKBM.setForeground(new java.awt.Color(255, 255, 255));
        lblManajemenJadwalKBM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManajemenJadwalKBM.setText("MANAJEMEN JADWAL KBM");
        lblManajemenJadwalKBM.setIconTextGap(7);

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

        javax.swing.GroupLayout gradientPanelSide1Layout = new javax.swing.GroupLayout(gradientPanelSide1);
        gradientPanelSide1.setLayout(gradientPanelSide1Layout);
        gradientPanelSide1Layout.setHorizontalGroup(
            gradientPanelSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                .addGroup(gradientPanelSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(gradientPanelSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblManajemenMaPel)
                            .addComponent(lblManajemenAkun)
                            .addComponent(lblManajemenJadwalKBM)))
                    .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblLogout)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        gradientPanelSide1Layout.setVerticalGroup(
            gradientPanelSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addComponent(lblManajemenAkun)
                .addGap(18, 18, 18)
                .addComponent(lblManajemenMaPel)
                .addGap(18, 18, 18)
                .addComponent(lblManajemenJadwalKBM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addGap(23, 23, 23))
        );

        jLabel6.setFont(new java.awt.Font("TT Commons DemiBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 46, 61));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/month-dark-24px.png"))); // NOI18N
        jLabel6.setText("MANAJEMEN JADWAL KBM");
        jLabel6.setIconTextGap(15);

        panelLihatJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLihatJadwalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLihatJadwalLayout = new javax.swing.GroupLayout(panelLihatJadwal);
        panelLihatJadwal.setLayout(panelLihatJadwalLayout);
        panelLihatJadwalLayout.setHorizontalGroup(
            panelLihatJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLihatJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLihatData2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLihatJadwalLayout.setVerticalGroup(
            panelLihatJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLihatJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLihatData2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelTambahJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTambahJadwalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTambahJadwalLayout = new javax.swing.GroupLayout(panelTambahJadwal);
        panelTambahJadwal.setLayout(panelTambahJadwalLayout);
        panelTambahJadwalLayout.setHorizontalGroup(
            panelTambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTambahData2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTambahJadwalLayout.setVerticalGroup(
            panelTambahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTambahData2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        paneUbahJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneUbahJadwalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneUbahJadwalLayout = new javax.swing.GroupLayout(paneUbahJadwal);
        paneUbahJadwal.setLayout(paneUbahJadwalLayout);
        paneUbahJadwalLayout.setHorizontalGroup(
            paneUbahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneUbahJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUbahData2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneUbahJadwalLayout.setVerticalGroup(
            paneUbahJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneUbahJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUbahData2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelHapusJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHapusJadwalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHapusJadwalLayout = new javax.swing.GroupLayout(panelHapusJadwal);
        panelHapusJadwal.setLayout(panelHapusJadwalLayout);
        panelHapusJadwalLayout.setHorizontalGroup(
            panelHapusJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHapusJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHapusData2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelHapusJadwalLayout.setVerticalGroup(
            panelHapusJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHapusJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHapusData2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(gradientPanelSide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addContainerGap(223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelTambahJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paneUbahJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelLihatJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelHapusJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradientPanelSide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelTambahJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelLihatJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(paneUbahJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelHapusJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblManajemenAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManajemenAkunMouseClicked
        new manajemenAkun().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblManajemenAkunMouseClicked

    private void panelLihatJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLihatJadwalMouseClicked
        new daftarJadwalKBM().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelLihatJadwalMouseClicked

    private void panelTambahJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTambahJadwalMouseClicked
        new formTambahJadwalKBM().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelTambahJadwalMouseClicked

    private void paneUbahJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneUbahJadwalMouseClicked
        new daftarJadwalKBM().setVisible(true);
        dispose();
    }//GEN-LAST:event_paneUbahJadwalMouseClicked

    private void panelHapusJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHapusJadwalMouseClicked
        new daftarJadwalKBM().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelHapusJadwalMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblManajemenMaPelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManajemenMaPelMouseClicked
        new manajemenMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblManajemenMaPelMouseClicked

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
            java.util.logging.Logger.getLogger(manajemenJadwalKBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manajemenJadwalKBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manajemenJadwalKBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manajemenJadwalKBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manajemenJadwalKBM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.gradientPanelSide gradientPanelSide1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblManajemenAkun;
    private javax.swing.JLabel lblManajemenJadwalKBM;
    private javax.swing.JLabel lblManajemenMaPel;
    private swing.panelBorder paneUbahJadwal;
    private swing.panelBorder panelBorder1;
    private swing.panelHapusData panelHapusData2;
    private swing.panelBorder panelHapusJadwal;
    private swing.panelLihatData panelLihatData2;
    private swing.panelBorder panelLihatJadwal;
    private swing.panelTambahData panelTambahData2;
    private swing.panelBorder panelTambahJadwal;
    private swing.panelUbahData panelUbahData2;
    // End of variables declaration//GEN-END:variables
}
