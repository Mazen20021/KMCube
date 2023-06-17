package Admins.DataBase;
import Main.Config;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Pharmacy extends javax.swing.JFrame{
    Connection con ;
    ResultSet rss = null;
    PreparedStatement paa = null;
    PreparedStatement paad = null;
    public Pharmacy (String ID , String Name , String Pass , String Type , JTable Table){
    con = Config.connectDB(); 
    importd_farm(Table);
        switch (Type){
            case "Insert":
                 try{
                    String insert = "Insert into FarmacyDoc (DrID,DrName,Password)  values (?,?,?)";
                    paa = con.prepareStatement(insert);
                    paa.setString(1, ID);
                    paa.setString(2, Name);
                    paa.setString(3, Pass);
                    paa.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Dr Added Sucessfully");
                    importd_farm(Table);
                }catch(HeadlessException | SQLException e){
                    importd_farm(Table);
                    JOptionPane.showMessageDialog(null,"Error Password Or National ID is repeated");
                 }
                break;
            case "Delete":
                String delete = "DELETE from FarmacyDoc WHERE DrID =?";
                int x = JOptionPane.showConfirmDialog(rootPane, "Do You want To delete this ID ?", "Deleting Option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(x ==JOptionPane.YES_OPTION){
                try{
                    paa = con.prepareStatement(delete);
                    paa.setString(1, ID);
                    paa.execute();
                // de();
                     JOptionPane.showMessageDialog(null,"ID Deleted Sucessfully"); 
                     importd_farm(Table);
                }catch(HeadlessException | SQLException e){
                    JOptionPane.showMessageDialog(null,e);
                 }  
                }
                break;
            case "Update":
                try{
                    String update = "Update FarmacyDoc set DrID=?,DrName=?,Password=? Where DrID="+ID+"";
                    paa = con.prepareStatement(update);
                    paa.setString(1, ID);
                    paa.setString(2, Name);
                    paa.setString(3, Pass);
                    paa.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Dr Updated");
                    importd_farm(Table);
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null,e); 
                }    
                break;
        }
    }
private void importd_farm(JTable Table){
        try{
           String insert = "select *from FarmacyDoc";
           paa = con.prepareStatement(insert);
           rss = paa.executeQuery();
           Table.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
     } 
}
