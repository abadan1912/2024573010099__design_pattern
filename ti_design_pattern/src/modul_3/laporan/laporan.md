# LAPORAN PRAKTIKUM 3
## Review 4 Pillar Object Oriented Programming (OOP)

Nama        : Abadan Syakira  
NIM         : 2024573010099  
Kelas       : TI 2A  
Mata Kuliah : Praktikum Design Pattern  
Tanggal Praktikum : 06 April 2026

---

# 1. Pendahuluan

## 1.1 Latar Belakang

Setelah memahami sintaks dasar Java pada praktikum sebelumnya, tahap selanjutnya yang sangat krusial sebelum memasuki materi Design Pattern adalah menguasai konsep Object-Oriented Programming (OOP). OOP merupakan paradigma pemrograman yang berorientasi pada objek, di mana data dan fungsi dibungkus dalam satu kesatuan unit.

Penerapan Design Pattern pada dasarnya adalah pemanfaatan tingkat lanjut dari pilar-pilar OOP untuk menyelesaikan masalah desain perangkat lunak yang umum terjadi. Oleh karena itu, peninjauan kembali terhadap konsep enkapsulasi, pewarisan, polimorfisme, dan abstraksi sangat diperlukan agar praktikan mampu membangun fondasi kode yang fleksibel, dapat digunakan kembali (reusable), dan mudah dipelihara.

## 1.2 Tujuan Praktikum

1. Memahami konsep Class dan Object sebagai unit dasar dalam pemrograman Java.
2. Mengimplementasikan keamanan data dan penyembunyian detail informasi melalui konsep Encapsulation.
3. Menerapkan hubungan antar objek menggunakan mekanisme Inheritance dan Composition.
4. Memahami fleksibilitas kode melalui implementasi Polymorphism (Overloading dan Overriding).
5. Menggunakan Abstract Class dan Interface untuk mencapai tingkat abstraksi yang tinggi dalam perancangan sistem.

---

# 2. Landasan Teori

## 2.1 OOP dan Class-Object

Object-Oriented Programming (OOP) adalah pola pikir di mana sebuah sistem kompleks dipecah menjadi objek-objek kecil yang saling berinteraksi.
- **Class**: Merupakan blueprint atau cetakan yang mendefinisikan atribut (state) dan perilaku (behavior) yang akan dimiliki oleh objek.
- **Object**: Adalah wujud nyata atau instansiasi dari sebuah Class yang menempati memori saat program dijalankan.

## 2.2 Encapsulation (Enkapsulasi)

Enkapsulasi adalah teknik untuk membungkus data dan metode ke dalam satu unit (class) serta menyembunyikan detail implementasi dari dunia luar. Hal ini dilakukan dengan:
- Memberikan akses modifier `private` pada variabel (atribut).
- Menyediakan metode publik berupa `getter` untuk mengambil nilai dan `setter` untuk mengubah nilai secara terkontrol.

## 2.3 Inheritance (Pewarisan) dan Composition (Komposisi)

- **Inheritance**: Mekanisme di mana sebuah class (subclass) mewarisi semua atribut dan metode dari class lain (superclass) menggunakan kata kunci `extends`. Ini menciptakan hubungan "is-a".
- **Composition**: Hubungan di mana sebuah class mengandung objek dari class lain sebagai bagian dari atributnya. Ini menciptakan hubungan "has-a" yang seringkali lebih fleksibel daripada pewarisan.

## 2.4 Polymorphism (Polimorfisme)

Polimorfisme memungkinkan satu antarmuka atau metode untuk memiliki banyak bentuk atau implementasi. Dalam Java, polimorfisme diwujudkan melalui:
- **Overloading**: Menggunakan nama metode yang sama dengan parameter yang berbeda dalam satu class.
- **Overriding**: Mendefinisikan ulang metode superclass di dalam subclass untuk memberikan implementasi yang lebih spesifik.

## 2.5 Abstraction (Abstraksi) | Abstract Class dan Interface

Abstraksi digunakan untuk menyembunyikan detail kerumitan proses dan hanya menampilkan fungsi penting kepada pengguna.
- **Abstract Class**: Class yang tidak dapat diinstansiasi menjadi objek secara langsung dan biasanya berisi metode abstrak (tanpa tubuh).
- **Interface**: Sebuah kontrak atau kumpulan metode kosong yang harus diimplementasikan oleh class lain menggunakan kata kunci `implements`.


# 3. Analisis Praktikum
Berikut merupakan analisis terhadap program-program utama yang telah dikerjakan pada praktikum:

## 3.1 bagian_1
```java
package modul_3.bagian_1;

class Mahasiswa {

    // Atribut
    String nama;
    int umur;

    // Metode
    void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
```
Program ini mendefinisikan sebuah Class bernama Mahasiswa yang berfungsi sebagai blueprint atau cetakan dasar dalam paradigma OOP. Di dalam kelas ini terdapat dua Atribut (variabel), yaitu nama dengan tipe data String dan umur dengan tipe data integer, yang merepresentasikan data dari seorang mahasiswa. Selain atribut, terdapat satu Metode bernama displayInfo() yang bertugas untuk mencetak nilai dari atribut-atribut tersebut ke layar. Pada tahap ini, kelas baru berupa rancangan struktur dan belum menempati memori nyata sebagai objek.

```java
package modul_3.bagian_1;

public class Main {
    public static void main(String[] args) {

        // Membuat objek
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.umur = 20;

        // Memanggil metode
        mhs1.displayInfo();
    }
}
```
Program ini berfungsi sebagai kelas utama (runner) yang memiliki metode main() untuk mengeksekusi logika program. Di dalamnya dilakukan proses Instansiasi, yaitu pembuatan Objek nyata bernama mhs1 dari cetakan Mahasiswa dengan menggunakan kata kunci new.
Setelah objek berhasil dibuat dalam memori, program mengisi data ke dalam atribut objek tersebut secara langsung melalui akses variabel (mhs1.nama dan mhs1.umur). Terakhir, program memanggil metode displayInfo() pada objek mhs1 untuk menampilkan informasi yang telah disimpan. Praktikum ini memberikan pemahaman dasar bahwa satu Class dapat melahirkan banyak Object dengan data yang berbeda-beda.

## 3.2 bagian_2
```java
package modul_3.bagian_2;

class Mahasiswa {
    // Atribut private
    private String nama;
    private int umur;

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
```
Program ini mengimplementasikan pilar Encapsulation dengan mengubah hak akses atribut nama dan umur menjadi private. Dengan access modifier ini, data di dalam kelas tidak dapat diakses atau diubah secara langsung dari luar kelas. Sebagai gantinya, kelas menyediakan metode publik berupa Getter (getNama, getUmur) untuk mengambil nilai dan Setter (setNama, setUmur) untuk mengisi nilai atribut tersebut. Penggunaan kata kunci this di dalam metode setter berfungsi untuk membedakan antara atribut kelas dengan parameter metode.

