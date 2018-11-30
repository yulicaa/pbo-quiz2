package yulica.quiz2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Yulica
 */
class ComboBoxModel {
    private HashMap<String, Float> items = new HashMap<>(); //variabel HashMap untuk menyimpan objek item

    // konstruktor untuk combo box model
    public ComboBoxModel() {
        this.items.put("Kopi", new Float(5000));
        this.items.put("Susu", new Float(15000));
        this.items.put("Gula", new Float(20000));
    }
    

    
    // menambahkan item ke daftar belanja
    public void tambahItem(String nama, float harga){
        this.items.put(nama, harga);
    }
}
