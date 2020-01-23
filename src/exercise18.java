import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight of shipping: ");
        double weight = input.nextDouble();
        System.out.print("The shipping will cost ");

        if (weight <=0 )
            System.out.print("Weight is incorrect");
        else if (weight<=2)
            System.out.print("2.5");
        else if (weight<=4)
            System.out.print("4,5");
        else if (weight<=10)
            System.out.print("7,5");
        else if (weight<=20)
            System.out.print("10,5");
        else
            System.out.print("Overweight");

        System.out.print(" pounds.");

    }
}
