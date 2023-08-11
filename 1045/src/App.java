import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double[] ordena = new double[3];
        for (int i = 0; i < 3; i++) {
            ordena[i] = scanner.nextDouble();
        }

        Arrays.sort(ordena);

        double a = ordena[2];
        double b = ordena[1];
        double c = ordena[0];
        scanner.close();

        if (a < b + c) {
            if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)))
                System.out.println("TRIANGULO RETANGULO");
            if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2)))
                System.out.println("TRIANGULO OBTUSANGULO");
            if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2)))
                System.out.println("TRIANGULO ACUTANGULO");
            if (a == b && a == c && b == c)
                System.out.println("TRIANGULO EQUILATERO");
            if (a == b && b != c || b == c && a != c || c == a && b != a)
                System.out.println("TRIANGULO ISOSCELES");
        } else
            System.out.println("NAO FORMA TRIANGULO");
    }
}
