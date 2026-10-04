class Auto {
    private String marke;
}
public class UebungFrageAntwort2 {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.marke = "Audi";
    }
}

// Chatty Frage:
// Was glaubst du, warum funktioniert die zweite Variante nicht mehr?
// Und noch wichtiger: Was bringt uns private überhaupt?

// Antwort:
// Es funktioniert nicht mehr, weil marke jetzt private gesetzt und somit gekapselt wurde. 
// Jetzt können wir ohne getter oder setter nicht mehr auf private Variablen zugreifen. 
// Deswegen kann der Code nicht mehr ausgeführt werden.

// Chatty Ergänzung:
// Eine kleine Präzisierung:
// private bedeutet nicht, dass auf das Attribut gar nicht mehr zugegriffen werden kann, 
// sondern dass direkter Zugriff von außerhalb der Klasse nicht erlaubt ist.