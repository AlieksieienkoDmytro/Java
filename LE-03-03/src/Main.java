import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startpunkt;
        int endpunkt;
        int schrittweite;

        while (true) {

            System.out.print("Startpunkt eingeben: ");

            if (scanner.hasNextInt()) {
                startpunkt = scanner.nextInt();
                break;
            } else {
                System.out.println("Fehler! Bitte eine ganze Zahl eingeben.");
                scanner.next();
            }
        }

        while (true) {

            System.out.print("Endpunkt eingeben: ");

            if (scanner.hasNextInt()) {
                endpunkt = scanner.nextInt();
                break;
            } else {
                System.out.println("Fehler! Bitte eine ganze Zahl eingeben.");
                scanner.next();
            }
        }

        while (true) {

            System.out.print("Schrittweite eingeben: ");

            if (scanner.hasNextInt()) {
                schrittweite = scanner.nextInt();

                if (schrittweite <= 0 || schrittweite > endpunkt) {
                    System.out.println("Fehler! Bitte eine ganze Zahl größer als 0 eingeben.");

                } else  {
                    break;
                }

            } else {
                System.out.println("Fehler! Bitte eine ganze Zahl eingeben.");
                scanner.next();
            }
        }

        for (int i = startpunkt; i <= endpunkt; i += schrittweite) {
            System.out.println(i);
        }
    }
}
