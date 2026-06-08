package modul_4.praktikum_2.dengan_srp;

public class UserRepository {
    private static final String FOLDER_PATH = "src\\modul_4\\srp\\praktikum_2\\dengan_srp\\";
    private static final String DATABASE_FILE = "user.txt";

    public void save(User user) {
        java.io.File file = new java.io.File(FOLDER_PATH + DATABASE_FILE);

        try (java.io.FileWriter writer = new java.io.FileWriter(file, true)) {
            writer.write(user.getName() + " - " + user.getEmail() + "\n");
            System.out.println("Pengguna berhasil disimpan: " + user.getName());
        } catch (java.io.IOException e) {
            System.out.println("Gagal menyimpan pengguna: " + e.getMessage());
        }
    }
}
