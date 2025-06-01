import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter game score in this format \"Home:Visitor|21:9\": ");
        String userInput = scanner.nextLine();
        String[] userInputParts = userInput.split("[:|]");
        int firstScore = Integer.parseInt(userInputParts[2]);
        int secondScore = Integer.parseInt(userInputParts[3]);
        if (firstScore > secondScore) {
            System.out.println("Winner: " + userInputParts[0]);
        } else if (secondScore > firstScore) {
            System.out.println("Winner: " + userInputParts[1]);
        } else if (firstScore == secondScore) {
            System.out.println("It's a tie!");
        } else {
            System.out.println("COULD NOT CALCULATE WINNER");
        }

    }
}
