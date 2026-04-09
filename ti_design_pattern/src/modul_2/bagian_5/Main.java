package modul_2.bagian_5;

public class Main {
    public static void main(String[] args) {
        // Menggunakan Default Constructor
        Person person1 = new Person();

        // Menggunakan Parameterized Constructor
        Person person2 = new Person("Budi", 25);

        person1.tampilkanInfo();
        person2.tampilkanInfo();
    }
}