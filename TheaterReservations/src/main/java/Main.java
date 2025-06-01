import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter;

        System.out.print("Enter name for reservation: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter date you will be coming (yyyy/MM/dd): ");
        String date = scanner.nextLine().trim();
        System.out.print("How many tickets would you like?: ");
        String numberOfTickets = scanner.nextLine().trim();

        String[] nameParts = name.split(" ");
        String firstName = nameParts[0];
        String lastName = nameParts[1];

        formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dateOfReservation = LocalDate.parse(date, formatter);

        int tickets = Integer.parseInt(numberOfTickets);

        if (tickets == 1) {
            System.out.println(tickets + " ticket reserved for " +
                    dateOfReservation + " under " + lastName + ", " + firstName);
        } else if (tickets > 1) {
            System.out.println(tickets + " tickets reserved for " +
                    dateOfReservation + " under " + lastName + ", " + firstName);
        } else {
            System.out.println("Please select 1 or more tickets.");
        }
    }
}
