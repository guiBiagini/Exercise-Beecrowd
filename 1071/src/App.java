import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int resposta = 0;

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 != 0) {
                    resposta += i;
                }
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                if (i % 2 != 0) {
                    resposta += i;
                }
            }
        }
        System.out.println(resposta);
    }
}
