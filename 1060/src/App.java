import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double a;
        int j = 0;
        for (int i = 1; i <= 6; i++) {
            a = scanner.nextDouble();
            if (a >= 0)
                j += 1;
        }
        System.out.println(j + " valores positivos");

    }
}
