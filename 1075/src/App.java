import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int x = 1; x <= 10000; x++) {
            if (x % n == 2)
                System.out.println(x);
        }

    }
}
