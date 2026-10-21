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
