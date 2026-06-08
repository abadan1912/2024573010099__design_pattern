# LAPORAN PRAKTIKUM 6
## Liskov Substitution Principle (LSP)

Nama        : Abadan Syakira  
NIM         : 2024573010099  
Kelas       : TI 2A  
Mata Kuliah : Praktikum Design Pattern  
Tanggal Praktikum : 08 Juni 2026

---

# 1. Pendahuluan

## 1.1 Latar Belakang

Dalam pengembangan perangkat lunak berorientasi objek, pewarisan (inheritance) merupakan salah satu mekanisme yang paling sering digunakan untuk membangun hierarki kelas. Namun, pewarisan yang tidak dirancang dengan hati-hati dapat menimbulkan perilaku yang tidak terduga ketika objek dari subclass digunakan untuk menggantikan objek dari superclass-nya. Permasalahan inilah yang menjadi inti dari prinsip ketiga dalam kumpulan SOLID Principles, yaitu Liskov Substitution Principle (LSP).

LSP, yang pertama kali diperkenalkan oleh Barbara Liskov pada tahun 1987, menyatakan bahwa objek dari sebuah superclass harus dapat digantikan dengan objek dari subclass-nya tanpa mengubah kebenaran atau keandalan program. Dengan kata lain, setiap subclass harus mampu memenuhi kontrak perilaku yang telah dijanjikan oleh superclass-nya. Pelanggaran terhadap prinsip ini seringkali muncul dalam bentuk subclass yang meng-override metode dengan cara yang mengubah perilaku yang diharapkan, atau melempar exception yang tidak diantisipasi oleh kode pengguna.

Pemahaman mendalam terhadap LSP menjadi fondasi yang sangat penting sebelum memasuki materi Design Pattern yang lebih lanjut, karena banyak pola desain yang pada dasarnya merupakan solusi terstruktur untuk masalah-masalah yang muncul akibat pelanggaran prinsip ini.

## 1.2 Tujuan Praktikum

1. Memahami definisi dan konsep dasar Liskov Substitution Principle (LSP) dalam paradigma pemrograman berorientasi objek.
2. Mengidentifikasi dan menganalisis pelanggaran LSP beserta dampak negatif yang ditimbulkannya terhadap sistem.
3. Mengimplementasikan solusi berbasis LSP menggunakan mekanisme interface dan pemisahan hierarki kelas yang tepat.
4. Membandingkan perilaku program sebelum dan sesudah penerapan LSP untuk memahami perbedaan secara konkret.
5. Menerapkan prinsip LSP dalam kasus latihan yang lebih kompleks dengan melibatkan hierarki kendaraan (Vehicle).

---

# 2. Landasan Teori

## 2.1 Liskov Substitution Principle (LSP)

Liskov Substitution Principle adalah prinsip yang menyatakan: *"If S is a subtype of T, then objects of type T may be replaced with objects of type S without altering any of the desirable properties of the program."* Dalam konteks Java, prinsip ini berarti bahwa kode yang beroperasi menggunakan referensi superclass harus dapat berjalan dengan benar tanpa perlu mengetahui bahwa di baliknya terdapat objek dari subclass tertentu.

## 2.2 Pelanggaran LSP

Sebuah implementasi dikatakan melanggar LSP apabila:
- **Perubahan Perilaku yang Tidak Diharapkan**: Subclass meng-override metode dengan cara yang mengubah kontrak perilaku yang dijanjikan superclass.
- **Pelemparan Exception Baru**: Subclass melempar exception yang tidak dideklarasikan atau tidak diantisipasi oleh kontrak superclass.
- **Penguatan Prasyarat (Precondition)**: Subclass memberlakukan prasyarat yang lebih ketat dibanding superclass.
- **Pelemahan Pascasyarat (Postcondition)**: Subclass memberikan jaminan yang lebih lemah setelah eksekusi metode dibanding superclass.

## 2.3 Interface sebagai Solusi LSP

