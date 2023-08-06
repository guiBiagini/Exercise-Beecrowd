import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	
        Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if (-b + Math.sqrt(delta) == 0 || -b - Math.sqrt(delta) == 0 || delta == 0 || delta < 0)
			System.out.println("Impossivel calcular");
		else {
			double r1 = (-b + Math.sqrt(delta))/ (2*a);
			double r2 = (-b - Math.sqrt(delta))/ (2*a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
    }
}
