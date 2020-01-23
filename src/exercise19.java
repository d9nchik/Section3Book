import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three edges: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        if (x + y <= z || x + z <= y || y + z <= x)
            System.out.println("Input is invalid");
        else
            System.out.println("Perimeter is equal " + (x + y + z));
    }
}
