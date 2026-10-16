// fast alles an Code was hier steht wurde von Chatty produziert.

public class ArrayTraining {
    public static void main(String[] args) {

        int[] zahlen = new int[4];
        int[] zahlen2 = {5, 12, 8, 20};
        int[] zahlen3 = {5, 12, 8, 20, 15};
        int[] zahlen4 = {-8, -3, -15, -2};
        int[] zahlen5 = {7, 15, 3, 22, 10, 18};

        int summe = 0;
        int groessteZahl = 0;
        int groessteZahl2 = 0;
        int anzahl = 0 ;
        int kleinsteZahl = zahlen5[0];

        zahlen[0] = 10;
        zahlen[1] = 20;
        zahlen[2] = 30;
        zahlen[3] = 40;

        int ergebnis = zahlen[2]; // selbst produzierter Code
        // System.out.println(zahlen[4]);

        zahlen[1] = 99; // selbst produzierter Code
        int letzterWert = zahlen[3]; // selbst produzierter Code

        // selbst produzierter Code
        for(int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }

        // selbst produzierter Code
        for(int i = 0; i < zahlen2.length; i++) {
            summe += zahlen2[i];
        }

        // selbst produzierter Code
        for(int i = 0; i < zahlen3.length; i++) {
            if (zahlen3[i] > groessteZahl) {
                groessteZahl = zahlen3[i];
            }
        }

        // selbst produzierter Code
        groessteZahl2 = zahlen4[0];
        
        for(int i = 0; i < zahlen4.length; i++) {
            
            if (zahlen4[i] > groessteZahl2) {
                groessteZahl2 = zahlen4[i];
            }
        }

        // selbst produzierter Code
        zahlen5[2] = 9;
        int wert = zahlen5[4];

        for(int i = 0; i < zahlen5.length; i++) {
            if (zahlen5[i] > 10) {
                anzahl += 1;
            }
        }

        for(int i = 0; i < zahlen5.length; i++) {
            if (zahlen5[i] < kleinsteZahl) {
                kleinsteZahl = zahlen5[i];
            }
        }

        System.out.println(summe);
        System.out.println(groessteZahl);
        System.out.println(groessteZahl2);
        System.out.println(wert);
        System.out.println(anzahl);
        System.out.println(kleinsteZahl);
    }
}

// Runde 1 Deine drei Fragen ^^
// 1. Was bedeutet int[] zahlen = new int[4];? Erklär es bitte in deinen eigenen Worten.
// 2. Wie lautet der Code, um die Zahl 30 aus dem Array auszulesen und in einer neuen int-Variablen namens ergebnis zu speichern?
// 3. Was passiert bei diesem Code?
//      System.out.println(zahlen[4]);

// Runde 2: Werte verändern:
// Deine Aufgaben ^^
// 1. Schreibe eine Codezeile, die den Wert am Index 1 auf 99 verändert.
// 2. Schreibe eine Codezeile, die den Wert am Index 3 in einer Variablen namens letzterWert speichert.
// 3. Was gibt dieser Code anschließend aus?
//      zahlen[1] = 99;
//      System.out.println(zahlen[1]);

// Runde 3: Array und for-Schleife verbinden:
// 1. Schreibe eine for-Schleife, die alle vier Zahlen im Array ausgibt.
// 2. Erkläre mir kurz, was diese drei Bestandteile deiner Schleife bedeuten:
// - int i = 0
// - i < zahlen.length
// - i++

// Runde 4: Jetzt bist du dran!:
// Deine Aufgabe
// Schreibe eine for-Schleife, die alle Zahlen im Array addiert und am Ende die Gesamtsumme ausgibt.
// Das Ergebnis soll sein: 45

// Runde 5 
// Dein Ziel: Finde die größte Zahl im Array und gib sie aus.
// Erwartete Ausgabe: 20
// Deine Hinweise

// Was passiert bei diesem Array? int[] zahlen3 = {-8, -3, -15, -2};

// Du brauchst zwei Dinge:
// Eine int-Variable, in der du dir die bisher größte Zahl merkst.
// Eine for-Schleife, die alle Werte im Array überprüft.

