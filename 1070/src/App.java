import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        scanner.close();
        if (x % 2 == 0)
            x++;
        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x += 2;
        }

    }
}
