package yulica.quiz2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Yulica
 */
// Deklarasi class Combo box model untuk merepresentasikan item
class ComboBoxModel {
    private HashMap<String, Float> items = new HashMap<>(); //variabel HashMap untuk menyimpan objek item

    // konstruktor untuk combo box model
    public ComboBoxModel() {
        this.items.put("Kopi", new Float(5000));
        this.items.put("Susu", new Float(15000));
        this.items.put("Gula", new Float(20000));
    }
    
    // ArrayList untuk mendapatkan jenis nama barang
    public ArrayList<String> getJenisNama(){
        ArrayList<String> str = new ArrayList<>();
        for(String item : this.items.keySet()){
            str.add(item);
        }
        return str;
    }
    
    
    
    // menambahkan item ke daftar belanja
    public void tambahItem(String nama, float harga){
        this.items.put(nama, harga);
    }
}
