package chattyJava.src.tag2;

import java.util.Scanner;

// Aufgabe 3 – Verschachtelung

// Wir bauen eine verschachtelte if-Bedingung.
// Situation Der Benutzer gibt sein Alter ein.
// Dann:

// Wenn mindestens 18:

// - Wenn mindestens 21 → "Du bist mindestens 21."
// - Sonst → "Du bist zwischen 18 und 20."

// Wenn unter 18:

// - "Du bist minderjährig."

public class altersabfrage3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie alt bist du? ");
        int alter = sc.nextInt();

        if (alter >= 18) {
            
            if (alter >= 21) {
                System.out.println("Du bist mindestens 21.");
            } else {
                System.out.println("Du bist zwischen 18 und 20.");
            }
        } else {
            System.out.println("Du bist minderjährig.");
        }
        sc.close();
    }
}
