import java.util.ArrayList;

class Spieler {
    private String name;
    private int punkte;

    Spieler(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    public void addPunkte(int punkte) {
        this.punkte += punkte;
    }

    public void anzeigen() {
        System.out.println("Der/Die Spieler/-in " + name + " hat " + punkte + " Punkte.");
    }

    public boolean istBesserAls(Spieler andererSpieler) {
        return this.punkte > andererSpieler.punkte;
    }
}

public class Spielestand {
    public static void main(String[] args) {
        Spieler tom = new Spieler("Tom", 100);
        Spieler lisa = new Spieler("Lisa", 150);

        ArrayList<Spieler> spielers = new ArrayList<>();

        spielers.add(tom);
        spielers.add(lisa);

        for (Spieler spieler : spielers) {
            spieler.anzeigen();
        }

        tom.addPunkte(30);

        System.out.println("Tom hat mehr Punkte als Lisa: " + tom.istBesserAls(lisa)); 
    }
}
