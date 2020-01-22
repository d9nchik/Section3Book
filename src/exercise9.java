import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();

        int firstDigit = number % 10;
        number /= 10;
        int secondDigit = number % 10;
        number /= 10;
        int thirdDigit = number % 10;
        number /= 10;
        int fourthDigit = number % 10;
        number /= 10;
        int fifthDigit = number % 10;
        number /= 10;
        int sixthDigit = number % 10;
        number /= 10;
        int seventhDigit = number % 10;
        number /= 10;
        int eightthDigit = number % 10;
        number /= 10;
        int ninthDigit = number;

        int checkSum = (firstDigit * 9 + secondDigit * 8 + thirdDigit * 7 +
                fourthDigit * 6 + fifthDigit * 5 + sixthDigit * 4 +
                seventhDigit * 3 + eightthDigit * 2 + ninthDigit) % 11;
        System.out.print("The ISBN-10 number is " + ninthDigit + eightthDigit + seventhDigit +
                sixthDigit + fifthDigit + fourthDigit +
                thirdDigit + secondDigit + firstDigit);
        if (checkSum < 10)
            System.out.println(checkSum);
        else
            System.out.println("X");
    }
}
