/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package penjualan;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author HarryHarkespan
 */
public class Barang extends javax.swing.JFrame {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1/test";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    /**
     * Creates new form Barang
     */
    public Barang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSatuan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStokMin = new javax.swing.JTextField();
        txtSimpan = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        tblUpdate = new javax.swing.JButton();
        tblDelete = new javax.swing.JButton();
        tblClear = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Satuan");

        jLabel4.setText("Stok Barang");

        jLabel5.setText("Stok Minimal");

        txtSimpan.setText("Simpan");
        txtSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSimpanActionPerformed(evt);
            }
        });

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelData);

        jScrollPane3.setViewportView(jScrollPane2);

        tblUpdate.setText("Update");
        tblUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblUpdateActionPerformed(evt);
            }
        });

        tblDelete.setText("Hapus");
        tblDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblDeleteActionPerformed(evt);
            }
        });

        tblClear.setText("Kosongkan");
        tblClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtSimpan))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tblUpdate)
                                .addGap(40, 40, 40)
                                .addComponent(tblDelete)
                                .addGap(34, 34, 34)
                                .addComponent(tblClear))
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtStokMin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(txtStok, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSatuan, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStokMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSimpan)
                    .addComponent(tblUpdate)
                    .addComponent(tblDelete)
                    .addComponent(tblClear))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSimpanActionPerformed
        // TODO add your handling code here:
        String kode = txtKode.getText().toString().trim();
        String nama = txtNama.getText();
        String satuan = txtSatuan.getText();
        int stok = Integer.parseInt(txtStok.getText());
        int stok_min = Integer.parseInt(txtStokMin.getText());
        //insert(kode,nama,satuan,stok,stok_min);
        //showtable();
        //clear();
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            //mengecek kode barang
            String query = "SELECT * FROM barang WHERE kd_brg = '" + kode + "'";
            rs = stmt.executeQuery(query);
            //jika kode barang sudah ada , maka akan menampilkan pesan
            if (rs.next())
            {
                JOptionPane.showMessageDialog(null, "Kode barang sudah digunakan");
            }
            else
            {
                String sql = "INSERT INTO barang (kd_brg, nm_brg, satuan, stok_brg, stok_min) VALUES (?,?,?,?,?)";
                PreparedStatement pms = conn.prepareStatement(sql);
                pms.setString(1, kode);
                pms.setString(2, nama);
                pms.setString(3, satuan);
                pms.setInt(4, stok);
                pms.setInt(5, stok_min);
                pms.execute();
            }
            stmt.close();
            conn.close(); 
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        showtable();  
    }//GEN-LAST:event_txtSimpanActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showtable();
    }//GEN-LAST:event_formWindowOpened

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        // TODO add your handling code here:
        getData();
    }//GEN-LAST:event_tabelDataMouseClicked

    private void tblClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_tblClearActionPerformed

    private void tblUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblUpdateActionPerformed
        // TODO add your handling code here:
        String kode = txtKode.getText().toString().trim();
        String nama = txtNama.getText();
        String satuan = txtSatuan.getText();
        int stok = Integer.parseInt(txtStok.getText());
        int stok_min = Integer.parseInt(txtStokMin.getText());
        update(kode,nama,satuan,stok,stok_min);
        showtable();
        clear();
    }//GEN-LAST:event_tblUpdateActionPerformed

    private void tblDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblDeleteActionPerformed
        // TODO add your handling code here:
        String kode = txtKode.getText().toString().trim();
        try {
            Class.forName(JDBC_DRIVER);
   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
 
            stmt = conn.createStatement();
            
            String sql = "DELETE FROM barang WHERE kd_brg=?";
            
            PreparedStatement pms = conn.prepareStatement(sql);
            pms.setString(1, kode);
            
            pms.execute();
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        showtable();
        clear();
    }//GEN-LAST:event_tblDeleteActionPerformed

    public void getData(){
        int baris = tabelData.getSelectedRow();
        txtKode.setText(String.valueOf(tabelData.getValueAt(baris,1)));
        txtNama.setText(String.valueOf(tabelData.getValueAt(baris,2)));
        txtSatuan.setText(String.valueOf(tabelData.getValueAt(baris, 3)));
        txtStok.setText(String.valueOf(tabelData.getValueAt(baris, 4)));
        txtStokMin.setText(String.valueOf(tabelData.getValueAt(baris, 5)));
    }
    
    public void insert(String kode, String nama, String satuan, int stok, int stok_min){
        try {
            Class.forName(JDBC_DRIVER);
   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
 
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO barang (kd_brg, nm_brg, satuan, stok_brg, stok_min) VALUES (?,?,?,?,?)";
            
            PreparedStatement pms = conn.prepareStatement(sql);
            pms.setString(1, kode);
            pms.setString(2, nama);
            pms.setString(3, satuan);
            pms.setInt(4, stok);
            pms.setInt(5, stok_min);
            
            pms.execute();
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void showtable(){
        try{
            Class.forName(JDBC_DRIVER);	   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("No");
            model.addColumn("Kode Barang");
            model.addColumn("Nama Barang");
            model.addColumn("Satuan");
            model.addColumn("Stok");
            model.addColumn("Stok Barang");
 
            stmt = conn.createStatement();
            String sql = "SELECT * FROM barang";
            int i = 1;
            rs = stmt.executeQuery(sql);
            while(rs.next()) {
            	model.addRow(new Object[] {
                        i,
            		rs.getString("kd_brg"),
            		rs.getString("nm_brg"),
            		rs.getString("satuan"),
            		rs.getInt("stok_brg"),
                        rs.getInt("stok_min")
            	});
            	i++;
            }
            rs.close();
            conn.close();
            stmt.close();
            
            tabelData.setModel(model);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void clear(){
        // TODO add your handling code here:
        txtKode.setText("");
        txtNama.setText("");
        txtSatuan.setText("");
        txtStok.setText("");
        txtStokMin.setText("");
    }
    
    public void update(String kode, String nama, String satuan, int stok, int stokmin){
        try {
            Class.forName(JDBC_DRIVER);
   
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
 
            stmt = conn.createStatement();
            
            String sql = "UPDATE barang SET kd_brg=?, nm_brg=?, satuan=?, stok_brg=?, stok_min=? WHERE kd_brg='"+kode+"'";
            
            PreparedStatement pms = conn.prepareStatement(sql);
            pms.setString(1, kode);
            pms.setString(2, nama);
            pms.setString(3, satuan);
            pms.setInt(4, stok);
            pms.setInt(5, stokmin);
            
            pms.execute();
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelData;
    private javax.swing.JButton tblClear;
    private javax.swing.JButton tblDelete;
    private javax.swing.JButton tblUpdate;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSatuan;
    private javax.swing.JButton txtSimpan;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtStokMin;
    // End of variables declaration//GEN-END:variables
}
