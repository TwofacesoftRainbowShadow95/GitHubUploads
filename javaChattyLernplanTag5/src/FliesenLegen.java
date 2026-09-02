// Aufgabe: Fliesen für einen Raum berechnen

// Für einen rechteckigen Raum sollen quadratische Fliesen gekauft werden. 
// Eine Fliese ist 0,6 Meter breit und lang.

// Lies die Länge und Breite des Raumes ein.

// Berechne:

// die längere Raumseite mit Math.max() die kürzere Raumseite mit Math.min() wie viele vollständige Fliesen an jede Seite passen, mit Math.floor() wie viele Fliesen tatsächlich benötigt werden, mit Math.ceil()

// Angebrochene Fliesenstücke werden in dieser vereinfachten Aufgabe nicht wiederverwendet.

// Ausgabe:

// Raumlänge in Metern: 5,0
// Raumbreite in Metern: 3,2

// Längere Raumseite: 5.0 Meter
// Kürzere Raumseite: 3.2 Meter
// Vollständige Fliesen entlang der Länge: 8
// Vollständige Fliesen entlang der Breite: 5
// Benötigte Fliesen insgesamt: 54

import java.util.Scanner;

public class FliesenLegen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib Hier deine Raumlänge ein: ");
        double raumLaenge = sc.nextDouble();
        System.out.print("Gib Hier deine Raumbreite ein: ");
        double raumBreite = sc.nextDouble();

        double fliesenFuerLaenge = raumLaenge / 0.6;
        double fliesenFuerBreite = raumBreite / 0.6;

        // System.out.println(fliesenFuerLaenge);
        // System.out.println(fliesenFuerBreite);

        double maxRaumLaenge = Math.max(raumLaenge, raumBreite);
        double minRaumBreite = Math.min(raumLaenge, raumBreite);

        System.out.println("Die Länge des Raumes beträgt " + maxRaumLaenge + " m lang.");
        System.out.println("Die Breite des Raumes beträgt " + minRaumBreite + " m lang.");

        int roundFliesenFuerLaenge = (int) Math.round(fliesenFuerLaenge);
        int roudFliesenFuerBreite = (int) Math.round(fliesenFuerBreite);

        System.out.println("Vollständige Fliesen entlang der Länge: " + roundFliesenFuerLaenge);
        System.out.println("Vollständige Fliesen entlang der Breite: " + roudFliesenFuerBreite);

        System.out.println("Benötigte Fliesen insgesamt: " + (roundFliesenFuerLaenge + roudFliesenFuerBreite));
        
        sc.close();
    }
}

