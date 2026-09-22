package Tag21;

// 03: Gekapselte Datenfelder kontrolliert auslesen
// - Erstelle A03_Fluggast.java.
// - Die Aufgabe wird mit Konsoleingabe/Scanner geloest.
// - Schreibe eine Klasse fuer einen Fluggast, 
//   die den Passagiernamen und den gebuchten Sitzplatz 
//   als private Datenfelder speichert. 
// - Beide Werte werden beim Erzeugen uebergeben. 
// - Stelle fuer beide Felder jeweils eine oeffentliche Abfragemethode bereit.
// - Lese in main zuerst den Namen und anschliessend den Sitzplatz ueber die Konsole ein, 
//   erzeuge das Fluggast-Objekt und gib die Daten formatiert aus.
// Beispielhafte Eingabe:
//      Lukas
//      14B
// Erwartete Ausgabe:
//      Fluggast: Lukas (Sitz: 14B)

import java.util.Scanner;

class Fluggast {
    private String name;
    private String sitzplatz;

    public Fluggast(String name, String sitzplatz) {
        this.name = name;
        this.sitzplatz = sitzplatz;
    }

    public String getName() {
        return name;
    }

    public String getSitzplatz() {
        return sitzplatz;
    }
}

public class A03_Fluggast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib den Passagiernamen ein: ");
        String name = sc.nextLine();

        System.out.print("Gib den Passagiersitzplatz ein: ");
        String sitzplatz = sc.nextLine();
        System.out.println();

        Fluggast fluggast = new Fluggast(name, sitzplatz);

        System.out.println("Fluggast: " + fluggast.getName() + " (Sitz: " + fluggast.getSitzplatz() + ")");
        System.out.println();

        sc.close();
    }
}
