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
