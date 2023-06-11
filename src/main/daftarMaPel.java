package main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class daftarMaPel extends javax.swing.JFrame {

    private String idMaPel;
    private String namaMaPel;
    private String waktuMaPel;
    
    Connection conn;
    Statement stm;
    ResultSet rs;
    PreparedStatement prep;
    String sql;
    String query;
    private DefaultTableModel DftTblModel_MaPel;

    public daftarMaPel() {
        initComponents();
        config.koneksi DB = new config.koneksi();
        DB.config();
        conn = DB.conn;
        stm = DB.stm;
        
        setBackground(new Color(0,0,0,0));
        
        tampilData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new swing.panelBorder();
        gradientPanelSide2 = new swing.gradientPanelSide();
        lblManajemenAkun = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblManajemenMaPel = new javax.swing.JLabel();
        lblManajemenJadwalKBM = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMaPel = new javax.swing.JTable();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();

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

        javax.swing.GroupLayout gradientPanelSide2Layout = new javax.swing.GroupLayout(gradientPanelSide2);
        gradientPanelSide2.setLayout(gradientPanelSide2Layout);
        gradientPanelSide2Layout.setHorizontalGroup(
            gradientPanelSide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelSide2Layout.createSequentialGroup()
                .addGroup(gradientPanelSide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gradientPanelSide2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(gradientPanelSide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblManajemenMaPel)
                            .addComponent(lblManajemenAkun)
                            .addComponent(lblManajemenJadwalKBM)))
                    .addGroup(gradientPanelSide2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblLogout)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        gradientPanelSide2Layout.setVerticalGroup(
            gradientPanelSide2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanelSide2Layout.createSequentialGroup()
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
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book-dark-32px.png"))); // NOI18N
        jLabel6.setText("DAFTAR MATA PELAJARAN");
        jLabel6.setIconTextGap(15);

        tbMaPel.setBackground(new java.awt.Color(204, 204, 204));
        tbMaPel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbMaPel.setPreferredSize(new java.awt.Dimension(450, 40));
        tbMaPel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMaPelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMaPel);

        btnHapus.setFont(new java.awt.Font("Vela Sans SemBd", 1, 10)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Vela Sans SemBd", 1, 10)); // NOI18N
        btnUbah.setText("UBAH");
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
        });

        lblBack.setFont(new java.awt.Font("Vela Sans SemBd", 0, 12)); // NOI18N
        lblBack.setForeground(new java.awt.Color(38, 46, 61));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chevron-dark.png"))); // NOI18N
        lblBack.setText("Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(gradientPanelSide2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnUbah))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradientPanelSide2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHapus)
                            .addComponent(btnUbah)
                            .addComponent(lblBack))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    public void tampilData(){
        DftTblModel_MaPel = new DefaultTableModel();
        DftTblModel_MaPel.addColumn("ID");
        DftTblModel_MaPel.addColumn("Mata Pelajaran");
        DftTblModel_MaPel.addColumn("Alokasi Waktu/Minggu");
        
        tbMaPel.setModel(DftTblModel_MaPel);
        try {
            DftTblModel_MaPel.fireTableDataChanged();
            sql = "SELECT * FROM tbmatapelajaran";
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                DftTblModel_MaPel.addRow(new Object[]{
                    rs.getString("idmatapelajaran"),
                    rs.getString("nama"),
                    rs.getString("alokasiwaktu")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        new formUbahMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUbahMouseClicked

    private void tbMaPelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMaPelMouseClicked
        int baris = tbMaPel.getSelectedRow();
        idMaPel = DftTblModel_MaPel.getValueAt(baris, 0).toString();
        namaMaPel = DftTblModel_MaPel.getValueAt(baris, 1).toString();
        waktuMaPel = DftTblModel_MaPel.getValueAt(baris, 2).toString();
    }//GEN-LAST:event_tbMaPelMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin hapus data?", "Konfirmasi",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (confirm == 0) {
            try {
                query = "DELETE FROM tbmatapelajaran WHERE idmatapelajaran ='" + getIdMaPel() + "'";
                prep = conn.prepareStatement(query);
                prep.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan",
                        JOptionPane.INFORMATION_MESSAGE);
                
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal di hapus" + e.getMessage(), "Pesan",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
        new daftarMaPel().setVisible(true);
    }//GEN-LAST:event_btnHapusMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        new manajemenMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblManajemenMaPelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManajemenMaPelMouseClicked
        new manajemenMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblManajemenMaPelMouseClicked

    private void lblManajemenAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManajemenAkunMouseClicked
        new manajemenAkun().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblManajemenAkunMouseClicked

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
            java.util.logging.Logger.getLogger(daftarMaPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftarMaPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftarMaPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftarMaPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftarMaPel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnUbah;
    private swing.gradientPanelSide gradientPanelSide1;
    private swing.gradientPanelSide gradientPanelSide2;
    private swing.gradientPanelSide gradientPanelSide3;
    private swing.gradientPanelSide gradientPanelSide4;
    private swing.gradientPanelSide gradientPanelSide5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblLogout1;
    private javax.swing.JLabel lblLogout2;
    private javax.swing.JLabel lblLogout3;
    private javax.swing.JLabel lblManajemenAkun;
    private javax.swing.JLabel lblManajemenJadwalKBM;
    private javax.swing.JLabel lblManajemenMaPel;
    private swing.panelBorder panelBorder1;
    private javax.swing.JTable tbMaPel;
    // End of variables declaration//GEN-END:variables

    public String getIdMaPel() {
        return idMaPel;
    }

    public void setIdMaPel(String idMaPel) {
        this.idMaPel = idMaPel;
    }

    public String getNamaMaPel() {
        return namaMaPel;
    }

    public void setNamaMaPel(String namaMaPel) {
        this.namaMaPel = namaMaPel;
    }

    public String getWaktuMaPel() {
        return waktuMaPel;
    }

    public void setWaktuMaPel(String waktuMaPel) {
        this.waktuMaPel = waktuMaPel;
    }
}
