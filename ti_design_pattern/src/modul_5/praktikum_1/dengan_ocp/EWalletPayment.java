package modul_5.praktikum_1.dengan_ocp;

public class EWalletPayment implements PaymentMethod {
    @Override
    public void process(double amount) {
        System.out.println("Processing E-Wallet payment of " + amount);
    }
}
