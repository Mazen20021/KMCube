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
public class Patient extends javax.swing.JFrame{
    Connection con ;
    ResultSet rss = null;
    PreparedStatement paa = null;
    PreparedStatement paad = null;
    public Patient(String NID , String Name , String Pass , String PN , String Gender , String Age, JTable Table , String type){
     con = Config.connectDB(); 
    importd_pat(Table);
    switch (type){
        case "Insert":
            try{
                 String insert = "Insert into PatientData (Name,NationalID,Password,Age,PhoneNumber,Gender)  values (?,?,?,?,?,?)";
                 paa = con.prepareStatement(insert);
                 paa.setString(1, Name);
                 paa.setString(2, NID);
                 paa.setString(3, Pass);
                 paa.setString(4, Age);
                 paa.setString(5, PN);
                 paa.setString(6, Gender);
                 paa.executeUpdate();
                 JOptionPane.showMessageDialog(null,"User Added Sucessfully");
                 importd_pat(Table);
                }   catch(HeadlessException | SQLException e){
                        importd_pat(Table);
                        JOptionPane.showMessageDialog(null,"Error Password Or National ID is repeated");
                    }
            break;
        case "Delete":
       String delete = "DELETE from PatientData WHERE NationalID =?";
       int x = JOptionPane.showConfirmDialog(rootPane, "Do You want To delete this user ?", "Deleting Option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
       if(x ==JOptionPane.YES_OPTION){
       try{      
       paa = con.prepareStatement(delete);
       paa.setString(1,NID);
       paa.execute();
       JOptionPane.showMessageDialog(null,"User Deleted Sucessfully"); 
       importd_pat(Table);     
      }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }  
    }
            break;
        case "Update":
        try{
        String update = "Update PatientData set Name=?,NationalID=?,Password=?,Age=?,PhoneNumber=?,Gender=? Where NationalID="+NID+"";
        paa = con.prepareStatement(update);
        paa.setString(1, Name);
        paa.setString(2, NID);
        paa.setString(3, Pass);
        paa.setString(4, Age);
        paa.setString(5, PN);
        paa.setString(6, Gender);
        paa.executeUpdate();
        JOptionPane.showMessageDialog(null,"Patient Updated");
        importd_pat(Table);
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null,e); 
    }    
            break;
        default:
            break;
        } 
    }
    private void importd_pat(JTable Table){
       try{
           String insert = "select *from PatientData";
           paa = con.prepareStatement(insert);
           rss = paa.executeQuery();
           Table.setModel(DbUtils.resultSetToTableModel(rss));
       }
        catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
        }
    }
}
