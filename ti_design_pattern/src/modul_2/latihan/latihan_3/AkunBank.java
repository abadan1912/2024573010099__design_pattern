package modul_2.latihan.latihan_3;

public class AkunBank {
    // Atribut private hanya bisa diakses di dalam class ini sendiri
    private double saldo;

    // Constructor untuk mengisi saldo awal
    public AkunBank(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Method public agar saldo bisa dilihat dari luar secara aman
    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: Rp" + saldo);
    }
}
