import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double a;
        int j = 0, s = 0, d = 0, p = 0;
        for (int i = 1; i <= 5; i++) {
            a = scanner.nextDouble();
            if (a % 2 == 0)
                j += 1;
            else
                s += 1;
            if (a > 0)
                d += 1;
            else if (a < 0)
                p += 1;
        }
        scanner.close();
        System.out.println(j + " valor(es) par(es)");
        System.out.println(s + " valor(es) impar(es)");
        System.out.println(d + " valor(es) positivo(s)");
        System.out.println(p + " valor(es) negativo(s)");
    }
}
