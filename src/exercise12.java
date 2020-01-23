import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int threeDigitInteger = input.nextInt();

        int a = threeDigitInteger % 10;
        int c = threeDigitInteger / 100;

        if (a==c)
            System.out.println(threeDigitInteger + " is a palindrome");
        else
            System.out.println(threeDigitInteger + " is not a palindrome");
    }
}
