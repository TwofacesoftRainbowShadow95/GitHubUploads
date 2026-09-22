package Tag21;

// 01: Privater Zustand und Zugriffsschutz
// - Erstelle A01_Muenztresor.java.
// - Die Aufgabe wird mit Konsoleingabe/Scanner geloest.
// - Schreibe eine Klasse fuer einen Muenztresor, 
//   der die Anzahl der enthaltenen Muenzen als private Ganzzahl speichert. 
// - Der Tresor soll eine Methode besitzen, um neue Muenzen hinzuzufuegen, 
//   sowie eine passende Methode, um den aktuellen Bestand auszulesen.
// - Lese in main die Anzahl der einzuwerfenden Muenzen ueber die Konsole ein, 
//   fuege sie dem Tresor hinzu und gib den aktuellen Bestand auf dem Bildschirm aus.
// Beispielhafte Eingabe:
//      45
// Erwartete Ausgabe:
//      Tresorbestand: 45 Muenzen

import java.util.Scanner;

class Muenztresor {
    private int muenzen;
    
    public void erhoehen() {
            muenzen++;
    }

    public int getMuenzen() {
        return muenzen;
    }

}

public class A01_Muenztresor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Muenztresor muenztresor = new Muenztresor();

        System.out.print("Wie viele Münzen sollen eingeworfen werden: ");
        int muenzAnzahl = sc.nextInt();

        for (int i = 0; i < muenzAnzahl; i++) {
            muenztresor.erhoehen();
            // System.out.println(muenztresor.getMuenzen());    
        }

        System.out.println("Tresorbestand: " + muenztresor.getMuenzen());

        sc.close();
    }
}
