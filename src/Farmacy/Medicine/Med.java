package Farmacy.Medicine;
import Main.Main;
import Main.Config;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
public class Med extends javax.swing.JFrame {
Connection conn;
ResultSet rss = null;
PreparedStatement paa = null; 

    public Med(String MedName , String State , String MedCode , String Quantity , String ExpDate , String DRID, String DRName , String text , String Type){
        conn = Config.connectDB();
        switch(Type){
            case "Insert":
                try{
            String Surgon = "Insert into Farmacy (MedName,MedCode,ExpDate,Quantity,DrID,DrName,Notes)  values (?,?,?,?,?,?,?)";
            paa = conn.prepareStatement(Surgon);
            paa.setString(1, MedName);
            paa.setString(2, MedCode);
            paa.setString(3, ExpDate);
            paa.setString(4, Quantity);
            paa.setString(5, DRID);
            paa.setString(6, DRName);
            paa.setString(7, text);
            if(Quantity.equals("0")){
              paa.setString(4, "Out Of Stock"); 
              paa.executeUpdate();
              JOptionPane.showMessageDialog(null,"Medicine Added(Note Please As soon As possible Get More Of That Medicine)");
            }else{
                paa.setString(4, Quantity); 
                paa.executeUpdate();
                JOptionPane.showMessageDialog(null,"This Medicine Added Sucessfully");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
                break;
            case "Update":
                try{
                     String update = "Update Farmacy set Quantity=? Where MedCode ="+MedCode+"";
                     paa = conn.prepareStatement(update);
                     paa.setString(1, Quantity);
                     if(Quantity.equals("0")){
                          paa.setString(1, "Out Of Stock"); 
                          paa.executeUpdate();
                          JOptionPane.showMessageDialog(null,"Medicine Updated(Note Please As soon As possible Get More Of That Medicine)");
                    }else{
                          paa.executeUpdate(); 
                          JOptionPane.showMessageDialog(null,"Medicine Updated");
                        }
                }catch(SQLException e){
                     JOptionPane.showMessageDialog(null,e);
                }
                break;
            default:
                break;
        }
    }
    
}
