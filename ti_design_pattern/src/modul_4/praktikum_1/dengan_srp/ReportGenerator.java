package modul_4.praktikum_1.dengan_srp;

public class ReportGenerator {
    private final String content;

    public ReportGenerator(String content) {
        this.content = content;
    }

    public String generateReport() {
        return "=== LAPORAN ===\n" + content + "\n=====================";
    }
}
