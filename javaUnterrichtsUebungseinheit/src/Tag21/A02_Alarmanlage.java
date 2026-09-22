package Tag21;

// 02: Boolean-Zustand kontrolliert schalten
// - Erstelle A02_Alarmanlage.java.
// - Die Aufgabe wird mit Konsoleingabe/Scanner geloest.
// - Schreibe eine Klasse fuer eine Alarmanlage, die ihren internen Scharfschaltungs-Status 
//   als privates Wahrheitswert-Feld speichert (Standardwert: unscharf). 
// - Die Klasse soll Methoden zum Scharfschalten und Entschaerfen 
//   sowie eine passende Abfragemethode fuer den Status besitzen.
// - Lese in main vom Benutzer ein Kommando (z. B. aktivieren) ueber die Konsole ein. 
// - Wenn das Kommando aktivieren lautet, schalte die Anlage scharf, ansonsten entschaerfe sie. 
// - Gib anschliessend den aktuellen Status auf dem Bildschirm aus.
// Beispielhafte Eingabe:
//      aktivieren
// Erwartete Ausgabe:
//      Alarmanlage aktiv: true

import java.util.Scanner;

class Alarmanlage {
    private boolean scharfschaltungsstatus = false;

    Alarmanlage() {
        scharfschaltungsstatus = false;
        System.out.println("unscharf");
    }
    
    public boolean setScharfStellen() {
        scharfschaltungsstatus = true;
        return true;
    }

    public boolean setEntschaerfen() {
        scharfschaltungsstatus = false;
        return false;
    }

    public boolean getStatus() {
        if (scharfschaltungsstatus == true) {
            return true;
        } else {
            return false;
        }
    }
}

public class A02_Alarmanlage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        Alarmanlage alarmanlage = new Alarmanlage();
        
        String eingabe = "";

        while (!eingabe.equals("null")) {
            
            System.out.println();
            System.out.println("Hier Befehle für die Scharfschaltung der Alarmanlage:");
            System.out.println("Zum Scharfschalten gib ein:     aktivieren");
            System.out.println("Zum Entschärfen gib ein:        deaktivieren");
            System.out.println("Zum beenden tippe die Zahl:     null");
            System.out.println();

            System.out.println("Deine Auswahl:");
            eingabe = sc.nextLine().toLowerCase().trim();
            System.out.println();

            switch (eingabe) {
                case "aktivieren":
                    alarmanlage.setScharfStellen();
                    System.out.println("Alarmanlage aktiv: " + alarmanlage.getStatus()); 
                    break;
                case "deaktivieren":
                    alarmanlage.setEntschaerfen();
                    System.out.println("Alarmanlage aktiv: " + alarmanlage.getStatus());
                    break;
                case "null":
                    break;
                default:
                    System.out.println("Ungültige Eingabe!");
                    System.out.println("Letzte Ausgabe: Alarmanlage aktiv: " + alarmanlage.getStatus());
                    break;
                    
            }
        }

        System.out.println("Ihre Alarmanlage ist aktiviert: " + alarmanlage.getStatus());
        System.out.println();

        sc.close();
    }
}
