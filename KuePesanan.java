// kelas KuePesanan yang merupakan subclass dari kelas Kue
public class KuePesanan extends Kue{
    // atribut kelas KuePesanan
    private int berat;

    // konstruktor untuk kelas KuePesanan
    KuePesanan(String nama, double harga, int berat) {
        super(nama, harga);
        this.berat = berat;
    }

    // getter untuk mendapatkan berat kue
    public int getBerat() {
        return berat;
    }

    // method override dari kelas Kue untuk menghitung harga kue pesanan
    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }

    // method override dari kelas Kue untuk menampilkan informasi umum dan spesifik kue pesanan
    @Override
    public String toString() {
        return super.toString() + ", Berat: " + berat + " kg";
    }
}