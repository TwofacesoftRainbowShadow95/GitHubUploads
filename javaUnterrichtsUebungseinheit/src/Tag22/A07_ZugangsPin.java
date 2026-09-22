package Tag22;

// Erstelle A07_ZugangsPin.java.
// Die Aufgabe wird mit Konsoleingabe/Scanner geloest.
// - Schreibe eine Klasse fuer eine 4-stellige Zugangs-PIN 
//   (Ganzzahl von 1000 bis einschliesslich 9999) mit einem privaten Datenfeld. 
// - Wenn beim Erzeugen ein Wert ausserhalb dieses Bereichs uebergeben wird, 
//   soll der Konstruktor eine IllegalArgumentException mit dem Text 
//   "Ungueltige PIN" ausloesen. Stelle eine Abfragemethode bereit, 
//   um die gespeicherte PIN auszulesen.
// - Lese in main eine PIN ueber die Konsole ein. 
// - Verwende eine Exception-Behandlung (try-catch), um das Erzeugen abzusichern:
// - Bei erfolgreicher Erzeugung: Gib "PIN eingerichtet: [PIN]" aus.
// - Bei einer Exception: Gib die Fehlermeldung der Exception auf der Konsole aus.
// Beispielhafte Eingabe:
// 4729
// Erwartete Ausgabe:
// PIN eingerichtet: 4729

import java.util.Scanner;

class ZugangsPin {
    private int zugangsPin; 

    public ZugangsPin(int zugangsPin) {
        if (zugangsPin < 1000 || zugangsPin > 9999) {
            throw new IllegalArgumentException("Ungültige PIN");
        }
        this.zugangsPin = zugangsPin;
    }

    public int getZugangsPin() {
        return zugangsPin;
    }
}

public class A07_ZugangsPin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Gib deine PIN ein: ");
        int pinEingabe = sc.nextInt();

        try {
 
        ZugangsPin pin = new ZugangsPin(pinEingabe);

        System.out.println("Pin eingerichtet: " + pin.getZugangsPin());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
