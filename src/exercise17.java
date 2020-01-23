import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computerChoice = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int userChoice = input.nextInt();

        System.out.print("The computer is ");

        whatSign(computerChoice);

        System.out.print(". You are ");

        whatSign(userChoice);

        if (computerChoice == userChoice)
            System.out.print(" too. It is draw");
        else if (computerChoice == 0 && userChoice == 2
                || computerChoice == 1 && userChoice == 0
                || computerChoice == 2 && userChoice == 1)
            System.out.print(". You loose");
        else
            System.out.print(". You won");

    }

    private static void whatSign(int userChoice) {
        switch (userChoice) {
            case 0:
                System.out.print("scissor");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper");
                break;
            default:
                System.out.println("/nData is incorrect!");
        }
    }
}
