package modul_3.bagian_3.pewarisan;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        // Mengisi atribut yang diwarisi dari Kendaraan
        mobil1.merk = "Toyota";
        mobil1.tahun = 2021;

        // Mengisi atribut asli milik Mobil
        mobil1.jumlahPintu = 4;

        // Memanggil metode untuk menampilkan info lengkap
        mobil1.displayInfoMobil();
    }
}
