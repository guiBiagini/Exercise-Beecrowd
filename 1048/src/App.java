import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        scanner.close();
        double novoSalario, reajuste;
        int percentual;

        if (salario > 0 && salario <= 400) {
            novoSalario = (salario * 0.15) + salario;
            percentual = 15;
        } else if (salario > 400 && salario <= 800) {
            novoSalario = (salario * 0.12) + salario;
            percentual = 12;
        } else if (salario > 800 && salario <= 1200) {
            novoSalario = (salario * 0.10) + salario;
            percentual = 10;
        } else if (salario > 1200 && salario <= 2000) {
            novoSalario = (salario * 0.07) + salario;
            percentual = 7;
        } else {
            novoSalario = (salario * 0.04) + salario;
            percentual = 4;
        }

        reajuste = novoSalario - salario;
        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

    }
}