```java
package modul_3.bagian_2;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.setNama("Budi");
        mhs1.setUmur(20);

        System.out.println("Nama: " + mhs1.getNama());
        System.out.println("Umur: " + mhs1.getUmur());
    }
}
```
Program utama ini menunjukkan cara berinteraksi dengan objek yang menerapkan enkapsulasi. Karena atribut pada objek mhs1 bersifat privat, maka pengisian data dilakukan melalui metode setNama("Budi") dan setUmur(20). Begitu pula saat ingin menampilkan data, program tidak mengakses variabel secara langsung, melainkan memanggil metode getNama() dan getUmur(). Pendekatan ini meningkatkan keamanan data karena kelas Mahasiswa memiliki kendali penuh terhadap bagaimana data tersebut diakses atau divalidasi.

## 3.3 bagian_3
### a. Komposisi
#### 1.Main
```java
package modul_3.bagian_3.komposisi;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        mobil.mulai();
        mobil.berhenti();
    }
}

```
#### 2. Mesin
```java
package modul_3.bagian_3.komposisi;

class Mesin {
    void hidupkan(){
        System.out.println("Mesin menyala. ");
    }

    void matikan(){
        System.out.println("Mesin dimatikan");
    }
}

```

#### 3. Mobil
```java
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

```
##### Analisis Mesin.java:
Kelas Mesin dirancang sebagai komponen independen yang memiliki perilaku (behavior) spesifik berupa metode hidupkan() dan matikan(). Dalam paradigma OOP, kelas ini berfungsi sebagai modul kecil yang nantinya akan disatukan ke dalam sistem yang lebih besar. Pada tahap ini, Mesin belum memiliki keterikatan dengan objek lain hingga ia dipanggil atau diinstansiasi di dalam kelas penampungnya.

##### Analisis Mobil.java:
Program ini merupakan inti dari implementasi hubungan Composition, yaitu hubungan "has-a" (memiliki) yang bersifat kuat. Kelas Mobil memiliki atribut privat berupa objek dari kelas Mesin yang dideklarasikan dengan kata kunci final. Hal ini menandakan bahwa objek mesin harus segera diinisialisasi, yang dilakukan tepat di dalam constructor Mobil.

Secara logis, analisis ini menunjukkan bahwa keberadaan objek Mesin sepenuhnya dikendalikan oleh objek Mobil. Jika objek Mobil dihancurkan, maka objek Mesin di dalamnya juga akan ikut hancur karena ia tidak diciptakan di luar kelas tersebut. Metode mulai() dan berhenti() mendemonstrasikan bagaimana Mobil memanfaatkan fungsi internal Mesin untuk menjalankan tugasnya sendiri.

##### Analisis Main.java:
Pada kelas utama, interaksi dilakukan hanya dengan objek Mobil. Analisis terhadap alur program ini menunjukkan penerapan prinsip abstraksi sederhana, di mana pengguna (kelas Main) tidak perlu mengetahui kerumitan internal bagaimana mesin dihidupkan. Cukup dengan memanggil metode mulai(), objek Mobil akan mengurus koordinasi dengan komponen Mesin di dalamnya. Hal ini membuktikan bahwa komposisi sangat efektif untuk membangun objek kompleks dari komponen-komponen yang lebih sederhana tanpa menciptakan hierarki pewarisan yang kaku.

### b. Pewarisan
#### 1. Main
```java
package modul_3.bagian_3.pewarisan;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        // Mengisi atribut yang diwarisi dari Kendaraan
        mobil1.merk = "Toyota";
        mobil1.tahun = 2021;

        // Mengisi atribut asli milik Mobil
        mobil1.jumlahPintu = 4;

        // Memanggil metode untuk menampilkan info lengkap
        mobil1.displayInfoMobil();
    }
}

```

#### 2. Kendaraan
```java
package modul_3.bagian_3.pewarisan;

class Kendaraan {
    String merk;
    int tahun;

    void displayInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
    }
}

```

#### 3. Mobil
```java
package modul_3.bagian_3.pewarisan;

class Mobil extends Kendaraan {
    int jumlahPintu;

    void displayInfoMobil() {
        displayInfo(); // Memanggil metode dari superclass
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
```
##### Analisis Kendaraan.java:
Kelas Kendaraan berfungsi sebagai Superclass (induk) yang mendefinisikan atribut umum bagi semua jenis kendaraan, yaitu merk dan tahun. Kelas ini juga menyediakan metode displayInfo() untuk menampilkan informasi dasar tersebut. Dalam hierarki pewarisan, kelas ini menjadi fondasi yang menyediakan sifat-sifat umum yang nantinya dapat diturunkan ke kelas-kelas yang lebih spesifik.

##### Analisis Mobil.java:
Program ini mengimplementasikan konsep Inheritance dengan menggunakan kata kunci extends untuk menghubungkan kelas Mobil dengan kelas Kendaraan. Sebagai Subclass, Mobil secara otomatis mewarisi seluruh atribut dan metode dari kelas Kendaraan.

Selain mewarisi sifat induknya, kelas Mobil juga memiliki atribut spesifiknya sendiri, yaitu jumlahPintu. Metode displayInfoMobil() menunjukkan penggunaan kembali kode (code reuse) dengan memanggil metode displayInfo() milik superclass, kemudian menambahkannya dengan informasi spesifik milik subclass. Hal ini mencerminkan hubungan "is-a", di mana mobil adalah sebuah kendaraan.

##### Analisis Main.java:
Pada kelas utama, dilakukan instansiasi objek mobil1 dari kelas Mobil. Meskipun atribut merk dan tahun tidak dideklarasikan secara tertulis di dalam kelas Mobil, objek tersebut tetap dapat mengakses dan mengisi nilai atribut tersebut karena adanya hubungan pewarisan.

##### Analisis terhadap alur program ini menunjukkan efisiensi dalam penulisan kode; pengembang tidak perlu menulis ulang logika yang sudah ada pada kelas induk. Cukup dengan memanggil satu metode displayInfoMobil(), seluruh data baik dari kelas induk maupun kelas anak dapat ditampilkan secara terpadu. Ini membuktikan bahwa pewarisan sangat membantu dalam mengorganisir hierarki objek dan mengurangi redundansi kode.

### b. Main
```java
package modul_3.bagian_3;

class Mesin {
    void hidupkan(){
        System.out.println("Mesin menyala.");
    }

    void matikan(){
        System.out.println("Mesin dimatikan.");
    }
}

class Kendaraan {
    void bergerak(){
        System.out.println("Kendaraan sedang bergerak.");
    }
}

class Mobil extends Kendaraan{
    private Mesin mesin;

    public Mobil(){
        this.mesin = new Mesin();
    }

    void mulai() {
        mesin.hidupkan();
        System.out.println("Mobil siap digunakan.");
    }

    void berhenti() {
        mesin.matikan();
        System.out.println("Mobil Berhenti.");
    }
}

public class Main {
    public static void main (String[] args) {
        Mobil mobil = new Mobil();
        mobil.mulai();
        mobil.bergerak();
        mobil.berhenti();
    }
}
```
Program ini merupakan implementasi kompleks yang mendemonstrasikan bagaimana dua pilar utama OOP, yaitu **Inheritance** (Pewarisan) dan **Composition** (Komposisi), dapat bekerja secara bersamaan dalam satu entitas objek.

