// fast alles an Code was hier zu sehen ist wurde von Chatty produziert.

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

public class quiz2 {
    public static void main(String[] args) {
        Spieler[] array = new Spieler[2];

        array[0] = new Spieler("Tom", 100);
        array[1] = new Spieler("Lisa", 150);
        
        Spieler ersterSpieler = array[0];
        ersterSpieler.addPunkte(50);
    }
}

// Frage 2 – Wir verbinden die Konzepte:
// Deine Fragen:
// 1. Auf welches Spieler-Objekt verweist ersterSpieler?
// 2. Was passiert, wenn du anschließend schreibst -> Zeile 29?
// 3. Wie viele Punkte hat Tom danach, wenn du sein Objekt über array[0] betrachtest?

// Meine Antwort:
// 1. ersterSpieler verweist array[0] welches auf das new Spieler-Objekt an der Indexstelle 0 von array
// 2. ersterSpieler bekommt 50 punkte mehr, das heißt, dass new Spieler in array[0]
// 3. Tom hat danach dann 150 punkte



