/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class ConnectionProvider {
    // Private static instance of the DatabaseConnection class
//    private static ConnectionProvider instance;

    // Private constructor to prevent instantiation from other classes
    Connection koneksi = null;
    private static Connection KoneksiDB() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root","");
            return koneksi;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }

    // Public method to get the single instance of DatabaseConnection
//    public static synchronized ConnectionProvider getInstance() {
//        if (instance == null) {
//            instance = new ConnectionProvider();
//        }
//        return instance;
//    }
//
//    // Public method to get a database connection
//    public Connection getConnection() throws SQLException {
//        // Here, you can configure your database connection parameters
//        String url = "jdbc:mysql://localhost:3306/perpustakaan";
//        String username = "root";
//        String password = "";
//
//        return DriverManager.getConnection(url, username, password);
//    }
}
