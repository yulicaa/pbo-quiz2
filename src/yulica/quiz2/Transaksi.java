package yulica.quiz2;

import java.util.ArrayList;

/**
 *
 * @author Yulica
 */
public class Transaksi {
    private final String kode; //variable kode pembayaran 
    private  ArrayList<Item> items = new ArrayList(); //menampilkan item apa saja yang dibeli
    private float total; //enampilkan total pembelian
    
    //konstruktor default
    public Transaksi() {
        this.kode = null;
    }
    
    //konstruktor 2 prameter
    public Transaksi(String kode, ArrayList<Item> items) {
        this.kode = kode;
        this.items = items;
    }
    
    //method set total
    public void setTotal(){
        float total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    //method output transaksi
    public String Pembayaran(){
        setTotal();
        String bayar = "";
        bayar += "Kode\t\t : " + this.kode + "\n";
        bayar += "Daftar Belanja : \n ";
        for (Item item : this.items){
            bayar += "\t" + item.getNama()  + "(" + item.getJumlah() + ") : " +item.getTotal() + "\n" ;   
        }
        bayar += "Total Pembayaran\t\t : " + this.total;
        return bayar;
    }
    
}
