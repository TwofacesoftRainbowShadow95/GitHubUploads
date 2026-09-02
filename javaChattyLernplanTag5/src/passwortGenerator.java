// Aufgabe Password Generator:
// Erstelle einen einfachen Passwortgenerator.
// - Lies zuerst die gewünschte Passwortlänge ein.
// - Erzeuge anschließend mithilfe von Math.random() ein zufälliges Passwort aus Buchstaben, Zahlen und Sonderzeichen.
// - Gib die gewünschte Passwortlänge ein:
//   Deine Auswahl: 8
//   Generiertes Passwort: aB3$dE1!

// ################################## -PseudoCode- ################################################

// PROGRAMM Passwortgenerator
//     Scanner für Benutzereingaben erstellen
//     Verfügbare Zeichen festlegen:
//         Großbuchstaben
//         Kleinbuchstaben
//         Ziffern
//         Sonderzeichen
//     AUSGEBEN "Passwortlänge eingeben: "
//     Passwortlänge EINLESEN
//     Passwort als leere Zeichenkette festlegen
//     WIEDERHOLE Passwortlänge-mal
//         Zufälligen Index zwischen 0 und
//         Anzahl der verfügbaren Zeichen minus 1 erzeugen
//         Zeichen an diesem Index auswählen
//         Ausgewähltes Zeichen an das Passwort anhängen
//     ENDE WIEDERHOLUNG
//     AUSGEBEN "Generiertes Passwort: " + Passwort
// ENDE PROGRAMM

import java.util.Scanner;

public class passwortGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String auswahlMoeglichkeiten = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzß1234567890^°<>|,;.:-_#'+*~!²§³$%&/()=?{}[]´`";

        System.out.print("Gib Hier deine Passwortlänge in einer ganzen positiven Zahl ein: ");
        int passwortlaenge = sc.nextInt();

        String passwort = "";
        for (int i = 0; i < passwortlaenge; i++) {
              int indexAuswahlMoeglichkeiten = (int) (Math.random() * auswahlMoeglichkeiten.length()) + 1;
              passwort += auswahlMoeglichkeiten.charAt(indexAuswahlMoeglichkeiten);
        }
        System.out.println("Dein Passwort lautet: " + passwort);
        sc.close();
    }
}
