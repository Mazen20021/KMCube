package Farmacy.Medicine;
import Main.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
public class SearchDrID {
Connection conn;
ResultSet rss = null;
PreparedStatement paa = null;
  public SearchDrID(String DRID, String Pass, JTable Table){
    conn = Config.connectDB();
    try{
          String insert = "select *from FarmacyDoc Where DrID =? and Password=?";
           paa = conn.prepareStatement(insert); 
           paa.setString(1, DRID);
           paa.setString(2, Pass);
           rss = paa.executeQuery();
          if(!rss.next()){
            JOptionPane.showMessageDialog(null,"ID or Password is Wrong"); 
         }else{
              updatetable(Table);
          }
      }catch(SQLException e){
          JOptionPane.showMessageDialog(null,e); 
      }
  }  
  private void updatetable(JTable Table){
      try{
           String insert = "select MedName , MedCode , ExpDate , Quantity , DrName , Notes from Farmacy";
           paa = conn.prepareStatement(insert);
           rss = paa.executeQuery();
           Table.setModel(DbUtils.resultSetToTableModel(rss));
       }
       catch(SQLException e){
           JOptionPane.showMessageDialog(null,e);
       }
  }
}
