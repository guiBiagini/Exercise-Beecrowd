import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva aqui ");
        int valor = scanner.nextInt();
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        if (valor >= 60) {
            minutos = valor / 60;
            segundos = valor % 60;
            if (minutos >= 60) {
                horas = minutos / 60;
                minutos = minutos % 60;
            }
        } else
            segundos = valor;

        System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}
