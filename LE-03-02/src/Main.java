import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int jahr;

        while (true) {

            System.out.print("Jahr eingeben: ");

            if (scanner.hasNextInt()) {
                jahr = scanner.nextInt();
                break;
            } else {
                System.out.println("Fehler! Bitte eine ganze Zahl eingeben.");
                scanner.next();
            }
        }

        if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
            System.out.println(jahr + " ist ein Schaltjahr.");
        } else {
            System.out.println(jahr + " ist kein Schaltjahr.");
        }
    }
}