Salah satu pendekatan paling efektif untuk mematuhi LSP adalah dengan mengganti hierarki pewarisan yang bermasalah menggunakan **Interface**. Dengan mendefinisikan kontrak perilaku melalui interface, setiap kelas implementasi bebas menentukan detail internalnya sendiri tanpa harus mewarisi state atau perilaku dari kelas induk yang tidak relevan. Pendekatan ini menghasilkan hierarki yang lebih datar dan kontrak yang lebih jelas antar komponen sistem.

## 2.4 Prinsip "Design by Contract"

LSP berkaitan erat dengan konsep *Design by Contract*, yaitu pandangan bahwa setiap komponen perangkat lunak memiliki kontrak berupa prasyarat yang harus dipenuhi sebelum pemanggilan dan pascasyarat yang dijamin setelah pemanggilan. Subclass yang baik harus memperluas kontrak ini, bukan mempersempitnya, sehingga kode pengguna tidak perlu melakukan pengecekan tipe objek secara eksplisit.

---

# 3. Analisis Praktikum

## 3.1 Praktikum 1 — Rectangle dan Square

### 3.1.1 Implementasi Tanpa LSP

#### Rectangle.java
```java
package modul_6.praktikum_1.tanpa_lsp;

public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}
```
Berkas ini mendefinisikan kelas `Rectangle` sebagai representasi dari sebuah persegi panjang. Kelas ini memiliki dua atribut `protected` yaitu `width` dan `height`, yang dapat dimodifikasi secara independen melalui masing-masing metode setter-nya. Kontrak implisit yang dijanjikan oleh kelas ini adalah bahwa `setWidth()` hanya akan mengubah nilai `width`, dan `setHeight()` hanya akan mengubah nilai `height`, sehingga `calculateArea()` akan selalu mengembalikan hasil perkalian antara keduanya secara terpisah.

#### Square.java
```java
package modul_6.praktikum_1.tanpa_lsp;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Violation: Merubah property height
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height); // Violation: Merubah property width
    }
}
```
Berkas ini merupakan subclass dari `Rectangle` yang merepresentasikan persegi. Karena sebuah persegi memiliki sisi yang sama, kelas ini meng-override kedua metode setter sedemikian rupa sehingga setiap perubahan pada `width` secara otomatis juga mengubah `height`, begitu pula sebaliknya. Secara matematis hal ini masuk akal, namun secara kontrak pewarisan inilah yang menjadi akar masalah pelanggaran LSP.

#### Main.java
```java
package modul_6.praktikum_1.tanpa_lsp;

public class Main {
    public static void testRectangle(Rectangle r) {
        r.setWidth(5);
        r.setHeight(4);
        System.out.println("Hasil yang diharapkan: 20, Hasil output: " + r.calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        testRectangle(rect); // Hasilnya benar

        Rectangle square = new Square();
        testRectangle(square); // Gagal! Nilai yang di outputkan 16, seharusnya 20
    }
}
```
Berkas ini mengekspos pelanggaran LSP secara langsung. Metode `testRectangle()` dirancang berdasarkan asumsi kontrak dari `Rectangle`, yaitu bahwa `setWidth(5)` dan `setHeight(4)` akan menghasilkan area sebesar 20. Ketika sebuah objek `Rectangle` asli digunakan, hasilnya benar. Namun ketika objek `Square` yang dimasukkan melalui referensi `Rectangle`, pemanggilan `setHeight(4)` secara diam-diam menimpa nilai `width` menjadi 4 juga, sehingga `calculateArea()` mengembalikan 16 bukan 20. Analisis ini membuktikan bahwa `Square` tidak dapat menggantikan `Rectangle` dengan aman — sebuah pelanggaran LSP yang nyata.

---

### 3.1.2 Implementasi Dengan LSP

#### Shape.java
```java
package modul_6.praktikum_1.dengan_lsp;

public interface Shape {
    int calculateArea();
}
```
Berkas ini mendefinisikan sebuah interface `Shape` yang menjadi kontrak umum bagi semua bangun datar. Interface ini hanya memandatkan satu kemampuan, yaitu `calculateArea()`, tanpa mempedulikan bagaimana masing-masing bangun datar menghitung luasnya. Keputusan desain untuk menggunakan interface di sini sangat krusial, karena interface tidak membawa state atau implementasi bawaan yang dapat disalahgunakan oleh kelas implementasi.

