// Aufgabe: trim() + contains()
//      String text = "   Java macht Spaß   ";
// Dein Programm soll:
// - Die Leerzeichen am Anfang und Ende entfernen.
// - Prüfen, ob der Text "Java" enthält.
// - Das Ergebnis beider Operationen ausgeben

public class trimmUndContains {
    public static void main(String[] args) {
        String text = "   Java macht Spaß   ";

        String ergebnis1 = text.trim();
        boolean ergebnis2 = text.contains("Java");

        System.out.println("Ergebnis 1: " + ergebnis1);
        System.out.println("Ergebnis 2: " + ergebnis2);
    }
}
