import java.util.Scanner;

public class TugasLooping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PERULANGAN FOR: ANGKA 1-10 ===");
        for (int angka = 1; angka <= 10; angka++) {
            System.out.print(angka + (angka < 10 ? ", " : "\n"));
        }

        System.out.println("\n=== PERULANGAN WHILE: ANGKA GENAP 2-20 ===");
        int genap = 2;
        while (genap <= 20) {
            System.out.print(genap + (genap < 20 ? ", " : "\n"));
            genap += 2;
        }

        System.out.println("\n=== TABEL PERKALIAN (DO-WHILE) ===");
        int angkaPerkalian;
        do {
            System.out.print("Masukkan angka 1-12: ");
            while (!input.hasNextInt()) {
                System.out.print("Input harus berupa bilangan bulat. Masukkan lagi: ");
                input.next();
            }
            angkaPerkalian = input.nextInt();
            if (angkaPerkalian < 1 || angkaPerkalian > 12) {
                System.out.println("Angka harus berada di antara 1 dan 12.");
            }
        } while (angkaPerkalian < 1 || angkaPerkalian > 12);

        int pengali = 1;
        do {
            System.out.println(angkaPerkalian + " x " + pengali + " = " + (angkaPerkalian * pengali));
            pengali++;
        } while (pengali <= 10);

        input.close();
    }
}
