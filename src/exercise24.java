public class exercise24 {
    public static void main(String[] args) {
        int rank = (int) (Math.random() * 13);
        int suit = (int) (Math.random() * 4);

        System.out.print("The card you pickesd is ");

        if (rank == 0)
            System.out.print("Ace");
        else if (rank == 10)
            System.out.print("Jack");
        else if (rank == 11)
            System.out.print("Queen");
        else if (rank == 12)
            System.out.print("King");
        else
            System.out.print((rank + 1));

        System.out.print(" of ");

        switch (suit) {
            case 0:
                System.out.println("Clubs");
                break;
            case 1:
                System.out.println("Diamonds");
                break;
            case 2:
                System.out.println("Hearts");
                break;
            case 3:
                System.out.println("Spades");
        }
    }
}
