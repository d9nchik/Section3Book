public class exercise2 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        int c = (int) (Math.random() * 10) + 1;

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("What is " + a + " * " + b + " * " + c + "? ");
        int answer = input.nextInt();
        System.out.println(a + " * " + b + " * " + c + " = " + answer + " is " + (a * b * c == answer));
    }
}
