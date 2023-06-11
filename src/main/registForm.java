package main;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class registForm extends javax.swing.JFrame {

    Connection conn;
    Statement stm;
    ResultSet rs;
    PreparedStatement prep;
    String sql;
    String query;

    public registForm() {
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

        gradientPanel1 = new swing.gradientPanel();
        panelBorder1 = new swing.panelBorder();
        txtNIPNISN = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        txtNama = new javax.swing.JTextField();
        txtTempatLahir = new javax.swing.JTextField();
        txtTanggalLahir = new javax.swing.JTextField();
        txtJenisKelamin = new javax.swing.JTextField();
        panelRegist = new swing.panelRegist();
        cmbAkun = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        gradientPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(650, 400));

        txtNIPNISN.setBackground(new java.awt.Color(255, 255, 255));
        txtNIPNISN.setFont(new java.awt.Font("Vela Sans Med", 0, 12)); // NOI18N
        txtNIPNISN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIPNISNActionPerformed(evt);
            }
        });

        txtPass.setBackground(new java.awt.Color(255, 255, 255));

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        txtNama.setFont(new java.awt.Font("Vela Sans Med", 0, 12)); // NOI18N

        txtTempatLahir.setBackground(new java.awt.Color(255, 255, 255));
        txtTempatLahir.setFont(new java.awt.Font("Vela Sans Med", 0, 12)); // NOI18N

        txtTanggalLahir.setBackground(new java.awt.Color(255, 255, 255));
        txtTanggalLahir.setFont(new java.awt.Font("Vela Sans Med", 0, 12)); // NOI18N

        txtJenisKelamin.setBackground(new java.awt.Color(255, 255, 255));
        txtJenisKelamin.setFont(new java.awt.Font("Vela Sans Med", 0, 12)); // NOI18N

        cmbAkun.setBackground(new java.awt.Color(255, 255, 255));
        cmbAkun.setEditable(true);
        cmbAkun.setFont(new java.awt.Font("Vela Sans Med", 0, 12)); // NOI18N
        cmbAkun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guru", "Siswa" }));

        btnSubmit.setBackground(new java.awt.Color(38, 46, 61));
        btnSubmit.setFont(new java.awt.Font("Vela Sans Med", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(204, 204, 204));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubmitMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Vela Sans SemBd", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Akun");

        jLabel2.setFont(new java.awt.Font("Vela Sans SemBd", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nama Lengkap");

        jLabel3.setFont(new java.awt.Font("Vela Sans SemBd", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NIP/NISN");

        jLabel4.setFont(new java.awt.Font("Vela Sans SemBd", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Vela Sans SemBd", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tempat Lahir");

        jLabel6.setFont(new java.awt.Font("Vela Sans SemBd", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tanggal Lahir");

        jLabel7.setFont(new java.awt.Font("Vela Sans SemBd", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Jenis Kelamin");

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
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(panelRegist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblBack)))
                .addGap(50, 50, 50)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(txtTempatLahir)
                    .addComponent(txtTanggalLahir)
                    .addComponent(txtJenisKelamin)
                    .addComponent(txtNama)
                    .addComponent(cmbAkun, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNIPNISN))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblBack)
                        .addGap(55, 55, 55)
                        .addComponent(panelRegist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNIPNISN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTempatLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTanggalLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtJenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gradientPanel1Layout = new javax.swing.GroupLayout(gradientPanel1);
        gradientPanel1.setLayout(gradientPanel1Layout);
        gradientPanel1Layout.setHorizontalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradientPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        gradientPanel1Layout.setVerticalGroup(
            gradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradientPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void cleartxt(){
        txtNIPNISN.setText("");
        txtNama.setText("");
        txtPass.setText("");
        txtTempatLahir.setText("");
        txtTanggalLahir.setText("");
        txtJenisKelamin.setText("");
        txtNIPNISN.requestFocus();
    }
    
    public boolean checkNIP(String nip){
        boolean checkUser = false;
        sql = "SELECT * FROM tbguru WHERE nip ='"+ nip +"'";
        
        try {
            prep = conn.prepareStatement(sql);
            prep.setString(1, nip);
            rs = prep.executeQuery();
            
            if(rs.next())
            {
                checkUser = true;
            }
            
        } catch (SQLException ex) {
            System.out.println("Terjadi error");
        }
         return checkUser;
    }
    
    private void txtNIPNISNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIPNISNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIPNISNActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        new main.manajemenAkun().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseClicked
        String NIPNISN = txtNIPNISN.getText();
        String nama = txtNama.getText();
        String password = new String(txtPass.getPassword());
        String tempatlahir = txtTempatLahir.getText();
        String tanggallahir = txtTanggalLahir.getText();
        String jeniskelamin = txtJenisKelamin.getText();
        
        String cekuser = null;
        
        if (cmbAkun.getSelectedIndex() == 0){
            
            if(checkNIP(NIPNISN)){
                String akunGagal = "Akun sudah terdaftar";
                JOptionPane.showMessageDialog(null,akunGagal,"Message",
                    JOptionPane.INFORMATION_MESSAGE);
                cleartxt();
               
            } else {
                try {
                    query = "INSERT INTO tbguru(nip, nama, password, tempatlahir, tanggallahir, jeniskelamin)"
                            + "VALUES('"+ NIPNISN +"', '"+ nama +"', '"+ password +"', '"+ tempatlahir +"', DATE'"+ tanggallahir +"', '"+ jeniskelamin +"')";
                    prep = conn.prepareStatement(query);
                    prep.executeUpdate();
                    
                    String berhasil = "Regist Akun Berhasil";
                    JOptionPane.showMessageDialog(null,berhasil,"Message",
                        JOptionPane.INFORMATION_MESSAGE);
                    new manajemenAkun().setVisible(true);
                    dispose();
                    
                } catch (SQLException e) {
                    String gagal = "Regist Akun Gagal";
                    JOptionPane.showMessageDialog(null,gagal,"Message",
                        JOptionPane.INFORMATION_MESSAGE);
                    cleartxt();
                }
                
            }
            
        } else if (cmbAkun.getSelectedIndex() == 1) {
            try {
                sql = "SELECT * FROM tbsiswa WHERE nisn = '" + NIPNISN + "'";
                rs = stm.executeQuery(sql);

                while(rs.next()){
                    cekuser = rs.getString("nisn");
                }
                rs.close();
                stm.close();

            } catch (SQLException e){
                System.out.print("Terjadi Error");
            }

            if(cekuser == null){
                try {
                    query = "INSERT INTO tbsiswa(nisn, nama, password, tempatlahir, tanggallahir, jeniskelamin)"
                            + "VALUES('"+ NIPNISN +"', '"+ nama +"', '"+ password +"', '"+ tempatlahir +"', DATE'"+ tanggallahir +"', '"+ jeniskelamin +"')";
                    prep = conn.prepareStatement(query);
                    prep.executeUpdate();
                    
                    String berhasil = "Regist Akun Berhasil";
                    JOptionPane.showMessageDialog(null,berhasil,"Message",
                        JOptionPane.INFORMATION_MESSAGE);
                    new manajemenAkun().setVisible(true);
                    dispose();
                    
                } catch (SQLException e) {
                    String gagal = "Regist Akun Gagal";
                    JOptionPane.showMessageDialog(null,gagal,"Message",
                        JOptionPane.INFORMATION_MESSAGE);
                    cleartxt();
                }
                
            } else {
                String akunGagal = "Akun sudah terdaftar";
                JOptionPane.showMessageDialog(null,akunGagal,"Message",
                    JOptionPane.INFORMATION_MESSAGE);
                cleartxt();
               
            }
        }
    }//GEN-LAST:event_btnSubmitMouseClicked

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
            java.util.logging.Logger.getLogger(registForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbAkun;
    private swing.gradientPanel gradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblBack;
    private swing.panelBorder panelBorder1;
    private swing.panelRegist panelRegist;
    private javax.swing.JTextField txtJenisKelamin;
    private javax.swing.JTextField txtNIPNISN;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTanggalLahir;
    private javax.swing.JTextField txtTempatLahir;
    // End of variables declaration//GEN-END:variables
}
