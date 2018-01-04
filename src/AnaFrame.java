
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AnaFrame extends javax.swing.JFrame {

    Methods method = new Methods();
    ArrayList<Kategori> katls = method.kategoriDoldur();
    ArrayList<Musteri> musls = method.musteriDoldur();
    ArrayList<Urun> urls = method.urunDoldur();
    ArrayList<String> katIdLs;
    

    public AnaFrame() {
        initComponents();
        Methods m = new Methods();
        tableKategori.setModel(m.kategoriTablo());
        tableMusteri.setModel(m.musteriTablo());
        tableUrun.setModel(m.urunTablo());

        setEnabled(false, jPanel9.getComponents());
        setEnabled(false, jPanel11.getComponents());
        setEnabled(false, jPanel14.getComponents());
        setEnabled(false, jPanel15.getComponents());
        setEnabled(false, jPanel17.getComponents());
        setEnabled(false, jPanel19.getComponents());

        //setvisible
        jPanel20.setVisible(false);
        panelSatis.setVisible(false);

        katIdLs = m.kategoriComboDoldur(comboUrnKategori);
        m.kategoriComboDoldur(comboUrnDuzenleKategori);
        m.kategoriComboDoldur(comboListeleme);

        //Date
        Date date = new Date();

        jDateChooserBasla.setDateFormatString("yyyy-MM-dd");
        jDateChooserBasla.setDate(date);

        jDateChooserBitir.setDateFormatString("yyyy-MM-dd");
        jDateChooserBitir.setDate(date);
        
        //kar-zarar
        m.karZarar(lblKarZarar);

    }
    //------------------------------------------------------------------------

    public void setEnabled(boolean enabled, Component[] comps) {
        for (Component comp : comps) {
            comp.setEnabled(enabled);
        }
    }

    //------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMusteri = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        btnMusListeDuzenle = new javax.swing.JButton();
        btnMusSil = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnMusKaydet = new javax.swing.JButton();
        txtMusAdi = new javax.swing.JTextField();
        txtMusSoyadi = new javax.swing.JTextField();
        txtMusTel = new javax.swing.JTextField();
        txtMusAdres = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtMusDuzenleAdi = new javax.swing.JTextField();
        txtMusDuzenleSoyadi = new javax.swing.JTextField();
        txtMusDuzenleTel = new javax.swing.JTextField();
        txtMusDuzenleAdres = new javax.swing.JTextField();
        btnMusDuzenle = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jRadioButtonMusteri = new javax.swing.JRadioButton();
        jRadioButtonUrun = new javax.swing.JRadioButton();
        jRadioButtonKategori = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtArama = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jDateChooserBasla = new com.toedter.calendar.JDateChooser();
        jPanel25 = new javax.swing.JPanel();
        jDateChooserBitir = new com.toedter.calendar.JDateChooser();
        lblDateUyari = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableRapor = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        lblKarZarar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        comboListeleme = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        bntListeleme = new javax.swing.JButton();
        panelSatis = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtSecilenUrun = new javax.swing.JLabel();
        txtUrunAdet = new javax.swing.JTextField();
        btnSatis = new javax.swing.JButton();
        comboMusteriSec = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabloKategoriUrunler = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableUrun = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        btnUrnListeDuzenle = new javax.swing.JButton();
        btnUrnSil = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnUrnKaydet = new javax.swing.JButton();
        txtUrnAdi = new javax.swing.JTextField();
        txtUrnAlisFiyat = new javax.swing.JTextField();
        txtUrnSatisFiyat = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtUrnStok = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtUrnAciklama = new javax.swing.JTextField();
        comboUrnKategori = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnUrnDuzenle = new javax.swing.JButton();
        txtUrnDuzenleAdi = new javax.swing.JTextField();
        txtUrnDuzenleAlisFiyat = new javax.swing.JTextField();
        txtUrnDuzenleSatisFiyat = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtUrnDuzenleStok = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtUrnDuzenleAciklama = new javax.swing.JTextField();
        comboUrnDuzenleKategori = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEski = new javax.swing.JPasswordField();
        txtYeniTekrar = new javax.swing.JPasswordField();
        txtYeni = new javax.swing.JPasswordField();
        btnDegistir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKategori = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        btnKatListeDuzenle = new javax.swing.JButton();
        btnKatSil = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKatAdi = new javax.swing.JTextField();
        btnKatKaydet = new javax.swing.JButton();
        txtKatAciklama = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKatDuzenleAdi = new javax.swing.JTextField();
        btnKatDuzenle = new javax.swing.JButton();
        txtKatDuzenleAciklama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cari Hesap Takip");

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Listesi"));

        tableMusteri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMusteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMusteriMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableMusteri);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        btnMusListeDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/update.png"))); // NOI18N
        btnMusListeDuzenle.setText("Düzenle");
        btnMusListeDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusListeDuzenleActionPerformed(evt);
            }
        });

        btnMusSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/delete.png"))); // NOI18N
        btnMusSil.setText("Sil");
        btnMusSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMusListeDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btnMusSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnMusListeDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnMusSil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Kaydet"));

        jLabel8.setText("Adı:");

        jLabel9.setText("Soyadı:");

        jLabel10.setText("Telefon:");

        jLabel11.setText("Adres:");

        btnMusKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/new.png"))); // NOI18N
        btnMusKaydet.setText("Kaydet");
        btnMusKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusKaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMusAdi)
                            .addComponent(txtMusSoyadi)
                            .addComponent(txtMusTel)
                            .addComponent(txtMusAdres)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 337, Short.MAX_VALUE)
                        .addComponent(btnMusKaydet)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMusAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMusSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMusTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtMusAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(btnMusKaydet)
                .addContainerGap())
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Müşteri Düzenle"));

        jLabel12.setText("Adı:");

        jLabel13.setText("Soyadı:");

        jLabel14.setText("Telefon:");

        jLabel15.setText("Adres:");

        btnMusDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/update.png"))); // NOI18N
        btnMusDuzenle.setText("Düzenle");
        btnMusDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMusDuzenleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMusDuzenleAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(txtMusDuzenleSoyadi)
                            .addComponent(txtMusDuzenleTel)
                            .addComponent(txtMusDuzenleAdres)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnMusDuzenle)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(txtMusDuzenleAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMusDuzenleSoyadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMusDuzenleTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMusDuzenleAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMusDuzenle)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Müşteriler", jPanel12);

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtre"));

        jLabel32.setText("Kriter: ");

        buttonGroup1.add(jRadioButtonMusteri);
        jRadioButtonMusteri.setText("Müşteri");

        buttonGroup1.add(jRadioButtonUrun);
        jRadioButtonUrun.setText("Ürün Adı");

        buttonGroup1.add(jRadioButtonKategori);
        jRadioButtonKategori.setText("Kategori");

        jLabel33.setText("Arama: ");

        jLabel34.setText("Tarih Aralığı:");

        txtArama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAramaKeyReleased(evt);
            }
        });

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Başlangıç Tarihi"));

        jDateChooserBasla.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserBaslaPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooserBasla, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooserBasla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Bitiş Tarihi"));

        jDateChooserBitir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserBitirPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooserBitir, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDateChooserBitir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        lblDateUyari.setForeground(new java.awt.Color(255, 51, 51));
        lblDateUyari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jRadioButtonMusteri)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonUrun)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonKategori))
                    .addComponent(txtArama)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDateUyari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jRadioButtonMusteri)
                    .addComponent(jRadioButtonUrun)
                    .addComponent(jRadioButtonKategori))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtArama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel34))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(lblDateUyari, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Sonuç"));

        tableRapor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Müşteri Adı", "Ürün Kategori", "Ürün Adı", "Adet", "Fiyat", "Ekleme Tarihi"
            }
        ));
        jScrollPane6.setViewportView(tableRapor);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Genel Kar-Zarar Durumu"));

        jLabel35.setText("KAR-ZARAR: ");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addGap(18, 18, 18)
                .addComponent(lblKarZarar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(lblKarZarar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Raporlar", jPanel2);

        comboListeleme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel28.setText("Lütfen listeleme için bir kategori seçiniz:");

        bntListeleme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/list.png"))); // NOI18N
        bntListeleme.setText("Listele");
        bntListeleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntListelemeActionPerformed(evt);
            }
        });

        panelSatis.setBorder(javax.swing.BorderFactory.createTitledBorder("Satış"));

        jLabel29.setText("Seçilen Ürün: ");

        jLabel30.setText("Adet:");

        jLabel31.setText("Müşteri:");

        btnSatis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/teslim.png"))); // NOI18N
        btnSatis.setText("Satış");
        btnSatis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatisActionPerformed(evt);
            }
        });

        comboMusteriSec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panelSatisLayout = new javax.swing.GroupLayout(panelSatis);
        panelSatis.setLayout(panelSatisLayout);
        panelSatisLayout.setHorizontalGroup(
            panelSatisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSatisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSatisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSatisLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSatisLayout.createSequentialGroup()
                        .addGroup(panelSatisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSatisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUrunAdet)
                            .addComponent(comboMusteriSec, 0, 196, Short.MAX_VALUE)
                            .addComponent(txtSecilenUrun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelSatisLayout.setVerticalGroup(
            panelSatisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSatisLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelSatisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(txtSecilenUrun, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelSatisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtUrunAdet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(panelSatisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(comboMusteriSec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btnSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabloKategoriUrunler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabloKategoriUrunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabloKategoriUrunlerMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tabloKategoriUrunler);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comboListeleme, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(bntListeleme, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSatis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboListeleme, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntListeleme, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelSatis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Satış Yönetimi", jPanel3);

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Listesi"));

        tableUrun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableUrun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUrunMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableUrun);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        btnUrnListeDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/update.png"))); // NOI18N
        btnUrnListeDuzenle.setText("Düzenle");
        btnUrnListeDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrnListeDuzenleActionPerformed(evt);
            }
        });

        btnUrnSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/delete.png"))); // NOI18N
        btnUrnSil.setText("Sil");
        btnUrnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrnSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUrnListeDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(btnUrnSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnUrnListeDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnUrnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Kaydet"));

        jLabel16.setText("Ürün adı: ");

        jLabel17.setText("Kategori:");

        jLabel18.setText("Alış fiyatı:");

        jLabel19.setText("Satış fiyatı:");

        btnUrnKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/new.png"))); // NOI18N
        btnUrnKaydet.setText("Kaydet");
        btnUrnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrnKaydetActionPerformed(evt);
            }
        });

        jLabel20.setText("Stok:");

        jLabel21.setText("Açıklama:");

        comboUrnKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUrnKaydet))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUrnAlisFiyat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboUrnKategori, javax.swing.GroupLayout.Alignment.TRAILING, 0, 301, Short.MAX_VALUE)
                            .addComponent(txtUrnAdi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUrnSatisFiyat)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUrnStok)
                            .addComponent(txtUrnAciklama))))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtUrnAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(comboUrnKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtUrnAlisFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtUrnSatisFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtUrnStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtUrnAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUrnKaydet)
                .addContainerGap())
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Düzenle"));

        jLabel22.setText("Ürün adı: ");

        jLabel23.setText("Kategori:");

        jLabel24.setText("Alış fiyatı:");

        jLabel25.setText("Satış fiyatı:");

        btnUrnDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/update.png"))); // NOI18N
        btnUrnDuzenle.setText("Düzenle");
        btnUrnDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrnDuzenleActionPerformed(evt);
            }
        });

        jLabel26.setText("Stok:");

        jLabel27.setText("Açıklama:");

        comboUrnDuzenleKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUrnDuzenle))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUrnDuzenleAdi)
                            .addComponent(txtUrnDuzenleAlisFiyat)
                            .addComponent(txtUrnDuzenleSatisFiyat)
                            .addComponent(comboUrnDuzenleKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUrnDuzenleStok)
                            .addComponent(txtUrnDuzenleAciklama))))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtUrnDuzenleAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(comboUrnDuzenleKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtUrnDuzenleAlisFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtUrnDuzenleSatisFiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtUrnDuzenleStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtUrnDuzenleAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnUrnDuzenle)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Ürün Yönetimi", jPanel4);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Parola Değiştir"));

        jLabel1.setText("Eski Parola: ");

        jLabel2.setText("Yeni Parola:");

        jLabel3.setText("Yeni Parola Tekrar: ");

        btnDegistir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/Refresh.png"))); // NOI18N
        btnDegistir.setText("Değiştir");
        btnDegistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDegistirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnDegistir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtYeniTekrar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEski)
                            .addComponent(txtYeni))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEski, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtYeni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtYeniTekrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnDegistir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(673, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kullanıcı Ayarları", jPanel5);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Liste"));

        tableKategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableKategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKategori);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Satır İşlemleri"));

        btnKatListeDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/update.png"))); // NOI18N
        btnKatListeDuzenle.setText("Düzenle");
        btnKatListeDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKatListeDuzenleActionPerformed(evt);
            }
        });

        btnKatSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/delete.png"))); // NOI18N
        btnKatSil.setText("Sil");
        btnKatSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKatSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKatListeDuzenle, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnKatSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(btnKatListeDuzenle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnKatSil, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Yeni Kategori Ekle"));

        jLabel4.setText("Kategori Adı: ");

        jLabel5.setText("Açıklama:");

        btnKatKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/new.png"))); // NOI18N
        btnKatKaydet.setText("Kaydet");
        btnKatKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKatKaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKatKaydet)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKatAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(txtKatAciklama))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKatAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKatAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKatKaydet)
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Düzenle"));

        jLabel6.setText("Kategori Adı: ");

        jLabel7.setText("Açıklama:");

        btnKatDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/update.png"))); // NOI18N
        btnKatDuzenle.setText("Düzenle");
        btnKatDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKatDuzenleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtKatDuzenleAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtKatDuzenleAciklama)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKatDuzenle)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKatDuzenleAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtKatDuzenleAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btnKatDuzenle)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Kategori Yönetimi", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDegistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDegistirActionPerformed
        if (txtYeni.getText().trim().equals("") || txtYeniTekrar.getText().trim().equals("") || txtEski.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else if (txtYeni.getText().trim().equals(txtYeniTekrar.getText().trim())) {
            Methods m = new Methods();
            m.sifreDegis(this, txtEski.getText().trim(), txtYeni.getText().trim());
        } else {
            JOptionPane.showMessageDialog(this, "Yeni parolalar uyuşmuyor. Lütfen tekrar giriniz.");
        }
    }//GEN-LAST:event_btnDegistirActionPerformed

    private void btnKatKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKatKaydetActionPerformed

        Methods m = new Methods();
        m.kategoriEkle(this, txtKatAdi.getText().trim(), txtKatAciklama.getText().trim());
        tableKategori.setModel(m.kategoriTablo());
        katls = m.kategoriDoldur();
        m.kategoriComboDoldur(comboUrnKategori);
        m.kategoriComboDoldur(comboUrnDuzenleKategori);
        m.kategoriComboDoldur(comboListeleme);
        katIdLs = m.kategoriComboDoldur(comboUrnKategori);


    }//GEN-LAST:event_btnKatKaydetActionPerformed

    String katId = "";
    private void tableKategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKategoriMouseClicked

        katId = katls.get(tableKategori.getSelectedRow()).getKatId();
        setEnabled(true, jPanel9.getComponents());

    }//GEN-LAST:event_tableKategoriMouseClicked

    private void btnKatSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKatSilActionPerformed
        Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            method.kategoriSil(this, katId);
            setEnabled(false, jPanel9.getComponents());
            tableKategori.setModel(method.kategoriTablo());
            katId = "";
            katls = m.kategoriDoldur();
            m.kategoriComboDoldur(comboUrnKategori);
            m.kategoriComboDoldur(comboUrnDuzenleKategori);
            m.kategoriComboDoldur(comboListeleme);
            katIdLs = m.kategoriComboDoldur(comboUrnKategori);

        }
    }//GEN-LAST:event_btnKatSilActionPerformed

    String duzenleKatId = "";
    private void btnKatListeDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKatListeDuzenleActionPerformed

        duzenleKatId = katId;
        DB db = new DB();
        try {
            String query = "CALL prcKategoriGetir(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, duzenleKatId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                txtKatDuzenleAdi.setText(rs.getString("katAdi"));
                txtKatDuzenleAciklama.setText(rs.getString("katAciklama"));
            }
        } catch (SQLException e) {
            System.err.println("KatListeDuzenle:" + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, jPanel11.getComponents());
        setEnabled(false, jPanel9.getComponents());
    }//GEN-LAST:event_btnKatListeDuzenleActionPerformed

    private void btnKatDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKatDuzenleActionPerformed

        Methods m = new Methods();
        String adi = txtKatDuzenleAdi.getText().trim();
        String aciklama = txtKatDuzenleAciklama.getText().trim();
        if (adi.equals("")) {
            JOptionPane.showMessageDialog(this, "Kategori Adı boş bırakılamaz.");
        } else {
            m.kategoruDuzenle(this, duzenleKatId, adi, aciklama);
            duzenleKatId = "";
            katId = "";
            tableKategori.setModel(m.kategoriTablo());
            txtKatDuzenleAdi.setText("");
            txtKatDuzenleAciklama.setText("");
            setEnabled(false, jPanel11.getComponents());
            m.kategoriComboDoldur(comboUrnKategori);
            m.kategoriComboDoldur(comboUrnDuzenleKategori);
            m.kategoriComboDoldur(comboListeleme);
            katIdLs = m.kategoriComboDoldur(comboUrnKategori);
        }


    }//GEN-LAST:event_btnKatDuzenleActionPerformed

    String musId = "";
    private void tableMusteriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMusteriMouseClicked
        musId = musls.get(tableMusteri.getSelectedRow()).getMusId();
        System.out.println(musId);
        setEnabled(true, jPanel14.getComponents());
    }//GEN-LAST:event_tableMusteriMouseClicked

    private void btnMusKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusKaydetActionPerformed
        Methods m = new Methods();
        if (!new Validation().harfMi(txtMusAdi.getText())) {
            JOptionPane.showMessageDialog(this, "Ad formata uygun değil. Sadece harf giriniz.");
        } else if (!new Validation().harfMi(txtMusSoyadi.getText())) {
            JOptionPane.showMessageDialog(this, "Soyad formata uygun değil. Sadece harf giriniz.");
        } else {
            m.musteriEkle(this, txtMusAdi.getText().trim(), txtMusSoyadi.getText().trim(), txtMusTel.getText().trim(), txtMusAdres.getText().trim());
            tableMusteri.setModel(m.musteriTablo());

            musls = m.musteriDoldur();
            musteriIds = m.comboMusterilerDoldur(comboMusteriSec);
        }
    }//GEN-LAST:event_btnMusKaydetActionPerformed


    private void btnMusSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusSilActionPerformed

        Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            method.musteriSil(this, musId);
            setEnabled(false, jPanel14.getComponents());
            tableMusteri.setModel(method.musteriTablo());
            musId = "";
            musls = m.musteriDoldur();
            musteriIds = m.comboMusterilerDoldur(comboMusteriSec);

        }

    }//GEN-LAST:event_btnMusSilActionPerformed

    String duzenleMusId = "";
    private void btnMusListeDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusListeDuzenleActionPerformed

        duzenleMusId = musId;
        DB db = new DB();
        try {
            String query = "CALL prcMusteriGetir(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, duzenleMusId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                txtMusDuzenleAdi.setText(rs.getString("musAdi"));
                txtMusDuzenleSoyadi.setText(rs.getString("musSoyadi"));
                txtMusDuzenleTel.setText(rs.getString("musTelefon"));
                txtMusDuzenleAdres.setText(rs.getString("musAdres"));

            }
        } catch (SQLException e) {
            System.err.println("MusListeDuzenle:" + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, jPanel15.getComponents());
        setEnabled(false, jPanel14.getComponents());
    }//GEN-LAST:event_btnMusListeDuzenleActionPerformed

    private void btnMusDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMusDuzenleActionPerformed

        Methods m = new Methods();
        String adi = txtMusDuzenleAdi.getText().trim();
        String soyadi = txtMusDuzenleSoyadi.getText().trim();
        String tel = txtMusDuzenleTel.getText().trim();
        String adres = txtMusDuzenleAdres.getText().trim();

        if (adi.equals("") || soyadi.equals("") || tel.equals("") || adres.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else if (!new Validation().harfMi(txtMusDuzenleAdi.getText())) {
            JOptionPane.showMessageDialog(this, "Ad formata uygun değil. Sadece harf giriniz.");
        } else if (!new Validation().harfMi(txtMusDuzenleSoyadi.getText())) {
            JOptionPane.showMessageDialog(this, "Soyad formata uygun değil. Sadece harf giriniz.");
        } else if (!new Validation().telefonMu(tel)) {
            JOptionPane.showMessageDialog(this, "Telefon formata uygun değil.");
        } else {
            m.musteriDuzenle(this, duzenleMusId, adi, soyadi, tel, adres);
            duzenleMusId = "";
            musId = "";
            tableMusteri.setModel(m.musteriTablo());
            txtMusDuzenleAdi.setText("");
            txtMusDuzenleSoyadi.setText("");
            txtMusDuzenleTel.setText("");
            txtMusDuzenleAdres.setText("");
            setEnabled(false, jPanel15.getComponents());
            musteriIds = m.comboMusterilerDoldur(comboMusteriSec);
        }


    }//GEN-LAST:event_btnMusDuzenleActionPerformed

    String urnId = "";
    private void tableUrunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUrunMouseClicked

        urnId = urls.get(tableUrun.getSelectedRow()).getUrId();
        System.out.println(urnId);
        setEnabled(true, jPanel17.getComponents());
    }//GEN-LAST:event_tableUrunMouseClicked

    private void btnUrnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrnKaydetActionPerformed

        if (!new Validation().sayiMi(txtUrnStok.getText())) {
            JOptionPane.showMessageDialog(this, "Stok sayısal değer olmalı.");
        } else if (!new Validation().sayiMi(txtUrnAlisFiyat.getText())) {
            JOptionPane.showMessageDialog(this, "Alış fiyatı sayısal değer olmalı.");
        } else if (!new Validation().sayiMi(txtUrnSatisFiyat.getText())) {
            JOptionPane.showMessageDialog(this, "Satış fiyatı sayısal değer olmalı.");
        } else {

            if (Integer.valueOf(txtUrnAlisFiyat.getText()) > Integer.valueOf(txtUrnSatisFiyat.getText())) {
                int confirmed = JOptionPane.showConfirmDialog(this,
                        "Alış fiyatı satış fiyatından yüksek. Emin misiniz?", "Satış",
                        JOptionPane.YES_NO_OPTION);

                if (confirmed == JOptionPane.YES_OPTION) {
                    Methods m = new Methods();
                    m.urunEkle(this, txtUrnAdi.getText().trim(), katIdLs.get(comboUrnKategori.getSelectedIndex()), txtUrnAlisFiyat.getText().trim(), txtUrnSatisFiyat.getText().trim(), txtUrnStok.getText().trim(), txtUrnAciklama.getText().trim());
                    tableUrun.setModel(m.urunTablo());

                    urls = m.urunDoldur();
                }
            }else{
                Methods m = new Methods();
            m.urunEkle(this, txtUrnAdi.getText().trim(), katIdLs.get(comboUrnKategori.getSelectedIndex()), txtUrnAlisFiyat.getText().trim(), txtUrnSatisFiyat.getText().trim(), txtUrnStok.getText().trim(), txtUrnAciklama.getText().trim());
            tableUrun.setModel(m.urunTablo());

            urls = m.urunDoldur();
            }

        }

    }//GEN-LAST:event_btnUrnKaydetActionPerformed

    private void btnUrnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrnSilActionPerformed
        Methods m = new Methods();
        int confirmed = JOptionPane.showConfirmDialog(this,
                "Silmek istediğinizden emin misiniz?", "Silme İşlemi",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {

            m.urunSil(this, urnId);
            setEnabled(false, jPanel17.getComponents());
            tableUrun.setModel(m.urunTablo());
            urnId = "";
            urls = m.urunDoldur();
        }
    }//GEN-LAST:event_btnUrnSilActionPerformed

    String duzenleUrnId = "";
    private void btnUrnListeDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrnListeDuzenleActionPerformed

        duzenleUrnId = urnId;

        DB db = new DB();
        try {
            String query = "CALL prcUrunGetir(?)";
            PreparedStatement ps = db.preBaglan(query);
            ps.setString(1, duzenleUrnId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                txtUrnDuzenleAdi.setText(rs.getString("urAdi"));
                comboUrnDuzenleKategori.setSelectedItem(rs.getString("katAdi"));
                txtUrnDuzenleAlisFiyat.setText(rs.getString("urAlis"));
                txtUrnDuzenleSatisFiyat.setText(rs.getString("urSatis"));
                txtUrnDuzenleStok.setText(rs.getString("urStok"));
                txtUrnDuzenleAciklama.setText(rs.getString("urAciklama"));
            }
        } catch (SQLException e) {
            System.err.println("UrnListeDuzenle:" + e);
        } finally {
            db.kapat();
        }
        setEnabled(true, jPanel19.getComponents());
        setEnabled(false, jPanel17.getComponents());
    }//GEN-LAST:event_btnUrnListeDuzenleActionPerformed

    private void btnUrnDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrnDuzenleActionPerformed

        Methods m = new Methods();
        String adi = txtUrnDuzenleAdi.getText().trim();
        String kategori = katIdLs.get(comboUrnDuzenleKategori.getSelectedIndex());
        String alis = txtUrnDuzenleAlisFiyat.getText().trim();
        String satis = txtUrnDuzenleSatisFiyat.getText().trim();
        String stok = txtUrnDuzenleStok.getText().trim();
        String aciklama = txtUrnDuzenleAciklama.getText().trim();

        if (adi.equals("") || alis.equals("") || satis.equals("") || stok.equals("") || aciklama.equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen boş alan bırakmayınız.");
        } else if (!new Validation().sayiMi(txtUrnDuzenleStok.getText())) {
            JOptionPane.showMessageDialog(this, "Stok sayısal değer olmalı.");
        } else if (!new Validation().sayiMi(txtUrnDuzenleAlisFiyat.getText())) {
            JOptionPane.showMessageDialog(this, "Alış fiyatı sayısal değer olmalı.");
        } else if (!new Validation().sayiMi(txtUrnDuzenleSatisFiyat.getText())) {
            JOptionPane.showMessageDialog(this, "Satış fiyatı sayısal değer olmalı.");
        } else {
            
            if (Integer.valueOf(txtUrnDuzenleAlisFiyat.getText())>Integer.valueOf(txtUrnDuzenleSatisFiyat.getText())) {
                int confirmed = JOptionPane.showConfirmDialog(this,
                        "Alış fiyatı satış fiyatından yüksek. Emin misiniz?", "Satış",
                        JOptionPane.YES_NO_OPTION);
            if (confirmed == JOptionPane.YES_OPTION) {
                m.urunDuzenle(this, duzenleUrnId, adi, kategori, alis, satis, stok, aciklama);
            duzenleUrnId = "";
            urnId = "";
            tableUrun.setModel(m.urunTablo());
            txtUrnDuzenleAdi.setText("");
            comboUrnDuzenleKategori.setSelectedIndex(0);
            txtUrnDuzenleAlisFiyat.setText("");
            txtUrnDuzenleSatisFiyat.setText("");
            txtUrnDuzenleStok.setText("");
            txtUrnDuzenleAciklama.setText("");

            setEnabled(false, jPanel19.getComponents());
            }
            }else{
           
                m.urunDuzenle(this, duzenleUrnId, adi, kategori, alis, satis, stok, aciklama);
            duzenleUrnId = "";
            urnId = "";
            tableUrun.setModel(m.urunTablo());
            txtUrnDuzenleAdi.setText("");
            comboUrnDuzenleKategori.setSelectedIndex(0);
            txtUrnDuzenleAlisFiyat.setText("");
            txtUrnDuzenleSatisFiyat.setText("");
            txtUrnDuzenleStok.setText("");
            txtUrnDuzenleAciklama.setText("");

            setEnabled(false, jPanel19.getComponents());
            
            }
            
        }


    }//GEN-LAST:event_btnUrnDuzenleActionPerformed

    ArrayList<String> urunIds = new ArrayList<>();

    private void bntListelemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntListelemeActionPerformed

        String idList = katIdLs.get(comboListeleme.getSelectedIndex());

        jPanel20.setVisible(true);

        Methods m = new Methods();
        urunIds = m.kategoriUrunListele(idList, tabloKategoriUrunler);


    }//GEN-LAST:event_bntListelemeActionPerformed

    String kategoridekiUrunId = "";
    ArrayList<String> musteriIds = new ArrayList<>();
    private void tabloKategoriUrunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloKategoriUrunlerMouseClicked
        Methods m = new Methods();
        kategoridekiUrunId = urunIds.get(tabloKategoriUrunler.getSelectedRow());
        DB db = new DB();
        if (evt.getClickCount() == 2) {
            panelSatis.setVisible(true);
            try {
                String query = "CALL prcUrunGetir(?)";
                PreparedStatement ps = db.preBaglan(query);
                ps.setString(1, kategoridekiUrunId);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    txtSecilenUrun.setText(rs.getString("urAdi"));
                }

            } catch (SQLException e) {
                System.err.println("tabloKategoriUrunlerMouseClicked: " + e);
            } finally {
                db.kapat();
            }
            musteriIds = m.comboMusterilerDoldur(comboMusteriSec);

        }
    }//GEN-LAST:event_tabloKategoriUrunlerMouseClicked

    String combodakiMusteriId = "";
    private void btnSatisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatisActionPerformed
        combodakiMusteriId = musteriIds.get(comboMusteriSec.getSelectedIndex());
        Methods m = new Methods();
        Validation v = new Validation();
        if (txtUrunAdet.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Lütfen adet giriniz.");
        } else if (!v.sayiMi(txtUrunAdet.getText().trim())) {
            JOptionPane.showMessageDialog(this, "Sayısal değer giriniz.");
        } else if (Integer.valueOf(txtUrunAdet.getText().trim()) <= 0) {
            JOptionPane.showMessageDialog(this, "Adet 0`dan büyük olmalı");
        } else {
            m.satisYap(this, combodakiMusteriId, kategoridekiUrunId, txtUrunAdet.getText().trim());
            m.karZarar(lblKarZarar);
        }

    }//GEN-LAST:event_btnSatisActionPerformed

    private void jDateChooserBaslaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserBaslaPropertyChange
        //SELECT *  FROM satis as s INNER JOIN  musteri as m  ON s.satMusId=m.musId and date(satTarih) between '2017-11-04 21:51:47' and  '2017-12-06 21:51:47' INNER JOIN urun as u on s.satUrunId= u.urIdINNER JOIN kategori as k ON u.urKatId = k.katId and m.musAdi like '%o%' and m.musSoyadi like '%ilme%'
        String basla = ((JTextField) jDateChooserBasla.getDateEditor().getUiComponent()).getText();
        String bitir = ((JTextField) jDateChooserBitir.getDateEditor().getUiComponent()).getText();

        String ara = txtArama.getText();

        if (jRadioButtonMusteri.isSelected()) {
            Date date1 = jDateChooserBasla.getDate();
            Date date2 = jDateChooserBitir.getDate();

            if (date1.compareTo(date2) > 0) {
                lblDateUyari.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.musteriArama(basla, bitir, ara, tableRapor);
                lblDateUyari.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (jRadioButtonUrun.isSelected()) {
            Date date1 = jDateChooserBasla.getDate();
            Date date2 = jDateChooserBitir.getDate();

            if (date1.compareTo(date2) > 0) {
                lblDateUyari.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.urunArama(basla, bitir, ara, tableRapor);
                lblDateUyari.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (jRadioButtonKategori.isSelected()) {
            Date date1 = jDateChooserBasla.getDate();
            Date date2 = jDateChooserBitir.getDate();

            if (date1.compareTo(date2) > 0) {
                lblDateUyari.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.kategoriArama(basla, bitir, ara, tableRapor);
                lblDateUyari.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else {
            lblDateUyari.setText("Lütfen kriter seçiniz.");
        }


    }//GEN-LAST:event_jDateChooserBaslaPropertyChange

    private void jDateChooserBitirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserBitirPropertyChange
        String basla = ((JTextField) jDateChooserBasla.getDateEditor().getUiComponent()).getText();
        String bitir = ((JTextField) jDateChooserBitir.getDateEditor().getUiComponent()).getText();

        String ara = txtArama.getText();

        if (jRadioButtonMusteri.isSelected()) {
            Date date1 = jDateChooserBasla.getDate();
            Date date2 = jDateChooserBitir.getDate();

            if (date1.compareTo(date2) > 0) {
                lblDateUyari.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.musteriArama(basla, bitir, ara, tableRapor);
                lblDateUyari.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (jRadioButtonUrun.isSelected()) {
            Date date1 = jDateChooserBasla.getDate();
            Date date2 = jDateChooserBitir.getDate();

            if (date1.compareTo(date2) > 0) {
                lblDateUyari.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.urunArama(basla, bitir, ara, tableRapor);
                lblDateUyari.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (jRadioButtonKategori.isSelected()) {
            Date date1 = jDateChooserBasla.getDate();
            Date date2 = jDateChooserBitir.getDate();

            if (date1.compareTo(date2) > 0) {
                lblDateUyari.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.kategoriArama(basla, bitir, ara, tableRapor);
                lblDateUyari.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else {
            lblDateUyari.setText("Lütfen kriter seçiniz.");
        }
    }//GEN-LAST:event_jDateChooserBitirPropertyChange

    private void txtAramaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAramaKeyReleased
        String basla = ((JTextField) jDateChooserBasla.getDateEditor().getUiComponent()).getText();
        String bitir = ((JTextField) jDateChooserBitir.getDateEditor().getUiComponent()).getText();

        String ara = txtArama.getText();

        if (jRadioButtonMusteri.isSelected()) {
            Date date1 = jDateChooserBasla.getDate();
            Date date2 = jDateChooserBitir.getDate();

            if (date1.compareTo(date2) > 0) {
                lblDateUyari.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.musteriArama(basla, bitir, ara, tableRapor);
                lblDateUyari.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (jRadioButtonUrun.isSelected()) {
            Date date1 = jDateChooserBasla.getDate();
            Date date2 = jDateChooserBitir.getDate();

            if (date1.compareTo(date2) > 0) {
                lblDateUyari.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.urunArama(basla, bitir, ara, tableRapor);
                lblDateUyari.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else if (jRadioButtonKategori.isSelected()) {
            Date date1 = jDateChooserBasla.getDate();
            Date date2 = jDateChooserBitir.getDate();

            if (date1.compareTo(date2) > 0) {
                lblDateUyari.setText("Başlangıç tarihi bitiş tarihinden sonra gelemez.");
            } else if (date1.compareTo(date2) <= 0) {

                Methods m = new Methods();
                m.kategoriArama(basla, bitir, ara, tableRapor);
                lblDateUyari.setText("");
            } else {
                System.out.println("How to get here?");
            }

        } else {
            lblDateUyari.setText("Lütfen kriter seçiniz.");
        }
    }//GEN-LAST:event_txtAramaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntListeleme;
    private javax.swing.JButton btnDegistir;
    private javax.swing.JButton btnKatDuzenle;
    private javax.swing.JButton btnKatKaydet;
    private javax.swing.JButton btnKatListeDuzenle;
    private javax.swing.JButton btnKatSil;
    private javax.swing.JButton btnMusDuzenle;
    private javax.swing.JButton btnMusKaydet;
    private javax.swing.JButton btnMusListeDuzenle;
    private javax.swing.JButton btnMusSil;
    private javax.swing.JButton btnSatis;
    private javax.swing.JButton btnUrnDuzenle;
    private javax.swing.JButton btnUrnKaydet;
    private javax.swing.JButton btnUrnListeDuzenle;
    private javax.swing.JButton btnUrnSil;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboListeleme;
    private javax.swing.JComboBox<String> comboMusteriSec;
    private javax.swing.JComboBox<String> comboUrnDuzenleKategori;
    private javax.swing.JComboBox<String> comboUrnKategori;
    private com.toedter.calendar.JDateChooser jDateChooserBasla;
    private com.toedter.calendar.JDateChooser jDateChooserBitir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButtonKategori;
    private javax.swing.JRadioButton jRadioButtonMusteri;
    private javax.swing.JRadioButton jRadioButtonUrun;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblDateUyari;
    private javax.swing.JLabel lblKarZarar;
    private javax.swing.JPanel panelSatis;
    private javax.swing.JTable tableKategori;
    private javax.swing.JTable tableMusteri;
    private javax.swing.JTable tableRapor;
    private javax.swing.JTable tableUrun;
    private javax.swing.JTable tabloKategoriUrunler;
    private javax.swing.JTextField txtArama;
    private javax.swing.JPasswordField txtEski;
    private javax.swing.JTextField txtKatAciklama;
    private javax.swing.JTextField txtKatAdi;
    private javax.swing.JTextField txtKatDuzenleAciklama;
    private javax.swing.JTextField txtKatDuzenleAdi;
    private javax.swing.JTextField txtMusAdi;
    private javax.swing.JTextField txtMusAdres;
    private javax.swing.JTextField txtMusDuzenleAdi;
    private javax.swing.JTextField txtMusDuzenleAdres;
    private javax.swing.JTextField txtMusDuzenleSoyadi;
    private javax.swing.JTextField txtMusDuzenleTel;
    private javax.swing.JTextField txtMusSoyadi;
    private javax.swing.JTextField txtMusTel;
    private javax.swing.JLabel txtSecilenUrun;
    private javax.swing.JTextField txtUrnAciklama;
    private javax.swing.JTextField txtUrnAdi;
    private javax.swing.JTextField txtUrnAlisFiyat;
    private javax.swing.JTextField txtUrnDuzenleAciklama;
    private javax.swing.JTextField txtUrnDuzenleAdi;
    private javax.swing.JTextField txtUrnDuzenleAlisFiyat;
    private javax.swing.JTextField txtUrnDuzenleSatisFiyat;
    private javax.swing.JTextField txtUrnDuzenleStok;
    private javax.swing.JTextField txtUrnSatisFiyat;
    private javax.swing.JTextField txtUrnStok;
    private javax.swing.JTextField txtUrunAdet;
    private javax.swing.JPasswordField txtYeni;
    private javax.swing.JPasswordField txtYeniTekrar;
    // End of variables declaration//GEN-END:variables
}
