package chattyJava.src.tag2;

// Aufgabe 11 – letzte while-Herausforderung
// Jetzt testen wir, ob du es wirklich verstanden hast.
// Schreibe ein Programm, das:
// - Eine Zahl vom Benutzer verlangt.                                               halb erledigt
// - Solange die Zahl positiv ist, weiterfragt. (Positiv Heißt Nicht gerade -.-)
// - Bei jeder positiven Zahl die bisherige Summe ausgibt.
// - Sobald 0 oder eine negative Zahl eingegeben wird, endet das Programm.

import java.util.Scanner;

public class whileZahlenabfrage2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Zahl: ");
       
        int summeZahlen = 0;
        int zahl = sc.nextInt();
        // summeZahlen += zahl;
        // System.out.println("Summe: " + summeZahlen);

        while (zahl != 0) {
            
             
            if (zahl > 0) {
                
                summeZahlen += zahl;
                System.out.print("Summe: " + summeZahlen);
                System.out.println();
                System.out.println();
                System.out.print("Zahl: ");
                zahl = sc.nextInt();
                //System.out.print("Summe: " + summeZahlen); 
                
            } else if (zahl < 0) {
                //summeZahlen = zahl;
                //System.out.println("Zahl: " + zahl);
                break;    
            }
        }
        System.out.println();
        System.out.println("Programm beendet.");
        sc.close();
    }
}
