public class Table {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("\n");
            for (int j = i; j< 10; j++) {
                if ((i * j) < 9)
                    System.out.println("" + "" + "" + (i * j));
                else
                    System.out.println("" + "" + "" + (i * j));
            }
        }
    }
}