import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int horaInicio = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        scanner.close();
        int totalHora = (24 - horaInicio) + horaFinal;
        if (totalHora > 24)
            totalHora = totalHora - 24;
        System.out.println("O JOGO DUROU " + totalHora + " HORA(S)");
    }
}
