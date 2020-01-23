import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coin = (int) (Math.random() * 2);

        System.out.print("Enter 0 for head or 1 - tail: ");
        int choice = input.nextInt();

        if (coin == choice)
            System.out.println("You are right!");
        else if (choice > 1 || choice < 0)
            System.out.println("Data input is incorrect");
        else
            System.out.println("You loose");
    }
}
