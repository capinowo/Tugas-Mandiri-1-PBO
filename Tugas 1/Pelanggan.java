/*
Program     : Pelanggan.java
Deskripsi   : Class ini mewakili item berupa pelanggan yang melakukan pemesanan.
Nama / NIM  : Alya Safina / 24060122140123
 */

public class Pelanggan {

    // Deklarasi Atribut
    private String kodeTransaksi;
    private String namaPembeli;
    private String tanggal;
    private String metode;

    // Deklarasi Konstruktor
    public Pelanggan (String kodeTransaksi, String namaPembeli, String tanggal, String metode) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggal = tanggal;
        this.metode = metode;
    }

    // Deklarasi Method
    public String getKodeTransaksi() {
        return kodeTransaksi; //Getter untuk kode transaksi
    }

    public void setKodeTransaksi(String kodeTransaksi) {
        this.kodeTransaksi = kodeTransaksi; //Setter untuk kode transaksi
    }

    public String getNamaPembeli() {
        return namaPembeli; //Getter untuk nama pembeli
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli; //Setter untuk nama pembeli
    }

    public String getTanggal() {
        return tanggal; //Getter untuk tanggal transaksi
    }

    public void getTanggal(String tanggal) {
        this.tanggal = tanggal; //Setter untuk tanggal transaksi
    }

    public String getMetode() {
        return metode; //Getter untuk metode pembayaran
    }

    public void setMetode(String metode) {
        this.metode = metode; //Setter untuk metode pembayaran
    }
}
