
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Giris {
    
    public boolean girisYap(String kulAdi, String kulParola){
           DB db = new DB();
        try {
            String q = "CALL prcGiris()";
            PreparedStatement pr = db.preBaglan(q);
            ResultSet rs = pr.executeQuery();
            if (kulAdi.equals("") || kulParola.equals("")) {
                JOptionPane.showMessageDialog(null, "Kullanici Adi veya Parola boş bırakılamaz.");
            }else{
                while(rs.next()) {
                    System.out.println("-----------------");
                    System.out.println(rs.getString("kulParola"));
                    
                
                if (kulAdi.equals(rs.getString("kulAdi")) && kulParola.equals(rs.getString("kulParola"))) {
                        return true;
                    }
               
            }
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("Hata : " + e);
        }finally{
            db.kapat();
        }  
        return false;
    }

}
