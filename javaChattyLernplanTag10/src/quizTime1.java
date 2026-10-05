class Spieler {

    private String name;
    private int punkte;

    public Spieler(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    public void addPunkte(int punkte) {
        this.punkte += punkte;
    }
}

public class quizTime1 {
    public static void main(String[] args) {
        Spieler a = new Spieler("Tom", 100);
        Spieler b = a;

        b.addPunkte(50);
        
    }
}

// Runde 1 – Warm-up:
// Aufgabe 1 – Referenzen + this + Konstruktor:
// Deine Fragen:
// 1. Was steht danach in a bzw. genauer: Wie viele Punkte hat a?
// 2. Warum verändert b.addPunkte(50) auch den Punktestand von a?
// 3. In    'this.punkte += punkte;'    welches punkte ist das Attribut des Objekts und welches ist der Parameter der Methode?
// 4. Und jetzt unser kleiner Endgegner: Was wäre der Unterschied, wenn dort statt
//    'this.punkte += punkte;'   folgendes stehen würde?    'punkte += punkte;'

// Meine Antwort:
// - a hat 150 punkte, weil a mit 100 punkten inizialisiert wurde, 
//   b auf das selbe Objekt wie a verweist und nochmal 50 punkte hinzu gefügt hat mit der Methode add
// - weil a & b auf das selbe Objekt referieren. Egal was a oder b mit dem Objekt macht, alles hat Auswirkungen auf das selbe Objekt.
// - das erste punkte ist das Attribut des Objekts, welchem dann der Wert des Parameters hinzu gefügt wird.
// - hier würde punkte nicht auf das Objekt sondern sich selbst verweisen. Somit wüsste Java nicht, wo die punkte hingehören, und es wird eine Exeption ausgelöst.

// Korrektur für Antwort auf 4 (letzter Stichpunkt):
// Es gibt keine Exception und Java weiß auch sehr wohl, worauf sich punkte bezieht.

// public void addPunkte(int punkte) {
//     punkte += punkte;
// }

// gibt es zwei gleichnamige Dinge:

// punkte links → Parameter
// punkte rechts → ebenfalls Parameter
// Parameter punkte = z. B. 50
// punkte += punkte
// ↓
// 50 += 50
// ↓
// Parameter wird zu 100
// Das Attribut des Objekts wird überhaupt nicht verändert.



