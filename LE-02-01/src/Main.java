import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Vorname eingeben: ");
        String vorname = scanner.nextLine();

        System.out.print("Nachname eingeben: ");
        String nachname = scanner.nextLine();

        System.out.println("Name: " + vorname + " " + nachname);
    }
}