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
