package modul_3.bagian_4.latihan.overloading;

public class Main {
    public static void main(String[] args) {
        Matematika mtk = new Matematika();

        // Menguji method tambah() 2 parameter int
        System.out.println("Hasil int + int     : " + mtk.tambah(10, 20));          // Output: 30

        // Menguji method tambah() 3 parameter int
        System.out.println("Hasil int + int + int : " + mtk.tambah(10, 20, 30));      // Output: 60

        // Menguji method tambah() 2 parameter double
        System.out.println("Hasil double + double : " + mtk.tambah(10.5, 20.5));      // Output: 31.0
    }
}
