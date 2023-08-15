import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String nivel1 = scanner.nextLine();
        String nivel2 = scanner.nextLine();
        String nivel3 = scanner.nextLine();
        String animal = "vazio";
        scanner.close();

        if (nivel1 == "vertebrado") {
            if (nivel2 == "ave")
                if (nivel3 == "carnivo")
                    animal = "aguia";
                else if (nivel3 == "onivoro")
                    animal = "pomba";
                else if (nivel2 == "mamifero")
                    if (nivel3 == "onivoro")
                        animal = "homem";
                    else if (nivel3 == "herbivoro")
                        animal = "vaca";
        } else {
            if (nivel2 == "inseto")
                if (nivel3 == "hematofago")
                    animal = "pulga";
                else if (nivel3 == "herbivoro")
                    animal = "largata";
                else if (nivel2 == "anelideo")
                    if (nivel3 == "hematofago")
                        animal = "sanguessuga";
                    else if (nivel3 == "onivoro")
                        animal = "minhoca";
        }
        System.out.println(animal);
    }
}
