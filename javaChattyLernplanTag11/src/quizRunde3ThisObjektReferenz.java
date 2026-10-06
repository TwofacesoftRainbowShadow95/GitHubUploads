public class quizRunde3ThisObjektReferenz {
    public static void main(String[] args) {
        class Spieler {

            private int punkte;

            public Spieler(int punkte) {
                this.punkte = punkte;
            }

            public void addPunkte(int punkte) {
                this.punkte += punkte;
            }
        }

        Spieler a = new Spieler(100);
        Spieler b = a;

        b.addPunkte(50);

        System.out.println(a.punkte);
    }
}

// Runde 3 – this + Objekt/Referenz
// Was passiert hier?

// Meine Antwort:
// - Zuerst find ichs faszinierend, dass mir der Editor nen Fehler bei print a.punkte anzeigt, 
//   wenn ich die class Spieler samt Inhalt aus der main rausnehme, aber nicht, wenn sie in der main liegt O.o
// - als nächstes haben wir eine Klasse mit nem privatem Attribut, auf welches man mit ner public Methode und nem public Konstruktor
//   zurückgreifen kann.
// - Dann erstellen wir ein neues Objekt der Klasse Spieler, auf welches mit der Referenz a verwiesen wird. Mit dem Konstruktor bekommt Spieler a 100 Punkte zugewiesen.
// - dann erstellen wir Referenz b, welche auf Referenz a, und somit auf das selbe Objekt wie a verweist.
// - im nächsten Schritt wendet man mit der Methode b.addPunkte an und fügt dem Objekt Spieler nochmal 50 punkte hinzu.
// - da b und a auf das selbe Objekt verweisen, funktioniert das auch.
// - zum Schluss kommt es drauf an, ob die Klasse in der main steht oder außerhalb. Denn wenn die Klasse In der main steht, kann a.punkte 
//   auf punkte zugreifen, wenn sie außerhalb der main steht, fehlt uns die Methode um auf punkte zugreifen zu können und es tritt ein 
//   Kompeilierfehler auf.

// Info am Rande:
// Wenn die Klasse sich innerhalb der main befindet wird die Wirkung von private aufgehoben. 
// Wenn sich die Klasse außerhalb der main befindet wirft print a.punkte einen Kompeilierfehler aus, 
// da wir keine Methode haben um auf den privaten int punkte zuzugreifen.





