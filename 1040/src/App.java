import java.util.Scanner; 
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		double n4 = scanner.nextDouble();

		double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
		System.out.println("Media: " + df.format(media));
		if (media >= 7)
			System.out.println("Aluno aprovado.");
		else if (media < 5)
			System.out.println("Aluno reprovado.");
		else {
			System.out.println("Aluno em exame.");
			double n5 = scanner.nextDouble();
			System.out.println("Nota do exame: " + df.format(n5));
			media = (media + n5) / 2;
			System.out.println(media >= 5.0 ? "Aluno aprovado." : "Aluno reprovado.");
			System.out.println("Media final: " + df.format(media));

		}
    }
}
