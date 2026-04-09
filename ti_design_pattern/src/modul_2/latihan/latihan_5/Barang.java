package modul_2.latihan.latihan_5;

public class Barang {
    String namaBarang;
    double harga;

    // Default Constructor
    public Barang() {
        this.namaBarang = "Belum Ada Nama";
        this.harga = 0;
    }

    // Parameterized Constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public void tampilkanBarang() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga      : Rp" + harga);
        System.out.println("-----------------------");
    }
}
