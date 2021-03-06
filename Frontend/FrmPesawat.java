/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Frontend;
import Backend.Pesawat;
import Backend.Kategori;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ACER
 */
public class FrmPesawat extends javax.swing.JFrame {

    /**
     * Creates new form FrmPesawat
     */
    public FrmPesawat() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }
    public void kosongkanForm(){
        txtidPesawat.setText("0");
        txtcariKategori.setText("0");
        txtnamaPesawat.setText("");
        txtjenisPesawat.setText("");
        txthargaTiket.setText("");
    }
    
    public final void tampilkanData(){
        String[] kolom = {"ID Pesawat","ID Kategori", "Nama Pesawat", "Jenis Tiket","Harga Tiket"};
        ArrayList<Pesawat> list = new Pesawat().getAll();
        Object rowData[] = new Object[5];
        
        tblPesawat.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Pesawat pst : list) {
            rowData[0] = pst.getIdPesawat();
            rowData[1] = pst.getKategori().getIdKategori();
            rowData[2] = pst.getNamaPesawat();
            rowData[3] = pst.getJenisPesawat();
            rowData[4] = pst.getHargaTiket();
        
            ((DefaultTableModel)tblPesawat.getModel()).addRow(rowData);
        }
    }
    
    public final void cari(String keyword){
        String[] kolom = {"ID Pesawat","ID Kategori", "Nama Pesawat", "Jenis Tiket","Harga Tiket"};
        ArrayList<Pesawat> list = new Pesawat().search(keyword);
        Object rowData[] = new Object[5];
        
        tblPesawat.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for (Pesawat pst : list) {
             rowData[0] = pst.getIdPesawat();
            rowData[1] = pst.getKategori().getIdKategori();
            rowData[2] = pst.getNamaPesawat();
            rowData[3] = pst.getJenisPesawat();
            rowData[4] = pst.getHargaTiket();
        
            ((DefaultTableModel)tblPesawat.getModel()).addRow(rowData);
        }
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
        lblidKategori = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtidPesawat = new javax.swing.JTextField();
        txtcariKategori = new javax.swing.JTextField();
        txtnamaPesawat = new javax.swing.JTextField();
        txtjenisPesawat = new javax.swing.JTextField();
        txthargaTiket = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btntambahBaru = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPesawat = new javax.swing.JTable();
        btncariKategori = new javax.swing.JButton();
        lblkategori = new javax.swing.JLabel();

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

        jLabel1.setText("ID Pesawat");

        lblidKategori.setText("ID Kategori");

        jLabel3.setText("Nama Pesawat");

        jLabel4.setText("Jenis Tiket Pesawat");

        jLabel5.setText("Harga Tiket");

        txtidPesawat.setEnabled(false);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btntambahBaru.setText("Tambah Baru");
        btntambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahBaruActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tblPesawat.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPesawat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPesawatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPesawat);

        btncariKategori.setText("Cari");
        btncariKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariKategoriActionPerformed(evt);
            }
        });

        lblkategori.setText("namaKategori");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblidKategori)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtidPesawat)
                                    .addComponent(txtcariKategori)
                                    .addComponent(txtnamaPesawat)
                                    .addComponent(txtjenisPesawat, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                    .addComponent(txthargaTiket)))
                            .addComponent(btnSimpan)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btntambahBaru)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCari)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncariKategori)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblkategori))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblidKategori)
                    .addComponent(txtcariKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncariKategori)
                    .addComponent(lblkategori))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnamaPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtjenisPesawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthargaTiket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntambahBaru)
                    .addComponent(btnhapus)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPesawatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPesawatMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblPesawat.getModel();
        int row = tblPesawat.getSelectedRow();
        
        txtidPesawat.setText(model.getValueAt(row, 0).toString());
        txtcariKategori.setText(model.getValueAt(row, 1).toString());
        txtnamaPesawat.setText(model.getValueAt(row, 2).toString());
        txtjenisPesawat.setText(model.getValueAt(row, 3).toString());
        txthargaTiket.setText(model.getValueAt(row, 4).toString());                                        
    }//GEN-LAST:event_tblPesawatMouseClicked

    private void btncariKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariKategoriActionPerformed
        // TODO add your handling code here:
        Kategori kategori = new Kategori();
        kategori = kategori.getById(Integer.parseInt(txtcariKategori.getText()));
        if (String.valueOf(kategori.getNamaKategori()).equalsIgnoreCase("null")) {
            lblkategori.setText("Data tidak ditemukan");
        } else {
            lblkategori.setText(String.valueOf(kategori.getNamaKategori()));
        }
    }//GEN-LAST:event_btncariKategoriActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            
            Pesawat pst = new Pesawat();

            pst.setIdPesawat(Integer.parseInt(txtidPesawat.getText()));
            Kategori kategori = new Kategori().getById(Integer.parseInt(txtcariKategori.getText()));
            pst.setKategori(kategori);
            pst.setNamaPesawat(txtnamaPesawat.getText());
            pst.setJenisPesawat(txtjenisPesawat.getText());
            pst.setHargaTiket(Integer.parseInt(txthargaTiket.getText()));
            pst.save();
            txtidPesawat.setText(Integer.toString(pst.getIdPesawat()));
            tampilkanData();
        } catch (Exception e) {
            System.out.println("Exception :" + e);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btntambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahBaruActionPerformed
        // TODO add your handling code here:
        kosongkanForm();
    }//GEN-LAST:event_btntambahBaruActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblPesawat.getModel();
        int row = tblPesawat.getSelectedRow();
        
        Pesawat pst = new Pesawat().getById(Integer.parseInt(model.getValueAt(row,0).toString()));
        pst.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cari(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPesawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btncariKategori;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btntambahBaru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblidKategori;
    private javax.swing.JLabel lblkategori;
    private javax.swing.JTable tblPesawat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtcariKategori;
    private javax.swing.JTextField txthargaTiket;
    private javax.swing.JTextField txtidPesawat;
    private javax.swing.JTextField txtjenisPesawat;
    private javax.swing.JTextField txtnamaPesawat;
    // End of variables declaration//GEN-END:variables
}
