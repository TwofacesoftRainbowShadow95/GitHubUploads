package Tag22;

// 06: Ungueltige Werte still abweisen und Zustand sichern
// - Erstelle A06_Lagerbestand.java.
// - Die Aufgabe wird mit Konsoleingabe/Scanner geloest.
// - Schreibe eine Klasse fuer einen Lagerbestand, 
//   die die vorhandene Stueckzahl als private Ganzzahl speichert. 
//   Die Aenderungsmethode soll nur Werte groesser oder gleich 0 uebernehmen. 
//   Negative Werte werden verworfen, ohne den bestehenden Bestand zu veraendern. 
//   Stelle eine passende Abfragemethode bereit.
// - Lese in main nacheinander zwei Ganzzahlen ueber die Konsole ein 
//   (z. B. einen gueltigen Bestand und anschliessend einen negativen Korrekturversuch). 
//   Wende beide Werte ueber die Aenderungsmethode an 
//   und gib den resultierenden Bestand auf dem Bildschirm aus.
// Beispielhafte Eingabe:
// 80
// -15
// Erwartete Ausgabe:
// Lagerbestand: 80 Stueck

import java.util.Scanner;

class Lagerbestand{
    private int stueckzahl;

    Lagerbestand(int stueckzahl) {
        this.stueckzahl = stueckzahl;
    }
    
    public void setStueckzahl(int stueckzahl) {
        if (stueckzahl >= 0) {
            this.stueckzahl = stueckzahl;
        }
    }

    public int getStueckzahl() {
        return stueckzahl;
    }
}

public class A06_Lagerbestand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Startbestand: ");
        int stueckzahl = sc.nextInt();
        Lagerbestand lb = new Lagerbestand(stueckzahl);

        System.out.print("Neuer Bestand: ");
        int nStueckzahl = sc.nextInt();
        lb.setStueckzahl(nStueckzahl);

        System.out.println("Lagerbestand: " + lb.getStueckzahl() + " Stück");

        sc.close();
    }
}