// Runde 6:
// Aufgabe 1 – Werte lesen und verändern
// 1. Ändere den Wert am Index 2 auf 9.
// 2. Speichere den Wert am Index 4 in einer neuen int-Variable namens wert.
// 3. Gib wert aus.

// Aufgabe 2 – Schleife und Bedingungen
// Schreibe eine for-Schleife, die zählt, wie viele Zahlen größer als 10 sind.
// Speichere die Anzahl in einer Variablen namens anzahl und gib sie anschließend aus.
// Du brauchst:
// - Eine int-Variable für den Zähler.
// - Eine for-Schleife.
// - Eine if-Bedingung.

// Aufgabe 3 – Alles kombinieren
// Finde die kleinste Zahl im Array und gib sie aus.
// Beachte dabei:
// - Verwende eine Variable namens kleinsteZahl.
// - Initialisiere sie mit einem Wert aus dem Array.
// - Verwende eine for-Schleife und eine if-Bedingung.
// - Aktualisiere kleinsteZahl, wenn du eine kleinere Zahl findest.

// Meine Antwort: 

// Runde 1: 
// 1. Hier wird ein Array mit dem primitiven Datentypen int und namen/Stack zahlen. Der Array hat 4 Plätze festgesetzt in der Erstellung
// 2. int ergebnis = zahlen[2];
// 3. es wird die Exception ArrayIndexOutOfBoundException erzeugt

// Runde 2:
// 1. zahlen[1] = 99;
// 2. int letzterWert = zahlen[3];
// 3. Der Code gibt 99 aus, da das die letzte Speicherung auf zahlen[1] ist.

// Runde 3:
// 1. for(int i = 0; i < zahlen.length; i++) {
//            System.out.println(zahlen[i]);
//        }
// 2. int i = 0 ist ein Platzhalter, welcher für den Index in dem Array steht.
//    i < zahlen.length ist die Bedingung, welche aussagt, wie oft die Prüfung durchgeführt werden soll. Nämlich solange i kleiner als die Menge der Elemente ist, prüfe erneut
//    i++ sorgt dafür, dass sich der Wert von i bei jeder Prüfung erhöht, ansonsten würde immer der selbe Wert gedruckt werden, was wahrscheinlich in einer Endlosschleife mit dem selben Wert enden würde.

// Runde 4:
// for(int i = 0; i < zahlen2.length; i++) {
        //     summe += zahlen2[i];
        // }

        // System.out.println(summe);

// Runde 5: 
// int[] zahlen3 = {5, 12, 8, 20, 15};
// int groessteZahl = 0;
// for(int i = 0; i < zahlen3.length; i++) {
        //     if (zahlen3[i] > groessteZahl) {
        //         groessteZahl = zahlen3[i];
        //     }
        // }

// System.out.println(groessteZahl);

// Runde 5 Variante 2: 
// int[] zahlen4 = {-8, -3, -15, -2};
// int groessteZahl2 = 0;
// groessteZahl2 = zahlen4[0];
        
        // for(int i = 0; i < zahlen4.length; i++) {
            
        //     if (zahlen4[i] > groessteZahl2) {
        //         groessteZahl2 = zahlen4[i];
        //     }
        // }
// System.out.println(groessteZahl2);

// Runde 6:
// Aufgabe 1: 
// 1. zahlen5[2] = 9;
// 2. int wert = zahlen5[4];
// 3. System.out.println(wert);

// Aufgabe 2:
// - int anzahl = 0 ;
// - for(int i = 0; i < zahlen5.length; i++) {
        //     if (zahlen5[i] > 10) {
        //         anzahl += 1;
        //     }
        // }
// - System.out.println(anzahl);

// Aufgabe 3: 
// - int kleinsteZahl = zahlen5[0];
// - for(int i = 0; i < zahlen5.length; i++) {
        //     if (zahlen5[i] < kleinsteZahl) {
        //         kleinsteZahl = zahlen5[i];
        //     }
        // }
// - System.out.println(kleinsteZahl);

// Korrektur Runde 3:
// Ein kleiner Unterschied: Die Bedingung sagt nicht direkt, wie oft geprüft werden soll. Sie wird vor jedem Schleifendurchlauf geprüft und entscheidet, ob die Schleife weiterläuft.






