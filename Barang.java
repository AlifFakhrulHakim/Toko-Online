
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Barang {

    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    Barang() {
        this.namaBarang.add("Keyboard");
        this.stok.add(20);
        this.harga.add(400000);

        this.namaBarang.add("Headset");
        this.stok.add(30);
        this.harga.add(200000);

        this.namaBarang.add("Mouse");
        this.stok.add(50);
        this.harga.add(150000);
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }
    
    public void setStok (int stok){
        this.stok.add(stok);
    }
    public int getStok (int idBarang){
        return this.stok.get (idBarang);
    }
    public void setHarga (int harga){
        this.harga.add (harga);
    }
    public int getHarga (int idBarang){
        return this.harga.get (idBarang);
    }

}
