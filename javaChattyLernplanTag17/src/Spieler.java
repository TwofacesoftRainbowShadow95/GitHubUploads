// Code von Chatty produziert

public class Spieler {
    private String name;
    private int punkte;

    public Spieler(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    public String getName() {
        return name;
    }

    public int getPunkte() {
        return punkte;
    }

    public void addPunkte(int punkte) {
        this.punkte += punkte;
    }

    public void anzeigen() {
        System.out.println(name + ": " + punkte + " Punkte");
    }

    public boolean istBesserAls(Spieler andererSpieler) {
        return this.punkte > andererSpieler.punkte;
    }
}
