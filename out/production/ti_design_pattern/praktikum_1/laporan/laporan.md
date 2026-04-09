# LAPORAN PRAKTIKUM 1
## Review Dasar Pemrograman Java

Nama        : Abadan Syakira  
NIM         : 2024573010099  
Kelas       : TI 2A  
Mata Kuliah : Praktikum Design Pattern  
Tanggal Praktikum : 02 Maret 2026

---

# 1. Pendahuluan

## 1.1 Latar Belakang

Sebelum mempelajari Design Pattern, perlu dilakukan peninjauan kembali terhadap konsep dasar pemrograman Java. Hal ini disebabkan karena Design Pattern merupakan pola perancangan yang diterapkan dalam pemrograman berorientasi objek (Object Oriented Programming/OOP).

Pada praktikum ini, materi Design Pattern belum langsung diberikan. Latihan dasar Java terlebih dahulu dilakukan untuk mengingat kembali konsep-konsep seperti variabel, operator, percabangan, perulangan, serta pembuatan program sederhana.

## 1.2 Tujuan Praktikum

1. Mengingat kembali sintaks dasar Java.
2. Memahami struktur dasar program Java.
3. Mengimplementasikan percabangan dan perulangan.
4. Mempersiapkan dasar sebelum mempelajari Design Pattern.

---

# 2. Landasan Teori

## 2.1 Struktur Dasar Program Java

Struktur dasar program Java terdiri dari:
- Class
- Method `main()`
- Statement
- Output menggunakan `System.out.println()`

## 2.2 Variabel

Variabel digunakan untuk menyimpan data dalam program.  
Beberapa tipe data yang umum digunakan antara lain:
- int
- double
- String
- boolean

## 2.3 Operator

Operator digunakan untuk melakukan operasi terhadap data.  
Jenis operator yang digunakan meliputi:
- Operator aritmatika (+, -, *, /, %)
- Operator perbandingan (==, !=, >, <)
- Operator logika (&&, ||)

## 2.4 Percabangan

Percabangan digunakan sebagai mekanisme pengambilan keputusan dalam program.  
Struktur percabangan yang umum digunakan antara lain:
- if
- if-else
- switch

## 2.5 Perulangan

Perulangan digunakan untuk menjalankan suatu blok kode secara berulang sesuai dengan kondisi yang ditentukan.  
Jenis perulangan yang digunakan antara lain:
- for
- while
- do-while

---

# 3. Analisis Praktikum

Berikut merupakan analisis terhadap program-program utama yang telah dikerjakan pada praktikum:

## 3.1 hello_world.java
```java
public class hello_world {
    public static void main (String[] args) {
        System.out.println("Hello, World!");
    }
}
```
Program ini digunakan untuk menampilkan teks ke layar menggunakan `System.out.println()`.  
Melalui program ini, struktur dasar program Java yang terdiri dari class dan method `main()` dapat dipahami kembali.

## 3.2 Variable.java
```java
public class Variable {
    public static void main(String[] args) {
        int umur = 20;
        double tinggi = 1.75;
        boolean isMahasiswa = true;
        char jenisKelamin = 'L';
        String nama = "Budi";

        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Mahasiswa: " + isMahasiswa);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }
}
```
Program ini dibuat untuk mendemonstrasikan deklarasi variabel dengan berbagai tipe data seperti `int`, `double`, dan `String`.  
Pemahaman mengenai penyimpanan dan penampilan data dalam program diperkuat melalui implementasi ini.

## 3.3 Operator.java
```java
public class Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a > b? " + (a > b));
        System.out.println("a == b? " + (a == b));
    }
}
```
Program ini digunakan untuk menerapkan operator aritmatika dan perbandingan dalam melakukan operasi terhadap data.  
Melalui program ini, cara kerja operasi matematika dan logika dalam Java dapat dipahami.

## 3.4 Percabangan.java
```java
public class Percabangan {
    public static void main(String[] args) {
        int nilai = 85;

        if (nilai >= 75) {
            System.out.println("Anda lulus!");
        } else {
            System.out.println("Anda tidak lulus.");
        }
    }
}
```
Struktur `if-else` digunakan dalam program ini untuk menentukan keputusan berdasarkan kondisi tertentu.  
Konsep perubahan alur program berdasarkan nilai variabel dapat diamati melalui implementasi tersebut.

## 3.5 Perulangan.java
```java
public class Perulangan {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i);
        }
    }
}
```
Program ini memanfaatkan perulangan untuk mencetak data secara berulang.  
Konsep iterasi dalam pemrograman diperkuat melalui penggunaan struktur perulangan.

## 3.6 Factorial.java
```java
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        System.out.println("Faktorial dari " + n + " adalah " + hasil);
    }
}
```
Program ini dibuat untuk menghitung nilai faktorial suatu bilangan dengan menggunakan perulangan.  
Penggunaan loop dalam penyelesaian perhitungan matematis dapat dipahami melalui program ini.

