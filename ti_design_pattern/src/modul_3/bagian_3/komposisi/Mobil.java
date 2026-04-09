package modul_3.bagian_3.komposisi;

class Mobil {
    private final Mesin mesin; //composition

    public Mobil() {
        this.mesin = new Mesin(); //membuat objek mesin
    }

    void mulai() {
    mesin.hidupkan();
    System.out.println("Mobil siap digunakan.");
    }

    void berhenti() {
        mesin.matikan();
        System.out.println("Mobil berhenti");
    }
}
