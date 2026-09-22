package Tag20;

// 03: Sitzplaetze eines Kursraums initialisieren
// - Erstelle A03_Kursraum.java. 
// - Schreibe Kursraum mit String thema und int plaetze. 
// - Der Konstruktor soll beide Werte erhalten. 
// - Erzeuge einen Raum fuer Java mit 18 Plaetzen und gib beide Werte aus. 
// - Erzeuge danach keinen zweiten Raum, sondern erklaere, 
//   welche Werte ohne passenden Konstruktoraufruf 
//   zunaechst in den Attributen stehen wuerden.
// Erwartete Ausgabe:
// Kursraum: Java, 18 Plaetze

class Kursraum {
    String thema;
    int plaetze;

    Kursraum(String thema, int plaetze) {
        this.thema = thema;
        this.plaetze = plaetze;
    }
}

public class A03_Kursraum {
    public static void main(String[] args) {

        //Wenn wir die Werte beim instanziieren des Objekts via Konstruktor nicht in die 
        //dafür vorgesehenen Parameter eintragen würden, stünde dort null & 0 als Defaultwerte.
        Kursraum kursraum = new Kursraum("Java", 18);

        System.out.println("Kursraum: " + kursraum.thema + ", " + kursraum.plaetze + " Plätze");
    }
}
