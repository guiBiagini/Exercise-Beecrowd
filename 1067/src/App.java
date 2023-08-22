import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= x; i++)
            if (i % 2 != 0)
                System.out.println(i);
    }
}
