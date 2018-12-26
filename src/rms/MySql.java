
package rms;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class MySql {
    
        private static final String username = "root";
        private static final String password = "";
        private static final String CONN_STRING="jdbc:mysql://localhost:3306/RMS";    //Loading JDBC driver for SQL
        static Connection conn = null;
        MySql()
    {
       
        
        
        
        try
        {
            conn = DriverManager.getConnection(CONN_STRING,username,password); //Connection Established between netbeans and SQL
            System.out.println("Connected Database");                          //Database connection Successful message
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Database connection error");
          //  System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        MySql my = new MySql();
    }
}
