package modul_3.bagian_5;

// 1. Interface
interface Terbang {
    void terbang();
}

// 2. Abstract Class
abstract class Hewan {
    String nama;

    // Method abstrak yang wajib diisi oleh anak kelas
    abstract void bersuara();

    // Method konkret (opsional, bisa langsung digunakan anak kelas)
    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// 3. Subclass yang mewarisi Hewan DAN mengimplementasikan Terbang
class Burung extends Hewan implements Terbang {

    // Implementasi method dari abstract class Hewan
    @Override
    void bersuara() {
        System.out.println("Kicau kicau!");
    }

    // Implementasi method dari interface Terbang
    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang.");
    }
}

// 4. Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Burung
        Burung burung = new Burung();

        // Mengisi atribut yang diwarisi dari kelas Hewan
        burung.nama = "Merpati";

        // Memanggil berbagai method
        burung.makan();    // Dari kelas Hewan
        burung.bersuara(); // Hasil override dari Hewan
        burung.terbang();  // Hasil implementasi dari interface Terbang
    }
}
