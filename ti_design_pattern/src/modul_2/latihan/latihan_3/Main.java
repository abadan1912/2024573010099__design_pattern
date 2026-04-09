package modul_2.latihan.latihan_3;

public class Main {
    public static void main(String[] args) {
        AkunBank tabungan = new AkunBank(500000);

        // 1. Memanggil method public (Berhasil)
        tabungan.tampilkanSaldo();

        // 2. Mencoba akses atribut private secara langsung (Akan Error)
        // System.out.println(tabungan.saldo); // <--- Hapus komentar ini untuk melihat error
    }
}
