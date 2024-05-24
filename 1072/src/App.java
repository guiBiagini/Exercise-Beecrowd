import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int b = 0, in = 0, out = 0, n = 0;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            b = scanner.nextInt();
            if (b >= 10 && b <= 20)
                in++;
            else
                out++;
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
