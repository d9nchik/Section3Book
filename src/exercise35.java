import java.util.Scanner;

public class exercise35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.print(number + " is ");
        if (number % 2 == 0)
            System.out.print("even");
        else
            System.out.print("odd");
        System.out.println(" number");
    }
}