#### Rectangle.java
```java
package modul_6.praktikum_1.dengan_lsp;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return width * height;
    }
}
```
Berkas ini mendefinisikan ulang kelas `Rectangle` sebagai implementasi dari interface `Shape`. Perubahan yang paling signifikan adalah penggunaan akses modifier `private` pada kedua atribut dan penghilangan metode `setWidth()` serta `setHeight()`. Nilai dimensi kini ditetapkan satu kali melalui konstruktor dan tidak dapat diubah lagi. Desain ini memastikan bahwa kontrak `calculateArea()` tidak pernah bisa dilanggar oleh subclass manapun karena tidak ada lagi hierarki pewarisan yang bermasalah.

#### Square.java
```java
package modul_6.praktikum_1.dengan_lsp;

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}
```
Berkas ini mendefinisikan `Square` sebagai entitas yang sepenuhnya independen, bukan sebagai turunan dari `Rectangle`. Kelas ini mengimplementasikan interface `Shape` secara langsung dengan atribut `side` yang mencerminkan sifat alami sebuah persegi. Analisis terhadap desain ini menunjukkan bahwa pemisahan hierarki adalah solusi yang tepat. `Square` bukanlah jenis `Rectangle`; keduanya hanyalah jenis `Shape` yang berbeda.

#### Main.java
```java
package modul_6.praktikum_1.dengan_lsp;

public class Main {
    public static void printArea(Shape shape) {
        System.out.println("Luas: " + shape.calculateArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(4);

        printArea(rectangle); // Luas: 20
        printArea(square);     // Luas: 16
    }
}
```
Berkas ini mendemonstrasikan keberhasilan penerapan LSP. Metode `printArea()` kini menerima tipe `Shape` sebagai parameternya, dan baik `Rectangle` maupun `Square` dapat diteruskan ke metode ini tanpa menyebabkan perilaku yang tidak terduga. Analisis terhadap output menunjukkan bahwa kedua objek menghasilkan nilai luas yang benar sesuai dengan definisi matematisnya masing-masing. Kode pengguna tidak perlu lagi mengkhawatirkan detail implementasi internal dari setiap bangun datar.

---

## 3.2 Praktikum 2 — Social Media Post

### 3.2.1 Implementasi Tanpa LSP

#### SocialMediaPost.java
```java
package modul_6.praktikum_2.tanpa_lsp;

class SocialMediaPost {
    protected String content;

    public SocialMediaPost(String content) {
        this.content = content;
    }

    public void publish() {
        System.out.println("Publishing post: " + content);
    }

    public int calculateMaxCharacters() {
        return 1000; // Batas karakter
    }
}
```
Berkas ini mendefinisikan kelas dasar `SocialMediaPost`. Kontrak yang dibangun oleh kelas ini cukup sederhana: metode `publish()` selalu berhasil mencetak konten, dan `calculateMaxCharacters()` mengembalikan batas 1000 karakter. Kelas ini tidak memodelkan kondisi kegagalan apapun, sehingga kode pengguna yang dibangun di atas kelas ini tidak akan mengantisipasi adanya exception saat memanggil `publish()`.

#### BlogPost.java
```java
package modul_6.praktikum_2.tanpa_lsp;

public class BlogPost extends SocialMediaPost {
    private boolean isDraft;

    public BlogPost(String content) {
        super(content);
        this.isDraft = true;
    }

    @Override
    public void publish() {
        if (!isDraft) {
            throw new IllegalStateException("Blog ini sudah di publish!");
        }
        isDraft = false;
        super.publish();
    }

    public void editContent(String newContent) {
        if (!isDraft) {
            throw new IllegalStateException("Blog yang sudah di publish tidak bisa diedit!");
        }
        this.content = newContent;
    }
}
```
Berkas ini menghadirkan pelanggaran LSP yang pertama. `BlogPost` meng-override metode `publish()` dengan menambahkan mekanisme state (`isDraft`) dan melempar `IllegalStateException` apabila `publish()` dipanggil lebih dari sekali. Hal ini melanggar kontrak superclass yang menjamin `publish()` selalu dapat dieksekusi tanpa kondisi khusus. Kode pengguna yang menggunakan referensi `SocialMediaPost` tidak akan pernah mengantisipasi exception tersebut karena superclass tidak pernah mendefinisikannya.

