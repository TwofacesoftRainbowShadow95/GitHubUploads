class Spieler {
    int punkte;

    public Spieler(int punkte) {
        this.punkte = punkte;
    }

    public boolean hatGewonnen() {
        return punkte >= 100;
    }
}

public class quiz3 {
    public static void main(String[] args) {
        Spieler a = new Spieler(100);
        Spieler b = a;
        Spieler c = null;

    }
}

// Frage 3 – Heap & Stack + null:
// Erkläre mir bitte:
// 1. Was liegt bei a, b und c auf dem Stack?
// 2. Was liegt im Heap?
// 3. Worauf zeigt c?
// 4. Was würde passieren, wenn wir danach schreiben:
//    c.addPunkte(50);

// Meine Antwort:
// - auf dem Stack liegt bei a,b & c die Beschriftung a, b & c und dass a & b auf das selbe Objekt zeigen, 
//   b zeigt auf a und a auf das neu erstellte Objekt, während c auf null zeigt. Macht das c zu einer Null-Referenz? O.o 
// - auf dem Heap liegt das Objekt new Spieler, welches das Attribut punkte: 100 trägt, 
//   ob null auch auf nem Heap liegt, glaub ich nicht, kann es aber auch nicht sicher sagen, da null kein Objekt per se ist, 
//   aber null ist ja eine ganz eingene Sache. Weniger als nichts.
// - c zeigt auf null. (Nichts, leere, weniger als 0)
// - Ich habe den Code kurz in die main gepackt und gesehen, dass ein Fehler produziert werden würde. Das erkläre ich damit, dass null Kein Objekt ist, wir haben ja keinen new Spieler
//   erschaffen in c, also logisch, und damit klappt natürlich die Methode der Klasse spieler bei c nicht, da sie zwar von der selben Klasse ist, die Methode aber nicht statisch ist 
//   und der Aufruf ebenso wenig. Was ist Spieler c dann eigentlich? Eine reine Null-Referenz oder etwas gänzlich anderes? Weil normales addieren auch nicht klappt. Meine Erklärung 
//   dafür ist, dass man auf null weder addieren noch subtrahieren oder ähnliches kann, da null weniger als 0 ist. Aber ich bitte um Erläuterung.

// Präzesion:
// - a, b & c sind Referenzvariablen
// - statt b zeigt auf a: Die Referenz, die in a steckt, wird nach b kopiert.
// - Objekt = Heap, hier new Spieler, null ist Kein Heap
// - c = Referenzvariable vom Typ Spieler, deren aktueller Wert null ist. Bedeutet: Erzeuge eine Referenzvariable c, die momentan auf kein Objekt zeigt.
// - null Hier: keine gültige Objekt-Referenz vorhanden
// - bei c.addPunkte(50) entsteht eine NullPointerExeption




