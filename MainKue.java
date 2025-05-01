// kelas MainKue yang merupakan kelas utama untuk menjalankan program
public class MainKue {
    public static void main(String[] args) {
        // Membuat array dari objek Kue yang berisi 10 objek KuePesanan dan 10 objek KueJadi
        // menambahkan 10 objek KuePesanan dan 10 objek KueJadi ke dalam array
        Kue[] kue = {
            new KuePesanan ("Brownies", 100000, 25),
            new KuePesanan("Nastar", 90000, 5),
            new KuePesanan("Kue Cubir", 45000, 10),
            new KuePesanan("Bolu Pandan", 95000, 3),
            new KuePesanan("Kue Lapis", 80000, 2),
            new KuePesanan("Putu Ayu", 112000, 7),
            new KuePesanan("Putri Salju", 130000, 6),
            new KuePesanan("Kue Talam", 200000, 1),
            new KuePesanan("Kue Lupis", 125000, 4),
            new KuePesanan("Kue Bugis", 166000, 11),
            new KueJadi("Kue Tart", 50000, 14),
            new KueJadi("Cheescake", 65000, 20),
            new KueJadi("Kue Muffin", 37000, 15),
            new KueJadi("Butter Cake", 48000, 17),
            new KueJadi("Bolu Gulung", 150000, 2),
            new KueJadi("Cupcake", 33000, 22),
            new KueJadi("Chiffon Cake", 70000, 9),
            new KueJadi("Kue Serabi", 5000, 5),
            new KueJadi("Kue Getuk", 7000, 12),
            new KueJadi("Croissant", 25000, 30),
        };

        // Menampilkan informasi semua kue yang ada di dalam array
        System.out.println();
        System.out.println("==================Daftar Semua Kue===================");
        // looping untuk setiap objek kue dalam array kue
        for (Kue k : kue) {
            // malakukan pengecekan jenis kue menggunakan instanceof
            // jika kue merupakan objek dari KueJadi maka tampilkan jenis kue adalah kue jadi
            if (k instanceof KueJadi){
                System.out.print("Jenis Kue: Kue Jadi --> ");
            // jika kue merupakan objek dari KuePesanan maka tampilkan jenis kue adalah kue pesanan
            } else if (k instanceof KuePesanan){
                System.out.print("Jenis Kue: Kue Pesanan --> ");
            // jika bukan keduanya maka tampilkan jenis kue tidak diketahui
            } else {
                System.out.println("Jenis Kue: Tidak Diketahui");
            }
            // menampilkan informasi kue menggunakan method toString yang ada di dalam kelas Kue
            System.out.println(k);
        }

        // menampilkan total harga semua kue
        System.out.println();
        System.out.println("============Total Harga Semua Kue============");
        double totalHargaSemuaKue = 0; // inisialisasi variabel totalHargaSemuaKue dengan 0
        // looping untuk setiap objek kue dalam array kue
        for (Kue k : kue) {
            // menambahkan harga kue ke dalam totalHargaSemuaKue
            totalHargaSemuaKue += k.hitungHarga();
        }
        System.out.printf("Total Harga Semua Kue: Rp.%,.2f%n", totalHargaSemuaKue);

        // menampilkan Total Kue Pesanan
        System.out.println();
        System.out.println("============Total Kue Pesanan============");
        // inisialisasi variabel totalHargaKuePesanan dan totalBeratKuePesanan dengan 0
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        // looping untuk setiap objek kue dalam array kue
        for (Kue k : kue){
            // melakukan pengecekan jika kue merupakan objek dari KuePesanan maka harga dan berat kue ditambahkan ke dalam totalHargaKuePesanan
            // dan totalBeratKuePesanan
            if (k instanceof KuePesanan){
                totalHargaKuePesanan += k.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) k).getBerat();
            }
        }
        System.out.printf("Total Harga Kue Pesanan: Rp.%,.2f%n", totalHargaKuePesanan);
        System.out.printf("Total Berat Kue Pesanan: %.2f kg%n", totalBeratKuePesanan);

        // menampilkan Total Kue Jadi
        System.out.println();
        System.out.println("============Total Kue Jadi============");
        // inisialisasi variabel totalHargaKueJadi dan totalJumlahKueJadi dengan 0
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue k : kue){
            // melakukan pengecekan jika kue merupakan objek dari KueJadi maka harga dan jumlah kue ditambahkan ke dalam totalHargaKueJadi
            // dan totalJumlahKueJadi
            if (k instanceof KueJadi){
                totalHargaKueJadi += k.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) k).getJumlah();
            }
        }
        System.out.printf("Total Harga Kue Jadi: Rp.%,.2f%n", totalHargaKueJadi);
        System.out.printf("Total Jumlah Kue Jadi: %.0f pcs%n", totalJumlahKueJadi);

        // menampilkan Kue Termahal
        System.out.println();
        System.out.println("============Kue Termahal============");
        // inisialisasi variabel kueTermahal dengan objek kue pertama dalam array
        Kue kueTermahal = kue[0];
        for (Kue k : kue) {
            // melakukan pengecekan jika harga kue lebih besar dari harga kue termahal
            // maka kue termahal diupdate dengan kue yang baru
            if (k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }
        System.out.printf("Kue dengan harga akhir terbesar --> %s dengan total harga: Rp.%,.2f%n", kueTermahal, kueTermahal.hitungHarga());
    }
}
