/*
Program     : Topping.java
Deskripsi   : Class ini mewakili item berupa pilihan topping yang dapat dipilih dalam kedai.
Nama / NIM  : Alya Safina / 24060122140123
 */


public class Topping {

    // Deklarasi Atribut
    private String jenisTopping;
    private double hargaTopping;
    private int stokTopping;
    
    // Deklarasi Konstruktor
    public Topping (String jenisTopping, double hargaTopping, int stokTopping) {
        this.jenisTopping = jenisTopping;
        this.hargaTopping = hargaTopping;
        this.stokTopping = stokTopping;
    }
    
    // Deklarasi Method
    public String getJenisTopping() {
        return jenisTopping; //Getter untuk jenis topping yang tersedia
    }

    public void setJenisTopping(String jenisTopping) {
        this.jenisTopping = jenisTopping; //Setter untuk jenis topping yang tersedia
    }
    
    public double getHargaTopping() {
        return hargaTopping; //Getter untuk harga topping yang tersedia
    }
    
    public void setHargaTopping(double hargaTopping) {
        this.hargaTopping = hargaTopping; //Setter untuk harga topping yang tersedia
    }
    
    public int getStokTopping() {
        return stokTopping; //Getter untuk stok topping yang tersedia
    }
    
    public void setStokTopping(int stokTopping) {
        this.stokTopping = stokTopping; //Setter untuk stok topping yang tersedia
    }
    
    public void kurangiStok(int jumlah) {
        this.stokTopping = stokTopping - jumlah; //Method untuk mengurangi stok topping yang tersedia
    }
}
