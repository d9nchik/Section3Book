public class exercise16 {
    public static void main(String[] args) {
        double width = Math.random() * 50 - 25;
        double height = Math.random() * 150 - 75;

        System.out.println("( " + (int)(width*1000)/1000.0 + " ; " + (int)(height*1000)/1000.0 + " )");
    }
}
