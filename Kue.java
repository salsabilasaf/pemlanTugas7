// Kelas Kue adalah kelas abstrak yang mendefinisikan struktur dasar untuk semua jenis kue
public abstract class Kue {
    // atribut kelas Kue
    private String nama;
    private double harga;
    
    // konstruktor untuk kelas Kue
    Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // getter untuk mendapatkan harga kue
    public double getHarga(){
        return harga;
    }

    // method abstrak untuk menghitung harga kue
    // yang mana artinya setiap subclass dari Kue harus mengimplementasikan method ini
    public abstract double hitungHarga();

    // method toString untuk menampilkan informasi umum kue
    public String toString() {
        return String.format("Nama: %s, Harga: Rp.%,.2f", nama, harga);
    }
}