# LAPORAN PRAKTIKUM 2
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