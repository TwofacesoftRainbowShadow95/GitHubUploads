// Aufgabe: String-Werkzeug 🛠️
// Erstelle ein Programm, das:
// - Einen Satz vom Benutzer einliest.                                              check
// - Ein Suchwort vom Benutzer einliest.                                            check
// - Eine Methode erstellt, die prüft, ob das Suchwort vorkommt.                    check
// - Eine Methode erstellt, die die letzte Position des Suchworts zurückgibt.       check
// - Das gefundene Wort mit substring() aus dem Satz herausschneidet und ausgibt.   check
// - String.join() benutzt, um eine kleine Ausgabe zusammenzubauen.
// Vorgaben:
// - Verwende mindestens 2 eigene Methoden.                 check
// - Verwende mindestens einmal return.                     check
// - Verwende contains(), lastIndexOf() und substring().    check
// - Keine ArrayList nötig.

import java.util.Arrays;
import java.util.Scanner;

public class stringWerkzeug {

    public static boolean  suchAnwendung(String a, String b) {
        return a.contains(b);
    }

    public static int posiWort(String a, String b) {
        return a.lastIndexOf(b);
    }

    public static String schnittWort(String a, int b, int c) {
        return a.substring(b, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] satz2 = new String[5];

        System.out.print("Gib einen Satz Wort für Wort ein: ");

        String satz = sc.nextLine();

        System.out.print("Nach welchem Wort möchtest du suchen: ");
        String gesWort = sc.nextLine();

        System.out.println("Dein Wort " + gesWort + " kommt im Satz vor: " + suchAnwendung(satz, gesWort));
        System.out.println("Dein gesuchtes Wort fängt an an Index " + posiWort(satz, gesWort));
        
        String schnittWortEinzeln = schnittWort(satz, (posiWort(satz, gesWort)), (posiWort(satz, gesWort) + gesWort.length()));
        System.out.println("Hier nochmal dein gesuchtes Wort aus dem Satz herausgeschnitten: " + schnittWortEinzeln);

        System.out.println("Gib hier 5 neue Wörter ein:");

        for (int i = 0; i < satz2.length; i++) {
            System.out.print("Wort Index: " + i + ": ");
            satz2[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(satz2));

        System.out.print("Gib ein Sonderzeichen ein, mit welchem du aus den 5 Wörtern etwas neues erschaffen möchtest: ");
        String zeichen = sc.nextLine();

        System.out.println("Dein neuer Satz lautet: " + String.join(zeichen, satz2));


        sc.close();
    }
}
