package modul_5.praktikum_2.tanpa_ocp;

public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("Regular Customer Discount: " +
                calculator.calculateDiscount("Regular", 100));

        System.out.println("Premium Customer Discount: " +
                calculator.calculateDiscount("Premium", 100));
    }
}
