import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double METERS_PER_FEET = 1 / 3.2808;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        int feet = input.nextInt();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = inches * METERS_PER_INCH + feet * METERS_PER_FEET;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is " + bmi);

        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
