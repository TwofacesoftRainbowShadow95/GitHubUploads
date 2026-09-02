import java.util.Scanner;

// Aufgabe 4 – direkt nochmal

// Schreibe ein Programm für eine Prüfung:
// - Punktzahl 0–49    → "Nicht bestanden"
// - Punktzahl 50–79   → "Bestanden"
// - Punktzahl 80–100  → "Sehr gut"

// Zusatz:
// Wenn die Punktzahl 80 oder höher ist, soll zusätzlich geprüft werden:

// - 90–100 → "Ausgezeichnet!"
// - 80–89 → "Sehr gut!"

// Nutze dafür eine verschachtelte if-Bedingung.

public class punktepruefung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Punkte von 0 - 100 hast du erreicht? ");
        int punkte = sc.nextInt();

        if (punkte >= 80) {
            if (punkte >= 90) {
                System.out.println("Ausgezeichnet!");
            } else {
                System.out.println("Sehr gut!");
            } 
        } else if (punkte < 50) {
            System.out.println("Nicht bestanden");
        } else {
            System.out.println("Bestanden");
        }
        sc.close(); 
    }
}