#### TwitterPost.java
```java
package modul_6.praktikum_2.tanpa_lsp;

public class TwitterPost extends SocialMediaPost {
    public TwitterPost(String content) {
        super(content);
    }

    @Override
    public int calculateMaxCharacters() {
        return 280; // Batas karakter twitter
    }

    @Override
    public void publish() {
        if (content.length() > calculateMaxCharacters()) {
            throw new IllegalArgumentException("Tweet melebihi batas karakter!");
        }
        System.out.println("Posting tweet: " + content);
    }
}
```
Berkas ini menghadirkan pelanggaran LSP yang kedua. `TwitterPost` meng-override `publish()` dengan menambahkan pengecekan panjang karakter dan melempar `IllegalArgumentException` jika batas terlampaui. Superclass sama sekali tidak mendefinisikan kondisi kegagalan ini. Akibatnya, kode pengguna yang memanggil `publish()` pada referensi `SocialMediaPost` tidak dapat memprediksi apakah operasi akan berhasil atau gagal dengan exception yang berbeda-beda tergantung tipe objek sesungguhnya.

#### Main.java
```java
package modul_6.praktikum_2.tanpa_lsp;

public class Main {
    public static void sharePost(SocialMediaPost post) {
        try {
            post.publish();
            System.out.println("Maksimum karakter: " + post.calculateMaxCharacters());
        } catch (Exception e) {
            System.out.println("Gagal membagi: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SocialMediaPost tweet = new TwitterPost("Halo Twitter!");
        SocialMediaPost longTweet = new TwitterPost("Tweet ini sangat panjang, dan melebihi batas karakter...".repeat(10));
        SocialMediaPost blog = new BlogPost("Modul 6 - Liskov Substitution Principle");

        System.out.println("Memposting tweet yang valid:");
        sharePost(tweet);

        System.out.println("\nMemposting tweet yang tidak valid:");
        sharePost(longTweet); // Throws exception

        System.out.println("\nMemposting blog:");
        sharePost(blog);

        System.out.println("\nMemposting blog sekali lagi:");
        sharePost(blog); // Throws different exception
    }
}
```
Berkas ini mengekspos dampak nyata dari pelanggaran LSP pada level kode pengguna. Perlu dicatat bahwa metode `sharePost()` terpaksa menggunakan blok `try-catch` untuk menangani exception yang seharusnya tidak ada jika kontrak superclass dihormati. Ini merupakan sinyal kuat bahwa ada yang salah pada hierarki pewarisan. Analisis terhadap skenario pengujian menunjukkan bahwa pemanggilan `sharePost(blog)` yang kedua akan gagal dengan exception yang berbeda dari `sharePost(longTweet)`, membuktikan bahwa kode pengguna harus "mengetahui" tipe asli objek untuk menangani kegagalan dengan benar — sesuatu yang bertentangan dengan semangat LSP.

---

### 3.2.2 Implementasi Dengan LSP

#### Publishable.java
```java
package modul_6.praktikum_2.dengan_lsp;

public interface Publishable {
    void publish();
    boolean canPublish();
    int getMaxContentLength();
}
```
Berkas ini merupakan jantung dari solusi berbasis LSP. Interface `Publishable` mendefinisikan kontrak yang jauh lebih kaya dibanding superclass sebelumnya. Penambahan metode `canPublish()` adalah keputusan desain yang paling krusial, karena metode ini menyediakan mekanisme resmi bagi kode pengguna untuk memeriksa kelayakan publikasi sebelum memanggil `publish()`. Dengan demikian, tidak ada lagi alasan bagi implementasi manapun untuk melempar exception secara mengejutkan dari dalam `publish()`.

