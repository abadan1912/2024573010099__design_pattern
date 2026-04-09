package modul_2.latihan.latihan_5;

public class Main {
    public static void main(String[] args) {
        // 1. Menggunakan Default Constructor
        Barang barang1 = new Barang();

        // 2. Menggunakan Parameterized Constructor
        Barang barang2 = new Barang("Laptop Gaming", 15000000);

        // Menampilkan informasi kedua objek
        System.out.println("Info Barang 1:");
        barang1.tampilkanBarang();

        System.out.println("Info Barang 2:");
        barang2.tampilkanBarang();
    }
}