Secara struktur, kelas `Mobil` dibangun di atas dua hubungan yang berbeda:
1.  **Pewarisan (is-a)**: Dengan menggunakan kata kunci `extends` terhadap kelas `Kendaraan`, `Mobil` berperan sebagai *subclass* yang mewarisi perilaku umum berupa metode `bergerak()`. Hal ini membuktikan efisiensi kode di mana `Mobil` tidak perlu mendefinisikan ulang logika pergerakan dasar yang sudah ada pada *superclass*.
2.  **Komposisi (has-a)**: Di sisi lain, `Mobil` memiliki atribut privat `mesin` dari kelas `Mesin`. Objek `mesin` ini diinisialisasi langsung di dalam *constructor* `Mobil`, yang menjadikannya komponen integral dari struktur internal mobil. Metode `mulai()` dan `berhenti()` pada objek mobil sebenarnya mengoordinasikan fungsionalitas dari metode `hidupkan()` dan `matikan()` milik objek mesin tersebut.

Pada kelas utama (`Main`), objek `mobil` didemonstrasikan mampu menjalankan tugas dari dua sumber logika yang berbeda. Pemanggilan `mobil.mulai()` dan `mobil.berhenti()` membuktikan keberhasilan mekanisme **Komposisi**, sementara pemanggilan `mobil.bergerak()` membuktikan berfungsinya mekanisme **Pewarisan**. Praktikum ini memberikan pemahaman penting bahwa dalam pengembangan perangkat lunak nyata, kombinasi kedua teknik ini sangat efektif untuk menciptakan objek yang kaya fitur namun tetap memiliki struktur yang terorganisir dan mudah dipelihara.

## 3.4 bagian_4
### a. overloading
#### 1.kalkulator
```java
package modul_3.bagian_4.overloading;

class Kalkulator {
    // Method overloading: penjumlahan dua bilangan bulat
    int tambah(int a, int b) {
        return a + b;
    }

    // Method overloading: penjumlahan tiga bilangan bulat
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Method overloading: penjumlahan dua bilangan desimal
    double tambah(double a, double b) {
        return a + b;
    }
}

```
#### 2.Main
```java
package modul_3.bagian_4.overloading;

public class main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Hasil 1: " + kalkulator.tambah(5, 10));      // Output: 15
        System.out.println("Hasil 2: " + kalkulator.tambah(5, 10, 15));  // Output: 30
        System.out.println("Hasil 3: " + kalkulator.tambah(3.5, 2.5));   // Output: 6.0
    }
}
```

##### Analisis Kalkulator.java:
Program ini mengimplementasikan salah satu bentuk polimorfisme statis, yaitu **Method Overloading**. Di dalam kelas `Kalkulator`, terdapat tiga metode dengan nama yang identik, yaitu `tambah()`, namun memiliki perbedaan pada **tanda tangan metode** (*method signature*). Perbedaan tersebut terletak pada jumlah parameter (dua parameter dibandingkan tiga parameter) serta tipe data parameter yang digunakan (`int` dibandingkan `double`). Hal ini memungkinkan satu nama metode untuk menangani berbagai variasi input tanpa harus membuat nama metode yang berbeda-beda.

---

##### Analisis Main.java:
Pada kelas utama, dilakukan instansiasi objek `kalkulator`. Analisis terhadap pemanggilan metode `tambah()` menunjukkan bahwa Java secara otomatis menentukan metode mana yang akan dieksekusi berdasarkan argumen yang diberikan saat pemanggilan.
- Pemanggilan `tambah(5, 10)` akan menjalankan metode dengan dua parameter `int`.
- Pemanggilan `tambah(5, 10, 15)` akan menjalankan metode dengan tiga parameter `int`.
- Pemanggilan `tambah(3.5, 2.5)` akan menjalankan metode dengan tipe data `double`.

Praktikum ini membuktikan bahwa *overloading* sangat berguna untuk meningkatkan keterbacaan kode (*readability*) dan memberikan fleksibilitas dalam penggunaan metode yang memiliki tujuan logika yang serupa namun dengan variasi input yang berbeda.

### b. overriding
#### 1.Anjing
```java
package modul_3.bagian_4.overriding;

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk Guk!");
    }
}

```
#### 2.Hewan
```java
package modul_3.bagian_4.overriding;

class Hewan {
    void bersuara() {
        System.out.println("Hewan bersuara.");
    }
}
```

#### 3.Kucing
```java
package modul_3.bagian_4.overriding;

class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meong!");
    }
}
```
#### 4.Main
```java
package modul_3.bagian_4.overriding;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing(); // Polymorphism
        Hewan hewan2 = new Anjing(); // Polymorphism

        hewan1.bersuara(); // Output: Meong!
        hewan2.bersuara(); // Output: Guk Guk!
    }
}
```
##### Analisis Hewan.java:
Kelas Hewan bertindak sebagai Superclass yang mendefinisikan perilaku umum melalui metode bersuara(). Pada kelas ini, metode tersebut memberikan implementasi standar atau umum. Dalam konsep polimorfisme dinamis, kelas ini berfungsi sebagai tipe referensi yang memungkinkan objek dari berbagai subclass untuk diperlakukan sebagai entitas yang sama.

##### Analisis Kucing.java & Anjing.java:
Kedua kelas ini merupakan Subclass yang mengimplementasikan Method Overriding. Dengan menggunakan anotasi @Override, masing-masing kelas mendefinisikan ulang metode bersuara() yang diwarisi dari kelas Hewan untuk memberikan implementasi yang lebih spesifik.
Kelas Kucing mengubah suara menjadi "Meong!".
Kelas Anjing mengubah suara menjadi "Guk Guk!".

Hal ini menunjukkan bahwa meskipun memiliki nama metode yang sama, perilaku yang dihasilkan berbeda tergantung pada spesialisasi kelasnya.

##### Analisis Main.java:
Program utama ini mendemonstrasikan Polimorfisme Dinamis (Runtime Polymorphism). Objek hewan1 dan hewan2 dideklarasikan dengan tipe referensi Hewan, namun diinstansiasi menggunakan objek Kucing dan Anjing.
Analisis terhadap hasil eksekusi menunjukkan bahwa Java menentukan metode mana yang akan dijalankan pada saat program berjalan (runtime) berdasarkan wujud asli objeknya, bukan berdasarkan tipe referensinya. Pemanggilan hewan1.bersuara() secara otomatis menjalankan versi milik Kucing. Praktikum ini membuktikan bahwa overriding memungkinkan fleksibilitas tinggi dalam kode, di mana satu perintah yang sama dapat menghasilkan aksi yang berbeda sesuai dengan karakteristik objek yang menggunakannya.

## 3.5 bagian_5
### a. abstrak
#### 1.Anjing
```java
package modul_3.bagian_5.abstrak;

class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Guk Guk!");
    }
}

```

#### 2.Hewan
```java
package modul_3.bagian_5.abstrak;

abstract class Hewan {
    // Atribut
    String nama;

    // Method konkret
    void makan() {
        System.out.println(nama + " sedang makan.");
    }

    // Method abstrak
    abstract void bersuara();
}

```

#### 3.Kucing
```java
package modul_3.bagian_5.abstrak;

// Subclass dari abstract class
class Kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meong!");
    }
}

```

#### 4.Main
```java
package modul_3.bagian_5.abstrak;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        kucing.nama = "Kitty";
        kucing.makan();    // Method konkret dari abstract class
        kucing.bersuara(); // Method abstrak yang di-override

        Hewan anjing = new Anjing();
        anjing.nama = "Doggy";
        anjing.makan();    // Method konkret dari abstract class
        anjing.bersuara(); // Method abstrak yang di-override
    }
}

```

