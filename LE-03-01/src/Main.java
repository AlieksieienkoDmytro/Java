import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String bezeichnung;
        int stuckzahl;
        double einzelpreis;

        System.out.println("=================================");
        System.out.println("     BESTELLUNG ERFASSEN");
        System.out.println("=================================");

        System.out.print("Bezeichnung: ");
        bezeichnung = scanner.nextLine();

        while (true) {

            System.out.print("Stückzahl: ");

            // checking the integer
            if (scanner.hasNextInt()) {
                stuckzahl = scanner.nextInt();
                break;
            } else {
                System.out.println("Fehler! Bitte eine ganze Zahl eingeben.");
                scanner.next();
            }
        }

        while (true) {

            System.out.print("Einzelpreis: ");

            // checking the float
            if (scanner.hasNextFloat()) {
                einzelpreis = scanner.nextFloat();
                break;
            } else {
                System.out.println("Fehler! Bitte eine Kommazahl eingeben.");
                scanner.next();
            }
        }

        System.out.println("\n========== BESTELLUNG ==========");
        System.out.println("Bezeichnung : " + bezeichnung);
        System.out.println("Stückzahl   : " + stuckzahl);
        System.out.printf("Einzelpreis : %.2f €%n", einzelpreis);
    }
}