import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100 + 0.5);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");

        if (numberOfOneDollars > 0) {
            if (numberOfOneDollars > 1)
                System.out.print(" " + numberOfOneDollars + " dollars");
            else
                System.out.print(" " + numberOfOneDollars + " dollar");
        }

        if (numberOfQuarters > 0) {
            if (numberOfQuarters > 1)
                System.out.print(" " + numberOfQuarters + " quarters ");
            else
                System.out.print(" " + numberOfQuarters + " quarter ");
        }

        if (numberOfDimes > 0) {
            if (numberOfDimes > 1)
                System.out.print(" " + numberOfDimes + " dimes");
            else
                System.out.print(" " + numberOfDimes + " dime");
        }

        if (numberOfNickels > 0) {
            System.out.print(" " + numberOfNickels + " nickel");
        }

        if (numberOfPennies > 0) {
            if (numberOfPennies > 1)
                System.out.print(" and " + numberOfPennies + " pennies");
            else
                System.out.print(" and " + numberOfPennies + " penny");
        }

    }
}