##### Analisis Hewan.java:
Kelas `Hewan` dideklarasikan sebagai **Abstract Class** menggunakan kata kunci `abstract`. Kelas ini berfungsi sebagai kerangka dasar yang tidak dapat diinstansiasi menjadi objek secara langsung. Di dalamnya terdapat atribut `nama` serta dua jenis metode: metode konkret `makan()` yang memiliki implementasi tetap, dan metode abstrak `bersuara()` yang tidak memiliki tubuh (*body*). Metode abstrak ini berfungsi sebagai kontrak yang memaksa setiap kelas turunan untuk memberikan implementasi spesifiknya masing-masing.


##### Analisis Kucing.java & Anjing.java:
Kedua kelas ini merupakan **Subclass** yang mewarisi kelas abstrak `Hewan`. Sebagai konsekuensi dari pewarisan kelas abstrak, `Kucing` dan `Anjing` wajib melakukan **Overriding** terhadap metode `bersuara()`. Dalam praktikum ini, `Kucing` mengimplementasikan suara "Meong!" sedangkan `Anjing` mengimplementasikan suara "Guk Guk!". Hal ini menunjukkan bagaimana abstraksi memungkinkan definisi perilaku umum di tingkat atas, namun detail implementasinya diserahkan kepada kelas yang lebih spesifik.

##### Analisis Main.java:
Pada kelas utama, objek `kucing` dan `anjing` dibuat menggunakan tipe referensi dari kelas abstrak `Hewan`. Analisis terhadap alur eksekusi menunjukkan bahwa meskipun referensinya adalah kelas abstrak, metode yang dipanggil tetap merujuk pada implementasi di kelas aslinya masing-masing. Objek-objek tersebut dapat menggunakan fungsi umum seperti `makan()` sekaligus menjalankan fungsi spesifik `bersuara()`. Penggunaan *abstract class* di sini memastikan standarisasi struktur bagi semua kelas turunan sambil tetap mempertahankan fleksibilitas perilaku tiap objek.


### b. Antarmuka
#### 1.Bergerak
```java
package modul_3.bagian_5.antarmuka;

// Interface
interface Bergerak {
    // Method abstrak
    void bergerak();

    // Method default (Java 8+)
    default void berhenti() {
        System.out.println("Berhenti bergerak.");
    }

    // Method static (Java 8+)
    static void info() {
        System.out.println("Ini adalah interface Bergerak.");
    }
}

```

#### 2.Pesawat
```java
package modul_3.bagian_5.antarmuka;

class Pesawat implements Bergerak {
    @Override
    public void bergerak() {
        System.out.println("Pesawat sedang terbang.");
    }
}

```

#### 3.Mobil
```java
package modul_3.bagian_5.antarmuka;

class Mobil implements Bergerak {
    @Override
    public void bergerak() {
        System.out.println("Mobil sedang melaju.");
    }
}

```

#### 4.Main
```java
package modul_3.bagian_5.antarmuka;

public class Main {
    public static void main(String[] args) {
        Bergerak mobil = new Mobil();
        mobil.bergerak();   // Method dari interface
        mobil.berhenti();   // Method default dari interface

        Bergerak pesawat = new Pesawat();
        pesawat.bergerak(); // Method dari interface
        pesawat.berhenti(); // Method default dari interface

        Bergerak.info();    // Method static dari interface
    }
}

```
##### Analisis Bergerak.java:
`Bergerak` merupakan sebuah **Interface** yang berfungsi sebagai kontrak perilaku bagi kelas-kelas yang mengimplementasikannya. Di dalam interface ini terdapat tiga jenis metode yang berbeda: metode abstrak `bergerak()` yang wajib di-override oleh kelas turunan, metode `default berhenti()` yang menyediakan implementasi standar tanpa memaksa override, serta metode `static info()` yang terikat pada interface itu sendiri. Penggunaan interface di sini bertujuan untuk mendefinisikan kemampuan atau peran (*role*) suatu objek tanpa memedulikan hierarki kelasnya.

##### Analisis Pesawat.java & Mobil.java:
Kedua kelas ini menggunakan kata kunci `implements` untuk mengadopsi kontrak dari interface `Bergerak`. Sebagai konsekuensinya, baik `Pesawat` maupun `Mobil` wajib memberikan implementasi konkret untuk metode `bergerak()`.
- `Pesawat` mengimplementasikan gerakan dengan cara "terbang".
- `Mobil` mengimplementasikan gerakan dengan cara "melaju".
  Keduanya secara otomatis mewarisi metode `berhenti()` dari interface tanpa perlu menulis ulang kodenya, yang menunjukkan efisiensi dalam penggunaan metode default pada interface modern.

##### Analisis Main.java:
Pada kelas utama, prinsip polimorfisme diterapkan dengan menggunakan tipe referensi interface `Bergerak` untuk objek `mobil` dan `pesawat`. Analisis terhadap alur program menunjukkan bahwa interface memungkinkan objek-objek dari kelas yang berbeda untuk diperlakukan secara seragam berdasarkan kemampuannya (dalam hal ini, kemampuan untuk bergerak).



Selain itu, pemanggilan `Bergerak.info()` menunjukkan penggunaan metode statis yang dapat diakses langsung melalui nama interface tanpa memerlukan instansiasi objek. Praktikum ini membuktikan bahwa interface adalah alat yang sangat kuat untuk mencapai abstraksi penuh dan mendukung fleksibilitas desain sistem yang lebih luas dibandingkan hanya menggunakan kelas abstrak.

### c. Main
```java
package modul_3.bagian_5;

// 1. Interface
interface Terbang {
    void terbang();
}

// 2. Abstract Class
abstract class Hewan {
    String nama;

    // Method abstrak yang wajib diisi oleh anak kelas
    abstract void bersuara();

    // Method konkret (opsional, bisa langsung digunakan anak kelas)
    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// 3. Subclass yang mewarisi Hewan DAN mengimplementasikan Terbang
class Burung extends Hewan implements Terbang {

    // Implementasi method dari abstract class Hewan
    @Override
    void bersuara() {
        System.out.println("Kicau kicau!");
    }

    // Implementasi method dari interface Terbang
    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang.");
    }
}

// 4. Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Burung
        Burung burung = new Burung();

        // Mengisi atribut yang diwarisi dari kelas Hewan
        burung.nama = "Merpati";

        // Memanggil berbagai method
        burung.makan();    // Dari kelas Hewan
        burung.bersuara(); // Hasil override dari Hewan
        burung.terbang();  // Hasil implementasi dari interface Terbang
    }
}

```
##### Analisis Main.java:
Program ini merupakan demonstrasi tingkat lanjut dari pilar **Abstraksi** yang menggabungkan penggunaan **Abstract Class** dan **Interface** dalam satu hierarki kelas. Struktur ini menunjukkan bagaimana Java mengatasi keterbatasan pewarisan tunggal (*single inheritance*) dengan memungkinkan sebuah kelas mewarisi satu kelas induk sekaligus mengimplementasikan banyak antarmuka.
Secara teknis, terdapat tiga komponen utama yang bekerja sama:
1.  **Interface Terbang**: Mendefinisikan kontrak kemampuan atau peran (*role*) spesifik, yaitu `terbang()`, yang bersifat opsional bagi kelas hewan lainnya namun wajib bagi yang mengimplementasikannya.
2.  **Abstract Class Hewan**: Berfungsi sebagai cetakan dasar identitas yang memiliki atribut `nama` dan metode konkret `makan()`. Metode abstrak `bersuara()` di sini memastikan bahwa setiap hewan memiliki identitas suara yang unik.
3.  **Subclass Burung**: Kelas ini mengintegrasikan kedua konsep tersebut dengan menggunakan kata kunci `extends` dan `implements`. `Burung` memiliki kewajiban ganda untuk melakukan **Overriding** terhadap metode dari kelas abstrak sekaligus mengimplementasikan metode dari interface.

