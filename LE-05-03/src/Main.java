import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bei spiel \"Der Artikel | Dasai Mochi | wurde bestellt von | Mochi Mochi\"");

        while (true) {

            System.out.print("Text eingeben: ");
            String text = scanner.nextLine();

            String[] teile = text.split("\\|");

            if  (teile.length != 4) {
                System.out.println("Ungültige Eingabe!");
                continue;
            }

            System.out.println("Artikel: " + teile[1].trim());
            System.out.println("Besteller: " + teile[3].trim());

            break;
        }
    }
}