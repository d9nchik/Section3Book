import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / 2 / a;
            double x2 = (-b - Math.sqrt(discriminant)) / 2 / a;
            System.out.println("The equation has two roots " + (int) (x1 * 1_000_000) / 1_000_000.0 +
                    " and " + (int) (x2 * 1_000_000) / 1_000_000.0);
        } else if (discriminant == 0) {
            double x = -b / 2 / a;
            System.out.println("The equation has one root " + (int) (x * 1_000_000) / 1_000_000.0);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
