package chattyJava.src.tag2;

// Aufgabe 7 – while

// Wir starten erstmal einfach, aber du sollst es selbst schreiben.
// Ziel: Das Programm soll die Zahlen 1 bis 10 ausgeben:
// 1
// 2
// 3
// ...
// 10
// Hinweise: Du brauchst:
// - Eine int-Variable, die bei 1 startet.
// - Eine while-Bedingung.
// - Etwas, das die Zahl nach jedem Durchlauf erhöht.
// Du kennst dafür bereits:
// zahl++;
// Achte besonders darauf, dass deine Schleife irgendwann endet.

public class whileZahlen {
    public static void main(String[] args) {
        int zahl = 0;

        while (zahl < 10) {
            zahl++;
            System.out.println(zahl);
        }
    }
}
