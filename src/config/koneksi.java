package config;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    
    public Connection conn;
    public Statement stm;
    
    public void config() {
        try {
            String url = "jdbc:mysql://localhost:3306/dbsiswasekolah";
            String user = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            stm = (Statement) conn.createStatement();
//            System.out.println("koneksi berhasil;");
            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
}
