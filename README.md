# LAPORAN PRAKTIKUM DASAR PEMROGRAMAN

## JOBSHEET 7 — LOOPS 1

**Nama:** Fauz Dino  
**NIM:** 264107020241  
**Program Studi:** D-IV Teknik Informatika  
**Kelas:** 1I  
**Politeknik Negeri Malang — Tahun Akademik 2026/2027**

Isi folder: `code/` menyimpan lima program Java, sedangkan `output/` menyimpan contoh keluaran yang sesuai dengan program.

---

# Kode, Penjelasan, dan Output

## Eksperimen 1 — FOR: nilai tertinggi/terendah dan kelulusan

Program membaca 10 nilai mahasiswa untuk mencari nilai tertinggi, terendah, serta jumlah mahasiswa lulus dan tidak lulus.

### Kode

```java
import java.util.Scanner;

public class SiakadFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score, highest = 0, lowest = 100;
        int pass = 0, fail = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score for student " + i + ": ");
            score = sc.nextDouble();
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
            if (score >= 60) pass++; else fail++;
        }
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Students passed: " + pass);
        System.out.println("Students failed: " + fail);
        sc.close();
    }
}
```

### Output contoh

```text
Enter score for student 1: 76.5
Enter score for student 2: 82.3
Enter score for student 3: 62.1
Enter score for student 4: 88.4
Enter score for student 5: 65.9
Enter score for student 6: 67.9
Enter score for student 7: 90.1
Enter score for student 8: 55.3
Enter score for student 9: 73.7
Enter score for student 10: 78.6
Highest score: 90.1
Lowest score: 55.3
Students passed: 9
Students failed: 1
```

Lihat berkas: `code/SiakadFor.java` dan `output/SiakadFor.txt`.

---

## Eksperimen 2 — WHILE: nilai dan grade

Program memvalidasi nilai 0–100, menentukan grade, mengulang input tidak valid, dan memberi pesan khusus untuk grade A.

### Kode

```java
import java.util.Scanner;

public class SiakadWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentCount = sc.nextInt();
        int i = 0;
        while (i < studentCount) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            int score = sc.nextInt();
            if (score < 0 || score > 100) {
                System.out.println("Invalid score. Please enter a valid score!");
                continue;
            }
            String grade;
            if (score > 80) grade = "A";
            else if (score > 73) grade = "B+";
            else if (score > 65) grade = "B";
            else if (score > 60) grade = "C+";
            else if (score > 50) grade = "C";
            else if (score > 39) grade = "D";
            else grade = "E";
            System.out.println("The grade of student " + (i + 1) + " is " + grade);
            if (grade.equals("A")) System.out.println("Well done, keep up the good work!");
            i++;
        }
        sc.close();
    }
}
```

### Output contoh

```text
Enter the number of students: 5
Enter score for student 1: 85
The grade of student 1 is A
Well done, keep up the good work!
Enter score for student 2: 63
The grade of student 2 is C+
Enter score for student 3: 101
Invalid score. Please enter a valid score!
Enter score for student 3: 23
The grade of student 3 is E
Enter score for student 4: -15
Invalid score. Please enter a valid score!
Enter score for student 4: 70
The grade of student 4 is B
Enter score for student 5: 55
The grade of student 5 is C
```

Lihat berkas: `code/SiakadWhile.java` dan `output/SiakadWhile.txt`.

---

## Eksperimen 3 — DO-WHILE: transaksi kafe

Program menghitung total belanja kopi, teh, dan roti berulang kali sampai nama pelanggan diisi cancel.

### Kode

```java
import java.util.Scanner;

public class CafeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int coffeePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        String customerName;
        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction canceled.");
                break;
            }
            System.out.print("Coffee quantity: "); int coffee = sc.nextInt();
            System.out.print("Tea quantity: "); int tea = sc.nextInt();
            System.out.print("Bread quantity: "); int bread = sc.nextInt();
            int totalPrice = coffee * coffeePrice + tea * teaPrice + bread * breadPrice;
            System.out.println("Total amount to pay: Rp " + totalPrice);
            sc.nextLine();
        } while (true);
        System.out.println("All transactions completed.");
        sc.close();
    }
}
```

### Output contoh

```text
Enter customer name (type 'cancel' to exit): Rena
Coffee quantity: 3
Tea quantity: 0
Bread quantity: 1
Total amount to pay: Rp 56000
Enter customer name (type 'cancel' to exit): Yuni
Coffee quantity: 1
Tea quantity: 4
Bread quantity: 2
Total amount to pay: Rp 80000
Enter customer name (type 'cancel' to exit): CANCEL
Transaction canceled.
All transactions completed.
```

