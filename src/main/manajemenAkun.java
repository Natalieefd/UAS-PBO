package main;

public class manajemenAkun extends javax.swing.JFrame {

    public manajemenAkun() {
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
        lblLogout1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        panelRegist = new swing.panelBorder();
        panelRegist1 = new swing.panelRegist();
        panelRegist2 = new swing.panelBorder();
        panelLihatAkun1 = new swing.panelLihatAkun();

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
        lblManajemenJadwalKBM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManajemenJadwalKBMMouseClicked(evt);
            }
        });

        lblLogout1.setFont(new java.awt.Font("TT Commons DemiBold", 1, 14)); // NOI18N
        lblLogout1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout-dark-24px.png"))); // NOI18N
        lblLogout1.setText("LOGOUT");
        lblLogout1.setIconTextGap(7);
        lblLogout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogout1MouseClicked(evt);
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
                        .addComponent(lblLogout1)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout1)
                .addGap(23, 23, 23))
        );

        jLabel6.setFont(new java.awt.Font("TT Commons DemiBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 46, 61));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/couple (3).png"))); // NOI18N
        jLabel6.setText("MANAJEMEN AKUN");
        jLabel6.setIconTextGap(15);

        panelRegist.setPreferredSize(new java.awt.Dimension(200, 200));
        panelRegist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegistMouseClicked(evt);
            }
        });

        panelRegist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegist1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRegistLayout = new javax.swing.GroupLayout(panelRegist);
        panelRegist.setLayout(panelRegistLayout);
        panelRegistLayout.setHorizontalGroup(
            panelRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRegist1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panelRegistLayout.setVerticalGroup(
            panelRegistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRegist1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelRegist2.setPreferredSize(new java.awt.Dimension(200, 200));
        panelRegist2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRegist2MouseClicked(evt);
            }
        });

        panelLihatAkun1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLihatAkun1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRegist2Layout = new javax.swing.GroupLayout(panelRegist2);
        panelRegist2.setLayout(panelRegist2Layout);
        panelRegist2Layout.setHorizontalGroup(
            panelRegist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegist2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLihatAkun1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRegist2Layout.setVerticalGroup(
            panelRegist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegist2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLihatAkun1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(panelRegist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(panelRegist2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRegist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRegist2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
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

    private void panelRegistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegistMouseClicked
        new registForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelRegistMouseClicked

    private void panelRegist1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegist1MouseClicked
        new registForm().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelRegist1MouseClicked

    private void panelRegist2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRegist2MouseClicked
        new daftarAkun().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelRegist2MouseClicked

    private void panelLihatAkun1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLihatAkun1MouseClicked
        new daftarAkun().setVisible(true);
        dispose();
    }//GEN-LAST:event_panelLihatAkun1MouseClicked

    private void lblManajemenMaPelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManajemenMaPelMouseClicked
        new manajemenMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblManajemenMaPelMouseClicked

    private void lblManajemenJadwalKBMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManajemenJadwalKBMMouseClicked
        new manajemenJadwalKBM().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblManajemenJadwalKBMMouseClicked

    private void lblLogout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogout1MouseClicked
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblLogout1MouseClicked

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
            java.util.logging.Logger.getLogger(manajemenAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manajemenAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manajemenAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manajemenAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manajemenAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.gradientPanelSide gradientPanelSide1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLogout1;
    private javax.swing.JLabel lblManajemenAkun;
    private javax.swing.JLabel lblManajemenJadwalKBM;
    private javax.swing.JLabel lblManajemenMaPel;
    private swing.panelBorder panelBorder1;
    private swing.panelLihatAkun panelLihatAkun1;
    private swing.panelBorder panelRegist;
    private swing.panelRegist panelRegist1;
    private swing.panelBorder panelRegist2;
    // End of variables declaration//GEN-END:variables
}
