import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();
        if (a % b == 0 || b % a == 0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");
    }
}
