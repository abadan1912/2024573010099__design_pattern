package modul_4.praktikum_2.dengan_srp;

public class EmailService {
    public void sendWelcomeEmail(User user) {
        System.out.println("\nMengirim email ke " + user.getEmail() + "...");
        System.out.println("Halo " + user.getName() + ", selamat datang di sistem kami!\n");
    }
}
