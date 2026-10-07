class Spieler { // class Spieler wurde eingefügt, damit der file keine Fehler anzeigt.

    private int punkte;

    public Spieler(int punkte) {
        this.punkte = punkte;
    }

    public void addPunkte(int punkte) {
        this.punkte += punkte;
    }
}

public class quiz2 {
    Spieler a = new Spieler(100);
    Spieler b = a;
}

// Frage 2 – Heap & Stack:
// Wo befinden sich a und b, und wo befindet sich das Spieler-Objekt?
// Und ganz wichtig: Warum zeigen a und b auf dasselbe Objekt?

// Meine Antwort:
// Stack = Referenz = a & b, welche beide auf den Heap new Spieler (das neue Spieler-Objekt) verweisen.
// a & b zeigen auf das selbe Objekt, weil b auf a verweist und a verweist auf das neue Spieler-Objekt.



