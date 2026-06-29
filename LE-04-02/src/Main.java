import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Variable for the Caesar shift
        int verschiebung;

        System.out.print("Text eingeben: ");
        String text = scanner.nextLine();

        // Validate the shift value
        while (true) {

            System.out.print("Verschiebung eingeben: ");

            if (scanner.hasNextInt()) {
                verschiebung = scanner.nextInt();
                break;
            } else {
                System.out.println("Fehler! Bitte eine ganze Zahl eingeben.");
                scanner.next();
            }
        }

        char[] chars = text.toCharArray();

        // Encrypt every character
        for (int i = 0; i < chars.length; i++) {

            char c = chars[i];

            c += verschiebung;

            chars[i] = c;
        }

        System.out.print("Verschlüsselter Text: ");
        for (char c : chars) {
            System.out.print(c);
        }
    }
}