package modul_5.latihan;

public class CarTax implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.1;
    }
}