#### SocialPost.java
```java
package modul_6.praktikum_2.dengan_lsp;

public class SocialPost implements Publishable {
    protected String content;

    public SocialPost(String content) {
        this.content = content;
    }

    @Override
    public void publish() {
        System.out.println("Publishing: " + content);
    }

    @Override
    public boolean canPublish() {
        return content.length() <= getMaxContentLength();
    }

    @Override
    public int getMaxContentLength() {
        return 1000;
    }
}
```
Berkas ini mendefinisikan implementasi dasar dari interface `Publishable` untuk postingan umum. Analisis terhadap implementasi `canPublish()` menunjukkan bahwa validasi panjang konten kini dilakukan secara standar melalui metode yang sudah menjadi bagian dari kontrak. Pola ini memungkinkan kode pengguna untuk selalu memanggil `canPublish()` terlebih dahulu sebelum `publish()`, tanpa perlu khawatir dengan tipe konkret dari objek yang dihadapinya.

#### BlogPost.java
```java
package modul_6.praktikum_2.dengan_lsp;

public class BlogPost implements Publishable {
    private String content;
    private boolean isPublished;

    public BlogPost(String content) {
        this.content = content;
        this.isPublished = false;
    }

    @Override
    public void publish() {
        if (isPublished) {
            return; // Idempotent operation
        }
        isPublished = true;
        System.out.println("Publishing blog: " + content);
    }

    @Override
    public boolean canPublish() {
        return !isPublished;
    }

    @Override
    public int getMaxContentLength() {
        return Integer.MAX_VALUE; // No practical limit
    }

    public void editContent(String newContent) {
        if (isPublished) {
            System.out.println("Adding update to published blog");
        }
        this.content = newContent;
    }
}
```
Berkas ini mendemonstrasikan cara yang tepat dalam menangani state yang kompleks tanpa melanggar LSP. Perbaikan paling signifikan terletak pada metode `publish()` yang kini bersifat *idempotent*, yaitu mengembalikan nilai diam-diam (`return`) jika sudah dipublikasikan, bukan melempar exception. Kondisi "sudah dipublikasikan" kini dikomunikasikan dengan benar melalui `canPublish()` yang mengembalikan `false`. Analisis ini menunjukkan bahwa LSP tidak berarti semua implementasi harus identik, melainkan setiap implementasi harus menghormati kontrak yang telah disepakati.

#### TwitterPost.java
```java
package modul_6.praktikum_2.dengan_lsp;

public class TwitterPost implements Publishable {
    private static final int MAX_LENGTH = 280;
    private String content;

    public TwitterPost(String content) {
        this.content = content;
    }

    @Override
    public void publish() {
        if (!canPublish()) {
            throw new IllegalArgumentException("Tweet exceeds " + MAX_LENGTH + " characters");
        }
        System.out.println("Posting tweet: " + content);
    }

    @Override
    public boolean canPublish() {
        return content.length() <= MAX_LENGTH;
    }

    @Override
    public int getMaxContentLength() {
        return MAX_LENGTH;
    }
}
```
Berkas ini menunjukkan bahwa exception tidak sepenuhnya dilarang dalam desain berbasis LSP, asalkan kode pengguna memiliki cara resmi untuk menghindarinya. Pada versi ini, kode pengguna selalu dapat memanggil `canPublish()` terlebih dahulu sebelum `publish()`. Jika `canPublish()` mengembalikan `false`, exception tidak akan pernah terlempar karena `publish()` tidak akan dipanggil. Dengan kata lain, exception yang ada kini bersifat defensif, bukan mengejutkan.

