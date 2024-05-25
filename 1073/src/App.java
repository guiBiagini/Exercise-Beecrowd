
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        N = scanner.nextInt();
        if (5 < N && N < 2000) 
            for (int i = 0; i <= N; i++) 
                if (i % 2 == 0 && i != 0) 
                    System.out.println(i + "^2 = " + (i * i));         
    }
}