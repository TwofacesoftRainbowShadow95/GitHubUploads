package Tag20;

// 05: Konzert mit zwei Erzeugungsvarianten
// - Erstelle A05_Konzert.java. 
// - Schreibe Konzert mit String titel und int jahr. 
// - Ein Konstruktor ohne Parameter soll Unbekannt und 0 setzen. 
// - Ein zweiter soll Titel und Jahr uebernehmen. 
// - Erzeuge beide Varianten und notiere, welcher Aufruf welche Parameterliste verwendet.
// Erwartete Ausgabe:
// Erstes: Unbekannt, 0
// Zweites: Sommerklang, 2026

class Konzert{
    String titel;
    int jahr;

    Konzert() {
        titel = "unbekannt";
        jahr = 0;
    }

    Konzert(String titel, int jahr){
        this.titel = titel;
        this.jahr = jahr;
    }
}

public class A05_Konzert {
    public static void main(String[] args) {
        Konzert konzert1 = new Konzert();
        Konzert konzert2 = new Konzert("Sommerklang", 2026);
        Konzert konzert3 = new Konzert(null, 2020);

        System.out.println("Erstes: " + konzert1.titel + ", " + konzert1.jahr);
        System.out.println("Zweites: " + konzert2.titel + ", " + konzert2.jahr);
        System.out.println("Drittes: " + konzert3.titel + konzert3.jahr);

    }
}
