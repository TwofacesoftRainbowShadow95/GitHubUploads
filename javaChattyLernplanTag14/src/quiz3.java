// alles an Code wurde von Chatty als Aufgabe produziert

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

    public boolean istBesserAls(Spieler andererSpieler) {
        return this.punkte > andererSpieler.punkte;
    }
}

public class quiz3 {
    public static void main(String[] args) {
        Spieler tom = new Spieler("Tom", 150);
        Spieler lisa = new Spieler("Lisa", 120);

        tom.istBesserAls(lisa);
    }
}

// Frage 3 – Objekt als Parameter:
// Wie rufst du die Methode auf, damit geprüft wird, ob Tom mehr Punkte als Lisa hat?
// Schreib nur den Methodenaufruf und erkläre kurz, welches Objekt this ist und welches Objekt als Parameter übergeben wird. ^^

// Meine Antwort:
// tom.istBesserAls(lisa);
// this ist hier das Objekt mit der Referenz tom. Das Objekt mit der Referenz lisa wird als Parameter übergeben.



