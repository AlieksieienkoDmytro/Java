import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Text eingeben: ");
        String text = scanner.nextLine();

        // Convert the text into a character array
        char[] buchstaben = text.toCharArray();

        // Array with German vowels
        char[] vokaleArray = {'e', 'u', 'i', 'o', 'ü', 'a', 'ö', 'ä'};
        // Array with punctuation marks
        char[] satzzeichenArray = {'.', ',', '!', '?', ':', ';'};

        int vokale = 0;
        int konsonanten = 0;
        int leerzeichen = 0;
        int satzzeichen = 0;

        for (char c : buchstaben) {

            // Convert to lowercase
            c = Character.toLowerCase(c);

            // Check for whitespaces
            if (Character.isWhitespace(c)) {
                leerzeichen++;
                continue;
            }

            boolean istSatzzeichen = false;

            // Check if the character is a punctuation mark
            for (char zeichen : satzzeichenArray) {

                if (c == zeichen) {
                    satzzeichen++;
                    istSatzzeichen = true;
                    break;
                }
            }

            if (istSatzzeichen) {
                continue;
            }

            // Check if the character is a letter
            if (Character.isLetter(c)) {

                boolean istVokal = false;

                // Check if the letter is a vowel
                for (char vokal : vokaleArray) {

                    if (c == vokal) {
                        vokale++;
                        istVokal = true;
                        break;
                    }
                }

                if (!istVokal) {
                    konsonanten++;
                }
            }
        }

        System.out.println("Textlänge: " + buchstaben.length);
        System.out.println("Vokale: " + vokale);
        System.out.println("Konsonanten: " + konsonanten);
        System.out.println("Leerzeichen: " + leerzeichen);
        System.out.println("Satzzeichen: " + satzzeichen);
    }
}