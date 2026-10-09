import java.util.ArrayList;
// alles an Code wurde von Chatty als Aufgabe produziert


class Spieler {
    private String name;
    private int punkte;

    public Spieler(String name, int punkte) {
        this.name = name;
        this.punkte = punkte;
    }

    public void anzeigen() {
        System.out.println("Der Spieler " + name + " hat " + punkte + " Punkte.");
    }
}

public class quiz2 {
    public static void main(String[] args) {
        ArrayList<Spieler> spieler = new ArrayList<>();

        spieler.add(new Spieler("Tom", 150));
        spieler.add(new Spieler("Lisa", 120));

        spieler.getFirst().anzeigen();
        
    }
}

// Frage 2 – Objekt aus einer Sammlung holen:
// Die Klasse Spieler besitzt bereits die Methode anzeigen().
// Wie lautet der Code, um den ersten Spieler aus der ArrayList zu holen und direkt seine Methode anzeigen() aufzurufen?

// Meine Antwort:
// spieler.getFirst().anzeigen(null, 0);

// Eine kurze Kontrollfrage

// public void begruessen(String name) {
//    System.out.println("Hallo " + name);
// }

// Welcher Aufruf ist richtig?

// A) begrussen()
// B) begrussen(null)
// C) begrussen("Tom")

// Und warum?

// Meine Antwort: 
// C, weil wir im Methodenaufruf einen Parameter mit Datenty String haben, welcher als name gekennzeichnet wurde, 
// und dementsprechend passtund C, weil hier der String "Tom" in den Klammern der Methode steht.


