// Das Grundgerüst an Codeproduktion wurde von Java erstellt.

import java.util.ArrayList;

public class quiz1 {
    public static void main(String[] args) {
        Spieler[] array = new Spieler[3];

        ArrayList<Spieler> liste = new ArrayList<>();
        liste.add(new Spieler("Tom", 100));
        liste.add(new Spieler("Lisa", 150));

        Spieler ersterAusArray = array[0]; // selbst geschriebener Code
        Spieler ersterAusListe = liste.get(0); // Spieler ersterAusListe = liste.getFirst();      selbst geschriebener Code

        Spieler[] array2 = new Spieler[2];
        array2[0] = new Spieler("Tom", 100);
        array2[1] = new Spieler("Lisa", 150);

        array2[0].addPunkte(20); // selbst geschriebener Code
    }
}

// Deine Aufgabe
// Du möchtest jeweils den ersten Spieler holen und in einer Variablen vom Typ Spieler speichern.
// Ergänze die beiden Zeilen: 11 & 12
// Bonusfrage: Was enthält ersterAusArray aktuell, wenn du dem Array noch keinen Spieler zugewiesen hast?

// Meine Antwort:
// Spieler ersterAusArray = array[0];
// Spieler ersterAusListe = liste.get(0); oder Spieler ersterAusListe = liste.getFirst();
// Es ist ein Array mit 3 lehren Plätzen dementsprechent enthält der Index 0 auch keine Werte.

// Korrektur:
// Spieler ersterAusArray = array[0]; // ersterAusArray ist null
// ersterAusArray.anzeigen();          // NullPointerException




