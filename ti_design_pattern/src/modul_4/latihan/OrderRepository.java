package modul_4.latihan;

import java.io.FileWriter;
import java.io.IOException;

public class OrderRepository {
    public void saveToFile(Order order) {
        try (FileWriter writer = new FileWriter("orders.txt", true)) {
            String data = order.getProduct() + " - " + order.getQuantity() +
                    " - Rp" + order.calculateTotal() + "\n";
            writer.write(data);
            System.out.println("Sistem: Pesanan berhasil disimpan ke file.");
        } catch (IOException e) {
            System.out.println("Sistem: Gagal menyimpan pesanan: " + e.getMessage());
        }
    }
}