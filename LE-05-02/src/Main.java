import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] zahlenArray = {'0','1','2','3','4', '5','6','7','8','9'};

        String[] teile = null;

        while (true) {

            System.out.print("IP-Adresse eingeben: ");
            String ip = scanner.nextLine();

            teile = ip.split("\\.");

            if (teile.length != 4) {
                System.out.println("Ungültige IP-Adresse!");
                continue;
            }

            boolean gultig = true;

            for (String teil : teile) {

                char[] eingabe = teil.toCharArray();

                for (char c : eingabe) {

                    boolean gefunden = false;

                    for (char zahl : zahlenArray) {

                        if (c == zahl) {
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

        int[] ipArray = new int[4];

        for (int i = 0; i < 4; i++) {
            ipArray[i] = Integer.parseInt(teile[i]);
        }

        System.out.println("Dezimal: "
                + ipArray[0] + "."
                + ipArray[1] + "."
                + ipArray[2] + "."
                + ipArray[3]);

        System.out.println("Binär: "
                + Integer.toBinaryString(ipArray[0]) + "."
                + Integer.toBinaryString(ipArray[1]) + "."
                + Integer.toBinaryString(ipArray[2]) + "."
                + Integer.toBinaryString(ipArray[3]));

        System.out.println("Oktal: "
                + Integer.toOctalString(ipArray[0]) + "."
                + Integer.toOctalString(ipArray[1]) + "."
                + Integer.toOctalString(ipArray[2]) + "."
                + Integer.toOctalString(ipArray[3]));

        System.out.println("Hex: "
                + Integer.toHexString(ipArray[0]).toUpperCase() + "."
                + Integer.toHexString(ipArray[1]).toUpperCase() + "."
                + Integer.toHexString(ipArray[2]).toUpperCase() + "."
                + Integer.toHexString(ipArray[3]).toUpperCase());
    }
}