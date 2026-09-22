package Tag20;

// 02: Konstruktorablauf beobachten
// - Erstelle A02_Bestellung.java. 
// - Schreibe die Klasse Bestellung mit einem parameterlosen Konstruktor, 
//   der "Bestellung angelegt." ausgibt. 
// - Gib danach in main "Main laeuft." aus.
// Erwartete Ausgabe:
//      Bestellung angelegt.
//      Main laeuft.

class Bestellung {
    Bestellung(){
        System.out.println("Bestellung angelegt.");
    }
}

public class A02_Bestellung {
    public static void main(String[] args) {
        Bestellung bestellung = new Bestellung();

        System.out.println("Main läuft.");
    }
}
