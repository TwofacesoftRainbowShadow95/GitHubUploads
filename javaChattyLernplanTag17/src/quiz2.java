// Code aus eigener Produktion

public class quiz2 {
    public static void main(String[] args) {
        Spieler[] spielers = new Spieler[2];

        spielers[0] = new Spieler("Tom", 100);
        spielers[1] = new Spieler("Lisa", 150);

        spielers[0].addPunkte(20);
        int punkte = spielers[0].getPunkte();
        System.out.println(spielers[0].istBesserAls(spielers[1])); 

        spielers[0].anzeigen();
        spielers[1].anzeigen();

        System.out.println(punkte);
    }
}
