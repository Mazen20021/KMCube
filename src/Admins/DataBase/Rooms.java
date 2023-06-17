package Admins.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Main.Config;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
public class Rooms extends javax.swing.JFrame{
    Connection con ;
    ResultSet rss = null;
    PreparedStatement paa = null;
    PreparedStatement paad = null;
    public Rooms(String RN , String Statues , String Type , JTable Table){
        con = Config.connectDB();
        importd_Rooms(Table);
        switch(Type){
            case "Insert":
                try{
                    String insert = "Insert into RoomEmg (RoomNo,State)  values (?,?)";
                    paa = con.prepareStatement(insert);
                    paa.setString(1, RN);
                    paa.setString(2, Statues);
                    paa.executeUpdate();            
                    JOptionPane.showMessageDialog(null,"Room Added Sucessfully");
                    importd_Rooms(Table); 
                 }catch(HeadlessException | SQLException e){
        
                    JOptionPane.showMessageDialog(null,"Error Room Exists");
                 } 
                    break;
            case "Update":
                try{
                    String update = "Update RoomEmg set RoomNo=?,State=? Where RoomNo ="+RN+"";
                    paa = con.prepareStatement(update);
                    paa.setString(1, RN);
                    paa.setString(2, Statues );
                    paa.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Room Updated");
                    importd_Rooms(Table);
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null,e); 
        
                }
                break;
            case "Delete":
                String delete = "DELETE from RoomEmg WHERE RoomNo =?";
                int x = JOptionPane.showConfirmDialog(rootPane, "Do You want To delete this Room ?", "Deleting Option", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if(x ==JOptionPane.YES_OPTION){
                try{
                    paa = con.prepareStatement(delete);
                    paa.setString(1, RN);
                    paa.execute();
                    JOptionPane.showMessageDialog(null,"Room Deleted Sucessfully"); 
                    importd_Rooms(Table);
                }catch(HeadlessException | SQLException e){
                    JOptionPane.showMessageDialog(null,e);
                }  
                }
                break;
            default:
                break;
        }
    }
    private void importd_Rooms(JTable Table){
        try{
           String insert = "select *from RoomEmg";
           paa = con.prepareStatement(insert);
           rss = paa.executeQuery();
           Table.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
     }
}
