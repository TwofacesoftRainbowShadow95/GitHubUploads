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

    public void addPunkte(int punkte) {
        this.punkte += punkte;
    }
}

public class quiz3 {
    public static void main(String[] args) {
        Spieler[] array = new Spieler[3];

        ArrayList<Spieler> liste = new ArrayList<>();

        liste.add(new Spieler("Tom", 100));
        liste.add(new Spieler("Lisa", 150));

        Spieler zweiterSpieler = array[1]; // mein Code
        System.out.println(array[1]); // mein Code

        liste.get(1); // mein Code 

        array[0] = new Spieler("Max", 200);
        liste.add(new Spieler("Max", 200));
    }
}

// Abschlussfrage – Array vs. ArrayList:
// Deine Aufgaben
// 1. Wie viele Plätze hat array, und wie viele Elemente enthält liste?
// 2. Wie greifst du auf das zweite Element zu?
//  - Einmal bei array
//  - Einmal bei liste
// 3. Was passiert bei diesen beiden Zeilen 32 & 33?
//    Erkläre insbesondere, ob dadurch ein vorhandener Eintrag ersetzt oder ein neues Element hinzugefügt wird.

// Meine Antwort:
// 1. array hat 3 Plätze, die schon vorgegeben werden, Hier in 1. hat array auch 3 leere Elemente.
// 2. bei array greife ich mit array[1] zu, welches in einer Variable, Hier Spieler zweiterSpieler = array[1]; oder System.out.println(array[1]);
//    bei liste greife ich mit liste.get(1); auf das 2. Element von Liste zu
// 3. der Spieler mit String "Tom" mit punkte 100 wurde mit dem new Spieler mit String "Max" und punkte 200 überschrieben 
//    und in dieser liste wurde "Max" mit 200 punkten nochmal hinten angefügt.


