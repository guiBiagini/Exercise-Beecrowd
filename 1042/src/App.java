import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double k = scanner.nextDouble();

        scanner.close();

        double[] ordena = { x, y, k };
        double[] ordem = { x, y, k };

        Arrays.sort(ordena);

        for (int i = 0; i < ordena.length; i++)
            System.out.printf("%.0f%n", ordena[i]);

        System.out.println("");

        for (int j = 0; j < ordena.length; j++)
            System.out.printf("%.0f%n", ordem[j]);
    }
}