Lihat berkas: `code/CafeDoWhile.java` dan `output/CafeDoWhile.txt`.

---

## Tugas 1 — Penjualan tiket bioskop

Program menghitung tiket dan pendapatan harian dengan diskon bertingkat serta mengulang masukan negatif.

### Kode

```java
import java.util.Scanner;

public class CinemaSales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ticketPrice = 50000;
        int totalTickets = 0;
        double totalRevenue = 0;
        System.out.println("Enter ticket quantity per customer (0 to finish).");
        while (true) {
            System.out.print("Ticket quantity: ");
            int quantity = sc.nextInt();
            if (quantity == 0) break;
            if (quantity < 0) {
                System.out.println("Invalid quantity. Please re-enter.");
                continue;
            }
            double discount = quantity > 10 ? 0.15 : quantity > 4 ? 0.10 : 0.0;
            double payment = quantity * ticketPrice * (1 - discount);
            totalTickets += quantity;
            totalRevenue += payment;
            System.out.printf("Customer payment: Rp %.0f (discount %.0f%%)%n", payment, discount * 100);
        }
        System.out.println("Total tickets sold: " + totalTickets);
        System.out.printf("Total ticket sales revenue: Rp %.0f%n", totalRevenue);
        sc.close();
    }
}
```

### Output contoh

```text
Enter ticket quantity per customer (0 to finish).
Ticket quantity: 3
Customer payment: Rp 150000 (discount 0%)
Ticket quantity: 5
Customer payment: Rp 225000 (discount 10%)
Ticket quantity: 12
Customer payment: Rp 510000 (discount 15%)
Ticket quantity: 0
Total tickets sold: 20
Total ticket sales revenue: Rp 885000
```

Lihat berkas: `code/CinemaSales.java` dan `output/CinemaSales.txt`.

---

## Tugas 2 — Biaya parkir

Program menghitung tarif mobil atau motor per jam dan berhenti saat tipe kendaraan 0 dimasukkan.

### Kode

```java
import java.util.Scanner;

public class ParkingFees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalFees = 0;
        System.out.println("Vehicle type: 1=Car, 2=Motorcycle, 0=Finish");
        while (true) {
            System.out.print("Enter vehicle type: ");
            int type = sc.nextInt();
            if (type == 0) break;
            if (type != 1 && type != 2) {
                System.out.println("Invalid vehicle type.");
                continue;
            }
            System.out.print("Enter parking hours: ");
            int hours = sc.nextInt();
            if (hours < 0) {
                System.out.println("Invalid hours.");
                continue;
            }
            int rate = type == 1 ? 3000 : 2000;
            int fee = rate * hours;
            totalFees += fee;
            System.out.println("Parking fee: Rp " + fee);
        }
        System.out.println("Total parking fees: Rp " + totalFees);
        sc.close();
    }
}
```

### Output contoh

```text
Vehicle type: 1=Car, 2=Motorcycle, 0=Finish
Enter vehicle type: 1
Enter parking hours: 3
Parking fee: Rp 9000
Enter vehicle type: 2
Enter parking hours: 2
Parking fee: Rp 4000
Enter vehicle type: 0
Total parking fees: Rp 13000
```

Lihat berkas: `code/ParkingFees.java` dan `output/ParkingFees.txt`.

---

# Pertanyaan dan Jawaban

## Eksperimen 1 — FOR

### Pertanyaan 1
Identifikasi komponen FOR loop pada kode Eksperimen 1.

**Jawaban:** `int i = 1` adalah inisialisasi; `i <= 10` adalah kondisi; `i++` adalah pembaruan; dan isi blok loop meminta skor, memperbarui nilai tertinggi/terendah, serta menghitung lulus/gagal.

### Pertanyaan 2
Mengapa `highest` diinisialisasi 0 dan `lowest` 100; apa akibat jika nilainya dibalik?

**Jawaban:** Karena skor sah diasumsikan berada pada rentang 0–100 sehingga nilai awal tersebut menjadi batas pembanding yang tepat. Jika dibalik (`highest=100`, `lowest=0`), skor yang semuanya di bawah 100 tidak akan memperbarui `highest`, dan skor di atas 0 tidak akan memperbarui `lowest`, sehingga hasil dapat keliru.

### Pertanyaan 3
Jelaskan fungsi potongan `if (score > highest)` dan `if (score < lowest)`.

