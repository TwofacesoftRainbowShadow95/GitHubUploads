package chattyJava.src.tag2;

import java.util.Scanner;


// Aufgabe 2 – else if

// Der Benutzer gibt sein Alter ein.

// Das Programm soll ausgeben:

// unter 13  → Kind
// 13–17      → Jugendlicher
// 18–64      → Erwachsener
// 65+        → Senior
// Deine Aufgabe

// Schreibe das komplett selbst mit if, else if und else.

public class altersabfrage2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie alt bist du? ");
        int alter = sc.nextInt();

        if (alter < 13) {
            System.out.println("Kind");
        } else if (alter < 18) {
            System.out.println("Jugendlicher");
        } else if (alter < 65) {
            System.out.println("Erwachsener");
        } else {
            System.out.println("Senior");
        }
        sc.close();
    }
}
