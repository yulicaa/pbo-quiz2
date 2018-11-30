/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yulica.quiz2;

/**
 *
 * @author Yulica
 */

// Deklarasi class Item untuk merepresentasikan barang
// yang akan dimasukkan dalam daftar belanja.
public class Item {
  private String nama; // atribut yang digunakan untuk menyimpan nama barang
  private float harga; // atribut yang digunakan untuk menyimpan harga barang
  private int jumlah; // atribut yang digunakan untuk menyimpan jumlah barang
  
  
    // konstruktor 2 parameter untuk Jcombobox
    public Item(String nama, float harga) {
        this.nama = nama;
        this.harga = harga;
    }
  
    //konstruktor tiga parameter untuk transaksi 
    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    
    // menambahkan method getter untuk nama item
    public String getNama() {
        return nama;
    }
    
    // menambahkan method setter untuk nama item
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // menambahkan method getter untuk harga item
    public float getHarga() {
        return harga;
    }
    
    // menambahkan method setter untuk harga item
    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    // menambahkan method getter untuk jumlah item
    public int getJumlah() {
        return jumlah;
    }
    
    // menambahkan method setter untuk jumlah item
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    //hasil untuk harga dikali jumlah barang
    public  float getTotal() {
        return this.harga * this.jumlah;
    }
    
    // menambahkan method to string untuk menampilkan nama, harga dan jumlah barang
    @Override
    public String toString() {
        return this.nama;
    }

}
