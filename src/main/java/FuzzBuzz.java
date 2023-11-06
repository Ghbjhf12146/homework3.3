public class FuzzBuzz {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i <= 100; i++)
            if (i % 5 == 0)
                System.out.println(i + " - Buzz");
            else if (i % 3 == 0)
                System.out.println(i + " - fuzz");

    }
}
