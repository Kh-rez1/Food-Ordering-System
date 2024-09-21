package org.xemacscode.demo;
import java.sql.*;

/**
 *
 * @author mdana
 */
public class DBConnection {
    
    // JDBC URL, username, and password of MySQL server
    static final String DB_URL = "jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";  // default XAMPP username
    static final String PASS = "";      // default XAMPP password (empty)
    
    public static Connection connectDB(){
        
        Connection conn = null;
        
        try{
            // Register JDBC driver (uncomment if needed)
            // Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Database connected successfully!");
            
            return conn;
            
        }catch(SQLException ex){
            // Handle errors for JDBC
            System.out.println("There were errors while connecting to Database: " + ex.getMessage());
            return null;
        }
    }
}
