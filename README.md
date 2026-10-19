# Jobsheet 6 — Looping dan Array

**Mata kuliah:** Praktikum Pemrograman Java  
**Nama:** [Isi nama] · **NIM:** [Isi NIM] · **Kelas:** [Isi kelas]

## Tujuan Pembelajaran
1. Memahami perulangan `for`, `while`, dan `do-while`.
2. Menggunakan array satu dimensi untuk menyimpan data.
3. Mengolah data dengan perulangan, termasuk menghitung total, rata-rata, dan kategori bilangan.

## Ringkasan Materi
Looping/perulangan menjalankan instruksi berulang kali. `for` cocok saat jumlah pengulangan diketahui, `while` mengulang selama kondisi benar, dan `do-while` menjalankan isi setidaknya satu kali sebelum memeriksa kondisi. Array menyimpan sejumlah nilai bertipe sama dalam satu variabel; indeks array dimulai dari 0. Perulangan memudahkan program membaca dan mengolah setiap elemen array.

## Program A — TugasLooping.java
Menampilkan angka 1–10 dengan `for`, angka genap 2–20 dengan `while`, lalu tabel perkalian angka pilihan (1–12) dengan `do-while`.

**Contoh input:** `7`  
**Contoh output inti:** angka 1 sampai 10; genap 2 sampai 20; tabel `7 x 1 = 7` hingga `7 x 10 = 70`.

![Output Program Looping](image/output-looping.png)

## Program B — TugasArray.java
Meminta jumlah nilai mahasiswa (minimal satu), mengisi array `int`, lalu menampilkan seluruh nilai, jumlah, rata-rata, nilai tertinggi, dan nilai terendah.

**Contoh input:** jumlah `4`, lalu nilai `80`, `70`, `90`, `60`.  
**Output inti:** jumlah `300`, rata-rata `75.00`, tertinggi `90`, terendah `60`.

![Output Program Array](image/output-array.png)

## Program C — TugasLoopingArray.java
Meminta beberapa bilangan, menyimpannya dalam array, menampilkan isinya, dan menghitung banyak bilangan genap/ganjil serta totalnya.

**Contoh input:** jumlah `5`, lalu `2`, `7`, `4`, `9`, `10`.  
**Output inti:** genap `3`, ganjil `2`, total `32`.

![Output Program Looping dan Array](image/output-looping-array.png)

## Kompilasi dan Menjalankan (Windows)
Pastikan JDK telah terpasang. Buka Command Prompt, lalu jalankan:

```bat
cd /d D:\learningjava\Jobsheet6
javac -d out src\TugasLooping.java src\TugasArray.java src\TugasLoopingArray.java
java -cp out TugasLooping
java -cp out TugasArray
java -cp out TugasLoopingArray
```

Masing-masing perintah `java` menjalankan program terpisah. Masukkan data sesuai prompt. Ketiga program menolak input non-angka dan meminta ulang; program array juga meminta jumlah data minimal 1.

## Kesimpulan
Array menjadi tempat penyimpanan banyak data sejenis, sedangkan looping membantu mengisi, menampilkan, dan mengolah seluruh data tersebut tanpa menulis instruksi yang sama berulang kali. Keduanya merupakan dasar penting dalam pembuatan program pengolahan data.

## Catatan Output
Gambar pada folder `image` adalah tampilan output uji yang dirender dari hasil eksekusi program yang benar-benar dijalankan (bukan tangkapan layar desktop). Output teks mentah juga disertakan dengan nama yang sama berekstensi `.txt` untuk pemeriksaan.
