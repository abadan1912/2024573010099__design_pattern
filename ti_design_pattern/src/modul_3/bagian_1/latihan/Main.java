package modul_3.bagian_1.latihan;

public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku();
        buku1.judul = "Animal Farm";
        buku1.penulis = "George Orwell";
        buku1.tahunTerbit = 2023;

        buku1.displayInfo();
    }
}