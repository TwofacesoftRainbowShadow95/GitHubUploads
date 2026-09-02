// Mini-Zahlenanalyse
// Schreibe ein Programm, das den Benutzer nach einer positiven Ganzzahl fragt.
// 1️. Zahl einlesen
// Gib eine positive Zahl ein: Speichere sie in einer passenden Variable.
// 2.  for-Schleife
// Gib anschließend alle Zahlen von 1 bis zur eingegebenen Zahl aus.
// Beispiel bei 5:
// 1
// 2
// 3
// 4
// 5
// 3️. if / else
// Für jede Zahl soll zusätzlich ausgegeben werden:
// 1 - ungerade
// 2 - gerade
// 3 - ungerade
// 4 - gerade
// 5 - ungerade
// Dafür kannst du % verwenden.
// 4️. Ternärer Operator
// Nach der Schleife soll eine Variable groesse mithilfe eines ternären Operators bestimmen:
// Zahl < 10 → "Kleine Zahl"
// Zahl ≥ 10 → "Große Zahl"
// Danach ausgeben.
// 5️. switch
// Der Benutzer soll anschließend auswählen:
// 1 → Anfänger
// 2 → Fortgeschritten
// 3 → Profi
// Mit switch soll die entsprechende Kategorie ausgegeben werden.
// 6️. Abschluss: Zum Schluss:
// "Analyse abgeschlossen."

import java.util.Scanner;

public class miniZahlenanalyse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Gib eine positive Ganzzahl ein: ");
        int zahl = sc.nextInt();
        System.out.println();

        for (int x = 1; x <= zahl; x++) {
            if (x %2 == 0) {
                System.out.println(x + " - gerade");
            } else {
                System.out.println(x + " - ungerade");
            }
        }

        String groesse = zahl >= 10 ? "Große Zahl" : "Kleine Zahl";
        System.out.println();
        System.out.println(groesse);

        System.out.println();
        System.out.println("Wähle deine Kategorie:");
        System.out.println();
        System.out.println("Für Anfänger wähle die          1");
        System.out.println("Für Fortgeschritten wähle die   2");
        System.out.println("Für Profi wähle die             3");
        System.out.println();
        System.out.print("Gib Hier deine Wahl ein: ");
        int kategorie = sc.nextInt();
        System.out.println();

        switch (kategorie) {
            case 1:
                System.out.println("Anfänger");
                break;
            case 2:
                System.out.println("Fortgeschritten");
                break;
            case 3:
                System.out.println("Profi");
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        System.out.println();
        System.out.println("Analyse abgeschlossen.");
        System.out.println();
        sc.close();
    }
}
