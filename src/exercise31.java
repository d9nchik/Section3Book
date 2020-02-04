import java.util.Scanner;

public class exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        byte answer = input.nextByte();

        double yuan, dollars;

        switch (answer) {
            case 0:
                System.out.print("Enter the dollar amount: ");
                dollars = input.nextDouble();
                yuan = dollars * exchangeRate;
                System.out.println("$" + dollars + " is " + yuan + " yuan");
                break;
            case 1:
                System.out.print("Enter the RMB amount: ");
                yuan = input.nextDouble();
                dollars = yuan / exchangeRate;
                System.out.println(yuan + " yuan is $" + (int) (dollars * 100+0.5) / 100.0);
                break;
            default:
                System.out.println("Incorrect input");
        }
    }
}
