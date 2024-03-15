/*
Program     : Nota.java
Deskripsi   : Merupakan kelas utama yang berisi logika interaksi dengan pengguna. Menampilkan output berupa nota transaksi
Nama / NIM  : Alya Safina / 24060122140123
 */

public class Nota {

    public static void main(String[] args) {

        // Inisialisasi menu mie
        Mie mie1 = new Mie ("Mie gandum", 5000, 50);
        Mie mie2 = new Mie ("Mie bihun", 5000, 50);
        Mie mie3 = new Mie ("Mie shirataki", 15000, 50);
        Mie mie4 = new Mie ("Mie soba", 7000, 50);
        Mie mie5 = new Mie ("Mie biang-biang", 7000, 50);

        // Inisialisasi menu topping
        Topping topping1 = new Topping("Ayam kecap", 5000, 50);
        Topping topping2 = new Topping("Telur rebus", 5000, 50);
        Topping topping3 = new Topping("Jamur kecap", 5000, 50);
        Topping topping4 = new Topping("Rumput laut", 5000, 50);
        Topping topping5 = new Topping("Daging sapi", 5000, 50);
        Topping topping6 = new Topping("Saus kacang cina", 5000, 50);
        Topping topping7 = new Topping("Minyak cabai", 5000, 50);
        Topping topping8 = new Topping("Kuah kaldu ayam", 5000, 50);
        Topping topping9 = new Topping("Kuah tsukemen", 5000, 50);

        // Inisialisasi pesanan yang masuk
        Pesanan P1 = new Pesanan(mie5, topping1, 1, topping2, 1, topping3, 1, topping4, 1, topping5, 1);

        // Inisialisasi pelanggan
        Pelanggan pelanggan1 = new Pelanggan("badut", "Clownpiece", "15032024", "Bank GSK");

        // Interaksi dengan pengguna

        //Bagian 1: Nota yang akan diterima pelanggan
        System.out.println("==============================================");
        System.out.println("               Selamat datang di              ");
        System.out.println("                Kedai Mie CIRNO               ");
        System.out.println("             Spesial Mie 5 Topping            ");
        System.out.println("==============================================");
        System.out.println("\nPesanan Kode **" + pelanggan1.getKodeTransaksi() + "\n");
        System.out.println("Jenis mie \t:" + mie5.getJenisMie() + "\t" + mie5.getHargaMie())  ;
        System.out.println("Topping 1 \t: " + topping1.getJenisTopping() + "\t\t" + topping1.getHargaTopping());
        System.out.println("Topping 2 \t: " + topping2.getJenisTopping() + "\t\t" + topping2.getHargaTopping());
        System.out.println("Topping 3 \t: " + topping3.getJenisTopping() + "\t\t" + topping3.getHargaTopping());
        System.out.println("Topping 4 \t: " + topping4.getJenisTopping() + "\t\t" + topping4.getHargaTopping());
        System.out.println("Topping 5 \t: " + topping5.getJenisTopping() + "\t\t" + topping5.getHargaTopping() + "\n");
        System.out.println("Total pembelian : \t\t\t" + P1.getTotalBill());
        System.out.println("Pajak PPN \t: \t\t\t" + P1.getTax());
        System.out.println("Biaya layanan \t: \t\t\t" + P1.getTip() + "\n");
        System.out.println("Biaya akhir \t: \t\t\t" + P1.totalAkhir() + "\n");
        System.out.println("                 TERIMA KASIH! \n      ");
        System.out.println("----------------------------------------------       < batas nota pelanggan dan riwayat transaksi toko, untuk disobek dan disimpan sebagai riwayat transaksi");

        //Bagian 2: Nota rekap transaksi untuk riwayat pemesanan
        System.out.println("\n\nRiwayat pesanan " + pelanggan1.getKodeTransaksi() + pelanggan1.getTanggal() + "a/n. " + pelanggan1.getNamaPembeli());
        System.out.println("");
        System.out.println();
        System.out.println(mie5.getJenisMie() + "\t\t" + mie5.getHargaMie())  ;
        System.out.println(topping1.getJenisTopping() + "\t\t" + topping1.getHargaTopping());
        System.out.println(topping2.getJenisTopping() + "\t\t" + topping2.getHargaTopping());
        System.out.println(topping3.getJenisTopping() + "\t\t" + topping3.getHargaTopping());
        System.out.println(topping4.getJenisTopping() + "\t\t" + topping4.getHargaTopping());
        System.out.println(topping5.getJenisTopping() + "\t\t" + topping5.getHargaTopping() + "\n");
        System.out.println("Total pembelian : \t" + P1.getTotalBill());
        System.out.println("Pajak PPN \t: \t" + P1.getTax());
        System.out.println("Biaya layanan \t: \t" + P1.getTip() + "\n");
        System.out.println("Biaya akhir \t: \t" + P1.totalAkhir() + "\n");
        System.out.println("Dibayar lunas menggunakan " + pelanggan1.getMetode() + "\n");
    }
}