#### Main.java
```java
package modul_6.praktikum_2.dengan_lsp;

public class Main {
    public static void sharePost(Publishable post) {
        if (post.canPublish()) {
            post.publish();
            System.out.println("Max length: " + post.getMaxContentLength());
        } else {
            System.out.println("Cannot publish this post now");
        }
    }

    public static void main(String[] args) {
        Publishable tweet = new TwitterPost("Hello Twitter!");
        Publishable longTweet = new TwitterPost("This is way too long...".repeat(20));
        Publishable blog = new BlogPost("My thoughts on clean code");

        System.out.println("Sharing valid tweet:");
        sharePost(tweet);

        System.out.println("\nSharing invalid tweet:");
        sharePost(longTweet);

        System.out.println("\nSharing blog post:");
        sharePost(blog);

        System.out.println("\nSharing blog post again:");
        sharePost(blog);  // Now handles gracefully

        System.out.println("\nEditing published blog:");
        ((BlogPost)blog).editContent("Updated thoughts on clean code");
    }
}
```
Berkas ini membuktikan elegansnya solusi berbasis LSP secara menyeluruh. Metode `sharePost()` kini tidak lagi memerlukan blok `try-catch` karena alur kontrol yang jelas melalui `canPublish()`. Setiap skenario pengujian, termasuk tweet yang terlalu panjang dan blog yang dipublikasikan dua kali, kini ditangani dengan mulus melalui alur `if-else` yang bersih. Kode pengguna tidak perlu mengetahui apapun tentang tipe konkret dari objek `Publishable` yang diterimanya, yang merupakan inti dari prinsip substitusi Liskov.

---

## 3.3 Latihan — Sistem Kendaraan (Vehicle)

### Vehicle.java
```java
package modul_6.latihan.Solusi;

public abstract class Vehicle implements Navigable {
    @Override
    public abstract void navigateTo(String destination);
}
```
Berkas ini mendefinisikan kelas abstrak `Vehicle` yang sekaligus mengimplementasikan interface `Navigable`. Desain ini menetapkan bahwa setiap kendaraan pada dasarnya adalah entitas yang dapat bernavigasi. Dengan mendeklarasikan `navigateTo()` sebagai metode abstrak, kelas ini memaksa setiap subclass konkret untuk memberikan implementasi navigasi yang spesifik sesuai dengan karakteristik kendaraannya masing-masing.

### Navigable.java
```java
package modul_6.latihan.Solusi;

public interface Navigable {
    void navigateTo(String destination);
}
```
Berkas ini merupakan interface dasar yang mendefinisikan kemampuan navigasi. Interface ini sengaja dibuat sesederhana mungkin untuk memastikan bahwa setiap entitas yang mampu bernavigasi — baik yang bermesin maupun tidak — dapat mengimplementasikannya. Keputusan untuk memisahkan kemampuan navigasi ke dalam interface tersendiri adalah pondasi dari solusi LSP pada latihan ini.

### EngineVehicle.java
```java
package modul_6.latihan.Solusi;

public interface EngineVehicle extends Navigable {
    void startEngine();
}
```
Berkas ini mendefinisikan interface `EngineVehicle` yang memperluas `Navigable` dengan kemampuan tambahan berupa `startEngine()`. Analisis terhadap hierarki interface ini menunjukkan pemikiran desain yang sangat matang. Kendaraan bermesin adalah kendaraan yang dapat bernavigasi, namun tidak semua kendaraan yang dapat bernavigasi memiliki mesin. Pemisahan ini mencegah kelas seperti `Bicycle` dipaksa untuk mengimplementasikan metode `startEngine()` yang tidak relevan baginya — sebuah masalah yang dikenal sebagai Interface Segregation Principle (ISP) yang juga berkaitan erat dengan LSP.

### Bicycle.java
```java
package modul_6.latihan.Solusi;

public class Bicycle extends Vehicle {
    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating BIKE route to " + destination);
        System.out.println("Following bike-friendly path to " + destination);
    }
}
```
Berkas ini mendefinisikan kelas `Bicycle` yang hanya mewarisi `Vehicle` tanpa mengimplementasikan `EngineVehicle`. Analisis terhadap implementasi `navigateTo()` menunjukkan bahwa sepeda memberikan jalur navigasi yang spesifik untuk pesepeda (`bike-friendly path`), yang secara logis berbeda dari rute kendaraan bermotor. Kelas ini dengan sempurna mematuhi LSP karena dapat digunakan di mana saja `Navigable` atau `Vehicle` diharapkan, dan perilakunya sepenuhnya dapat diprediksi.