Analisis pada metode `main()` menunjukkan bahwa objek `burung` memiliki fleksibilitas tinggi; ia dapat mengakses fitur umum dari kelas induk (`makan`), menjalankan identitas spesifiknya (`bersuara`), dan mendemonstrasikan keahlian khususnya (`terbang`). Praktikum ini membuktikan bahwa kombinasi *abstract class* dan *interface* sangat efektif untuk membangun arsitektur perangkat lunak yang sangat modular, di mana struktur dasar diatur oleh kelas abstrak dan kemampuan tambahan diatur oleh interface.

## 3.6 bagian_6
### a. KonferensiApp
```java
package modul_3.bagian_6;

import java.util.ArrayList;
import java.util.Scanner;

public class KonferensiApp {
    private static final ArrayList<Pesanan> daftarPesanan = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Aplikasi Pemesanan Tiket Konferensi ===");
            System.out.println("1. Lihat Daftar Tiket");
            System.out.println("2. Pesan Tiket");
            System.out.println("3. Lihat Detail Pesanan");
            System.out.println("4. Batalkan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1: lihatDaftarTiket(); break;
                case 2: pesanTiket(); break;
                case 3: lihatDetailPesanan(); break;
                case 4: batalkanPesanan(); break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void lihatDaftarTiket() {
        System.out.println("\nDaftar Tiket:");
        System.out.println("1. Tiket Reguler - Rp100.000");
        System.out.println("2. Tiket VIP - Rp250.000 (Diskon 10%)");
    }

    private static void pesanTiket() {
        System.out.print("\nMasukkan nama pemesan: ");
        String namaPemesan = scanner.nextLine();

        System.out.print("Pilih jenis tiket (1: Reguler, 2: VIP): ");
        int jenisTiket = scanner.nextInt();
        System.out.print("Masukkan jumlah tiket: ");
        int jumlah = scanner.nextInt();

        Tiket tiket = null;
        switch (jenisTiket) {
            case 1: tiket = new TiketReguler(); break;
            case 2: tiket = new TiketVIP(); break;
            default:
                System.out.println("Jenis tiket tidak valid.");
                return;
        }

        Pesanan pesanan = new Pesanan(namaPemesan, tiket, jumlah);
        daftarPesanan.add(pesanan);
        System.out.println("Pesanan berhasil dibuat!");
        pesanan.displayDetail();
    }

    private static void lihatDetailPesanan() {
        if (isNoPesanan()) return;

        System.out.print("Pilih nomor pesanan untuk melihat detail: ");
        int nomorPesanan = scanner.nextInt();
        if (nomorPesanan > 0 && nomorPesanan <= daftarPesanan.size()) {
            daftarPesanan.get(nomorPesanan - 1).displayDetail();
        } else {
            System.out.println("Nomor pesanan tidak valid.");
        }
    }

    private static void batalkanPesanan() {
        if (isNoPesanan()) return;

        System.out.print("Pilih nomor pesanan yang ingin dibatalkan: ");
        int nomorPesanan = scanner.nextInt();
        if (nomorPesanan > 0 && nomorPesanan <= daftarPesanan.size()) {
            daftarPesanan.remove(nomorPesanan - 1);
            System.out.println("Pesanan berhasil dibatalkan.");
        } else {
            System.out.println("Nomor pesanan tidak valid.");
        }
    }

    private static boolean isNoPesanan() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("\nBelum ada pesanan.");
            return true;
        }
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < daftarPesanan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPesanan.get(i).getNamaPemesan());
        }
        return false;
    }
}

```

### b. Pesanan
```java
package modul_3.bagian_6;

class Pesanan {
    private final String namaPemesan;
    private final Tiket tiket;
    private final int jumlah;

    public Pesanan(String namaPemesan, Tiket tiket, int jumlah) {
        this.namaPemesan = namaPemesan;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public int getJumlah() {
        return jumlah;
    }

    // Menghitung total harga setelah diskon
    public double hitungTotal() {
        double total = tiket.getHarga() * jumlah;
        double diskon = tiket.hitungDiskon() * jumlah;
        return total - diskon;
    }

    // Menampilkan detail pesanan
    public void displayDetail() {
        System.out.println("\nDetail Pesanan:");
        System.out.println("Nama Pemesan: " + namaPemesan);
        System.out.println("Jenis Tiket: " + tiket.getJenis());
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total Harga: Rp" + hitungTotal());
    }
}

```

### c. Tiket
```java
package modul_3.bagian_6;

abstract class Tiket {
    private final String jenis;
    private final double harga;

    public Tiket(String jenis, double harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHarga() {
        return harga;
    }

    // Abstract method untuk menghitung diskon
    public abstract double hitungDiskon();
}

```

### d. TiketReguler
```java
package modul_3.bagian_6;

class TiketReguler extends Tiket {
    public TiketReguler() {
        super("Reguler", 100000); // Harga tiket reguler
    }

    @Override
    public double hitungDiskon() {
        return 0; // Tidak ada diskon untuk tiket reguler
    }
}

```

### e. TiketVIP
```java
package modul_3.bagian_6;

class TiketVIP extends Tiket {
    public TiketVIP() {
        super("VIP", 250000); // Harga tiket VIP
    }

    @Override
    public double hitungDiskon() {
        return 0.1 * getHarga(); // Diskon 10% untuk tiket VIP
    }
}

```
##### Analisis Tiket.java:
Berkas ini mendefinisikan sebuah Abstract Class yang berfungsi sebagai fondasi utama bagi seluruh jenis tiket dalam sistem. Dengan menggunakan kata kunci abstract, kelas ini tidak dapat diinstansiasi secara langsung, melainkan hanya sebagai cetakan dasar. Di dalamnya terdapat atribut private untuk menjaga keamanan data (jenis dan harga) serta sebuah Abstract Method hitungDiskon(). Metode abstrak ini sangat krusial karena memaksa setiap kelas turunan untuk memberikan aturan perhitungan diskon yang spesifik sesuai dengan jenis tiketnya.

##### Analisis TiketReguler.java:
Berkas ini merupakan Subclass yang mewarisi sifat dari kelas Tiket. Analisis terhadap kodenya menunjukkan penggunaan kata kunci super pada constructor untuk mengirimkan data jenis "Reguler" dan harga "100000" ke kelas induk. Sebagai konsekuensi dari pewarisan kelas abstrak, kelas ini wajib melakukan Overriding pada metode hitungDiskon(). Pada tiket reguler, metode ini mengembalikan nilai 0, yang secara logis menunjukkan bahwa tipe tiket ini tidak memiliki potongan harga.

