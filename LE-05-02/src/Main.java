import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] teile;
        String ip;

        while (true) {

            System.out.print("IP-Adresse eingeben: ");
            ip = scanner.nextLine();

            teile = ip.split("\\.");

            if (teile.length != 4) {
                System.out.println("Ungültige IP-Adresse!");
                continue;
            }

            boolean gultig = true;

            for (String teil : teile) {

                char[] eingabe = teil.toCharArray();

                for (char c : eingabe) {

                    if (!Character.isDigit(c)) {
                        gultig = false;
                        break;
                    }
                }

                if (!gultig) {
                    break;
                }

                int zahl = Integer.parseInt(teil);

                if (zahl < 0 || zahl > 255) {
                    gultig = false;
                    break;
                }
            }

            if (!gultig) {
                System.out.println("Ungültige IP-Adresse!");
                continue;
            }

            break;
        }

        String[] binar = new String[4];
        String[] oktal = new String[4];
        String[] hex = new String[4];

        for (int i = 0; i < 4; i++) {

            int zahl = Integer.parseInt(teile[i]);

            binar[i] = Integer.toBinaryString(zahl);
            oktal[i] = Integer.toOctalString(zahl);
            hex[i] = Integer.toHexString(zahl).toUpperCase();
        }

        String binarString = String.join(".", binar);
        String oktalString = String.join(".", oktal);
        String hexString = String.join(".", hex);

        System.out.println("Dezimal: " + ip);
        System.out.println("Binär: " + binarString);
        System.out.println("Oktal: " + oktalString);
        System.out.println("Hex: " + hexString);
    }
}