import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (b < a && b <= c) {
            int temp = b;
            b = a;
            a = temp;
        } else if (c < a) {
            int temp = c;
            c = a;
            a = temp;
        }

        if (b > c) {
            int temp = c;
            c = b;
            b = temp;
        }

        System.out.println("Sorted numbers: " + a + " " + b + " " + c);
    }
}
