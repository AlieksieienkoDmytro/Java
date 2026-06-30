import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] hexArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        String hex = "";

        while (true) {

            System.out.print("HEX-Farbcode eingeben: ");
            hex = scanner.nextLine();

            if (hex.startsWith("#")) {
                hex = hex.substring(1);
            }

            if (hex.length() != 6) {
                System.out.println("Ungültige Länge!");
                continue;
            }

            char[] eingabe = hex.toUpperCase().toCharArray();

            boolean gultig = true;

            for (char c : eingabe) {

                boolean gefunden = false;

                for (char zeichen : hexArray) {

                    if (c == zeichen) {
                        gefunden = true;
                        break;
                    }
                }

                if (!gefunden) {
                    gultig = false;
                    break;
                }
            }

            if (!gultig) {
                System.out.println("Ungültiger HEX-Code!");
                continue;
            }
            break;
        }

        String rotHex = hex.substring(0, 2);
        String grunHex = hex.substring(2, 4);
        String blauHex = hex.substring(4, 6);

        int rot = Integer.parseInt(rotHex, 16);
        int grun = Integer.parseInt(grunHex, 16);
        int blau = Integer.parseInt(blauHex, 16);

        System.out.println("Rot: " + rot);
        System.out.println("Grün: " + grun);
        System.out.println("Blau: " + blau);
    }
}