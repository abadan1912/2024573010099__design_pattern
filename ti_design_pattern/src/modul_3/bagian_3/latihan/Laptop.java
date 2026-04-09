package modul_3.bagian_3.latihan;

class Laptop {
    private Processor processor;
    private RAM ram;

    // Constructor (composition: object dibuat di dalam)
    public Laptop() {
        processor = new Processor();
        ram = new RAM();
    }

    public void hidupkanLaptop() {
        System.out.println("Laptop dinyalakan...");
        processor.jalankan();
        ram.baca();
        ram.tulis();
    }
}