##### Analisis TiketVIP.java:
Sama halnya dengan tiket reguler, berkas ini adalah Subclass dari Tiket namun dengan spesialisasi yang berbeda. Melalui mekanisme inheritance, ia menetapkan harga yang lebih tinggi (250000). Perbedaan utama terletak pada implementasi metode hitungDiskon(), di mana kelas ini menerapkan logika perhitungan diskon sebesar 10% dari harga dasar. Ini mendemonstrasikan pilar Polymorphism, di mana satu nama metode (hitungDiskon) memiliki perilaku yang berbeda pada objek yang berbeda.

##### Analisis Pesanan.java:
Berkas ini merupakan kelas pendukung yang menerapkan prinsip Composition (Hubungan Has-a). Kelas Pesanan memiliki atribut berupa objek dari kelas Tiket. Hal yang menarik di sini adalah fleksibilitasnya; karena atribut tiket bertipe superclass, ia dapat menampung objek TiketReguler maupun TiketVIP. Metode hitungTotal() di dalam kelas ini menunjukkan koordinasi antar objek, di mana total bayar dihitung dengan mengurangi harga dasar dikali jumlah dengan total diskon yang didapat dari objek tiket tersebut.

##### Analisis KonferensiApp.java:
Berkas ini bertindak sebagai kelas utama sekaligus pusat kendali (Controller) aplikasi. Analisis terhadap strukturnya menunjukkan penggunaan ArrayList<Pesanan> sebagai media penyimpanan data dinamis di dalam memori. Program ini mengintegrasikan interaksi pengguna melalui Scanner dengan logika bisnis yang telah dibangun di kelas-kelas sebelumnya. Di sinilah seluruh konsep OOP bertemu: pembuatan objek secara dinamis, penyimpanan objek dalam koleksi, dan pemanggilan metode polimorfik untuk menampilkan detail pesanan secara interaktif kepada pengguna.


# 4. Analisis Latihan

Selain program utama, latihan tambahan juga dikerjakan untuk memperkuat pemahaman konsep dasar Java.

## 4.1 Latihan bagian_1
### Main
```java
package modul_3.bagian_1;

public class Main {
    public static void main(String[] args) {

        // Membuat objek
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Budi";
        mhs1.umur = 20;

        // Memanggil metode
        mhs1.displayInfo();
    }
}

```

### Mahasiswa
```java
package modul_3.bagian_1;

class Mahasiswa {

    // Atribut
    String nama;
    int umur;

    // Metode
    void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}

```
#### Analisis Mahasiswa.java:
Berkas ini mendefinisikan sebuah Class (Kelas) bernama Mahasiswa yang berfungsi sebagai cetakan atau blueprint untuk menciptakan objek. Analisis terhadap kodenya menunjukkan adanya dua Atribut (variabel anggota) yaitu nama dan umur dengan hak akses default. Selain atribut, kelas ini juga memiliki sebuah Metode bernama displayInfo() yang bertugas untuk mencetak data mahasiswa ke konsol. Struktur ini mencerminkan prinsip dasar pemrograman berorientasi objek di mana data dan perilaku dibungkus dalam satu kesatuan unit.

#### Analisis Main.java:
Berkas ini merupakan kelas utama yang menjalankan program. Analisis terhadap alur eksekusi menunjukkan proses Instansiasi, di mana sebuah objek nyata bernama mhs1 dibuat dari kelas Mahasiswa menggunakan kata kunci new. Setelah objek terbentuk, program mengisi nilai ke dalam atribut secara langsung (mhs1.nama = "Budi"). Pemanggilan metode mhs1.displayInfo() di akhir program membuktikan bahwa objek tersebut telah berhasil menyimpan data di memori dan dapat menjalankan fungsi yang telah didefinisikan pada kelas induknya.

## 4.2 Latihan bagian_2
### Main
```java
package modul_3.bagian_2.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek motor baru
        Motor mtr1 = new Motor();

        // Mengisi data menggunakan Setter
        mtr1.setMerk("Honda Vario");
        mtr1.setTahun(2023);

        // Menampilkan data menggunakan Getter
        System.out.println("Merk Motor  : " + mtr1.getMerk());
        System.out.println("Tahun Keluar : " + mtr1.getTahun());
    }
}

```
### Motor
```java
package modul_3.bagian_2.latihan;

class Motor {
    // Atribut private (Enkapsulasi)
    private String merk;
    private int tahun;

    // Getter untuk Merk
    public String getMerk() {
        return merk;
    }

    // Setter untuk Merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter untuk Tahun
    public int getTahun() {
        return tahun;
    }

    // Setter untuk Tahun
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
```
#### Analisis Motor.java:
Berkas ini merupakan implementasi murni dari pilar Encapsulation (Pengapsulan). Dengan menetapkan hak akses private pada atribut merk dan tahun, data di dalam kelas ini terlindungi dari akses langsung oleh kelas luar. Analisis terhadap kodenya menunjukkan penggunaan metode Getter dan Setter sebagai pintu masuk resmi untuk berinteraksi dengan atribut tersebut. Penggunaan kata kunci this pada metode setter berfungsi untuk membedakan antara variabel anggota kelas dengan parameter yang diterima, sehingga proses pemberian nilai (assignment) menjadi akurat.

#### Analisis Main.java:
Berkas ini berfungsi sebagai penguji untuk memastikan mekanisme enkapsulasi pada kelas Motor berjalan dengan benar. Di dalam metode main, dilakukan instansiasi objek mtr1. Analisis terhadap alur program menunjukkan bahwa pengisian data dilakukan melalui metode setMerk() dan setTahun(), bukan dengan mengakses variabelnya secara langsung. Begitu pula saat menampilkan data, program memanggil metode getMerk() dan getTahun().

Praktikum ini membuktikan bahwa enkapsulasi memungkinkan kontrol yang lebih baik terhadap data, karena pengembang dapat menambahkan validasi di dalam metode setter jika diperlukan di masa mendatang tanpa mengubah struktur pada kelas utama.

## 4.3 Latihan bagian_3
### Laptop
```java
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

```
### Main
```java
package modul_3.bagian_3.latihan;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.hidupkanLaptop();
    }
}

```
### Processor
```java
package modul_3.bagian_3.latihan;

class Processor {
    public void jalankan() {
        System.out.println("Processor sedang menjalankan instruksi...");
    }
}

```
### RAM
```java
package modul_3.bagian_3.latihan;

class RAM {
    public void baca() {
        System.out.println("RAM sedang membaca data...");
    }

    public void tulis() {
        System.out.println("RAM sedang menulis data...");
    }
}

```
#### Analisis Processor.java:
Berkas ini mendefinisikan salah satu komponen penyusun utama dari sistem komputer dalam model pemrograman. Sebagai sebuah kelas mandiri, Processor memiliki tanggung jawab tunggal (Single Responsibility) untuk menyediakan fungsionalitas pemrosesan melalui metode jalankan(). Dalam struktur Composition, kelas ini dirancang sebagai objek "bagian" (Part) yang nantinya akan dikendalikan oleh objek yang lebih besar.

