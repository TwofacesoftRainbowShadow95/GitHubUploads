package chattyJava.src.tag2;

// Aufgabe 12 Schreibe ein Programm,                                Hinweise Du brauchst:
// das den Benutzer nach einer Zahl fragt.                          - Scanner
// Das Programm soll die Zahl mindestens einmal abfragen            - int zahl
// und anschließend solange weiterfragen,                           - do
// wie die Zahl nicht 0 ist.                                        - while
// Beispiel:                                                        
// Zahl: 5                                                          
// Zahl: 8                                                          
// Zahl: 3                                                          
// Zahl: 0                                                          
// Programm beendet.                                                


import java.util.Scanner;

public class doWhileZahlenabfrage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zahl: ");
        int zahl = sc.nextInt();

        do {
            System.out.print("Zahl: ");
            zahl = sc.nextInt();
        } while (zahl != 0);
            System.out.println("Programm beendet.");
        sc.close();
    }
}
