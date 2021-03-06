/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yulica.quiz2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import yulica.quiz2.Transaksi.*;


/**
 *
 * @author Yulica
 */
public class TransaksiFrame extends javax.swing.JFrame {
    private int id = 0; // id kode transaksi
    private String kode; // variabel kode untuk tansaksi
    private DefaultComboBoxModel comboModel; // Jcombobox model 
    private DefaultTableModel tabelModel; // Jtable model 
    private ArrayList<Item> dftrBelanja = new ArrayList<>(); //daftar transaksi
    
    //konstruktor untuk transaksi frame
    public TransaksiFrame() {
        ComboBoxModel comboModel = new ComboBoxModel();
        this.comboModel = new DefaultComboBoxModel<>(comboModel.getJenisNama().toArray());
        
        TabelModel tabelModel = new TabelModel();
        this.tabelModel = new DefaultTableModel(tabelModel.getNamaKolom(), 0); // tabel untuk nama kolom
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        codeText = new javax.swing.JTextField();
        newButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        itemComboBox = new javax.swing.JComboBox<>();
        itemText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transaksiTabel = new javax.swing.JTable();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Code");

        codeText.setBackground(new java.awt.Color(240, 240, 240));
        codeText.setDragEnabled(true);
        codeText.setEnabled(false);

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Item");

        itemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kopi", "Susu", "Gula" }));
        itemComboBox.setSelectedIndex(-1);
        itemComboBox.setEnabled(false);

        itemText.setBackground(new java.awt.Color(240, 240, 240));
        itemText.setEnabled(false);
        itemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTextActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.setEnabled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        transaksiTabel.setModel(this.tabelModel);
        jScrollPane1.setViewportView(transaksiTabel);

        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.setEnabled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.setEnabled(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(codeText)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(itemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(itemText, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(removeButton))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newButton))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(itemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //men disable tombol remove dan save jika isi table kosong
    private void belanja(){
        if(isEmpty()){
            this.saveButton.setEnabled(false);
            this.removeButton.setEnabled(false);
        }else{
            this.saveButton.setEnabled(true);
            this.removeButton.setEnabled(true);
        }
    }
    
    //untuk men set code pembelian
    private String setCode() {
        this.incId();
        String dt = new SimpleDateFormat("yyMMdd").format(new Date()); //mendapatkan tanggal hari ini sbg string
        this.kode = String.format(dt+"%02d", this.id);  //menambahkan id pada kode setelah tanggal
        return kode;
    }
        
    // id bertambah
    private void incId() {
        this.id += 1;
    }
    
    // id berkurang
    private void decId() {
        this.id -= 1;
    }
    
    // pengecekan jika isi tabel kosong
    private boolean isEmpty(){
        return this.transaksiTabel.getModel().getRowCount() <= 0;
    }
    
    // pengecekan item agar tidak terjadi duplikasi
    private  boolean Duplicate(String nama){
        boolean result = false;
        ArrayList<String> item = new ArrayList<>();
        for(int i = 0; i < tabelModel.getRowCount(); i++){
            item.add(tabelModel.getValueAt(i, 0).toString());
        }
        for(String i : item){
            if(i.equals(nama)){
                result = true;
            }
        }
        return result;
    }
    
    // update fungsi jumlah 
    // jika terdapat item yg diinginkan lagi
    private  void updateJumlah(String nama, int add){
        ArrayList<String> item = new ArrayList<>();
        for(int i = 0; i < tabelModel.getRowCount(); i++){
            item.add(tabelModel.getValueAt(i, 0).toString());
        }
        for(int i = 0; i < item.size(); i++){
            if(item.get(i).equals(nama)){
                int jumlah = new Integer (tabelModel.getValueAt(i, 2).toString());
                tabelModel.setValueAt(jumlah + add, i, 2);
            }
        }
    }
    
    // jika melakukan transaksi baru 
    private  void newTransaksi(){
        this.itemText.setText("");
        this.codeText.setText("");
        this.newButton.setEnabled(true);
        this.saveButton.setEnabled(false);
        this.cancelButton.setEnabled(false);
        this.addButton.setEnabled(false);
        this.removeButton.setEnabled(false);
        this.removeButton.setEnabled(false);
        this.itemText.setEnabled(false);
        this.itemComboBox.setEnabled(false);
        this.tabelModel.setRowCount(0);
        this.dftrBelanja.clear();
    }
    
    //menambahkan object(nama, harga, jumlah) item
    private  Object[] addItem(String nama, int jumlah){
        float harga = 0;
        ComboBoxModel items = new ComboBoxModel();
        for(int i = 0 ; i < items.getHargaBarang().size(); i++){
            if(nama.equalsIgnoreCase(items.getJenisNama().get(i))){
            harga = items.getHargaBarang().get(i);
            }
        }
        Object[] obj = {
            nama,
            harga,
            jumlah
        };
        return obj;
    }
    
    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        this.itemText.setText("1");
        this.newButton.setEnabled(false);
        this.cancelButton.setEnabled(true);
        this.addButton.setEnabled(true);
        this.itemText.setEnabled(true);
        this.itemComboBox.setEnabled(true);
        this.codeText.setText(this.setCode());
    }//GEN-LAST:event_newButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // mengecek apakah ada baris yang dipilih
        if(transaksiTabel.getSelectedRow() <0){
            String sbr = "Pilih item yang ingin dihapus!";
            JOptionPane.showMessageDialog(this, sbr,"Information",JOptionPane.INFORMATION_MESSAGE);
        }else{
            // jika ada baris yang dipilih, maka baris itu akan dihapus
            int count = transaksiTabel.getSelectedRows().length;
            for(int i = 0; i < count; i++){
                tabelModel.removeRow(transaksiTabel.getSelectedRow());
            }
        }
            this.belanja();
    }//GEN-LAST:event_removeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        newTransaksi();
        this.decId(); 
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
            try{
            // loop setiap tabel
            for(int i = 0; i < tabelModel.getRowCount(); i++){
                //menyimpan nama dan jumlah menjadi variable
                String nama = tabelModel.getValueAt(i, 0).toString();
                float harga = new Float(tabelModel.getValueAt(i, 1).toString());
                int jumlah = new Integer(tabelModel.getValueAt(i, 2).toString());
                this.dftrBelanja.add(new Item(nama, harga, jumlah));
            }
            //Transaksi dengan kode dan comitted belanja
            Transaksi transaksi = new Transaksi(this.kode, this.dftrBelanja);
            //menangani output transaksi
            StringBuilder sbr = new StringBuilder();
            //menambahkan hasil transaksi
            sbr.append(transaksi.Pembayaran());
            // memanggil dialog
            JOptionPane.showMessageDialog(this, sbr, "Transaksi " , JOptionPane.INFORMATION_MESSAGE);
            // melakukan transaksi baru
            newTransaksi();
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String nama = this.itemComboBox.getSelectedItem().toString();
        int jumlah = new Integer(this.itemText.getText());
        if(Duplicate(nama)){
            updateJumlah(nama, jumlah);
        }else{
            tabelModel.addRow(addItem(nama, jumlah));
        }
        this.belanja();    
    }//GEN-LAST:event_addButtonActionPerformed

    private void itemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTextActionPerformed

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransaksiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField codeText;
    private javax.swing.JComboBox<String> itemComboBox;
    private javax.swing.JTextField itemText;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable transaksiTabel;
    // End of variables declaration//GEN-END:variables
}
