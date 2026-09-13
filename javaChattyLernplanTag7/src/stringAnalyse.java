package tag7;

import java.util.Scanner;

// Schreibe ein Programm, das einen Satz vom Benutzer einliest, z. B.:

// Hallo Java Welt

// Dein Programm soll:

// 1. Den Satz einlesen.
// 2. Eine eigene Methode analysiereText(...) erstellen.
// 3. In dieser Methode:
//      - die Länge des Strings bestimmen,
//      - "Java" suchen,
//      - die letzte Position von "Java" bestimmen,
// 4. den Text "Java" mit substring() herausschneiden.
// 5. Die Ergebnisse aus der Methode sinnvoll ausgeben.
// Verwende dabei mindestens einen Methodenparameter und einen Rückgabewert.

// Wichtig: Du musst nicht alles in eine einzige Methode quetschen. Überleg selbst, wie du es strukturieren möchtest.

public class stringAnalyse {

public static int satzAnalyse1(String a) {
    return a.length();
}

public static boolean satzAnalyse2(String a, String b) {
    return a.contains(b);
}

public static int satzAnalyse3(String a, String b) {
    return a.lastIndexOf(b);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib einen Satz ein: ");
        String satz = sc.nextLine();

        System.out.println("Dein Satz hat " + satzAnalyse1(satz) + " Stellen.");

        System.out.print("Nach welchem Wort möchtest du in deinem Satz suchen: ");
        String gesWort = sc.nextLine();

        System.out.println("Im Satz befindet sich " + gesWort + ": " + satzAnalyse2(satz, gesWort));

        int positionGesWort = satzAnalyse3(satz, gesWort);
        System.out.println("Die letzte Position von " + gesWort + " befindet sich an Stelle: " + positionGesWort);
        
        String gesWort2 = satz.substring(positionGesWort, positionGesWort + gesWort.length());
        System.out.println("Das gesuchte Wort: " + gesWort2);

        sc.close();
    }
}
