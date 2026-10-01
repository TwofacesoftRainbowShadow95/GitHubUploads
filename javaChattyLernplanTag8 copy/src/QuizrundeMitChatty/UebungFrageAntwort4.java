// Frage:
// Was wird ausgegeben und warum?
// Hier testen wir gleichzeitig private, Setter, if, this und Getter.

class Spieler {
    private int punkte;

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        if (punkte >= 0) {
            this.punkte = punkte;
        }
    }
}

public class UebungFrageAntwort4 {
    public static void main(String[] args) {
        Spieler s = new Spieler();

        s.setPunkte(100);
        s.setPunkte(-50);

        System.out.println(s.getPunkte());
    }
}

// Antwort:
// Hier wird punkte bei s.setPunkte(100) auf 100 gesetzt, weil der Eintrag >= 0 war
// bei s.setPunkte(-50) wird nichts angenommen oder verändert, weil die if-Bedingung >= 0 nicht erfüllt ist. 
// Denn der Minus Bereich liegt unter 0 / ist < 0.