#### Analisis RAM.java:
Berkas ini mendefinisikan komponen penyimpanan sementara yang memiliki perilaku spesifik dalam pengolahan data. Analisis terhadap kodenya menunjukkan adanya dua metode utama, yaitu baca() dan tulis(), yang merepresentasikan operasi dasar memori. Pemisahan RAM menjadi kelas tersendiri memudahkan pemeliharaan kode dan memungkinkan objek ini untuk diintegrasikan ke dalam berbagai jenis perangkat lain selain laptop jika diperlukan di masa mendatang.

#### Analisis Laptop.java:
Berkas ini merupakan inti dari penerapan konsep Composition (hubungan Has-a). Kelas Laptop berperan sebagai objek "seluruh" (Whole) yang menggabungkan objek Processor dan RAM ke dalam strukturnya. Analisis terhadap constructor menunjukkan bahwa instansiasi kedua komponen tersebut dilakukan langsung di dalam kelas Laptop. Hal ini menandakan hubungan kepemilikan yang sangat kuat, di mana siklus hidup objek bagian (Processor dan RAM) sangat bergantung pada keberadaan objek induknya (Laptop).

#### Analisis Main.java:
Berkas ini berfungsi untuk menguji fungsionalitas dari penggabungan seluruh komponen tersebut. Ketika objek laptop dibuat, sistem secara otomatis menyiapkan status internal dari prosesor dan memori yang dimilikinya. Melalui pemanggilan metode laptop.hidupkanLaptop(), terlihat bagaimana objek induk mengoordinasikan tugas kepada objek-objek bagiannya. Praktikum ini memberikan gambaran nyata tentang bagaimana abstraksi perangkat keras dapat diimplementasikan dalam pemrograman berorientasi objek untuk membangun sistem yang lebih kompleks.

## 4.4 Latihan bagian_4
### Overloading
#### Main
```java
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

```
#### Matematika
```java
package modul_3.bagian_4.latihan.overloading;

class Matematika {
    // 1. Method tambah() dengan 2 parameter bertipe int
    int tambah(int a, int b) {
        return a + b;
    }

    // 2. Method tambah() dengan 3 parameter bertipe int
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // 3. Method tambah() dengan 2 parameter bertipe double
    double tambah(double a, double b) {
        return a + b;
    }
}

```
#### Analisis Matematika.java:
Berkas ini mengimplementasikan konsep Polimorfisme Statis melalui mekanisme Method Overloading. Di dalam kelas Matematika, terdapat tiga metode dengan nama yang sama, yaitu tambah(), namun memiliki Method Signature yang berbeda-beda. Perbedaan tersebut mencakup jumlah parameter (dua parameter dibandingkan tiga parameter) serta variasi tipe data parameter (int dibandingkan double). Hal ini memungkinkan satu nama metode untuk menangani berbagai jenis operasi penjumlahan tanpa perlu membuat nama metode yang unik untuk setiap tipe input, sehingga kode menjadi lebih rapi dan mudah dipahami.

#### Analisis Main.java:
Berkas ini berfungsi untuk menguji kemampuan overloading pada objek mtk. Analisis terhadap alur eksekusi menunjukkan bahwa Java menggunakan prinsip Compile-time Polymorphism, di mana pemilihan metode yang akan dijalankan ditentukan saat kompilasi berdasarkan argumen yang dilewatkan.

- Pemanggilan mtk.tambah(10, 20) secara otomatis memicu metode dengan dua parameter int.

- Pemanggilan mtk.tambah(10, 20, 30) memicu metode dengan tiga parameter int.

- Pemanggilan mtk.tambah(10.5, 20.5) memicu metode dengan parameter double.

Praktikum ini membuktikan bahwa overloading memberikan fleksibilitas tinggi bagi pengguna kelas, karena mereka dapat menggunakan nama metode yang sama untuk logika yang serupa namun dengan variasi data yang berbeda-beda.

### Overriding
#### BangunDatar
```java
package modul_3.bagian_4.latihan.overriding;

class BangunDatar {
    // Method dasar yang akan di-override
    double hitungLuas() {
        System.out.println("Menghitung luas bangun datar...");
        return 0;
    }
}

```

#### Lingkaran
```java
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

```

#### Main
```java
package modul_3.bagian_4.latihan.overriding;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari subclass
        BangunDatar persegi = new Persegi(4);
        BangunDatar lingkaran = new Lingkaran(7);

        // Memanggil method yang sudah di-override
        System.out.println("Luas Persegi: " + persegi.hitungLuas());     // Output: 16.0
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas()); // Output: 153.93...
    }
}

```

#### Persegi
```java
package modul_3.bagian_4.latihan.overriding;

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}

```
##### Analisis BangunDatar.java:Berkas ini bertindak sebagai Superclass (induk) yang mendefinisikan kontrak umum untuk semua jenis bangun datar. Di dalamnya terdapat metode hitungLuas() yang memberikan implementasi dasar atau nilai default. Fungsi utama dari kelas ini adalah menyediakan struktur pewarisan sehingga setiap bentuk geometri yang lebih spesifik dapat dikelompokkan dalam satu tipe referensi yang sama, yang merupakan inti dari konsep polimorfisme.

##### Analisis Lingkaran.java:Berkas ini merupakan Subclass yang menspesialisasi kelas BangunDatar untuk objek lingkaran. Analisis terhadap kodenya menunjukkan penggunaan atribut r (jari-jari) dan implementasi Method Overriding pada metode hitungLuas(). Dengan menggunakan konstanta Math.PI, kelas ini memberikan logika perhitungan luas yang akurat spesifik untuk lingkaran ($L = \pi \times r^2$), menggantikan logika umum yang ada pada kelas induk.

##### Analisis Persegi.java:Sama halnya dengan lingkaran, berkas ini adalah Subclass yang melakukan overriding terhadap metode hitungLuas(). Kelas ini mendefinisikan atribut sisi dan memberikan implementasi perhitungan luas persegi ($L = s \times s$). Penggunaan anotasi @Override di sini berfungsi sebagai penanda bagi compiler bahwa metode ini secara sengaja menggantikan metode dengan tanda tangan yang sama di kelas BangunDatar.

##### Analisis Main.java:Berkas ini mendemonstrasikan penerapan Dynamic Polymorphism atau Runtime Polymorphism. Objek persegi dan lingkaran dideklarasikan menggunakan tipe referensi superclass (BangunDatar), namun diinstansiasi menggunakan objek subclass yang berbeda.Analisis terhadap hasil eksekusi menunjukkan bahwa Java secara otomatis menentukan metode mana yang akan dijalankan pada saat program berjalan (runtime) berdasarkan wujud asli objeknya. Meskipun pemanggilan metodenya memiliki nama yang identik, hasil yang dikembalikan berbeda sesuai dengan rumus luas masing-masing bangun datar. Praktikum ini membuktikan bahwa polimorfisme memungkinkan kode menjadi sangat fleksibel dan mudah diperluas tanpa harus mengubah logika pada kelas utamanya.

## 4.5 Latihan bagian_5
### Berenang
```java
package modul_3.bagian_5.Latihan;

public interface Berenang {
    void berenang();
}

```

### HewanAir
```java
package modul_3.bagian_5.Latihan;

public abstract class HewanAir {
    String nama;

    // Method abstrak yang wajib diimplementasikan oleh subclass
    abstract void makan();
}

```

