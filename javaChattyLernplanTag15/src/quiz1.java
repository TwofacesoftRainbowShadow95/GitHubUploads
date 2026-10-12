// fast alles an Code was hier zu sehen ist wurde von Chatty produziert.

import java.util.ArrayList;

class Spieler {
    private String name;
    private int punkte;

    public Spieler(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    public void anzeigen() {
        System.out.println("Der Spieler " + name + " hat " + punkte + " Punkte.");
    }
}

public class quiz1 {
    public static void main(String[] args) {
        Spieler[] array = new Spieler[3];

        ArrayList<Spieler> liste = new ArrayList<>();
        liste.add(new Spieler("Tom", 100));

        System.out.println(array[0]); // selbst geschriebener Code

        liste.getFirst(); // selbst geschriebener Code
        liste.get(0); // selbst geschriebener Code

        System.out.println(array.length); // selbst geschriebener Code
        liste.size(); // selbst geschriebener Code

        int anzahl = array.length; // selbst geschriebener Code
        Spieler ersterSpieler = array[0]; // selbst geschriebener Code
    }
}

// Frage 1 – Array oder ArrayList?:
// A) Wie greifst du auf das erste Element von array zu?
// B) Wie greifst du auf das erste Element von liste zu?
// C) Wie ermittelst du die Anzahl der Elemente bei beiden?

// Meine Antwort:
// A) System.out.println(array[0]); Aber Warum klappt das nur in der println-Anweisung? O.o Das check ich nicht... -.-
// B) liste.getFirst(); oder liste.get(0);
// C) System.out.println(array.length); und liste.size(); Ich versteh echt nicht warum die reinen Array-Befehle nur mit einer println-Anweisung klappen. 
// Man kann sie nicht unabhängig aufrufen oder in einer Variable speichern und ich verstehe nicht warum -.-

// Mini-Übung:
// 1. Speichere die Länge des Arrays in einer int-Variable namens anzahl.
// 2. Speichere den Inhalt von array[0] in einer Spieler-Variable namens ersterSpieler.
// Keine println()-Anweisungen diesmal!

// Meine Antwort = der Code welchen ich selbst produziert habe.


