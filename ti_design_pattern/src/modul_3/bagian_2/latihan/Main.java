package modul_3.bagian_2.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek motor baru
        Motor mtr1 = new Motor();

        // Mengisi data menggunakan Setter
        mtr1.setMerk("Honda Vario");
        mtr1.setTahun(2023);

        // Menampilkan data menggunakan Getter
        System.out.println("Merk Motor  : " + mtr1.getMerk());
        System.out.println("Tahun Keluar : " + mtr1.getTahun());
    }
}
