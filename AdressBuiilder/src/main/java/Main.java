import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please provide the following information:");
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.println("\nBilling Street: ");
        String billingStreet = scanner.nextLine();
        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();
        System.out.println("Billing State: ");
        String billingState = scanner.nextLine();
        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine();
        System.out.println("\nShipping Street: ");
        String shippingStreet = scanner.nextLine();
        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();
        scanner.close();

        StringBuilder adresses = new StringBuilder();

        adresses.append(fullName);
        adresses.append("\n\n" + billingStreet + "\n" + billingCity + ", " + billingState + " " + billingZip);
        adresses.append("\n\n" + shippingStreet + "\n" + shippingCity + ", " + shippingState + " " +shippingZip);
        String myAdresses = adresses.toString();
        System.out.println(myAdresses);
    }
}
