/*
Program     : Mie.java
Deskripsi   : Class ini mewakili item berupa pilihan mie yang dapat dipilih dalam kedai.
Nama / NIM  : Alya Safina / 24060122140123
 */

public class Mie {

    // Deklarasi Atribut
    private String jenisMie;
    private double hargaMie;
    private int stokMie;

    // Deklarasi Konstruktor
    public Mie (String jenisMie, double hargaMie, int stokMie) {
        this.jenisMie = jenisMie;
        this.hargaMie = hargaMie;
        this.stokMie = stokMie;
    }

    // Deklarasi Method
    public String getJenisMie() {
        return jenisMie;
    }

    public void setJenisMie(String jenisMie) {
        this.jenisMie = jenisMie; //Getter untuk jenis mie yang tersedia
    }

    public double getHargaMie() {
        return hargaMie;
    }

    public void setHargaMie(double hargaMie) {
        this.hargaMie = hargaMie; //Getter untuk harga mie yang tersedia
    }

    public int getStokMie() {
        return stokMie; //Getter untuk stok mie yang tersedia
    }

    public void setStokMie(int stokMie) {
        this.stokMie = stokMie; //Setter untuk stok mie yang tersedia
    }

    public void kurangiStok(int jumlah) {
       this.stokMie = stokMie - jumlah; //Method untuk mengurangi stok mie yang tersedia
    }
}
