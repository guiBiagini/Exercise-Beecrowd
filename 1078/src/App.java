import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        if (n > 2 && n < 1000)
            for (int i = 1; i <= 10; i++) {
                int x = i * n;
                System.err.println(i + " x " + n + " = " + x);
            }
    }
}
