package yulica.quiz2;

import java.util.ArrayList;

/**
 *
 * @author Yulica
 */
class ComboBoxModel {
    private ArrayList<Item> items; //variabel untuk menyimpan objek item

    // konstruktor untuk combo box model
    public ComboBoxModel() {
        this.items = new ArrayList<>();
    }
    
    public Item[] toArray() {
        Item[] items = new Item[this.items.size()];
        for(int i = 0; i < items.length; i++) {
            items[i] = this.items.get(i);
        }
        return items;
    }
    
    // menambahkan item ke keranjang belanja
    public void tambahItem(Item item){
        this.items.add(item);
    }
}
