import java.util.Scanner;

public class TugasLoopingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahData;
        do {
            System.out.print("Masukkan jumlah bilangan (minimal 1): ");
            while (!input.hasNextInt()) {
                System.out.print("Masukkan bilangan bulat. Coba lagi: ");
                input.next();
            }
            jumlahData = input.nextInt();
            if (jumlahData < 1) System.out.println("Jumlah data harus minimal 1.");
        } while (jumlahData < 1);

        int[] bilangan = new int[jumlahData];
        int total = 0;
        int jumlahGenap = 0;
        int jumlahGanjil = 0;

        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            while (!input.hasNextInt()) {
                System.out.print("Input harus bilangan bulat. Masukkan lagi: ");
                input.next();
            }
            bilangan[i] = input.nextInt();
            total += bilangan[i];
            if (bilangan[i] % 2 == 0) jumlahGenap++;
            else jumlahGanjil++;
        }

        System.out.println("\n=== HASIL PENGOLAHAN ARRAY ===");
        for (int i = 0; i < bilangan.length; i++) {
            System.out.println("Bilangan ke-" + (i + 1) + ": " + bilangan[i]);
        }
        System.out.println("Jumlah bilangan genap : " + jumlahGenap);
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
        System.out.println("Total seluruh bilangan: " + total);
        input.close();
    }
}
