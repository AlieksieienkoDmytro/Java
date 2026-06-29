import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int anzahl;

        while (true) {

            System.out.print("Anzahl der Ziehungen: ");

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

        // Create the lottery array
        int[] lotto = new int[anzahl];

        // Generate random numbers from 1 to 45
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(45) + 1;
        }

        // Create the statistics array
        int[] statistik = new int[46];

        // Count every number
        for (int zahl : lotto) {
            statistik[zahl]++;
        }

        System.out.println("\nGezogene Zahlen:");

        for (int zahl : lotto) {
            System.out.print(zahl + " ");
        }

        System.out.println("\n\n===== Statistik =====");

        for (int i = 1; i <= 45; i++) {

            double prozent = (double) statistik[i] / lotto.length * 100;

            System.out.println(i + " - " + statistik[i] + " mal (" + prozent + "%)");
        }
    }
}