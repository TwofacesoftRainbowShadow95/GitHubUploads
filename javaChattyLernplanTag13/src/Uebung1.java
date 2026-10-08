import java.util.ArrayList;

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

    public void anzeigen() {
        System.out.println(name + " hat " + punkte + " Punkte.");
    }

    public boolean istBesserAls(Spieler andererSpieler) {
        
        return this.punkte > andererSpieler.punkte;
    }

    public String getName() {
        return name;
    }

}

public class Uebung1 {
    public static void main(String[] args) {
        Spieler a = new Spieler("Tom", 100); // (2. Teil der Aufgabe)
        Spieler lisa = new Spieler("Lisa", 120); // (2. Teil der Aufgabe)
        Spieler b = a; // (2. Teil der Aufgabe)
        Spieler max = new Spieler("Max", 200); // (3. Teil der Aufgabe)
        Spieler litschi = new Spieler("Litschi", 50);
        //Spieler c = null; (1. Teil der Aufgabe.)
        
        Spieler [] spielers = new Spieler[3]; // (3. Teil der Aufgabe)

        spielers[0] = new Spieler("Tom", 150); // (3. Teil der Aufgabe)
        spielers[1] = new Spieler("Lisa", 120); // (3. Teil der Aufgabe)
        spielers[2] = new Spieler("Max", 200); // (3. Teil der Aufgabe)

        ArrayList<Spieler> spieler2 = new ArrayList<>();

        spieler2.add(a);
        spieler2.add(lisa);
        spieler2.add(max);
        spieler2.add(litschi);

        b.addPunkte(50); // (2. Teil der Aufgabe)
        a.anzeigen(); // (2. Teil der Aufgabe)
        System.out.println("Tom hat mehr Punkte als Lisa: " + a.istBesserAls(lisa)); // (2. Teil der Aufgabe)
        System.out.println("Lisa hat mehr Punkte als Tom: " + lisa.istBesserAls(a)); // (2. Teil der Aufgabe)
        //c.anzeigen(); (1. Teil der Aufgabe.)

        for (Spieler spieler : spielers) { // (3. Teil der Aufgabe)
            spieler.anzeigen();
        }

        for (Spieler spieler : spieler2) {
            spieler.anzeigen();
        }

        System.out.println("Spieler " + spieler2.get(0).getName() + " hat mehr Punkte als Spieler " + spieler2.get((spieler2.size() - 1)).getName() + ": " + spieler2.get(0).istBesserAls(spieler2.get((spieler2.size() - 1))));
    }
}

// Dieser File kombiniert 2 Aufgaben. Damit der File sauber ausgelesen werden kann
// und keine wichtigen Lern-Bestandteile verloren gehen habe ich die absichtlich
// erzeugten Fehler auskommentiert.


