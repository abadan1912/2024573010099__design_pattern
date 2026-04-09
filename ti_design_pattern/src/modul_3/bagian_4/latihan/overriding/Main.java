package modul_3.bagian_4.latihan.overriding;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari subclass
        BangunDatar persegi = new Persegi(4);
        BangunDatar lingkaran = new Lingkaran(7);

        // Memanggil method yang sudah di-override
        System.out.println("Luas Persegi: " + persegi.hitungLuas());     // Output: 16.0
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas()); // Output: 153.93...
    }
}
