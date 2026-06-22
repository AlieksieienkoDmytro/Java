import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float unteresLimit;
        float oberesLimit;

        while (true) {

            System.out.print("Unteres Preislimit: ");

            if (scanner.hasNextFloat()) {
                unteresLimit = scanner.nextFloat();
                break;
            } else {
                System.out.println("Fehler! Bitte eine Zahl eingeben.");
                scanner.next();
            }
        }

        while (true) {

            System.out.print("Oberes Preislimit: ");

            if (scanner.hasNextFloat()) {
                oberesLimit = scanner.nextFloat();

                if (oberesLimit <= unteresLimit) {
                    System.out.println("Das obere Limit muss größer sein.");
                } else {
                    break;
                }

            } else {
                System.out.println("Fehler! Bitte eine Zahl eingeben.");
                scanner.next();
            }
        }

        float schritt = (oberesLimit - unteresLimit) / 10;

        System.out.print("\t");

        for (float preis = unteresLimit; preis <= oberesLimit; preis += schritt) {
            System.out.print(preis + " ");
        }

        System.out.println();

        for (int stuck = 10; stuck <= 100; stuck += 10) {

            System.out.print(stuck + ": ");

            for (float preis = unteresLimit; preis <= oberesLimit; preis += schritt) {

                System.out.print((stuck * preis) + " ");

            }

            System.out.println();
        }
    }
}