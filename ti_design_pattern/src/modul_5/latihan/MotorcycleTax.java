package modul_5.latihan;

public class MotorcycleTax implements TaxStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.05;
    }
}