### Ikan
```java
package modul_3.bagian_5.Latihan;

public class Ikan extends HewanAir implements Berenang {

    public Ikan(String nama) {
        this.nama = nama;
    }

    // Implementasi dari interface Berenang
    @Override
    public void berenang() {
        System.out.println(nama + " berenang dengan lincah di air.");
    }

    // Implementasi dari abstract class HewanAir
    @Override
    void makan() {
        System.out.println(nama + " sedang makan pelet.");
    }
}

```

### Main
```java
package modul_3.bagian_5.Latihan;

public class Main {
    public static void main(String[] args) {
        Ikan ikanKu = new Ikan("Nemo");

        ikanKu.makan();
        ikanKu.berenang();
    }
}

```
##### Analisis Berenang.java:
Berkas ini merupakan sebuah Interface yang mendefinisikan kemampuan atau peran (role) tertentu, yaitu berenang(). Dalam konsep abstraksi, interface ini bertindak sebagai kontrak perilaku yang menjamin bahwa setiap kelas yang mengimplementasikannya pasti memiliki fungsi untuk berenang. Keunggulan penggunaan interface di sini adalah fleksibilitasnya, di mana objek selain hewan (seperti kapal selam atau manusia) juga dapat mengadopsi kemampuan ini tanpa harus berada dalam hierarki kelas yang sama.

##### Analisis HewanAir.java:
Berkas ini dideklarasikan sebagai Abstract Class yang berfungsi sebagai identitas dasar bagi semua makhluk hidup yang tinggal di air. Kelas ini memiliki atribut nama dan sebuah metode abstrak makan(). Perbedaan mendasar dengan interface sebelumnya adalah HewanAir lebih fokus pada "apa benda itu" (is-a relationship), sedangkan interface fokus pada "apa yang bisa dilakukan benda itu" (can-do relationship).

##### Analisis Ikan.java:
Berkas ini adalah Subclass yang menunjukkan kekuatan integrasi antara pewarisan dan antarmuka. Dengan menggunakan kata kunci extends HewanAir dan implements Berenang, kelas Ikan memiliki kewajiban ganda:
- Memberikan implementasi konkret untuk metode makan() yang diwarisi dari kelas abstrak.
- Memberikan implementasi konkret untuk metode berenang() yang diwajibkan oleh interface.
- Analisis terhadap kodenya menunjukkan bahwa Ikan berhasil menyatukan identitas sebagai hewan air dengan kemampuan berenangnya menjadi satu entitas objek yang utuh.

##### Analisis Main.java:
Berkas ini bertindak sebagai penguji untuk memverifikasi fungsionalitas objek Ikan. Analisis terhadap alur eksekusi menunjukkan bahwa objek ikanKu yang diberi nama "Nemo" dapat menjalankan fungsi dari dua sumber abstraksi yang berbeda secara bersamaan. Pemanggilan makan() menjalankan logika dari kelas induk, sementara berenang() menjalankan logika dari antarmuka. Praktikum ini membuktikan bahwa kombinasi abstract class dan interface sangat efektif untuk membangun struktur kode yang modular, terorganisir, dan mudah dikembangkan.

Berikut adalah revisi untuk bagian 5. Hasil dan Pembahasan, 6. Kesimpulan, dan 7. Saran yang disusun dalam bentuk paragraf mengalir tanpa menggunakan poin-poin atau numerik, sesuai dengan permintaan Anda:

# 5. Hasil dan Pembahasan
   Rangkaian praktikum pada Modul 3 ini memberikan pemahaman mendalam mengenai penerapan pilar-pilar Object-Oriented Programming (OOP) dalam bahasa Java yang dimulai dari konsep enkapsulasi. Analisis terhadap implementasi kelas Motor menunjukkan bahwa penggunaan akses private pada atribut yang dikombinasikan dengan metode getter dan setter sangat efektif untuk menjaga integritas data. Mekanisme ini memastikan bahwa setiap perubahan nilai atribut harus melalui prosedur resmi, sehingga pengembang memiliki kendali penuh untuk menambahkan logika validasi di masa mendatang guna mencegah data yang tidak valid masuk ke dalam sistem.

Selanjutnya, pembahasan mengenai pewarisan dan komposisi memperlihatkan dua cara berbeda dalam membangun struktur objek. Melalui pewarisan, sistem dapat mengefisiensikan penulisan kode dengan menurunkan sifat umum dari kelas induk ke kelas turunan, sementara komposisi pada sistem Laptop mendemonstrasikan hubungan kepemilikan yang sangat erat antar komponen. Analisis pada bagian ini menyimpulkan bahwa komposisi memberikan struktur yang lebih kokoh untuk komponen yang memiliki ketergantungan hidup mati terhadap objek induknya, sedangkan pewarisan lebih unggul dalam menciptakan hierarki keluarga objek yang teratur.

Pada aspek polimorfisme, praktikum membuktikan fleksibilitas program melalui teknik overloading dan overriding. Method overloading pada kelas Matematika memungkinkan satu nama metode menangani berbagai jenis input data secara statis saat kompilasi. Sebaliknya, method overriding pada kasus Bangun Datar menunjukkan kekuatan polimorfisme dinamis, di mana program mampu menentukan rumus perhitungan luas yang tepat secara otomatis saat berjalan sesuai dengan wujud asli objeknya. Hal ini diperkuat dengan penerapan abstraksi menggunakan Abstract Class dan Interface yang bertindak sebagai kontrak desain. Integrasi keduanya dalam satu kelas seperti pada objek Ikan atau sistem Konferensi menciptakan arsitektur perangkat lunak yang sangat modular, di mana struktur dasar diatur oleh kelas abstrak dan kemampuan tambahan distandarisasi oleh antarmuka.

# 6. Kesimpulan
   Secara keseluruhan, praktikum ini memberikan bukti nyata bahwa pemrograman berorientasi objek merupakan paradigma yang sangat kuat dalam merepresentasikan masalah dunia nyata ke dalam solusi digital yang terstruktur. Keempat pilar utama OOP terbukti saling melengkapi dalam menciptakan kode yang aman melalui enkapsulasi, efisien melalui pewarisan, dan fleksibel melalui polimorfisme serta abstraksi. Penggunaan kelas abstrak dan antarmuka menjadi kunci utama dalam membangun kerangka kerja yang konsisten namun tetap memberikan ruang bagi spesialisasi pada setiap objek turunannya. Dengan memahami seluruh konsep ini, pengembangan aplikasi skala besar menjadi lebih terorganisir karena setiap komponen memiliki tanggung jawab yang jelas dan hubungan antar objek yang terdefinisi dengan baik.

# 7. Saran
   Sebagai langkah pengembangan lebih lanjut, proses pembelajaran praktikum ini dapat ditingkatkan dengan mengeksplorasi kasus-kasus yang memiliki tingkat kompleksitas lebih tinggi, seperti integrasi antar sistem atau manajemen data yang lebih dinamis. Mahasiswa juga disarankan untuk mulai membiasakan diri menambahkan logika validasi yang lebih ketat pada metode setter untuk merasakan manfaat keamanan dari enkapsulasi secara langsung. Selain itu, penggabungan konsep OOP dengan teknik penanganan kesalahan atau exception handling akan sangat bermanfaat untuk memastikan bahwa objek yang diciptakan tidak hanya memiliki struktur yang baik, tetapi juga memiliki ketahanan yang tinggi terhadap kegagalan input saat program digunakan secara luas.