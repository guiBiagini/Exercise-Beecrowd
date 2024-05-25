import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = 0, a = 0;
        N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            a = scanner.nextInt();
            if (a % 2 == 0 && a != 0)
                if (a > 0)
                    System.out.println("EVEN POSITIVE");
                else
                    System.out.println("EVEN NEGATIVE");
            else if (a % 2 != 0 && a != 0)
                if (a > 0)
                    System.out.println("ODD POSITIVE");
                else
                    System.out.println("ODD NEGATIVE");
            else
                System.out.println("NULL");
        }
    }
}