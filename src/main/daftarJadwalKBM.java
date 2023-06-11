package main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class daftarJadwalKBM extends javax.swing.JFrame {

    private String idJadwalKBM;
    private String kelas;
    private String hari;
    private String jam;
    private String maPel;
    private String ket;
    
    Connection conn;
    Statement stm;
    ResultSet rs;
    PreparedStatement prep;
    String sql;
    String query;
    private DefaultTableModel DftTblModel_Jadwal;

    public daftarJadwalKBM() {
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

        gradientPanel1 = new swing.gradientPanel();
        panelBorder1 = new swing.panelBorder();
        jLabel6 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbJadwal = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("TT Commons DemiBold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(38, 46, 61));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("JADWAL KEGIATAN BELAJAR MENGAJAR");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setIconTextGap(15);

        lblBack.setFont(new java.awt.Font("Vela Sans SemBd", 0, 12)); // NOI18N
        lblBack.setForeground(new java.awt.Color(38, 46, 61));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chevron-dark.png"))); // NOI18N
        lblBack.setText("Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        tbJadwal.setBackground(new java.awt.Color(204, 204, 204));
        tbJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbJadwal.setPreferredSize(new java.awt.Dimension(450, 40));
        tbJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbJadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbJadwal);

        jLabel8.setFont(new java.awt.Font("TT Commons DemiBold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(38, 46, 61));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SEMESTER GENAP TAHUN AJARAN 2022/2023");
        jLabel8.setIconTextGap(15);

        btnUbah.setFont(new java.awt.Font("Vela Sans SemBd", 1, 10)); // NOI18N
        btnUbah.setText("UBAH");
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Vela Sans SemBd", 1, 10)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHapusMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblBack))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)))
                .addGap(1, 1, 1)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus)
                    .addComponent(btnUbah))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void tampilData(){
        DftTblModel_Jadwal = new DefaultTableModel();
        DftTblModel_Jadwal.addColumn("Kelas");
        DftTblModel_Jadwal.addColumn("Hari");
        DftTblModel_Jadwal.addColumn("Jam");
        DftTblModel_Jadwal.addColumn("Mata Pelajaran");
        DftTblModel_Jadwal.addColumn("Keterangan");
        
        tbJadwal.setModel(DftTblModel_Jadwal);
        try {
            DftTblModel_Jadwal.fireTableDataChanged();
            sql = "SELECT * FROM tbjadwalkbm ORDER BY Kelas";
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                DftTblModel_Jadwal.addRow(new Object[]{
                    rs.getString("kelas"),
                    rs.getString("hari"),
                    rs.getString("jam"),
                    rs.getString("matapelajaran"),
                    rs.getString("keterangan")
                    
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        new manajemenJadwalKBM().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        new formUbahJadwalKBM().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnUbahMouseClicked

    private void btnHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHapusMouseClicked
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin hapus data?", "Konfirmasi",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirm == 0) {
            try {
                query = "DELETE FROM tbjadwalkbm WHERE idjadwal ='" + getIdJadwalKBM() + "'";
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

    private void tbJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbJadwalMouseClicked
        int baris = tbJadwal.getSelectedRow();
        idJadwalKBM = DftTblModel_Jadwal.getValueAt(baris, 0).toString();
        kelas = DftTblModel_Jadwal.getValueAt(baris, 1).toString();
        hari = DftTblModel_Jadwal.getValueAt(baris, 2).toString();
        jam = DftTblModel_Jadwal.getValueAt(baris, 3).toString();
        maPel = DftTblModel_Jadwal.getValueAt(baris, 4).toString();
        ket = DftTblModel_Jadwal.getValueAt(baris, 5).toString();
    }//GEN-LAST:event_tbJadwalMouseClicked

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
            java.util.logging.Logger.getLogger(daftarJadwalKBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftarJadwalKBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftarJadwalKBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftarJadwalKBM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new daftarJadwalKBM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnUbah;
    private swing.gradientPanel gradientPanel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBack;
    private swing.panelBorder panelBorder1;
    private javax.swing.JTable tbJadwal;
    // End of variables declaration//GEN-END:variables

    public String getIdJadwalKBM() {
        return idJadwalKBM;
    }

    public void setIdJadwalKBM(String idJadwalKBM) {
        this.idJadwalKBM = idJadwalKBM;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getMaPel() {
        return maPel;
    }

    public void setMaPel(String maPel) {
        this.maPel = maPel;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
}
