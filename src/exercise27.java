import java.util.Scanner;

public class exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point’s x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.print("The point is ");
        if (!(x < 200 && x > 0 && y < (200 - x) / 2))
            System.out.print("not ");
        System.out.println("in the triangle");
    }
}
