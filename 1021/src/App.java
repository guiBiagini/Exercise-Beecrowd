import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
		Scanner scanner = new Scanner(System.in);

		double notas[] = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};
		double moedas[] = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
		int qtdNota, qtdMoeda;
	
		double valor = scanner.nextDouble();
		valor = (valor * 100) + 0.05;
	
		System.out.println("NOTAS:");
		for (int i = 0; i < notas.length; i++) {
			qtdNota = (int) (valor / (notas[i] * 100));
			valor %= notas[i] * 100;
			System.out.printf("%d nota(s) de R$ %.2f%n", qtdNota, notas[i]);
		}
	
		System.out.println("MOEDAS:");
		for (int i = 0; i < moedas.length; i++) {
			qtdMoeda = (int) (valor / (moedas[i] * 100));
			valor %= moedas[i] * 100;
			System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoeda, moedas[i]);
		}
    }
}
