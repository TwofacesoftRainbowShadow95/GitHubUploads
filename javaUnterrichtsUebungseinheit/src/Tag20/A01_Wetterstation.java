package Tag20;
// 01: Betriebszustand einer Wetterstation

// - Erstelle A01_Wetterstation.java. 
// - Schreibe die Klasse Wetterstation mit String status 
//   und einem parameterlosen Konstruktor, der online setzt. 
// - Erzeuge ein Objekt und gib den Status aus. 
// - Begruende vor dem Schreiben, warum der Wert nicht erst in main gesetzt werden soll.
// Erwartete Ausgabe:
// Wetterstation: online

// Der Wert wird am besten schon im Konstruktor gesetzt, damit man einen "Startwert"
//hat mit welchem man arbeiten kann?
class Wetterstation {
    String status;

    Wetterstation(){
        status = "online";
    }
}

public class A01_Wetterstation {
    public static void main(String[] args) {
        Wetterstation wetterstation = new Wetterstation();

        System.out.println("Wetterstation: " + wetterstation.status);
    }
}
