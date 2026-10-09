# Tugas PBO - Inheritance dan Polimorfisme

Repositori ini berisi implementasi tugas Pemrograman Berorientasi Objek (PBO) tentang pewarisan (*inheritance*) dan polimorfisme pada kelas-kelas bentuk geometri. Kelas `BujurSangkar`, `Lingkaran`, dan `Silinder` berbagi perilaku melalui kelas induk, lalu menampilkan informasi sesuai jenis objeknya.

## Deskripsi Kelas

1. **`Bentuk.java`**  
   Kelas induk yang menyimpan atribut warna (`Warna`) serta menyediakan accessor dan mutator untuk warna. Metode `printInfo()` menampilkan informasi dasar bentuk.

2. **`BujurSangkar.java`**  
   Turunan dari `Bentuk` yang menyimpan panjang sisi. Metode `hitungLuas()` menghitung luas dengan rumus sisi × sisi, sedangkan `printInfo()` menampilkan warna dan luas bujur sangkar.

3. **`Lingkaran.java`**  
   Turunan dari `Bentuk` yang menyimpan jari-jari. Metode `hitungLuas()` menghitung luas dengan rumus π × jari-jari², dan `printInfo()` menampilkan warna serta luas lingkaran.

4. **`Silinder.java`**  
   Turunan dari `Lingkaran` yang menambahkan atribut tinggi. Metode `hitungVolume()` menghitung volume dengan mengalikan luas alas lingkaran dengan tinggi. Metode `printInfo()` menampilkan warna dan volume silinder.

5. **`Main.java`**  
   Kelas utama yang menguji pembuatan objek setiap bentuk secara langsung, kemudian menyimpan beberapa objek turunan dalam array bertipe `Bentuk`. Pemanggilan `printInfo()` melalui array tersebut menunjukkan polimorfisme: implementasi yang dijalankan mengikuti jenis objek sebenarnya.

## Cara Menjalankan

Pastikan Java Development Kit (JDK) telah terpasang. Dari direktori utama repositori, kompilasi dan jalankan program dengan:

```bash
javac -d out src/*.java
java -cp out Main
```

## Hasil Eksekusi Program (Output)

Berikut tangkapan layar hasil eksekusi program:

![Hasil output program](Program_Output/Screenshot%202026-10-09%20130631.png)

Program menampilkan hasil untuk dua skenario:

1. **Instansiasi langsung:** informasi bujur sangkar merah, lingkaran biru, dan silinder kuning.
2. **Polimorfisme:** objek bujur sangkar hijau, lingkaran ungu, dan silinder oranye disimpan dalam array `Bentuk`, lalu masing-masing menampilkan informasi melalui implementasi `printInfo()` miliknya.

Nilai luas dan volume lingkaran/silinder menggunakan `Math.PI`, sehingga hasilnya ditampilkan sebagai bilangan desimal.