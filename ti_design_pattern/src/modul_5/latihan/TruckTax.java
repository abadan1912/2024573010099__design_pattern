package modul_5.latihan;

public class TruckTax implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.15;
    }
}