### Car.java
```java
package modul_6.latihan.Solusi;

public class Car extends Vehicle implements EngineVehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Calculating Car route to " + destination);
        System.out.println("Following Car route to " + destination);
    }
}
```
Berkas ini mendefinisikan kelas `Car` yang mewarisi `Vehicle` sekaligus mengimplementasikan `EngineVehicle`. Dengan demikian, `Car` memiliki dua kapabilitas: kemampuan navigasi umum (dari `Vehicle`/`Navigable`) dan kemampuan menghidupkan mesin (dari `EngineVehicle`). Analisis terhadap desain ini menunjukkan bahwa setiap kapabilitas didefinisikan secara eksplisit melalui kontrak yang terpisah, sehingga tidak ada ambiguitas mengenai kemampuan apa yang dimiliki oleh setiap tipe kendaraan.

### Main.java
```java
package modul_6.latihan.Solusi;

public class Main {
    public static void beginMotorizedTrip(EngineVehicle vehicle, String destination) {
        vehicle.startEngine();
        vehicle.navigateTo(destination);
    }

    public static void beginTrip(Navigable vehicle, String destination) {
        vehicle.navigateTo(destination);
    }

    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();

        System.out.println("=== Car Trip ===");
        beginMotorizedTrip(car, "Central Park");

        System.out.println("\n=== Bike Trip ===");
        beginTrip(bike, "Central Park");
    }
}
```
Berkas ini merupakan bukti akhir dari keberhasilan desain berbasis LSP. Metode `beginMotorizedTrip()` secara eksplisit mensyaratkan `EngineVehicle`, sehingga kompiler sendiri yang akan menolak jika seseorang mencoba meneruskan `Bicycle` ke dalam metode tersebut. Sebaliknya, metode `beginTrip()` menerima `Navigable`, yang berarti baik `Car` maupun `Bicycle` dapat digunakan secara bergantian tanpa masalah. Analisis ini menunjukkan bahwa dengan desain interface yang tepat, aturan substitusi dapat ditegakkan baik oleh kompiler maupun oleh struktur kode itu sendiri, bukan hanya oleh disiplin programmer.

---

# 4. Hasil dan Pembahasan

Rangkaian praktikum pada Modul 6 ini secara konsisten membuktikan bahwa pelanggaran Liskov Substitution Principle tidak selalu tampak sebagai kesalahan yang jelas pada tahap perancangan, namun baru akan manifes sebagai perilaku program yang tidak terduga pada saat dieksekusi. Pada praktikum pertama, relasi pewarisan `Square extends Rectangle` terlihat logis secara intuitif karena dalam matematika setiap persegi memang adalah persegi panjang. Namun analisis terhadap implementasinya mengungkap bahwa pewarisan tersebut mengorbankan keandalan kontrak setter. Ketika metode `testRectangle()` yang dibangun berdasarkan asumsi `Rectangle` menerima objek `Square`, logika internal yang menyamakan `width` dan `height` secara diam-diam menghancurkan ekspektasi kode pengguna dan menghasilkan output yang salah.

Solusi yang diterapkan dengan memisahkan `Rectangle` dan `Square` menjadi dua implementasi independen dari interface `Shape` membuktikan bahwa hubungan "is-a" dalam domain pemrograman tidak selalu harus diterjemahkan dengan pewarisan. Keduanya adalah "bentuk yang dapat dihitung luasnya", dan itulah satu-satunya kontrak yang perlu mereka penuhi bersama. Pembahasan pada praktikum kedua memperkuat kesimpulan ini dengan memperlihatkan dimensi pelanggaran LSP yang berbeda, yaitu munculnya exception yang tidak terantisipasi. Kelas `BlogPost` dan `TwitterPost` yang meng-override `publish()` dengan melempar exception memaksa kode pengguna untuk menggunakan blok `try-catch` sebagai penopang, yang sejatinya adalah tanda bahwa hierarki pewarisan tidak dirancang dengan benar.

