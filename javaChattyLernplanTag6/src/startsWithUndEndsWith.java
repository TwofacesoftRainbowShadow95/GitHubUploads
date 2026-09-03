// Aufgabe 
// Gegeben:     String datei = "Java_Projekt.java";
// Finde heraus und gib aus:
// - Beginnt der Dateiname mit "Java"?
// - Endet der Dateiname mit ".java"?
// - Enthält der Dateiname "Projekt"?
// Bonus: Gib die drei Ergebnisse jeweils als verständliche Meldung aus, statt nur true/false

public class startsWithUndEndsWith {
    public static void main(String[] args) {
        String datei = "Java_Projekt.java";

        System.out.println("Beginnt der Dateiname mit 'Java': " + datei.startsWith("Java"));
        System.out.println("Endet der Dateiname mit '.java': " + datei.endsWith(".java"));
        System.out.println("Enthält der Dateiname 'Projekt': " + datei.contains("Projekt"));
    }
}
