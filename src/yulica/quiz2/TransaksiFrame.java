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
        jTable1 = new javax.swing.JTable();
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

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Item");

        itemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kopi", "Susu", "Gula" }));
        itemComboBox.setSelectedIndex(-1);

        itemText.setText("1");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(this.tabelModel);
        jScrollPane1.setViewportView(jTable1);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(newButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(cancelButton)))))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(removeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton)))
                .addGap(30, 30, 30)
                .addComponent(saveButton)
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
        return this.tabelModel.getRowCount() <= 0;
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
    
    }//GEN-LAST:event_removeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
       
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        
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
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
