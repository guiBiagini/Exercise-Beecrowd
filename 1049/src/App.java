import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String nivel1 = scanner.nextLine();
        String nivel2 = scanner.nextLine();
        String nivel3 = scanner.nextLine();
        String animal = "vazio";
        scanner.close();

        if (nivel1.contentEquals("vertebrado")) {
            if (nivel2.contentEquals("ave")) {
                if (nivel3.contentEquals("carnivoro"))
                    animal = "aguia";
                else if (nivel3.contentEquals("onivoro"))
                    animal = "pomba";
            } else if (nivel2.contentEquals("mamifero")) {
                if (nivel3.contentEquals("onivoro"))
                    animal = "homem";
                else if (nivel3.contentEquals("herbivoro"))
                    animal = "vaca";
            }
        } else if (nivel1.contentEquals("invertebrado")) {
            if (nivel2.contentEquals("inseto")) {
                if (nivel3.contentEquals("hematofago"))
                    animal = "pulga";
                else if (nivel3.contentEquals("herbivoro"))
                    animal = "lagarta";
            } else if (nivel2.contentEquals("anelideo")) {
                if (nivel3.contentEquals("hematofago"))
                    animal = "sanguessuga";
                else if (nivel3.contentEquals("onivoro"))
                    animal = "minhoca";
            }
        }
        System.out.println(animal);
    }
}
