package modul_3.bagian_4.latihan.overriding;

class Lingkaran extends BangunDatar {
    double r;

    Lingkaran(double r) {
        this.r = r;
    }

    @Override
    double hitungLuas() {
        return Math.PI * r * r;
    }
}
