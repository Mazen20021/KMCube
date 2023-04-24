package Main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Config {
    public static Connection connectDB(){
        Connection con = null;
        String url = "jdbc:sqlite:C:/sqlite/db/KMMCUBE.db";
        
        try {
         con = DriverManager.getConnection(url);
         System.out.println("Connected To KMMCUBE DataBase");
            Statement stnt = con.createStatement();
        }
        catch(SQLException ex){
            System.out.println("Disconnected");
            Logger.getLogger(Config.class.getName()).log(Level.SEVERE,null,ex);
    }
        return con;
    }
    public static void main(String[] args) {
         connectDB();
        }
    
 }
