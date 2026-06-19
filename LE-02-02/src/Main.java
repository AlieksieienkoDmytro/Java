import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Erste zahl eingeben: ");
        float a = input.nextFloat();

        System.out.print("Zweite zahl eingeben: ");
        float b = input.nextFloat();

        System.out.println("Die Summe ist: " + (a + b));
        System.out.println("Die Differenz ist: " + (a - b));
        System.out.println("Die Produkt ist: " + (a * b));
        System.out.println("Die Quotient ist: " + (a / b));
    }
}