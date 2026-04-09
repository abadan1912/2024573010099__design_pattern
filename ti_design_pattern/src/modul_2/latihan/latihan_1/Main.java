package modul_2.latihan.latihan_1;

public class Main {
    public static void main(String[] args) {
        // 1. Membuat object dari class Buku
        Buku buku1 = new Buku();

        // 2. Mengisi nilai atribut (judul dan pengarang)
        buku1.judul = "Laskar Pelangi";
        buku1.pengarang = "Andrea Hirata";

        // 3. Menampilkan nilai atribut tersebut
        System.out.println("Judul Buku: " + buku1.judul);
        System.out.println("Pengarang : " + buku1.pengarang);
    }
}
