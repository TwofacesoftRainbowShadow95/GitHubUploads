import java.util.ArrayList;

class Spieler {
    private String name;
    private int punkte;

    public Spieler(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        if (punkte >= 0) {
            this.punkte = punkte;
        }
    }

    public void addPunkte(int punkte) {
        this.punkte += punkte;
    }

    public boolean hatMehrPunkteAls(Spieler anderer) {
        return punkte > anderer.getPunkte();
    }
}

public class Spiel {
    public static void main(String[] args) {
        Spieler tom = new Spieler("Tom", 100);
        Spieler lisa = new Spieler("Lisa", 150);

        ArrayList<Spieler> spielerList = new ArrayList<>();

        spielerList.add(tom);
        spielerList.add(lisa);

        for (Spieler spieler : spielerList) {

                System.out.print(spieler.getName() + " ");    
                System.out.println(spieler.getPunkte());

                if (spieler == tom) {
                    spieler.addPunkte(50); // geändert von tom.addPunkte(50)
                } else if (spieler == lisa) {
                    spieler.setPunkte(-100); // geändert von lisa.setPunkte(-100)
                }
        }
        
        System.out.println(tom.getPunkte());
        System.out.println(lisa.getPunkte());

        System.out.println("Tom hat mehr Punkte als Lisa: " + tom.hatMehrPunkteAls(lisa));
        System.out.println("Lisa hat mehr Punkte als Tom: " + lisa.hatMehrPunkteAls(tom));

        // Bei beiden methoden hatMehrPunkteAls() kommt false raus, da Tom und Lisas
        // Punktestand gleich ist. Kein Punktestand kann größer als der andere sein.
    }
}
