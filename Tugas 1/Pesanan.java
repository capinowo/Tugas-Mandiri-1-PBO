/*
Program     : Pesanan.java
Deskripsi   :Class ini mewakili item berupa pesanan yang masuk.
Nama / NIM  : Alya Safina / 24060122140123
 */

public class Pesanan {

    // Deklarasi Atribut
    private Mie mie;
    private Topping toppingA;
    private Topping toppingB;
    private Topping toppingC;
    private Topping toppingD;
    private Topping toppingE;
    private int jumlahtoppingA;
    private int jumlahtoppingB;
    private int jumlahtoppingC;
    private int jumlahtoppingD;
    private int jumlahtoppingE;
    private double totalBill;
    private double tax;
    private double tip;

    // Deklarasi Konstruktor
    public Pesanan (Mie mie, Topping toppingA, int jumlahtoppingA, Topping toppingB, int jumlahtoppingB, Topping toppingC, int jumlahtoppingC, Topping toppingD, int jumlahtoppingD, Topping toppingE, int jumlahtoppingE) {
        this.mie = mie;
        this.toppingA = toppingA;
        this.jumlahtoppingA = jumlahtoppingA;
        this.toppingB = toppingB;
        this.jumlahtoppingB = jumlahtoppingB;
        this.toppingC = toppingC;
        this.jumlahtoppingC = jumlahtoppingC;
        this.toppingD = toppingD;
        this.jumlahtoppingD = jumlahtoppingD;
        this.toppingE = toppingE;
        this.jumlahtoppingE = jumlahtoppingE;
        hitungTotal(); // Menghitung total harga mie dan topping yang dibeli
        hitungTax(); // Menghitung total pajak yang harus dibayarkan, yakni 10%
        hitungTip(); // Menghitung total biaya layanan yang harus dibayarkan, yakni 15%
    }

    // Deklarasi Method

    //Getter dan setter untuk mie
    public Mie getMie() {
        return mie;
    }
    public void setMie(Mie mie) {
        this.mie = mie;
    }

    //Getter dan setter untuk topping pertama
    public Topping gettoppingA() {
        return toppingA;
    }
    public void settoppingA(Topping toppingA) {
        this.toppingA = toppingA;
    }
    public int getJumlahtoppingA() {
        return jumlahtoppingA;
    }
    public void setJumlahtoppingA(int jumlahtoppingA) {
        this.jumlahtoppingA = jumlahtoppingA;
    }

    //Getter dan setter untuk topping kedua
    public Topping gettoppingB() {
        return toppingB;
    }
    public void settoppingB(Topping toppingB) {
        this.toppingB = toppingB;
    }
    public int getJumlahtoppingB() {
        return jumlahtoppingB;
    }
    public void setJumlahtoppingB(int jumlahtoppingB) {
        this.jumlahtoppingB = jumlahtoppingB;
    }

    //Getter dan setter untuk topping ketiga
    public Topping gettoppingC() {
        return toppingC;
    }
    public void settoppingC(Topping toppingC) {
        this.toppingC = toppingC;
    }
    public int getJumlahtoppingC() {
        return jumlahtoppingC;
    }
    public void setJumlahtoppingC(int jumlahtoppingC) {
        this.jumlahtoppingC = jumlahtoppingC;
    }

    //Getter dan setter untuk topping keempat
    public Topping gettoppingD() {
        return toppingD;
    }
    public void settoppingD(Topping toppingD) {
        this.toppingD = toppingD;
    }
    public int getJumlahtoppingD() {
        return jumlahtoppingD;
    }
    public void setJumlahtoppingD(int jumlahtoppingD) {
        this.jumlahtoppingD = jumlahtoppingD;
    }

    //Getter dan setter untuk topping kelima
    public int getJumlahtoppingE() {
        return jumlahtoppingE;
    }
    public Topping gettoppingE() {
        return toppingE;
    }
    public void settoppingE(Topping toppingE) {
        this.toppingE = toppingE;
    }
    public void setJumlahtoppingE(int jumlahtoppingE) {
        this.jumlahtoppingE = jumlahtoppingE;
    }

    //Getter, setter, dan method untuk total harga mie dan topping yang dibeli
    public double getTotalBill() {
        return totalBill;
    }
    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }
    private void hitungTotal() {
        totalBill = ((mie.getHargaMie()) + (toppingA.getHargaTopping() * jumlahtoppingA) + (toppingB.getHargaTopping() * jumlahtoppingB) + (toppingC.getHargaTopping() * jumlahtoppingC) + (toppingD.getHargaTopping() * jumlahtoppingD) + (toppingE.getHargaTopping() * jumlahtoppingE) + getTax() + getTip());
    }

    //Getter, setter, dan method untuk total PPN yang harus dibayarkan
    public double getTax() {
        return tax;
    }
    public void setTotalTax(double tax) {
        this.tax = tax;
    }
    private void hitungTax() {
        tax = totalBill * 0.1;
    }

    //Getter, setter, dan method untuk total biaya layanan yang harus dibayarkan
    public double getTip() {
        return tip;
    }
    public void setTotalTip(double tip) {
        this.tip = tip;
    }
    private void hitungTip() {
        tip = totalBill * 0.15;
    }

    //Method untuk total biaya yang harus dibayarkan = makanan, pajak, dan layanan
    public double totalAkhir() {
        return totalBill + tip + tax;
    }
}
