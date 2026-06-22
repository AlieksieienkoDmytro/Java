import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Rechteck ===");

        System.out.print("Breite: ");
        float breite = scanner.nextFloat();

        System.out.print("Länge: ");
        float lange = scanner.nextFloat();

        System.out.print("Höhe: ");
        float hohe = scanner.nextFloat();

        float rechteckFlache = breite * lange;
        float quaderVolumen = rechteckFlache * hohe;

        System.out.println("Fläche: " + rechteckFlache);
        System.out.println("Volumen: " + quaderVolumen);


        System.out.println("\n=== Gleichseitiges Dreieck ===");

        System.out.print("Seitenlänge: ");
        float seite = scanner.nextFloat();

        System.out.print("Prismahöhe: ");
        float prismaHohe = scanner.nextFloat();

        // Math.sqrt(3) = √3
        double dreieckFlache = (Math.sqrt(3) / 4) * seite * seite;
        double prismaVolumen = dreieckFlache * prismaHohe;

        System.out.println("Fläche: " + dreieckFlache);
        System.out.println("Volumen: " + prismaVolumen);


        System.out.println("\n=== Kreis ===");

        System.out.print("Radius: ");
        float radius = scanner.nextFloat();

        System.out.print("Zylinderhöhe: ");
        float zylinderHohe = scanner.nextFloat();

        // Math.PI = π
        double kreisFlache = Math.PI * radius * radius;
        double zylinderVolumen = kreisFlache * zylinderHohe;

        System.out.println("Fläche: " + kreisFlache);
        System.out.println("Volumen: " + zylinderVolumen);
    }
}