
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        scanner.close();

        if (a + b > c && a + c > b && b + c > a) {
            double perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            double area = ((a + b) * c)/2;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}
