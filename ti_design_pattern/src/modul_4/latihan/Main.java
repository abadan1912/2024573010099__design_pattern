package modul_4.latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Masukkan nama produk: ");
        String product = scanner.nextLine();
        System.out.print("Masukkan jumlah: ");
        int quantity = scanner.nextInt();
        System.out.print("Masukkan harga satuan: ");
        double price = scanner.nextDouble();

        // Inisialisasi Objek
        Order order = new Order(product, quantity, price);
        OrderRepository repository = new OrderRepository();
        OrderPrinter printer = new OrderPrinter();

        // Eksekusi sesuai tanggung jawab masing-masing
        repository.saveToFile(order);
        printer.printReceipt(order);
    }
}
