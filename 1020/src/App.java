import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

		int idade = scanner.nextInt();
		int ano = 0;
		int mes = 0;
		int dia = 0;

		if (idade > 365)
			ano = idade / 365;
		mes = (idade % 365) / 30;
		dia = idade - ((365 * ano) + (30 * mes));

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
    }
}
