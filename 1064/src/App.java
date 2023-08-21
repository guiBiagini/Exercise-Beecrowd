import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double a, media = 0;
        int j = 0;
        for (int i = 1; i <= 6; i++) {
            a = scanner.nextDouble();
            if (a >= 0) {
                j += 1;
                media += a;
            }
        }
        media = media / j;
        System.out.println(j + " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}
