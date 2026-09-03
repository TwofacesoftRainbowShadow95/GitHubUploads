// Gegeben:
//      String text = "Java";
// Deine Aufgabe:
// - Gib die Anzahl der Zeichen aus.
// - Gib das erste Zeichen aus.
// - Gib das letzte Zeichen aus.
// Tipp: Der letzte Index ist nicht length(), sondern length() - 1

public class warmUp {
    public static void main(String[] args) {
        String text = "Java";

        System.out.println("Das Wort hat " + text.length() + " Buchstaben.");
        System.out.println("Das erste Zeichen lautet: " + text.charAt(0));
        System.out.println("Das letzte Zeichen lautet: " + text.charAt(text.length() - 1));

    }
}
