/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JComboBox;
import Model.*;
import Control.*;
import javax.swing.JOptionPane;
import Exception.*;

/**
 *
 * @author Andreas
 */
public class FormBuku extends javax.swing.JFrame {

    BukuControl BC;
    /**
     * Creates new form FormBuku
     */

    String action;

    public FormBuku() {
        initComponents();
        BC = new BukuControl();
        setForm(false);
        cmbKategori.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param val
     */
    
    public void cekKosong() throws exDataKosong {
        if (txtCari.getText().equalsIgnoreCase("") || 
                txtJudul.getText().equalsIgnoreCase("") || 
                txtPenerbit.getText().equalsIgnoreCase("") || 
                txtPengarang.getText().equalsIgnoreCase("") || 
                txtStok.getText().equalsIgnoreCase("") ||
                cmbKategori.getSelectedItem().equals(-1)) {
            
        }
    }
    
    public void setForm(boolean val)    {
        txtCari.setEnabled(val);
        txtJudul.setEnabled(val);
        txtPenerbit.setEnabled(val);
        txtPengarang.setEnabled(val);
        txtStok.setEnabled(val);
        txtThnTerbit.setEnabled(val);
        cmbKategori.setEnabled(val);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        txtPenerbit = new javax.swing.JTextField();
        txtThnTerbit = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPengarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnUbah2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Penerbit :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Stok:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tahun Terbit :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Kategori : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));
        getContentPane().add(txtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 210, 30));
        getContentPane().add(txtJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 210, 30));
        getContentPane().add(txtPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 210, 30));
        getContentPane().add(txtThnTerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 210, 30));

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novel", "Kamus", "Komik", "Buku Pelajaran" }));
        getContentPane().add(cmbKategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pengarang :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));
        getContentPane().add(txtPengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 210, 30));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Menu Buku");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 50, 230, 30));

        btnCari.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        btnCari.setText("Cari");
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 40, 130, 50));

        btnSimpan.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 690, 200, 50));

        btnTambah.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 690, 190, 50));

        btnHapus.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnHapus.setText("Hapus");
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 690, 190, 50));

        btnKembali.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnKembali.setText("Kembali");
        getContentPane().add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 690, 190, 50));

        jTable1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Judul", "Tebal", "Pengarang", "Tahun Terbit", "Kategori"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 1160, 460));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Admin");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pencarian :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 50, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("@ Copyright Tugas Besar PBO 2017");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 770, -1, -1));

        btnUbah.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 690, 190, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/form buku.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 840));

        btnUbah2.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnUbah2.setText("Ubah");
        btnUbah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbah2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 690, 190, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if (action.equalsIgnoreCase("Tambah")) {
            Buku B = new Buku(cmbKategori.getSelectedItem().toString(),
                    Integer.parseInt(txtStok.getText()), txtJudul.getText(),
                    txtPengarang.getText(), txtPenerbit.getText(),
                    Integer.parseInt(txtThnTerbit.getText()));
            BC.insertBuku(B);
            JOptionPane.showMessageDialog(this, "Data Buku Berhasil Ditambahkan!");
            setForm(false);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        setForm(true);
        action = "Tambah";
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        setForm(true);
        action = "Edit";
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnUbah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbah2ActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btnUbah2;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtThnTerbit;
    // End of variables declaration//GEN-END:variables
}