import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int minutoInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int minutoFinal = scanner.nextInt();
        scanner.close();

        int mt1 = (horaInicial * 60) + minutoInicial;
        int mt2 = (horaFinal * 60) + minutoFinal;
        int h24 = (24 * 60);
        int resultado = 0;
        if (mt2 > mt1) {
            resultado = mt2 - mt1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (resultado / 60), (resultado % 60));
        } else if (mt1 > mt2) {
            resultado = (h24 - mt1) + (mt2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (resultado / 60), (resultado % 60));
        } else if (mt2 == mt1) {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 24, 0);
        }

    }
}
