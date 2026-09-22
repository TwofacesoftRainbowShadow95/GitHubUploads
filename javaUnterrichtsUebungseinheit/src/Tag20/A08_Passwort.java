package Tag20;

// 08: Mindestwert pruefen
// - Erstelle A08_Passwort.java. 
// - Schreibe Passwort mit int laenge. 
// - Werte unter 8 sollen IllegalArgumentException("Zu kurz") ausloesen. 
// - Erzeuge ein Passwort mit 5 und fange die Exception.
// Erwartete Ausgabe:
// Zu kurz

class Passwort {
    int laenge;

    Passwort(int laenge){
        if (laenge < 8) {
            throw new IllegalArgumentException("Zu kurz!");
        }

        this.laenge = laenge;
    }
}

public class A08_Passwort {
    public static void main(String[] args) {
        
        try {
            Passwort passwort = new Passwort(5);

            System.out.println("Passwortlänge: " + passwort);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
