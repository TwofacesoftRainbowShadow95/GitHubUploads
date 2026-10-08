class Spieler {
    int punkte;

    public Spieler(int punkte) {
        this.punkte = punkte;
    }

    public boolean hatGewonnen() {
        return punkte >= 100;
    }
}

public class quiz2 {
    public static void main(String[] args) {
        Spieler a = new Spieler(120);
        Spieler b = new Spieler(80);
    }
}

// Frage 2 – boolean + return:
// - Was liefert a.hatGewonnen()?
// - Was liefert b.hatGewonnen()?
// - Was bedeutet das return hier genau?
// - Warum darf diese Methode boolean als Rückgabetyp haben?

// Meine Antwort:
// - a.hatGewonnen() liefert den boolean true, da die punkte von a, 120, verglichen werden. Vergleich: 120 >= 100 = true.
// - b.hatGewonnen() liefert den boolean false, da die punkte von b, 80, verglichen werden. Vergleich: 80 >= 100 = false.
// - return bedeutet, dass wir den Wert von return in eine Variable zur weiteren Verarbeitung verwenden können.
// - Da wir bei einer solchen Konstellation nur ein true oder false rausbekommen können. Ein String wäre unnötige Zeitverschwendung und alles andere macht keinen Sinn.

// Präzision: 
// - return gibt den berechneten Wert an die Stelle zurück, von der die Methode aufgerufen wurde.