**Jawaban:** Kedua kondisi membandingkan skor saat ini dengan nilai ekstrem tersimpan; jika skor lebih besar dari `highest`, nilai tertinggi diganti, dan jika lebih kecil dari `lowest`, nilai terendah diganti.

### Pertanyaan 4
Modifikasi program untuk menghitung mahasiswa lulus dan gagal dengan batas lulus 60.

**Jawaban:** Kode sudah dimodifikasi: setelah membaca skor, kondisi `score >= 60` menambah penghitung lulus; selainnya menambah penghitung gagal; keduanya dicetak sesudah nilai tertinggi dan terendah.

### Pertanyaan 5
Commit dan push program ke GitHub.

**Jawaban:** Berkas kode siap di-commit, tetapi commit/push tidak dilakukan karena belum ada repository remote atau instruksi akun GitHub yang terhubung.

## Eksperimen 2 — WHILE

### Pertanyaan 1
Jelaskan `score < 0 || score > 100` dan `continue`.

**Jawaban:** Operator `||` berarti OR, jadi skor dianggap tidak valid jika kurang dari 0 atau lebih dari 100; `continue` melewati sisa iterasi tersebut dan meminta skor untuk mahasiswa yang sama lagi.

### Pertanyaan 2
Mengapa `i++` ada di akhir loop; apa jika di awal?

**Jawaban:** Di akhir, penghitung bertambah hanya setelah skor valid diproses, sehingga input tidak valid tidak mengurangi jumlah mahasiswa yang harus dinilai; jika diletakkan di awal, input tidak valid juga menaikkan penghitung dan dapat melewati mahasiswa, serta nomor mahasiswa yang tampil bergeser.

### Pertanyaan 3
Jika jumlah mahasiswa 19, berapa kali WHILE berjalan?

**Jawaban:** Ada 19 iterasi untuk 19 skor valid; masukan tidak valid dapat menyebabkan iterasi tambahan karena `continue` mempertahankan indeks.

### Pertanyaan 4
Tambahkan pesan untuk mahasiswa yang mendapat A.

**Jawaban:** Sudah diterapkan dengan `if (grade.equals("A")) System.out.println("Well done, keep up the good work!");`.

### Pertanyaan 5
Commit dan push program ke GitHub.

**Jawaban:** Berkas kode siap di-commit, tetapi commit/push tidak dilakukan karena belum ada repository remote atau instruksi akun GitHub yang terhubung.

## Eksperimen 3 — DO-WHILE

### Pertanyaan 1
Jika nama pelanggan pertama `cancel`, berapa kali loop dieksekusi?

**Jawaban:** Satu kali, karena badan `do` tetap berjalan sekali sebelum kondisi diperiksa dan `break` langsung menghentikan loop saat cancel.

### Pertanyaan 2
Apa kondisi penghentian DO-WHILE?

**Jawaban:** Pengguna mengetik `cancel` (huruf besar/kecil tidak berpengaruh), lalu `break` menghentikan loop.

### Pertanyaan 3
Apa fungsi nilai `true` pada kondisi DO-WHILE?

**Jawaban:** `true` membuat perulangan terus berulang tanpa batas secara alami; penghentian dilakukan eksplisit oleh `break`.

### Pertanyaan 4
Mengapa loop berjalan tanpa komponen inisialisasi dan pembaruan?

**Jawaban:** DO-WHILE tidak mensyaratkan bagian inisialisasi/pembaruan seperti FOR; badan loop dijalankan, lalu kondisi boolean diperiksa, dan di sini `break` menjadi mekanisme keluar.

## Tugas

### Tugas 1 — Penjualan tiket bioskop
**Jawaban:** Implementasi `code/CinemaSales.java` membaca jumlah tiket tiap pelanggan hingga 0, menolak jumlah negatif, memberi diskon 10% untuk lebih dari 4 tiket dan 15% untuk lebih dari 10 tiket, lalu menampilkan jumlah tiket dan pendapatan total. Untuk jumlah 0–4 tidak ada diskon.

### Tugas 2 — Biaya parkir
**Jawaban:** Implementasi `code/ParkingFees.java` menggunakan tipe kendaraan 1 untuk mobil (Rp3.000/jam), 2 untuk motor (Rp2.000/jam), dan 0 untuk berhenti; biaya setiap kendaraan ditambahkan dan total dicetak di akhir. Karena flowchart di halaman sumber berupa gambar dan rincian simbolnya tidak terbaca dari teks, implementasi memakai asumsi input tipe kendaraan dan lama parkir sesuai deskripsi soal.
