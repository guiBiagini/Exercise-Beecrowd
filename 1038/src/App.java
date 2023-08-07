import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int codigo = scanner.nextInt();
        int qtd = scanner.nextInt();
        double conta = 0;

        if (codigo == 1)
            conta = 4 * qtd;
        else if (codigo == 2)
            conta = 4.5 * qtd;
        else if (codigo == 3)
            conta = 5 * qtd;
        else if (codigo == 4)
            conta = 2 * qtd;
        else if (codigo == 5)
            conta = 1.5 * qtd;

        System.out.printf("Total: R$ %.2f%n", conta);
    }
}
