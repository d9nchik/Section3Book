import java.util.Scanner;

public class exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int GMT = input.nextInt();
        long timeMS = System.currentTimeMillis();
        long timeS = timeMS / 1000;
        long seconds = timeS % 60;
        long timeM = timeS / 60;
        long minutes = timeM % 60;
        long timeH = timeM / 60;
        long hours = timeH % 24;

        if (hours+GMT>11)
            System.out.print("The current time is " + (hours+GMT-12) + ":"+minutes+":"+seconds +" PM");
        else
            System.out.print("The current time is " + (hours+GMT) + ":"+minutes+":"+seconds +" AM");
    }
}