## 3.7 Prima.java
```java
public class Prima {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrima = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrima = false;
                break;
            }
        }

        System.out.println(n + (isPrima ? " adalah bilangan prima." : " bukan bilangan prima."));
    }
}
```
Program ini digunakan untuk menentukan apakah suatu bilangan termasuk bilangan prima atau bukan.  
Logika percabangan dan perulangan diterapkan secara bersamaan dalam proses pengecekan bilangan.

## 3.8 Segitiga.java
```java
public class Segitiga {
    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```
Program ini menampilkan pola segitiga dengan menggunakan nested loop (perulangan bersarang).  
Penggabungan dua struktur perulangan digunakan untuk membentuk pola tertentu.

---

# 4. Analisis Latihan

Selain program utama, latihan tambahan juga dikerjakan untuk memperkuat pemahaman konsep dasar Java.

## 4.1 Variable.java (Latihan)
```java
public class Variable {
    public static void main(String[] args) {

        String namaLengkap = "Abadan Syakira";
        String tempatLahir = "Lhokseumawe";
        String tanggalLahir = "19 Desember 2005";
        String golonganDarah = "AB";
        int umur = 20;
        double tinggiBadan = 171;
        String jenisKelamin = "Laki-laki";
        String agama = "Islam";
        String pekerjaan = "Mahasiswa";

        System.out.println("===== DATA DIRI =====");
        System.out.println("Nama Lengkap   : " + namaLengkap);
        System.out.println("Tempat Lahir   : " + tempatLahir);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Golongan Darah : " + golonganDarah);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Tinggi Badan   : " + tinggiBadan + " cm");
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Agama          : " + agama);
        System.out.println("Pekerjaan      : " + pekerjaan);
    }
}
```
Latihan ini bertujuan untuk memperdalam pemahaman mengenai deklarasi dan penggunaan variabel dalam berbagai kondisi.

## 4.2 Operator.java (Latihan)
```java
public class Operator {
    public static void main(String[] args) {

        double panjang = 10;
        double lebar = 5;
        double luas;

        luas = panjang * lebar;

        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Luas Persegi Panjang = " + luas);
    }
}
```
Latihan ini digunakan untuk memperkuat pemahaman terhadap penggunaan operator aritmatika dan logika.

## 4.3 Percabangan.java (Latihan)
```java
public class Percabangan {
    public static void main(String[] args) {

        int bilangan = 10;

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil");
        }
    }
}
```
Latihan ini difokuskan pada penerapan struktur percabangan dalam pengambilan keputusan.

## 4.4 PerulanganFor.java
```java
public class PerulanganFor {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
```
Latihan ini menerapkan perulangan `for`, yang umumnya digunakan ketika jumlah iterasi telah diketahui.
```java

```
## 4.5 PerulanganWhile.java
```java
public class PerulanganWhile {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
```
Latihan ini menggunakan perulangan `while` yang bergantung pada kondisi tertentu.

## 4.6 PerulanganDoWhile.java
```java
public class PerulanganDoWhile {
    public static void main(String[] args) {

        int i = 1;

        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }
}

```
Latihan ini menunjukkan bahwa blok kode dijalankan minimal satu kali sebelum kondisi diperiksa.

Latihan-latihan tersebut dilakukan sebagai penguatan logika dasar sebelum memasuki konsep yang lebih kompleks seperti Design Pattern.

---

# 5. Hasil dan Pembahasan

Setelah seluruh program dijalankan, diperoleh hasil sebagai berikut:

- Program dapat dikompilasi dan dijalankan tanpa error.
- Konsep dasar Java dapat dipahami kembali.
- Percabangan dan perulangan terbukti menjadi dasar dalam membangun logika program.
- Program matematis seperti faktorial dan bilangan prima membantu meningkatkan kemampuan berpikir algoritmik.

Praktikum ini menjadi tahap persiapan sebelum memasuki materi Design Pattern yang membutuhkan pemahaman kuat terhadap class dan logika pemrograman.

---

# 6. Kesimpulan

Berdasarkan praktikum yang telah dilakukan, dapat disimpulkan bahwa:

1. Materi dasar Java merupakan fondasi penting dalam pemrograman.
2. Variabel, operator, percabangan, dan perulangan merupakan elemen utama dalam membangun program.
3. Latihan tambahan berperan dalam memperkuat pemahaman konsep.
4. Praktikum ini menjadi langkah awal sebelum mempelajari Design Pattern secara lebih mendalam.

---

# 7. Saran

Sebelum mempelajari Design Pattern, pemahaman terhadap hal-hal berikut perlu diperkuat:

- Struktur class
- Method dan parameter
- Logika percabangan dan perulangan
- Dasar pemrograman berorientasi objek

Dengan penguasaan konsep tersebut, proses pembelajaran Design Pattern akan menjadi lebih efektif.