Penerapan interface `Publishable` yang dilengkapi metode `canPublish()` terbukti menjadi solusi yang elegan karena memindahkan tanggung jawab pengecekan kondisi dari dalam metode `publish()` ke dalam kontrak antarmuka itu sendiri. Kode pengguna tidak lagi perlu menangani exception yang berbeda-beda per tipe objek; cukup dengan memeriksa `canPublish()` terlebih dahulu, alur program dapat berjalan dengan bersih dan dapat diprediksi untuk semua implementasi. Pada latihan kendaraan, penggunaan dua interface terpisah yaitu `Navigable` dan `EngineVehicle` memperlihatkan bagaimana LSP dapat ditegakkan secara struktural pada level kompiler. `Bicycle` yang tidak memiliki mesin tidak pernah bisa diteruskan ke `beginMotorizedTrip()`, bukan karena ada pemeriksaan tipe eksplisit, melainkan karena sistem tipe Java sendiri yang mencegahnya.

---

# 5. Kesimpulan

Praktikum ini memberikan pemahaman yang mendalam dan berbasis bukti bahwa Liskov Substitution Principle bukan sekadar aturan teoretis, melainkan merupakan panduan praktis yang memiliki dampak langsung terhadap keandalan dan keterpeliharaan perangkat lunak. Pelanggaran LSP, baik melalui pengubahan perilaku setter seperti pada kasus `Square`, maupun melalui pelemparan exception yang tidak terduga seperti pada kasus `BlogPost`, terbukti menghasilkan kode yang rapuh dan sulit diprediksi. Sebaliknya, penerapan LSP melalui penggunaan interface yang dirancang dengan kontrak yang jelas menghasilkan kode yang kokoh, fleksibel, dan tidak memerlukan pengecekan tipe eksplisit dari kode pengguna. Pemahaman ini menjadi bekal yang sangat penting untuk melangkah ke materi Design Pattern yang memanfaatkan prinsip substitusi ini sebagai salah satu pilar utamanya.

---

# 6. Saran

Sebagai langkah pengembangan lebih lanjut, sangat disarankan untuk mengeksplorasi keterkaitan antara LSP dengan prinsip SOLID lainnya, khususnya Interface Segregation Principle (ISP), karena keduanya seringkali menjadi solusi yang saling melengkapi dalam menangani masalah hierarki pewarisan yang bermasalah. Mahasiswa juga disarankan untuk membiasakan diri melakukan analisis kontrak secara eksplisit sebelum merancang hierarki kelas, dengan bertanya: "Apakah setiap operasi yang berlaku pada superclass dapat berjalan dengan benar jika dilakukan pada subclass?" Latihan dengan pembuatan unit test untuk memverifikasi kepatuhan LSP juga akan sangat bermanfaat, karena kasus seperti `testRectangle()` pada praktikum ini pada dasarnya adalah bentuk paling sederhana dari pengujian semacam itu.

---

# Daftar Pustaka

Gamma, E., Helm, R., Johnson, R., & Vlissides, J. (1994). *Design Patterns: Elements of Reusable Object-Oriented Software*. Addison-Wesley Professional.

Goodfellow, I., Bengio, Y., & Courville, A. (2016). *Deep Learning*. MIT Press.

Liskov, B. H., & Wing, J. M. (1994). A behavioral notion of subtyping. *ACM Transactions on Programming Languages and Systems (TOPLAS)*, 16(6), 1811–1841. https://doi.org/10.1145/197320.197383

Martin, R. C. (2002). *Agile Software Development: Principles, Patterns, and Practices*. Prentice Hall.

Martin, R. C. (2017). *Clean Architecture: A Craftsman's Guide to Software Structure and Design*. Prentice Hall.

Martin, R. C. (2008). *Clean Code: A Handbook of Agile Software Craftsmanship*. Prentice Hall.

Russell, S., & Norvig, P. (2020). *Artificial Intelligence: A Modern Approach* (4th ed.). Pearson.

Shalloway, A., & Trott, J. R. (2004). *Design Patterns Explained: A New Perspective on Object-Oriented Design* (2nd ed.). Addison-Wesley Professional.

Suyanto. (2014). *Artificial Intelligence: Searching, Reasoning, Planning, dan Learning*. Informatika Bandung.

Weisfeld, M. (2013). *The Object-Oriented Thought Process* (4th ed.). Addison-Wesley Professional.
