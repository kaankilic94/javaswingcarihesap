
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Methods {

    public void sifreDegis(JFrame frame, String eski, String yeni) {
        DB db = new DB();
        DB db2 = new DB();
        String query = "CALL prcGiris()";
        PreparedStatement ps = db.preBaglan(query);
        try {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                if (!eski.equals(rs.getString("kulParola"))) {
                    JOptionPane.showMessageDialog(frame, "Eski parolo hatalı.");
                } else if (!eski.equals(yeni)) {
                    String sorgu = "CALL prcParolaDegis(?)";
                    PreparedStatement pss = db2.preBaglan(sorgu);
                    pss.setString(1, yeni);
                    int update = pss.executeUpdate();
                    if (update > 0) {
                        JOptionPane.showMessageDialog(frame, "Parola başarıyla değiştirildi.");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Parola değiştirilemedi. Lütfen tekrar deneyin.");
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Yeni parola eskisiyle aynı olamaz.");
                }
            }
        } catch (SQLException e) {
            System.err.println("sifreDegis :" + e);
        } finally {
            db.kapat();
            db2.kapat();
        }

    }

    public void kategoriEkle(JFrame frame, String katAdi, String katAciklama) {
        DB db = new DB();
        String query = "CALL prcKategoriEkle(?,?)";

        try {

            if (katAdi.equals("")) {
                JOptionPane.showMessageDialog(frame, "Kategori adı boş bırakılamaz.");
            } else {
                PreparedStatement ps = db.preBaglan(query);
                ps.setString(1, katAdi);
                ps.setString(2, katAciklama);
                int ekle = ps.executeUpdate();
                if (ekle > 0) {
                    JOptionPane.showMessageDialog(frame, "Kategori başarıyla eklendi.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Kategori eklenemedi, lütfen tekrar deneyin.");
                }
            }
        } catch (Exception e) {
            System.err.println("kategoriEkle: " + e);
        } finally {
            db.kapat();
        }

    }

    public ArrayList<Kategori> kategoriDoldur() {
        ArrayList<Kategori> ls = new ArrayList<>();

        DB db = new DB();
        String query = "CALL prcKategoriListele()";
        PreparedStatement ps = db.preBaglan(query);

        try {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Kategori k = new Kategori();
                k.setKatId(rs.getString("katId"));
                k.setKatAdi(rs.getString("katAdi"));
                k.setKatAciklama(rs.getString("katAciklama"));
                ls.add(k);
            }

        } catch (Exception e) {
            System.err.println("kategoriEkle:" + e);
        } finally {
            db.kapat();
        }

        return ls;
    }

    public DefaultTableModel kategoriTablo() {
        DefaultTableModel table = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        table.addColumn("Kategori Adı");
        table.addColumn("Kategori Açıklama");

        ArrayList<Kategori> ls = kategoriDoldur();

        for (Kategori l : ls) {
            table.addRow(new String[]{l.getKatAdi(), l.getKatAciklama()});
        }

        return table;
    }

    public void kategoriSil(JFrame frame, String katId) {

        DB db = new DB();

        try {
            String query = "CALL prcKategoriSil(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, katId);
            int sil = ps.executeUpdate();
            if (sil > 0) {
                JOptionPane.showMessageDialog(frame, "Kategori başarıyla silindi.");
            } else {
                JOptionPane.showMessageDialog(frame, "Kategori silinemedi, lütfen tekrar deneyiniz.");
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("kategoriSil:" + e);
        } finally {
            db.kapat();
        }

    }

    public void kategoruDuzenle(JFrame frame, String katId, String katAdi, String katAciklama) {
        DB db = new DB();

        try {
            String query = "CALL prcKategoriDuzenle(?,?,?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, katId);
            ps.setString(2, katAdi);
            ps.setString(3, katAciklama);
            int update = ps.executeUpdate();
            if (update > 0) {
                JOptionPane.showMessageDialog(frame, "Kategori güncellendi.");
            } else {
                JOptionPane.showMessageDialog(frame, "Kategori güncellenemedi, lütfen tekrar deneyin.");
            }

        } catch (Exception e) {
            System.err.println("kategoriDuzenle:" + e);
        } finally {
            db.kapat();
        }

    }

    public ArrayList<Musteri> musteriDoldur() {
        ArrayList<Musteri> ls = new ArrayList<>();

        DB db = new DB();
        String query = "CALL prcMusteriListele()";
        PreparedStatement ps = db.preBaglan(query);

        try {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Musteri m = new Musteri();
                m.setMusId(rs.getString("musId"));
                m.setMusAdi(rs.getString("musAdi"));
                m.setMusSoyadi(rs.getString("musSoyadi"));
                m.setMusTel(rs.getString("musTelefon"));
                m.setMusAdres(rs.getString("musAdres"));
                ls.add(m);
            }

        } catch (SQLException e) {
            System.err.println("musteriDoldur:" + e);
        } finally {
            db.kapat();
        }

        return ls;
    }

    public DefaultTableModel musteriTablo() {
        DefaultTableModel table = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        table.addColumn("Adı");
        table.addColumn("SoyAdı");
        table.addColumn("Telefon");
        table.addColumn("Adres");

        ArrayList<Musteri> ls = musteriDoldur();

        for (Musteri l : ls) {
            table.addRow(new String[]{l.getMusAdi(), l.getMusSoyadi(), l.getMusTel(), l.getMusAdres()});
        }

        return table;
    }

    public void musteriEkle(JFrame frame, String musAdi, String musSoyadi, String musTel, String musAdres) {
        DB db = new DB();
        String query = "CALL prcMusteriEkle(?,?,?,?)";

        try {

            if (musAdi.equals("") || musSoyadi.equals("") || musTel.equals("") || musAdres.equals("")) {
                JOptionPane.showMessageDialog(frame, "Lütfen boş alan bırakmayın.");
            } else if (!new Validation().telefonMu(musTel)) {
                JOptionPane.showMessageDialog(frame, "Telefon numarası formata uygun değil.");
            } else {
                PreparedStatement ps = db.preBaglan(query);
                ps.setString(1, musAdi);
                ps.setString(2, musSoyadi);
                ps.setString(3, musTel);
                ps.setString(4, musAdres);
                int ekle = ps.executeUpdate();
                if (ekle > 0) {
                    JOptionPane.showMessageDialog(frame, "Müşteri başarıyla eklendi.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Müşteri eklenemedi, lütfen tekrar deneyin.");
                }
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("kategoriEkle: " + e);
        } finally {
            db.kapat();
        }

    }

    public void musteriSil(JFrame frame, String musId) {
        DB db = new DB();

        try {
            String query = "CALL prcMusteriSil(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, musId);
            int sil = ps.executeUpdate();
            if (sil > 0) {
                JOptionPane.showMessageDialog(frame, "Müşteri başarıyla silindi.");
            } else {
                JOptionPane.showMessageDialog(frame, "Müşteri silinemedi, lütfen tekrar deneyiniz.");
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("musteriSil:" + e);
        } finally {
            db.kapat();
        }
    }

    public void musteriDuzenle(JFrame frame, String musId, String musAdi, String musSoyadi, String musTel, String musAdres) {

        DB db = new DB();

        try {
            String query = "CALL prcMusteriDuzenle(?,?,?,?,?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, musId);
            ps.setString(2, musAdi);
            ps.setString(3, musSoyadi);
            ps.setString(4, musTel);
            ps.setString(5, musAdres);
            int update = ps.executeUpdate();
            if (update > 0) {
                JOptionPane.showMessageDialog(frame, "Musteri güncellendi.");
            } else {
                JOptionPane.showMessageDialog(frame, "Musteri güncellenemedi, lütfen tekrar deneyin.");
            }

        } catch (Exception e) {
            System.err.println("MusteriDuzenle:" + e);
        } finally {
            db.kapat();
        }

    }

    public ArrayList<String> kategoriComboDoldur(JComboBox combobox) {
        ArrayList<String> ls = new ArrayList<>();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        DB db = new DB();
        String query = "CALL prcKategoriListele()";

        try {
            PreparedStatement ps = db.preBaglan(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addElement(rs.getString("katAdi"));
                ls.add(rs.getString("katId"));
            }
            combobox.setModel(model);
        } catch (Exception e) {
            System.err.println("kategoriComboDoldur: " + e);
        }
        return ls;
    }

    public ArrayList<Urun> urunDoldur() {
        ArrayList<Urun> ls = new ArrayList<>();
        DB db = new DB();

        try {

            String query = "Call prcUrunListele()";
            PreparedStatement ps = db.preBaglan(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Urun u = new Urun();
                u.setUrId(rs.getString("urId"));
                u.setUrAdi(rs.getString("urAdi"));
                u.setUrKatId(rs.getString("katAdi"));
                u.setUrAlis(rs.getString("urAlis"));
                u.setUrSatis(rs.getString("urSatis"));
                u.setUrStok(rs.getString("urStok"));
                u.setUrAciklama(rs.getString("urAciklama"));
                ls.add(u);

            }

        } catch (Exception e) {
            System.err.println("urunDoldur: " + e);
        }
        return ls;
    }

    public DefaultTableModel urunTablo() {
        DefaultTableModel table = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        table.addColumn("Ürün Adı");
        table.addColumn("Kategori");
        table.addColumn("Alış Fiyatı");
        table.addColumn("Satış Fiyatı");
        table.addColumn("Stok");
        table.addColumn("Açıklama");

        for (Urun u : urunDoldur()) {
            table.addRow(new String[]{u.getUrAdi(), u.getUrKatId(), u.getUrAlis(), u.getUrSatis(), u.getUrStok(), u.getUrAciklama()});
        }

        return table;
    }

    public void urunEkle(JFrame frame, String urnAdi, String urnKategori, String urnAlis, String urnSatis, String urnStok, String urnAciklama) {
        DB db = new DB();
        String query = "CALL prcUrunEkle(?,?,?,?,?,?)";

        try {

            if (urnAdi.equals("") || urnAlis.equals("") || urnSatis.equals("") || urnStok.equals("") || urnAciklama.equals("")) {
                JOptionPane.showMessageDialog(frame, "Lütfen boş alan bırakmayın.");
            } else {
                PreparedStatement ps = db.preBaglan(query);
                ps.setString(1, urnAdi);
                ps.setString(2, urnKategori);
                ps.setString(3, urnAlis);
                ps.setString(4, urnSatis);
                ps.setString(5, urnStok);
                ps.setString(6, urnAciklama);
                int ekle = ps.executeUpdate();
                if (ekle > 0) {
                    JOptionPane.showMessageDialog(frame, "Ürün başarıyla eklendi.");
                } else {
                    JOptionPane.showMessageDialog(frame, "Ürün eklenemedi, lütfen tekrar deneyin.");
                }
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("kategoriEkle: " + e);
        } finally {
            db.kapat();
        }

    }

    public void urunSil(JFrame frame, String urnId) {
        DB db = new DB();

        try {
            String query = "CALL prcUrunSil(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, urnId);
            int sil = ps.executeUpdate();
            if (sil > 0) {
                JOptionPane.showMessageDialog(frame, "Ürün başarıyla silindi.");
            } else {
                JOptionPane.showMessageDialog(frame, "Ürün silinemedi, lütfen tekrar deneyiniz.");
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println("urunSil:" + e);
        } finally {
            db.kapat();
        }
    }

    public void urunDuzenle(JFrame frame, String urnId, String urnAdi, String urnKategori, String urnAlis, String urnSatis, String urnStok, String urnAciklama) {

        DB db = new DB();

        try {
            String query = "CALL prcUrunDuzenle(?,?,?,?,?,?,?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, urnId);
            ps.setString(2, urnAdi);
            ps.setString(3, urnKategori);
            ps.setString(4, urnAlis);
            ps.setString(5, urnSatis);
            ps.setString(6, urnStok);
            ps.setString(7, urnAciklama);
            int update = ps.executeUpdate();
            if (update > 0) {
                JOptionPane.showMessageDialog(frame, "Ürün güncellendi.");
            } else {
                JOptionPane.showMessageDialog(frame, "Ürün güncellenemedi, lütfen tekrar deneyin.");
            }

        } catch (HeadlessException | SQLException e) {
            System.err.println("urunDuzenle:" + e);
        } finally {
            db.kapat();
        }
    }

    public ArrayList<String> kategoriUrunListele(String id, JTable tableListele) {
        ArrayList<String> ls = new ArrayList<>();
        String query = "CALL prcKategoriUrunListele(?)";
        DB db = new DB();
        DefaultTableModel tablo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tablo.addColumn("Adı");
        tablo.addColumn("Satış Fiyatı(₺)");
        tablo.addColumn("Açıklama");

        try {
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tablo.addRow(new String[]{rs.getString("urAdi"), rs.getString("urSatis"), rs.getString("urAciklama")});
                ls.add(rs.getString("urId"));
            }
            tableListele.setModel(tablo);
        } catch (SQLException e) {
            System.err.println("kategoriUrunListele: " + e);
        }
        return ls;
    }

    public ArrayList<String> comboMusterilerDoldur(JComboBox comboBox) {
        ArrayList<String> ls = new ArrayList<>();
        String query = "CALL prcMusteriListele()";
        DB db = new DB();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try {
            PreparedStatement ps = db.preBaglan(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                model.addElement(rs.getString("musAdi") + " " + rs.getString("musSoyadi"));
                ls.add(rs.getString("musId"));
            }
            comboBox.setModel(model);
        } catch (SQLException e) {
            System.err.println("comboMusterilerDoldur:" + e);
        } finally {
            db.kapat();
        }
        return ls;
    }

    public void satisYap(JFrame frame, String musId, String urunId, String adet) {

        String query = "CALL prcSatisYap(?,?,?)";
        String sorgu = "CALL prcUrunGetir(?)";
        DB db = new DB();
        DB db2 = new DB();
        try {
            PreparedStatement ps = db.preBaglan(query);
            PreparedStatement ps2 = db2.preBaglan(sorgu);
            ps.setString(1, musId);
            ps.setString(2, urunId);
            ps.setString(3, adet);
           
            ps2.setString(1, urunId);
            ResultSet rs = ps2.executeQuery();
            String urunAdet = "";
            while (rs.next()) {
                urunAdet = rs.getString("urStok");
            }

            if (Integer.valueOf(adet) > Integer.valueOf(urunAdet)) {
                JOptionPane.showMessageDialog(frame, "Stok yetersiz.");
            } else {
                 int ekle = ps.executeUpdate();
                if (ekle > 0) {
                    JOptionPane.showMessageDialog(frame, "Satış başarılı.");
                    int yeniStokInt = Integer.valueOf(urunAdet) - Integer.valueOf(adet);
                    String yeniStok = String.valueOf(yeniStokInt);
                    String query2 = "UPDATE urun SET urStok ='"+yeniStok+"' WHERE urId='"+urunId+"'";
                    db.baglan().executeUpdate(query2);
                } else {
                    JOptionPane.showMessageDialog(frame, "Satış yapılamadı. Lütfen tekrar deneyin.");
                }
            }

        } catch (HeadlessException | NumberFormatException | SQLException e) {
            System.err.println("satisYap: " + e);
        } finally {
            db.kapat();
            db2.kapat();
        }

    }
    
    public void musteriArama(String basla, String bitir, String musteri, JTable tableRapor){
        
        String[] must = musteri.split(" ");
        String adi =  must[0];
        String soyadi = "";
        
        if (must.length>1) {
            soyadi = must[must.length-1];
        }
        
        System.out.println(adi + " " + soyadi);
        DB db = new DB();
        String query = "SELECT *, date(satTarih) as tarih  FROM satis as s INNER JOIN  musteri as m  ON s.satMusId=m.musId and date(satTarih) between '"+basla+"' and  '"+bitir+"' INNER JOIN urun as u on s.satUrunId= u.urId INNER JOIN kategori as k ON u.urKatId = k.katId and m.musAdi like '%"+adi+"%' and m.musSoyadi like '%"+soyadi+"%'";
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Müşteri Adi");
        table.addColumn("Ürün Kategori");
        table.addColumn("Ürün Adı");
        table.addColumn("Adet");
        table.addColumn("Fiyat");
        table.addColumn("Eklenme Tarihi");
        try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {                
                table.addRow(new String[]{rs.getString("musAdi")+" "+rs.getString("musSoyadi"),rs.getString("katAdi"), rs.getString("urAdi"),rs.getString("urStok"),rs.getString("urSatis"),rs.getString("tarih")});
            }
            
        } catch (SQLException e) {
            System.err.println("musteriArama: " + e);
        }finally{
            db.kapat();
        }
        tableRapor.setModel(table);
        
    }
    
    public void urunArama(String basla, String bitir, String urun, JTable tableRapor){
       
        DB db = new DB();
        String query = "SELECT *, date(satTarih) as tarih  FROM satis as s INNER JOIN  musteri as m  ON s.satMusId=m.musId and date(satTarih) between '"+basla+"' and  '"+bitir+"' INNER JOIN urun as u on s.satUrunId= u.urId INNER JOIN kategori as k ON u.urKatId = k.katId and u.urAdi like '%"+urun+"%'";
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Müşteri Adi");
        table.addColumn("Ürün Kategori");
        table.addColumn("Ürün Adı");
        table.addColumn("Adet");
        table.addColumn("Fiyat");
        table.addColumn("Eklenme Tarihi");
        try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {                
                table.addRow(new String[]{rs.getString("musAdi")+" "+rs.getString("musSoyadi"),rs.getString("katAdi"), rs.getString("urAdi"),rs.getString("urStok"),rs.getString("urSatis"),rs.getString("tarih")});
            }
            
        } catch (SQLException e) {
            System.err.println("musteriArama: " + e);
        }finally{
            db.kapat();
        }
        tableRapor.setModel(table);
        
    }
    
    public void kategoriArama(String basla, String bitir, String kategori, JTable tableRapor){
         DB db = new DB();
        String query = "SELECT *, date(satTarih) as tarih  FROM satis as s INNER JOIN  musteri as m  ON s.satMusId=m.musId and date(satTarih) between '"+basla+"' and  '"+bitir+"' INNER JOIN urun as u on s.satUrunId= u.urId INNER JOIN kategori as k ON u.urKatId = k.katId and k.katAdi like '%"+kategori+"%'";
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("Müşteri Adi");
        table.addColumn("Ürün Kategori");
        table.addColumn("Ürün Adı");
        table.addColumn("Adet");
        table.addColumn("Fiyat");
        table.addColumn("Eklenme Tarihi");
        try {
            ResultSet rs = db.baglan().executeQuery(query);
            while (rs.next()) {                
                table.addRow(new String[]{rs.getString("musAdi")+" "+rs.getString("musSoyadi"),rs.getString("katAdi"), rs.getString("urAdi"),rs.getString("urStok"),rs.getString("urSatis"),rs.getString("tarih")});
            }
            
        } catch (SQLException e) {
            System.err.println("musteriArama: " + e);
        }finally{
            db.kapat();
        }
        tableRapor.setModel(table);
    }
    
    public void karZarar(JLabel label){
        
        String query = "SELECT * FROM satis inner join urun where satis.satUrunId=urun.urId";
        DB db = new DB();
        int toplam = 0;
        try {
            ResultSet rs = db.baglan().executeQuery(query);
            
            while (rs.next()) {    
                
                toplam = toplam + (rs.getInt("satAdet")*(rs.getInt("urSatis")-rs.getInt("urAlis")));
                
            }
            
            
        } catch (Exception e) {
            System.err.println("karZarar:" + e);
        }
        
        label.setText(String.valueOf(toplam));
        
    }
}
