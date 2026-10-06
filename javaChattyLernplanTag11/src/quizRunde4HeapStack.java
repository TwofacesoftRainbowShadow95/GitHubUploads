class Spieler {

    private int punkte;

    public Spieler(int punkte) {
        this.punkte = punkte;
    }

    public void addPunkte(int punkte) {
        this.punkte += punkte;
    }
}

public class quizRunde4HeapStack {
    public static void main(String[] args) {
        Spieler a = new Spieler(100);
    }
}

// Letzte Runde für heute – Heap/Stack
// Wir wissen:
// - a ist eine Referenz
// - new Spieler(100) erzeugt ein Objekt
// Jetzt ordne bitte nur diese beiden Dinge zu:
// A) a
// B) das durch new Spieler(100) erzeugte Spieler-Objekt

// Meine Antwort:
// A) a = Stack
// B) das durch new Spieler(100) erzeugte Spieler-Objekt gehört zum Heap



