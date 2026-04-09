package modul_3.bagian_5.Latihan;

public class Ikan extends HewanAir implements Berenang {

    public Ikan(String nama) {
        this.nama = nama;
    }

    // Implementasi dari interface Berenang
    @Override
    public void berenang() {
        System.out.println(nama + " berenang dengan lincah di air.");
    }

    // Implementasi dari abstract class HewanAir
    @Override
    void makan() {
        System.out.println(nama + " sedang makan pelet.");
    }
}
