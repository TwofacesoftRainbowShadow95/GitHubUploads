class Spieler {
    int punkte;

    public Spieler(int punkte) {
        this.punkte = punkte;
    }

    public void addPunkte(int punkte) {
        this.punkte += punkte;
    }
}

public class quiz1 {
    public static void main(String[] args) {
        Spieler a = new Spieler(100);
        Spieler b = a;

        b.addPunkte(50);
    }
}

// Warm-up
// Frage 1: Referenzen + Objekte
// - Welchen Wert hat a.punkte am Ende?
// - Welchen Wert hat b.punkte am Ende?
// - Warum haben beide denselben Wert?
// - Was passiert bei this.punkte += punkte genau?
//   (Hier interessiert mich besonders der Unterschied zwischen dem Attribut und dem Parameter.)

// - a.punkte hat am Ende den Wert 150
// - b.punkte hat am Ende auch den Wert 150, da a & b Referenzen des selben Objekts sind (Sie zeigen beide auf das selbe Objekt).
// - a & b Referenzen des selben Objekts sind (Sie zeigen beide auf das selbe Objekt).
// - bei this.punkte += punkte haben wir mit this, einen Bezug auf das neue Objekt und nicht auf sich selbst. Mit += gibt man an, dass zu einem bestehendem Attribut-Wert 
//   noch der dahinterstehende Parameter-Wert dazu addiert wird und dieses Endergebnis wird Hier objektbezogen in punkte gespeichert.


