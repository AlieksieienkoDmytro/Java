import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int anzahl;
        int nichtEmpfehlenswert = 0;
        int akzeptabel = 0;
        int hervorragend = 0;
        int summe = 0;

        while (true) {

            System.out.print("Anzahl der Testpersonen: ");

            if (scanner.hasNextInt()) {

                anzahl = scanner.nextInt();

                if (anzahl > 0) {
                    break;
                } else {
                    System.out.println("Bitte eine Zahl größer als 0 eingeben.");
                }

            } else {
                System.out.println("Fehler! Bitte eine ganze Zahl eingeben.");
                scanner.next();
            }
        }

        int[] bewertungen = new int[anzahl];

        // Generate random ratings
        for (int i = 0; i < bewertungen.length; i++) {
            bewertungen[i] = random.nextInt(3) + 1;
        }

        // Count the ratings
        for (int bewertung : bewertungen) {

            summe += bewertung;

            if (bewertung == 1) {
                nichtEmpfehlenswert++;
            } else if (bewertung == 2) {
                akzeptabel++;
            } else {
                hervorragend++;
            }
        }

        // Calculate percentages
        double prozent1 = (double) nichtEmpfehlenswert / anzahl * 100;
        double prozent2 = (double) akzeptabel / anzahl * 100;
        double prozent3 = (double) hervorragend / anzahl * 100;

        // Calculate average rating
        double durchschnitt = (double) summe / anzahl;


        System.out.println("\nBewertungen:");
        for (int bewertung : bewertungen) {
            System.out.print(bewertung + " ");
        }

        System.out.println("\n\n===== Ergebnis =====");
        System.out.println("Nicht empfehlenswert: " + nichtEmpfehlenswert + " (" + prozent1 + "%)");
        System.out.println("Akzeptabel: " + akzeptabel + " (" + prozent2 + "%)");
        System.out.println("Hervorragend: " + hervorragend + " (" + prozent3 + "%)");
        System.out.println("Gesamtbewertung: " + durchschnitt);
    }
}