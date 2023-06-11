package main;

public class manajemenMaPel extends javax.swing.JFrame {

    public manajemenMaPel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.panelBorder();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        panelTambahMapel = new swing.panelBorder();
        panelTambahData2 = new swing.panelTambahData();
        paneUbahMapel = new swing.panelBorder();
        panelUbahData2 = new swing.panelUbahData();
        panelLihatMapel = new swing.panelBorder();
        panelLihatData2 = new swing.panelLihatData();
        panelHapusMapel = new swing.panelBorder();
        panelHapusData2 = new swing.panelHapusData();
        gradientPanelSide1 = new swing.gradientPanelSide();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblLogout2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel6.setFont(new java.awt.Font("TT Commons DemiBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 46, 61));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book-dark-32px.png"))); // NOI18N
        jLabel6.setText("MANAJEMEN MATA PELAJARAN");
        jLabel6.setIconTextGap(15);

        panelTambahMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelTambahMapelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelTambahMapelLayout = new javax.swing.GroupLayout(panelTambahMapel);
        panelTambahMapel.setLayout(panelTambahMapelLayout);
        panelTambahMapelLayout.setHorizontalGroup(
            panelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTambahData2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTambahMapelLayout.setVerticalGroup(
            panelTambahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTambahData2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        paneUbahMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneUbahMapelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneUbahMapelLayout = new javax.swing.GroupLayout(paneUbahMapel);
        paneUbahMapel.setLayout(paneUbahMapelLayout);
        paneUbahMapelLayout.setHorizontalGroup(
            paneUbahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneUbahMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUbahData2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneUbahMapelLayout.setVerticalGroup(
            paneUbahMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneUbahMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUbahData2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelLihatMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLihatMapelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLihatMapelLayout = new javax.swing.GroupLayout(panelLihatMapel);
        panelLihatMapel.setLayout(panelLihatMapelLayout);
        panelLihatMapelLayout.setHorizontalGroup(
            panelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLihatMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLihatData2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLihatMapelLayout.setVerticalGroup(
            panelLihatMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLihatMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLihatData2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelHapusMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelHapusMapelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHapusMapelLayout = new javax.swing.GroupLayout(panelHapusMapel);
        panelHapusMapel.setLayout(panelHapusMapelLayout);
        panelHapusMapelLayout.setHorizontalGroup(
            panelHapusMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHapusMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHapusData2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelHapusMapelLayout.setVerticalGroup(
            panelHapusMapelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHapusMapelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHapusData2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("TT Commons DemiBold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("MANAJEMEN AKUN");
        jLabel1.setIconTextGap(7);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TT Commons DemiBold", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/human-white.png"))); // NOI18N
        jLabel2.setText("STAF DASHBOARD");
        jLabel2.setIconTextGap(10);

        jLabel3.setFont(new java.awt.Font("TT Commons DemiBold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("MANAJEMEN MATA PELAJARAN");
        jLabel3.setIconTextGap(7);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("TT Commons DemiBold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("MANAJEMEN JADWAL KBM");
        jLabel4.setIconTextGap(7);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        lblLogout2.setFont(new java.awt.Font("TT Commons DemiBold", 1, 14)); // NOI18N
        lblLogout2.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogout2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout-dark-24px.png"))); // NOI18N
        lblLogout2.setText("LOGOUT");
        lblLogout2.setIconTextGap(7);
        lblLogout2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogout2MouseClicked(evt);
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
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)))
                    .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblLogout2)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        gradientPanelSide1Layout.setVerticalGroup(
            gradientPanelSide1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelSide1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(lblLogout2)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(gradientPanelSide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelTambahMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(paneUbahMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(panelLihatMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(panelHapusMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(44, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTambahMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelLihatMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneUbahMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelHapusMapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(gradientPanelSide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void panelTambahMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTambahMapelMouseClicked
        new formTambahMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelTambahMapelMouseClicked

    private void panelLihatMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLihatMapelMouseClicked
        new daftarMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelLihatMapelMouseClicked

    private void paneUbahMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneUbahMapelMouseClicked
        new daftarMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_paneUbahMapelMouseClicked

    private void panelHapusMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHapusMapelMouseClicked
        new daftarMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelHapusMapelMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new manajemenAkun().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new manajemenMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new manajemenJadwalKBM().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void lblLogout2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogout2MouseClicked
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogout2MouseClicked

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
            java.util.logging.Logger.getLogger(manajemenMaPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manajemenMaPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manajemenMaPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manajemenMaPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manajemenMaPel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.gradientPanelSide gradientPanelSide1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblLogout1;
    private javax.swing.JLabel lblLogout2;
    private swing.panelBorder paneUbahMapel;
    private swing.panelBorder panelBorder1;
    private swing.panelHapusData panelHapusData2;
    private swing.panelBorder panelHapusMapel;
    private swing.panelLihatData panelLihatData2;
    private swing.panelBorder panelLihatMapel;
    private swing.panelTambahData panelTambahData2;
    private swing.panelBorder panelTambahMapel;
    private swing.panelUbahData panelUbahData2;
    // End of variables declaration//GEN-END:variables
}
