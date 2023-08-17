import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int[] dddArray = { 61, 71, 11, 21, 32, 19, 27, 31 };
        String[] cityArray = { "Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas",
                "Vitoria", "Belo Horizonte" };

        int ddd = scanner.nextInt();
        scanner.close();

        String city = "DDD não cadastrado";

        for (int i = 0; i < dddArray.length; i++) {
            if (dddArray[i] == ddd) {
                city = cityArray[i];
                break;
            }
        }
        System.out.println(city);

    }
}
