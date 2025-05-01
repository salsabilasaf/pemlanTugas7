// Kelas KueJadi yang merupakan subclass dari Kue
public class KueJadi extends Kue{
    // atribut kelas KueJadi
    private double jumlah;

    // konstruktor untuk kelas KueJadi
    KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    // getter untuk mendapatkan jumlah kue jadi
    public double getJumlah(){
        return jumlah;
    }

    // method override dari kelas Kue untuk menghitung harga kue jadi
    @Override
    public double hitungHarga(){
        return getHarga() * jumlah * 2;
    }

    // method override dari kelas Kue untuk menampilkan informasi umum dan spesifik kue jadi
    @Override
    public String toString(){
        return super.toString() + ", jumlah: " + jumlah + " pcs";
    }
}
