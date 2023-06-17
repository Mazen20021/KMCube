package Admins.DataBase;
import Admins.Admins;
import Main.Config;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Doctor extends javax.swing.JFrame{
    Connection con ;
    ResultSet rss = null;
    PreparedStatement paa = null;
    PreparedStatement paad = null;
    Admins ad = new Admins();
 public Doctor(String ID , String Name , String NID , String Pass , String Av , String Spec , String operation, JTable Table){
      con = Config.connectDB();  
      switch (operation) {
            case "Insert":
                 try{
       String insert = "Insert into Doclist (ID,Name ,NationalID , Specification , Password,Available)  values (?,?,?,?,?,?)";
       paa = con.prepareStatement(insert);
       paa.setString(1, ID);
       paa.setString(2, Name);
       paa.setString(3, NID);
       paa.setString(4, Spec);
       paa.setString(5, Pass);
       paa.setString(6, Av);
       paa.executeUpdate();
       JOptionPane.showMessageDialog(null,"User Added Sucessfully");
       add_pd(ID,Name,Av,Spec,Table);
       importd_doc(Table);
    }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,"Error Password Or National ID is repeated");
    }
                break;
            case "Update":
        try{
        String update = "Update doclist set ID=? , Name=?,NationalID=?,Specification=?,Password=?,Available=? Where ID ="+ID+"";
        paa = con.prepareStatement(update);
        paa.setString(1, ID);
        paa.setString(2, Name);
        paa.setString(3, NID);
        paa.setString(5, Pass);
        paa.setString(6, Av);
        paa.setString(4, Spec);
        paa.executeUpdate();
        JOptionPane.showMessageDialog(null,"Doctor Updated");
        importd_doc(Table);
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e); 
    }    
                break;
            case "Delete":
       String delete = "DELETE from Doclist WHERE ID =?";
       int x = JOptionPane.showConfirmDialog(rootPane, "Do You want To delete this user ?", "Deleting Option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
       if(x ==JOptionPane.YES_OPTION){
       try{
       paa = con.prepareStatement(delete);
       paa.setString(1, ID);
       paa.execute();
       de(ID,Table);
       JOptionPane.showMessageDialog(null,"User Deleted Sucessfully"); 
       importd_doc(Table);
      }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
      }
      }
                break;
            default:
                break;
        }
    }
 private void add_pd(String ID , String Name , String Av , String Spec , JTable Table){
    try{
      String Adoc = "Insert into Adoc (ID,Name,Spec,Av)  values (?,?,?,?)";
      paad = con.prepareStatement(Adoc);
      paad.setString(1, ID);
      paad.setString(2, Name);
      paad.setString(3, Spec);
      paad.setString(4, Av);
      paad.executeUpdate();
      importd_doc(Table);
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Error Cannot add in doclist for patient db");
    }
}
 private void de(String ID , JTable Table){
       String delete = "DELETE from Adoc WHERE ID =?";
       try{
       paa = con.prepareStatement(delete);
       paa.setString(1, ID);
       paa.execute();
       importd_doc(Table);
      }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
     
    }   
    
} 
 private void importd_doc(JTable Table){
        try{
           String insert = "select *from doclist";
           paa = con.prepareStatement(insert);
           rss = paa.executeQuery();
           Table.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
     }
     }
}
