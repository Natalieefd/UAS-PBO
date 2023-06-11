package main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class akunSiswa extends javax.swing.JFrame {

    Connection conn;
    Statement stm;
    ResultSet rs;
    PreparedStatement prep;
    String sql;
    String query;
    private DefaultTableModel DftTblModel_Siswa;

    public akunSiswa() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSiswa = new javax.swing.JTable();
        gradientPanelSide1 = new swing.gradientPanelSide();
        lblManajemenAkun = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblManajemenMaPel = new javax.swing.JLabel();
        lblManajemenJadwalKBM = new javax.swing.JLabel();
        lblLogout2 = new javax.swing.JLabel();
        lblBack5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel6.setFont(new java.awt.Font("TT Commons DemiBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 46, 61));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/card-32PX.png"))); // NOI18N
        jLabel6.setText("DAFTAR AKUN SISWA");
        jLabel6.setIconTextGap(15);

        tbSiswa.setBackground(new java.awt.Color(204, 204, 204));
        tbSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbSiswa.setPreferredSize(new java.awt.Dimension(450, 40));
        jScrollPane1.setViewportView(tbSiswa);

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
                            .addComponent(lblManajemenMaPel)
                            .addComponent(lblManajemenAkun)
                            .addComponent(lblManajemenJadwalKBM)))
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
                .addComponent(lblManajemenAkun)
                .addGap(18, 18, 18)
                .addComponent(lblManajemenMaPel)
                .addGap(18, 18, 18)
                .addComponent(lblManajemenJadwalKBM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                .addComponent(lblLogout2)
                .addGap(23, 23, 23))
        );

        lblBack5.setFont(new java.awt.Font("Vela Sans SemBd", 0, 12)); // NOI18N
        lblBack5.setForeground(new java.awt.Color(38, 46, 61));
        lblBack5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chevron-dark.png"))); // NOI18N
        lblBack5.setText("Back");
        lblBack5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBack5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(gradientPanelSide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblBack5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBack5)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    public void tampilData(){
        DftTblModel_Siswa = new DefaultTableModel();
        DftTblModel_Siswa.addColumn("NISN");
        DftTblModel_Siswa.addColumn("Nama");
        DftTblModel_Siswa.addColumn("Password");
        DftTblModel_Siswa.addColumn("Tempat Lahir");
        DftTblModel_Siswa.addColumn("Tanggal Lahir");
        DftTblModel_Siswa.addColumn("Jenis Kelamin");
        
        tbSiswa.setModel(DftTblModel_Siswa);
        try {
            DftTblModel_Siswa.fireTableDataChanged();
            sql = "SELECT * FROM tbsiswa";
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                DftTblModel_Siswa.addRow(new Object[]{
                    rs.getString("nisn"),
                    rs.getString("nama"),
                    rs.getString("password"),
                    rs.getString("tempatlahir"),
                    rs.getString("tanggallahir"),
                    rs.getString("jeniskelamin")
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void lblManajemenAkunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManajemenAkunMouseClicked
        new manajemenAkun().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblManajemenAkunMouseClicked

    private void lblManajemenMaPelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManajemenMaPelMouseClicked
        new manajemenMaPel().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblManajemenMaPelMouseClicked

    private void lblManajemenJadwalKBMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManajemenJadwalKBMMouseClicked
        new manajemenJadwalKBM().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblManajemenJadwalKBMMouseClicked

    private void lblBack5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBack5MouseClicked
        new manajemenAkun().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBack5MouseClicked

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
            java.util.logging.Logger.getLogger(akunSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(akunSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(akunSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(akunSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new akunSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.gradientPanelSide gradientPanelSide1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBack5;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblLogout1;
    private javax.swing.JLabel lblLogout2;
    private javax.swing.JLabel lblManajemenAkun;
    private javax.swing.JLabel lblManajemenJadwalKBM;
    private javax.swing.JLabel lblManajemenMaPel;
    private swing.panelBorder panelBorder1;
    private javax.swing.JTable tbSiswa;
    // End of variables declaration//GEN-END:variables
}
