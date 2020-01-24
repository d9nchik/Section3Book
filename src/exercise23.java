import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        System.out.print("Point (" +x+", " +y +") is");

        if (!(x<5&&x>-5&&y<2.5&&y>-2.5))
            System.out.print(" not");

        System.out.println(" in the rectangle");
    }
}
