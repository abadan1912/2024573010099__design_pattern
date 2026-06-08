package modul_4.latihan;

public class OrderPrinter {
    public void printReceipt(Order order) {
        System.out.println("\n📄 STRUK PESANAN");
        System.out.println("----------------------------");
        System.out.println("Produk      : " + order.getProduct());
        System.out.println("Jumlah      : " + order.getQuantity());
        System.out.println("Harga Satuan: Rp" + order.getPrice());
        System.out.println("Total Harga : Rp" + order.calculateTotal());
        System.out.println("----------------------------");
    }
}
