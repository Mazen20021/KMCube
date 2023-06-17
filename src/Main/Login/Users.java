package Main.Login;
import Main.Main;
import Admins.Admins;
import Reception.Reception;
import Doctors.doctor1;
import Farmacy.Farmacy_Main;
import Main.Config;
import Managers.Managers;
import Reception.Patient_Female;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Users extends javax.swing.JFrame{
    Admins AD = new Admins();
    Main m = new Main();
    Farmacy_Main fm = new Farmacy_Main();
    Reception rD = new Reception();
    Patient_Female ptf = new Patient_Female();
    Managers mg = new Managers();
    doctor1 dr = new doctor1();
    Connection con ;
    ResultSet rs = null;
    PreparedStatement pa = null;
   public Users(String NID , String Pass){
       con = Config.connectDB();
       if((NID.equals("10001")) & (Pass.equals("Admin_ad"))){
           m.setVisible(false);
           dispose();
           AD.show();
       }
       else if((NID.equals("80002")) & (Pass.equals("Admin_rs"))){
           m.setVisible(false);
           dispose();
           rD.show();
       }else{
           try{
           String sql = "select * from doclist WHERE NationalID LIKE ? and Password LIKE ?;";
           pa = con.prepareStatement(sql);
           pa.setString(1, NID);
           pa.setString(2, Pass);
           rs = pa.executeQuery();
           if(rs.next()){
               m.setVisible(false);
              dispose();
              dr.show();
              
           }
           else if(!rs.next()){
              rec(NID , Pass);
           }
           else{
               JOptionPane.showMessageDialog(null, "User Is Not Found"); 
           }
           
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error"); 
       }
       }
   }
    private void rec(String NID , String Pass){
        if((NID.equals("10001")) & (Pass.equals("Admin_ad"))){
            m.setVisible(false);
           dispose();
           AD.show();
           
       }
       else if((NID.equals("90001")) & (Pass.equals("Admin_mg"))){
           m.setVisible(false);
           mg.show();
           dispose();
       }
       else{
        try{
           String sql = "select * from PatientData WHERE NationalID LIKE ? and Password LIKE ?;";
           pa = con.prepareStatement(sql);
           pa.setString(1, NID);
           pa.setString(2, Pass);
           rs = pa.executeQuery();
           if(rs.next()){
              m.setVisible(false);
              dispose();
              ptf.show();
              
           }else if(!rs.next()){
               farm(NID , Pass);
           }
           else{
               JOptionPane.showMessageDialog(null, "User Is Not Found"); 
           }
           
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error"); 
       }
       }
    }
    private void farm(String NID , String Pass){
        try{
           String sql = "select * from FarmacyDoc WHERE DrID LIKE ? and Password LIKE ?;";
           pa = con.prepareStatement(sql);
           pa.setString(1, NID);
           pa.setString(2, Pass);
           rs = pa.executeQuery();
           if(rs.next()){
              m.setVisible(false);
              dispose();
              fm.show();
              
           }
           else{
               JOptionPane.showMessageDialog(null, "User Is Not Found"); 
           }
           
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Error"); 
       }  
    }
    
}
