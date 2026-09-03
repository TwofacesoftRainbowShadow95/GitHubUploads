// Aufgabe
// Gegeben: String text = "Java ist cool und Java macht Spaß";
// Dein Programm soll:
// - "Java" durch "Python" ersetzen.
// - Das Ergebnis ausgeben.
// - Herausfinden, an welcher Position das erste "Java" beginnt.
// - Die gefundene Position ausgeben.

public class replaceUndIndexOf {
    public static void main(String[] args) {
        
        String text = "Java ist cool und Java macht Spaß";

        System.out.println(text.replace("Java", "Python"));
        System.out.println("Position im Text von 'Java': " + text.indexOf("Java"));

    }
}
