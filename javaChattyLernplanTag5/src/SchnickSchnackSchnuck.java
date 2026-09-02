// Aufgabe: Stein, Schere, Papier
// Erstelle ein einfaches Spiel gegen den Computer.
// - Der Spieler gibt eine Zahl ein:
//   1 = Stein
//   2 = Schere
//   3 = Papier
// - Der Computer wählt mithilfe von Math.random() ebenfalls eine Zahl zwischen 1 und 3. 
// - Gib anschließend die Auswahl des Spielers, die Auswahl des Computers und den Gewinner aus. 
// - Die regeln sind wie folgt: Stein schlägt Schere, Schere schlägt Papier und Papier schlägt Stein.
//   Aausgabe:
//   1 = Stein
//   2 = Schere
//   3 = Papier
// Deine Auswahl: 1
// Du hast Stein gewählt.
// Der Computer hat Schere gewählt.
// Du hast gewonnen!

// ############################### Pseudo - Code ###################################################

// PROGRAMM SteinScherePapier
//     Scanner für Benutzereingaben erstellen
//     AUSGEBEN "1 = Stein"
//     AUSGEBEN "2 = Schere"
//     AUSGEBEN "3 = Papier"

//     AUSGEBEN "Deine Auswahl: "
//     Auswahl EINLESEN

//     Zufallszahl zwischen 1 und 3 für den Computer erzeugen

//     Auswahl des Spielers ausgeben
//     Auswahl des Computers ausgeben

//     Gewinner bestimmen:
//         Wenn Auswahl des Spielers gleich Auswahl des Computers:
//             AUSGEBEN "Unentschieden!"
//         Sonst wenn:
//             //(Auswahl des Spielers == 1 und Auswahl des Computers == 2) oder
//             (Auswahl des Spielers == 2 und Auswahl des Computers == 3) oder
//             (Auswahl des Spielers == 3 und Auswahl des Computers == 1):
//             AUSGEBEN "Du hast gewonnen!"
//         Sonst:
//             AUSGEBEN "Der Computer hat gewonnen!"
// ENDE PROGRAMM

import java.util.Scanner;

public class SchnickSchnackSchnuck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Auswahlmenü:");
        System.out.println();
        System.out.println("Für Schere tippe    1");
        System.out.println("Für Stein tippe     2");
        System.out.println("Für Papier tippe    3");
        System.out.println();

        int auswahlMensch = sc.nextInt();

        switch (auswahlMensch) {
            case 1:
                System.out.println("Deine Auswahl lautet Stein.");
                break;
            case 2:
                System.out.println("Deine Auswahl lautet Schere.");
                break;
            case 3:
                System.out.println("Deine Auswahl lautet Papier.");
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }

        for (int i = 1; i <= 1; i++) {
            int auswahlComputer = (int) (Math.random() * 3) + 1;
            System.out.println(auswahlComputer);
        

        switch (auswahlComputer) {
            case 1:
                System.out.println("Computer Auswahl lautet Stein.");
                break;
            case 2:
                System.out.println("Computer Auswahl lautet Schere.");
                break;
            case 3:
                System.out.println("Computer Auswahl lautet Papier.");
                break;
            }

        if (auswahlMensch == auswahlComputer) {
            System.out.println("Unentschieden");
        }
        else if (auswahlMensch == 3 && auswahlComputer == 1) {
            System.out.println("Du hast gewonnen!");
        }
        else if (auswahlMensch == 1 && auswahlComputer == 3) {
            System.out.println("Du hast verloren!");
        }
         else if (auswahlMensch < auswahlComputer) {
            System.out.println("Du hast gewonnen!");
        }
        else {
            System.out.println("Du hast verloren!");
        }
        
        }
        sc.close();
    }    
}
