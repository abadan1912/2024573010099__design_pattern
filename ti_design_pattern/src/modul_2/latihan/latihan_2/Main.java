package modul_2.latihan.latihan_2;

public class Main {
    public static void main(String[] args) {
        // 1. Membuat object dari class Lingkaran
        Lingkaran bundar = new Lingkaran();

        // 2. Mengisi nilai atribut jariJari
        bundar.jariJari = 10;

        // 3. Memanggil method hitungLuas() dan menyimpannya dalam variabel
        double hasilLuas = bundar.hitungLuas();

        // Menampilkan hasil
        System.out.println("Jari-jari lingkaran: " + bundar.jariJari);
        System.out.println("Luas lingkaran     : " + hasilLuas);
    }
}
