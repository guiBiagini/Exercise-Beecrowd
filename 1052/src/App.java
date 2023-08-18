import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int[] valorArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 , 10 ,11 ,12 };
        String[] mesesArray = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

        int valor = scanner.nextInt();
        scanner.close();

        String mes = "mes nao cadastrado";

        for (int i = 0; i < valorArray.length; i++) {
            if (valorArray[i] == valor) {
                mes = mesesArray[i];
                break;
            }
        }
        System.out.println(mes);
    }
}
