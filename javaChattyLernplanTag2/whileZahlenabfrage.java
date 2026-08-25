package chattyJava.src.tag2;

// Aufgabe 10 – while + Eingabe                     
//           
// Schreibe ein Programm, das den Benutzer                
// wiederholt nach einer Zahl fragt.         
// Das Programm soll solange weiterfragen,              Vorgaben: Du brauchst:
// wie die eingegebene Zahl nicht 0 ist.                - Scanner               erledigt!
// Beispiel:                                            - eine int-Variable     erledigt!
// - Gib eine Zahl ein: 8                               - while                 erledigt!
// - Gib eine Zahl ein: 3                               - if/else               Unnötig >:D
// - Gib eine Zahl ein: 0                               Hinweis: Die Variable muss vor der while-Bedingung existieren
// - Programm beendet.                                  Und ganz wichtig: Überlege dir zuerst: 
// - Gib eine Zahl ein: 5                               Welche Bedingung muss gelten, damit die Schleife weiterläuft?

import java.util.Scanner;

public class whileZahlenabfrage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Gib eine Zahl ein. ");
        int zahl = sc.nextInt();

        while (zahl != 0) {
                   
        System.out.print("Gib eine Zahl ein: ");
        zahl = sc.nextInt();

        }

        System.out.println("Programm beendet.");
        sc.close();

    }
}
