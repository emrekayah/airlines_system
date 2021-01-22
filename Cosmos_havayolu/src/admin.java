
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class admin extends javax.swing.JFrame {
    
    public String[] sutunlar; 
    public String s_musteri_id="",s_personel_id="",s_liman_id="";
    public String y_u_id1,y_u_id2;
    
    public database db;
    
    
    public admin() throws SQLException {
        this.db = new database();
        initComponents();
        String[] sutunlar = {"Uçuş No","Uçak No","Kalkis liman No","İniş liman No","Uçuş süresi","Tarih - Saat","Ucret Katsayısı"}; 
        tablodoldur("SELECT * FROM havayolu.ucus;",1,sutunlar);
        String[] sutunlar1 = {"Müşteri No","Ad","Soyad","TC/Pasaport No","Şifre","Cinsiyet"};
        tablodoldur("SELECT * FROM havayolu.musteri;",4,sutunlar1);
        String[] sutunlar2 = {"Personel No","Ad","Soyad","TC/Pasaport No","Mevki","Cinsiyet"};
        tablodoldur("SELECT * FROM havayolu.personel;",6,sutunlar2);
        String[] sutunlar3 = {"Liman No","Liman Adı","Şehir","İniş Kalkış Ücreti"};
        tablodoldur("SELECT * FROM havayolu.limanlar;",8,sutunlar3);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog2 = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        yeniUcus = new javax.swing.JDialog();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jTextField11 = new javax.swing.JTextField();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        personel_ekle = new javax.swing.JDialog();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        liman_ekle = new javax.swing.JDialog();
        jLabel40 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        jDialog2.setTitle("Lütfen Bekleyiniz...");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setText("Lütfen Bekleyiniz");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        yeniUcus.setTitle("YENİ UÇUŞ");

        jLabel28.setText("Kaptan Pilot:");

        jCalendar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCalendar1MouseClicked(evt);
            }
        });
        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });
        jCalendar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jCalendar1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCalendar1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );

        jCalendar1.getAccessibleContext().setAccessibleDescription("");

        jTextField11.setText("500");

        jLabel23.setText("İniş Liman");

        jLabel31.setText("Kabin Memuru(2):");

        jLabel32.setText("Kabin Memuru(3):");

        jLabel25.setText("Uçak Modeli");

        jLabel27.setText("Ücret Katsayısı:");

        jLabel29.setText("Yardımcı Pilot:");

        jLabel30.setText("Kabin Memuru(1):");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1İtemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Tarih:");

        jButton12.setText("Onay");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel33.setText("Saat:");

        jLabel22.setText("Kalkış Liman");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel44.setText(":");

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "15", "30", "45" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(jLabel25)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27)
                        .addComponent(jLabel28)
                        .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addComponent(jComboBox8, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addComponent(jLabel32)
                        .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        jScrollPane9.setViewportView(jPanel7);

        javax.swing.GroupLayout yeniUcusLayout = new javax.swing.GroupLayout(yeniUcus.getContentPane());
        yeniUcus.getContentPane().setLayout(yeniUcusLayout);
        yeniUcusLayout.setHorizontalGroup(
            yeniUcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );
        yeniUcusLayout.setVerticalGroup(
            yeniUcusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );

        personel_ekle.setTitle("PERSONEL EKLE");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel34.setText("Personel Ekle");

        jLabel35.setText("Ad:");

        jLabel36.setText("Soyad:");

        jLabel37.setText("TC/Pasaport No:");

        jLabel38.setText("Mevki:");

        jLabel39.setText("Cinsiyet:");

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kaptan Pilot", "Yardımcı Pilot", "Kabin Memuru" }));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın", "Diğer" }));

        jButton3.setText("Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personel_ekleLayout = new javax.swing.GroupLayout(personel_ekle.getContentPane());
        personel_ekle.getContentPane().setLayout(personel_ekleLayout);
        personel_ekleLayout.setHorizontalGroup(
            personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personel_ekleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35)
                    .addGroup(personel_ekleLayout.createSequentialGroup()
                        .addGroup(personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39))
                        .addGap(18, 18, 18)
                        .addGroup(personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField13)
                            .addComponent(jTextField14)
                            .addComponent(jTextField15)
                            .addComponent(jComboBox12, 0, 242, Short.MAX_VALUE)
                            .addComponent(jComboBox13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        personel_ekleLayout.setVerticalGroup(
            personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personel_ekleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addGap(25, 25, 25)
                .addGroup(personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personel_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        liman_ekle.setTitle("LİMAN EKLE");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel40.setText("Liman Ekle");

        jLabel41.setText("Liman Adı:");

        jLabel42.setText("Şehir:");

        jLabel43.setText("İnişl Kalkış Ücreti:");

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jButton9.setText("Ekle");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout liman_ekleLayout = new javax.swing.GroupLayout(liman_ekle.getContentPane());
        liman_ekle.getContentPane().setLayout(liman_ekleLayout);
        liman_ekleLayout.setHorizontalGroup(
            liman_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(liman_ekleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(liman_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addGroup(liman_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton9)
                        .addGroup(liman_ekleLayout.createSequentialGroup()
                            .addGroup(liman_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel43)
                                .addComponent(jLabel42))
                            .addGap(18, 18, 18)
                            .addGroup(liman_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                .addComponent(jTextField17)
                                .addComponent(jTextField16)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        liman_ekleLayout.setVerticalGroup(
            liman_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(liman_ekleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addGroup(liman_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(liman_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(liman_ekleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("[ADMIN] - COSMOS AIRLINES");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("Nereden:");

        jLabel3.setText("Nereye:");

        jLabel6.setText("Uçuştaki Personeller:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setText("Uçuştaki Müşteriler:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton10.setText("Yeni Uçuş");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(1, 1, 1))
        );

        jTabbedPane1.addTab("Uçuşlar", jPanel2);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jLabel1.setText("Müşterinin Biletleri:");

        jLabel8.setText("İsim:");

        jLabel9.setText("Soyisim:");

        jLabel10.setText("TC/Pasaport no:");

        jLabel11.setText("Şifre:");

        jLabel12.setText("Cinsiyet:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın", "Diğer" }));

        jButton1.setText("Güncelle");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sil");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(62, 62, 62)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 124, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)))
        );

        jTabbedPane1.addTab("Müşteriler", jPanel1);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTable7);

        jLabel13.setText("Personelin Uçuşları:");

        jLabel14.setText("İsim:");

        jLabel15.setText("Soyisim:");

        jLabel16.setText("TC/Pasaport no:");

        jLabel17.setText("Personel Mevkisi:");

        jLabel18.setText("Cinsiyet:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kadın", "Diğer" }));

        jButton4.setText("Güncelle");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Sil");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kabin memuru", "Yardımcı Pilot", "Kaptan pilot" }));

        jButton11.setText("Yeni Personel");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(0, 592, Short.MAX_VALUE))
                    .addComponent(jScrollPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField7)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField5)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13))
                        .addContainerGap())
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                    .addComponent(jScrollPane6)))
        );

        jTabbedPane1.addTab("Personeller", jPanel6);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable8);

        jLabel4.setText("Liman Adı:");

        jLabel5.setText("Şehir:");

        jButton6.setText("Sil");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Güncelle");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Yeni Liman");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel19.setText("i/k Ücreti:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField8)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addContainerGap(598, Short.MAX_VALUE))
                    .addComponent(jScrollPane8)))
        );

        jTabbedPane1.addTab("Limanlar", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //UPDATE `havayolu`.`musteri` SET `m_ad` = 'Buraka', `m_soyad` = 'Tanrıverdia', `ptcno` = '1840442180a', `m_sifre` = '123a', `cinsiyet` = 'a' WHERE (`idmusteri` = '1');
        String ad,soyad,tc,sifre,cinsiyet="";
        ad = jTextField2.getText();
        soyad = jTextField3.getText();
        tc = jTextField4.getText();
        sifre = jTextField12.getText();
        switch(jComboBox5.getSelectedIndex()){
            case 0 -> cinsiyet="e";
            case 1 -> cinsiyet="k";
            case 2 -> cinsiyet="d";
        }
        try {
            //database db = new database();
            db.updateQuery("UPDATE `havayolu`.`musteri` SET `m_ad` = '"+ad+"', `m_soyad` = '"+soyad+"', `ptcno` = '"+tc+"', `m_sifre` = '"+sifre+"', `cinsiyet` = '"+cinsiyet+"' WHERE (`idmusteri` = '"+s_musteri_id+"');");
            String[] sutunlar1 = {"Müşteri No","Ad","Soyad","TC/Pasaport No","Şifre","Cinsiyet"};
            tablodoldur("SELECT * FROM havayolu.musteri;",4,sutunlar1);
            JOptionPane.showMessageDialog(null, "Güncelleme işlemi tamamlandı","Başarılı", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            //database db = new database();
            db.updateQuery("DELETE FROM `havayolu`.`musteri` WHERE (`idmusteri` = '"+s_musteri_id+"');");
            String[] sutunlar1 = {"Müşteri No","Ad","Soyad","TC/Pasaport No","Şifre","Cinsiyet"};
            tablodoldur("SELECT * FROM havayolu.musteri;",4,sutunlar1);
            JOptionPane.showMessageDialog(null, "Silme işlemi tamamlandı","Başarılı", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String ad,soyad,tc,tur="",cinsiyet="";
        ad = jTextField5.getText();
        soyad = jTextField6.getText();
        tc = jTextField7.getText();
        switch(jComboBox6.getSelectedIndex()){
            case 0 -> cinsiyet="e";
            case 1 -> cinsiyet="k";
            case 2 -> cinsiyet="d";
        }
        switch(jComboBox7.getSelectedIndex()){
            case 0 -> tur="km";
            case 1 -> tur="pi_y";
            case 2 -> tur="pi_k";
        }
        try {
            //database db = new database();
            db.updateQuery("UPDATE `havayolu`.`personel` SET `p_ad` = '"+ad+"', `p_soyad` = '"+soyad+"', `ptc_no` = '"+tc+"', `p_tur` = '"+tur+"', `cinsiyet` = '"+cinsiyet+"' WHERE (`idpersonel` = '"+s_personel_id+"');");
            String[] sutunlar1 = {"Personel No","Ad","Soyad","TC/Pasaport No","Mevki","Cinsiyet"};
            tablodoldur("SELECT * FROM havayolu.personel;",6,sutunlar1);
            JOptionPane.showMessageDialog(null, "Güncelleme işlemi tamamlandı","Başarılı", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            //database db = new database();
            db.updateQuery("DELETE FROM `havayolu`.`personel` WHERE (`idpersonel` = '"+s_personel_id+"');");
            String[] sutunlar2 = {"Personel No","Ad","Soyad","TC/Pasaport No","Mevki","Cinsiyet"};
            tablodoldur("SELECT * FROM havayolu.personel;",6,sutunlar2);
            JOptionPane.showMessageDialog(null, "Silme işlemi tamamlandı","Başarılı", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            //database db = new database();
            db.updateQuery("DELETE FROM `havayolu`.`limanlar` WHERE (`liman_id` = '"+s_liman_id+"');");
            JOptionPane.showMessageDialog(null, "Liman silme işlemi tamamlandı","Başarılı", JOptionPane.INFORMATION_MESSAGE);
            String[] sutunlar3 = {"Liman No","Liman Adı","Şehir","İniş Kalkış Ücreti"};
            tablodoldur("SELECT * FROM havayolu.limanlar;",8,sutunlar3);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //Ucus Bİlgisi Diz
        jDialog2.setBounds(500, 500, 200, 50);
        jDialog2.setVisible(true);
        String[] sutunlar = {"Personel No","Personel Adı","Personel Soyadı","Tc / Pasaport No","Personel Mevki","Cinsiyet"}; 
        String id = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
        tablodoldur("SELECT p_no,p_ad,p_soyad,ptc_no,p_tur,cinsiyet FROM havayolu.ucus_personel INNER JOIN havayolu.personel ON ucus_personel.p_no = personel.idpersonel WHERE ucus_no="+id+";",2,sutunlar);
        String[] sutunlar2 = {"Müşteri No","Uçuş Sınıfı","Müşteri Adı","Müşteri Soyadı","Tc / Pasaport No","Cinsiyet"}; 
        tablodoldur("SELECT m_no,ucus_sinif,m_ad,m_soyad,ptcno,cinsiyet FROM havayolu.ucus_kisi INNER JOIN havayolu.musteri ON ucus_kisi.m_no = musteri.idmusteri WHERE ucus_no="+id+";",3,sutunlar2);
        String kLimanId = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2);
        String iLimanId = (String) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3);
        try {
            //database db = new database();
            String kLimanAdi = db.getSingleData(Integer.parseInt(kLimanId),"liman_id","liman_ad","limanlar");
            String iLimanAdi = db.getSingleData(Integer.parseInt(iLimanId),"liman_id","liman_ad","limanlar");
            jLabel20.setText(kLimanAdi);
            jLabel21.setText(iLimanAdi);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDialog2.setVisible(false);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        yeniUcus.setBounds(500, 150, 475, 630);
        yeniUcus.setVisible(true);
        ArrayList<String> veri = new ArrayList<String>();
        try {
            veri = db.getData("SELECT liman_id,liman_ad FROM havayolu.limanlar;");
            for (int i = 3; i < veri.size(); i++) {
                jComboBox1.addItem(veri.get(i)+" - "+veri.get(i+1));
                i++;
            }
            veri.clear();
            veri = db.getData("SELECT iducak,ucak_model FROM havayolu.ucaklar;");
            for (int i = 3; i < veri.size(); i++) {
                jComboBox3.addItem(veri.get(i)+" - "+veri.get(i+1));
                i++;
            }
            veri.clear();
            veri = db.getData("SELECT idpersonel,p_ad,p_soyad FROM havayolu.personel WHERE p_tur=\"pi_k\";");
            for (int i = 4; i < veri.size(); i++) {
                jComboBox4.addItem(veri.get(i)+" - "+veri.get(i+1)+" "+veri.get(i+2));
                i=i+2;
            }
            veri.clear();
            veri = db.getData("SELECT idpersonel,p_ad,p_soyad FROM havayolu.personel WHERE p_tur=\"pi_y\";");
            for (int i = 4; i < veri.size(); i++) {
                jComboBox8.addItem(veri.get(i)+" - "+veri.get(i+1)+" "+veri.get(i+2));
                i=i+2;
            }
            veri.clear();
            veri = db.getData("SELECT idpersonel,p_ad,p_soyad FROM havayolu.personel WHERE p_tur=\"km\";");
            for (int i = 4; i < veri.size(); i++) {
                jComboBox9.addItem(veri.get(i)+" - "+veri.get(i+1)+" "+veri.get(i+2));
                jComboBox10.addItem(veri.get(i)+" - "+veri.get(i+1)+" "+veri.get(i+2));
                jComboBox11.addItem(veri.get(i)+" - "+veri.get(i+1)+" "+veri.get(i+2));
                i=i+2;
            }
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        //[6, idmusteri, m_ad, m_soyad, ptcno, m_sifre, cinsiyet, 1, Burak, Tanrıverdi, 18404421802, 1234, e]
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        s_musteri_id = (String) jTable4.getModel().getValueAt(jTable4.getSelectedRow(), 0);
        
        ArrayList<String> veri = new ArrayList<String>();
        String sorgu = "SELECT * FROM havayolu.musteri WHERE idmusteri ='"+s_musteri_id+"';";
        try {
            //database db = new database();
            veri = db.getData(sorgu);
            jTextField2.setText(veri.get(8));
            jTextField3.setText(veri.get(9));
            jTextField4.setText(veri.get(10));
            jTextField12.setText(veri.get(11));
            switch(veri.get(12)){
                case "e" -> jComboBox5.setSelectedIndex(0);
                case "k" -> jComboBox5.setSelectedIndex(1);
                case "d" -> jComboBox5.setSelectedIndex(2);
            }
            bilettablodoldur("SELECT iducus_kisi,iducus,m_no,ucus_sinif,ucak_no,kalkis_liman,inis_liman,sure,tarih_saat,ucret FROM ucus_kisi INNER JOIN havayolu.ucus ON ucus_kisi.ucus_no=ucus.iducus WHERE m_no="+s_musteri_id+";",5);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        s_personel_id = (String) jTable6.getModel().getValueAt(jTable6.getSelectedRow(), 0);
        ArrayList<String> veri = new ArrayList<String>();
        String sorgu = "SELECT * FROM havayolu.personel WHERE idpersonel ='"+s_personel_id+"';";
        try {
            //database db = new database();
            veri = db.getData(sorgu);
            jTextField5.setText(veri.get(8));//1
            jTextField6.setText(veri.get(9));
            jTextField7.setText(veri.get(10));
            switch(veri.get(11)){
                case "pi_k" -> jComboBox7.setSelectedIndex(2);
                case "pi_y" -> jComboBox7.setSelectedIndex(1);
                case "km" -> jComboBox7.setSelectedIndex(0);
            }
            switch(veri.get(12)){
                case "e" -> jComboBox6.setSelectedIndex(0);
                case "k" -> jComboBox6.setSelectedIndex(1);
                case "d" -> jComboBox6.setSelectedIndex(2);
            }
            String[] sutunlar = {"Personelin Uçuş No","Uçuş No","Personel No"}; 
            tablodoldur("SELECT * FROM havayolu.ucus_personel where p_no="+s_personel_id+";",7,null);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jTable6MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String ad,soyad,tc,tur="",cinsiyet="";
        ad = jTextField13.getText();
        soyad = jTextField14.getText();
        tc = jTextField15.getText();
        switch(jComboBox13.getSelectedIndex()){
            case 0 -> cinsiyet="e";
            case 1 -> cinsiyet="k";
            case 2 -> cinsiyet="d";
        }
        switch(jComboBox12.getSelectedIndex()){
            case 0 -> tur="pi_k";
            case 1 -> tur="pi_y";
            case 2 -> tur="km";
        }
        try {
            //database db = new database();
            db.updateQuery("INSERT INTO `havayolu`.`personel` (`p_ad`, `p_soyad`, `ptc_no`, `p_tur`, `cinsiyet`) VALUES ('"+ad+"', '"+soyad+"', '"+tc+"', '"+tur+"', '"+cinsiyet+"');");
            String[] sutunlar1 = {"Personel No","Ad","Soyad","TC/Pasaport No","Mevki","Cinsiyet"};
            tablodoldur("SELECT * FROM havayolu.personel;",6,sutunlar1);
            JOptionPane.showMessageDialog(null, "Personel ekleme işlemi tamamlandı","Başarılı", JOptionPane.INFORMATION_MESSAGE);
            personel_ekle.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        personel_ekle.setBounds(500,500,400,400);
        personel_ekle.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        s_liman_id = (String) jTable8.getModel().getValueAt(jTable8.getSelectedRow(), 0);
        ArrayList<String> veri = new ArrayList<String>();
        String sorgu = "SELECT * FROM havayolu.limanlar WHERE liman_id ='"+s_liman_id+"';";
        try {
            //database db = new database();
            veri = db.getData(sorgu);
            jTextField1.setText(veri.get(6));//1
            jTextField8.setText(veri.get(7));
            jTextField9.setText(veri.get(8));
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_jTable8MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String l_ad,l_sehir,ik;
        l_ad=jTextField1.getText();
        l_sehir=jTextField8.getText();
        ik=jTextField9.getText();
        try {
            //database db = new database();
            db.updateQuery("UPDATE `havayolu`.`limanlar` SET `liman_ad` = '"+l_ad+"', `liman_sehir` = '"+l_sehir+"', `ik_ucreti` = '"+ik+"' WHERE (`liman_id` = '"+s_liman_id+"');");
            JOptionPane.showMessageDialog(null, "Liman güncelleme işlemi tamamlandı","Başarılı", JOptionPane.INFORMATION_MESSAGE);
            String[] sutunlar3 = {"Liman No","Liman Adı","Şehir","İniş Kalkış Ücreti"};
            tablodoldur("SELECT * FROM havayolu.limanlar;",8,sutunlar3);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        liman_ekle.setBounds(500,500,500,450);
        liman_ekle.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String l_ad,l_sehir,ik;
        l_ad=jTextField16.getText();
        l_sehir=jTextField17.getText();
        ik=jTextField18.getText();
        try {
            liman.setAd(l_ad);
            liman.setSehir(l_sehir);
            liman.setIk(ik);
            liman.ekle();
            JOptionPane.showMessageDialog(null, "Liman ekleme işlemi tamamlandı","Başarılı", JOptionPane.INFORMATION_MESSAGE);
            String[] sutunlar3 = {"Liman No","Liman Adı","Şehir","İniş Kalkış Ücreti"};
            tablodoldur("SELECT * FROM havayolu.limanlar;",8,sutunlar3);
            liman_ekle.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1İtemStateChanged
        //System.out.println(jComboBox1.getSelectedIndex()+" "+jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1İtemStateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //System.out.println(jComboBox1.getSelectedIndex()+" "+jComboBox1.getSelectedItem());
        String cb = jComboBox1.getSelectedItem().toString();
        String[] dizi;
        dizi = cb.split(" - ");
        y_u_id1 = dizi[0];
        ArrayList<String> veri = new ArrayList<String>();
        try {
            veri = db.getData("SELECT liman_id,liman_ad FROM havayolu.ucus_sure INNER JOIN limanlar ON ucus_sure.liman_2 = limanlar.liman_id WHERE liman_1="+y_u_id1+";");
            jComboBox2.removeAllItems();
            for (int i = 3; i < veri.size(); i++) {
                jComboBox2.addItem(veri.get(i)+" - "+veri.get(i+1));
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        cb = jComboBox2.getSelectedItem().toString();
        dizi = cb.split(" - ");
        y_u_id2 = dizi[0];
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jCalendar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCalendar1KeyTyped

    }//GEN-LAST:event_jCalendar1KeyTyped

    private void jCalendar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCalendar1MouseClicked
        
    }//GEN-LAST:event_jCalendar1MouseClicked

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        //java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Europe/Istanbul",offset=10800000,dstSavings=0,useDaylight=false,transitions=116,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=0,WEEK_OF_YEAR=3,WEEK_OF_MONTH=3,DAY_OF_MONTH=18,DAY_OF_YEAR=17,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=6,SECOND=21,MILLISECOND=323,ZONE_OFFSET=10800000,DST_OFFSET=0]
        Calendar cal = jCalendar1.getCalendar();
        int datevar = cal.get(Calendar.DATE);
        int monthvar = cal.get(Calendar.MONTH);
        int yearvar = cal.get(Calendar.YEAR);
        jLabel45.setText(yearvar+"-"+(monthvar+1)+"-"+datevar);
    }//GEN-LAST:event_jCalendar1PropertyChange

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //INSERT INTO `havayolu`.`ucus` (`ucak_no`, `kalkis_liman`, `inis_liman`, `sure`, `tarih_saat`, `ucret`) VALUES ('1', '2', '1', '3', '2021-01-30 10:45:00', '500');
        String ucakid,inisliman,sure="",tarih_saat,ucret,sorgu;
        String cb = jComboBox3.getSelectedItem().toString();
        String[] dizi;
        dizi = cb.split(" - ");
        ucakid = dizi[0];
        
        cb = jComboBox2.getSelectedItem().toString();
        dizi = cb.split(" - ");
        inisliman = dizi[0];
        ArrayList<String> veri = new ArrayList<String>();
        try {
            veri = db.getData("SELECT sure FROM havayolu.ucus_sure WHERE liman_1="+y_u_id1+" AND liman_2 = "+inisliman+";");
            sure = veri.get(2);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        tarih_saat = jLabel45.getText()+" "+jComboBox14.getSelectedItem().toString()+":"+jComboBox15.getSelectedItem().toString()+":00";
        ucret = jTextField11.getText();
        sorgu = "INSERT INTO `havayolu`.`ucus` (`ucak_no`, `kalkis_liman`, `inis_liman`, `sure`, `tarih_saat`, `ucret`) VALUES ('"+ucakid+"', '"+y_u_id1+"', '"+inisliman+"', '";
        sorgu = sorgu + sure + "', '"+tarih_saat+"', '"+ucret+"');";
        
        try {
            db.updateQuery(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String[] personeller = new String[5];
        cb = jComboBox4.getSelectedItem().toString();
        dizi = cb.split(" - ");
        personeller[0] = dizi[0];
        
        cb = jComboBox8.getSelectedItem().toString();
        dizi = cb.split(" - ");
        personeller[1] = dizi[0];
        
        cb = jComboBox9.getSelectedItem().toString();
        dizi = cb.split(" - ");
        personeller[2] = dizi[0];
        
        cb = jComboBox10.getSelectedItem().toString();
        dizi = cb.split(" - ");
        personeller[3] = dizi[0];
        
        cb = jComboBox11.getSelectedItem().toString();
        dizi = cb.split(" - ");
        personeller[4] = dizi[0];
        
        veri.clear();
        String sonucusid="";
        try {
            veri = db.getData("SELECT iducus FROM havayolu.ucus;");
            int size = veri.size();
            sonucusid = veri.get(size-1);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < 5; i++) {
            try {
                db.updateQuery("INSERT INTO `havayolu`.`ucus_personel` (`ucus_no`, `p_no`) VALUES ('"+sonucusid+"', '"+personeller[i]+"');");
            } catch (SQLException ex) {
                Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        yeniUcus.setVisible(false);
        String[] sutunlar = {"Uçuş No","Uçak No","Kalkis liman No","İniş liman No","Uçuş süresi","Tarih - Saat","Ucret Katsayısı"}; 
        tablodoldur("SELECT * FROM havayolu.ucus;",1,sutunlar);
    }//GEN-LAST:event_jButton12ActionPerformed
    private void bilettablodoldur(String sorgu,int tablo){
        ArrayList<String> veri = new ArrayList<String>();
        try {
            DefaultTableModel dtm = new DefaultTableModel();
            jTable5.setModel(dtm);
            dtm.setRowCount(0);
            //database db = new database();
            veri = db.getData(sorgu);
            veri.set(1,"Bilet Numarası");
            veri.set(2,"Uçuş Numarası");
            veri.set(3,"Müşteri Numarası");
            veri.set(4,"Uçuş Sınıfı");
            veri.set(5,"Uçak Modeli");
            veri.set(6,"Kalkış Liman");
            veri.set(7,"İniş Liman");
            veri.set(8,"Süre");
            veri.set(9,"Tarih Saat");
            veri.set(10,"Ücret");
        
            String[] satir = new String[Integer.parseInt(veri.get(0))];
            for (int i = 1; i < (satir.length+1); i++) {
                satir[i-1] = veri.get(i);
            }
            dtm.setColumnIdentifiers(satir);
            for (int i = 1; i < (veri.size()/satir.length); i++) {
                for (int j = 0; j < satir.length; j++) {
                    satir[j] = veri.get(i*satir.length+j+1);
                }
                satir[7] = (Integer.parseInt(satir[7])/60)+"sa "+(Integer.parseInt(satir[7])%60)+"dk";
                satir[5] = db.getSingleData(Integer.parseInt(satir[5]),"liman_id","liman_ad","limanlar");
                satir[6] = db.getSingleData(Integer.parseInt(satir[6]),"liman_id","liman_ad","limanlar");
                satir[4] = db.getSingleData(Integer.parseInt(satir[4]),"iducak","ucak_model","ucaklar");
                if("e".equals(satir[3]))
                    satir[3]="Ekonomi";
                else
                    satir[3]="Business";
                dtm.addRow(satir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tablodoldur(String sorgu,int tablo,String[] sutunlar){
        try {
            DefaultTableModel dtm = new DefaultTableModel();
            switch(tablo){
                case 1:
                    jTable1.setModel(dtm);
                    break;
                case 2:
                    jTable2.setModel(dtm);
                    break;
                case 3:
                    jTable3.setModel(dtm);
                    break;    
                case 4:
                    jTable4.setModel(dtm);
                    break;
                case 5:
                    jTable5.setModel(dtm);
                    break;
                case 6:
                    jTable6.setModel(dtm);
                    break;    
                case 7:
                    jTable7.setModel(dtm);
                    break;
                case 8:
                    jTable8.setModel(dtm);
                    break;    
            }
            
            ArrayList<String> veri = new ArrayList<String>();
            dtm.setRowCount(0);
            //database db = new database();
            veri = db.getData(sorgu);
            String[] satir = new String[Integer.parseInt(veri.get(0))];
            for (int i = 1; i < (satir.length+1); i++) {
                satir[i-1] = veri.get(i);
            }
            if(sutunlar!=null)
                dtm.setColumnIdentifiers(sutunlar);
            else
                dtm.setColumnIdentifiers(satir);
            
            for (int i = 1; i < (veri.size()/satir.length); i++) {
                for (int j = 0; j < satir.length; j++) {
                    satir[j] = veri.get(i*satir.length+j+1);
                }
                dtm.addRow(satir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {
        FlatLightLaf.install();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new admin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JDialog jDialog2;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JDialog liman_ekle;
    private javax.swing.JDialog personel_ekle;
    private javax.swing.JDialog yeniUcus;
    // End of variables declaration//GEN-END:variables
}
