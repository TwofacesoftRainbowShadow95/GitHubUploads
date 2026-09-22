package Tag22;

// 05: Eingabewerte in der Aenderungsmethode validieren
// - Erstelle A05_Rabattaktion.java.
// - Die Aufgabe wird mit Konsoleingabe/Scanner geloest.
// - Schreibe eine Klasse fuer eine Rabattaktion, 
//   die einen Rabatt in Prozent als private Kommazahl speichert (Standardwert: 0.0). 
// - Die Aenderungsmethode soll nur Werte im Bereich 
//   von 0.0 bis einschliesslich 100.0 Prozent akzeptieren und bei Erfolg true, 
//   bei unzulaessigen Werten false zurueckgeben. 
//   Stelle zusaetzlich eine Abfragemethode fuer den aktuellen Rabattwert bereit.
// - Lese in main nacheinander zwei Rabattwerte ueber die Konsole ein. 
//   Versuche beide Werte ueber die Aenderungsmethode zu setzen und 
//   gib jeweils den Erfolgsstatus sowie abschliessend den gespeicherten Rabattwert aus.
// Beispielhafte Eingabe:
// 15.5
// 120.0

import java.util.Scanner;

class Rabattaktion {
    private double rabatt = 0.0;

    Rabattaktion(double rabatt) {
        this.rabatt = rabatt;
    }

    public boolean getRabattZulaessig() {
        if (rabatt > 100 || rabatt < 0) {
            return false;
        } else {
            return true;
        }
    }
}

public class A05_Rabattaktion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib einen Rabatt ein: ");
        double rabatt = sc.nextDouble();

        Rabattaktion rabattaktion = new Rabattaktion(rabatt);

        System.out.println("Rabattaktion zulässig: " + rabattaktion.getRabattZulaessig());

        sc.close();
    }
}
