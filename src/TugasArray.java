import java.util.Scanner;

public class TugasArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData;

        // Pastikan jumlah data minimal satu.
        do {
            System.out.print("Masukkan jumlah nilai mahasiswa (minimal 1): ");
            while (!input.hasNextInt()) {
                System.out.print("Masukkan bilangan bulat. Coba lagi: ");
                input.next();
            }
            jumlahData = input.nextInt();
            if (jumlahData < 1) System.out.println("Jumlah data harus minimal 1.");
        } while (jumlahData < 1);

        int[] nilai = new int[jumlahData];
        int total = 0;
        int tertinggi = Integer.MIN_VALUE;
        int terendah = Integer.MAX_VALUE;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            while (!input.hasNextInt()) {
                System.out.print("Nilai harus bilangan bulat. Masukkan lagi: ");
                input.next();
            }
            nilai[i] = input.nextInt();
            total += nilai[i];
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        double rataRata = (double) total / nilai.length;
        System.out.println("\n=== RINGKASAN NILAI ===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
        System.out.println("Jumlah nilai : " + total);
        System.out.printf("Rata-rata    : %.2f%n", rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        input.close();
    }
}
