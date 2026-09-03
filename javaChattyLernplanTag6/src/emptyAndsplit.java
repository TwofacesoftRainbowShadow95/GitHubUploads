// Aufgabe isEmpty & split
// Gegeben:     String einkauf = "Apfel,Birne,Banane,Milch";
// Deine Aufgabe:
// - Teile den String an den Kommata auf.
// - Gib jedes einzelne Produkt aus.
// - Erstelle zusätzlich einen leeren String und prüfe mit isEmpty(), ob er leer ist.
// Kleiner Hinweis: 
// Bei split//() wirst du wahrscheinlich etwas brauchen, 
// mit dem du mehrere einzelne Werte nacheinander bearbeiten kannst.

public class emptyAndsplit {
    public static void main(String[] args) {
        String einkauf = "Apfel,Birne,Banane,Milch"; 
        String leer = "";
        // String artikel = "";
        String[] artikel = einkauf.split(","); 

        for (int i = 0; i < artikel.length; i++) {
            System.out.println(artikel[i]);
        }
        
        System.out.println("String leer ist leer? " + leer.isEmpty());

    }
}
