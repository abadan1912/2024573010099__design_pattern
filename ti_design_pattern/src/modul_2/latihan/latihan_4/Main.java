package modul_2.latihan.latihan_4;

public class Main {
    public static void main(String[] args) {
        // Membuat object dari class Mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // Menggunakan setter untuk mengisi nilai atribut
        mhs.setNama("Budi Santoso");
        mhs.setNim("220101234");

        // Menampilkan nilai menggunakan getter
        System.out.println("Nama Mahasiswa : " + mhs.getNama());
        System.out.println("NIM Mahasiswa  : " + mhs.getNim());
    }
}
