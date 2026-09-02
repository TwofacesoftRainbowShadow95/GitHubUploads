import java.util.Scanner;

// Switch Aufgabe 1:
// Schreibe selbst einen switch, der eine Zahl von 1–4 entgegennimmt:

// 1 → Frühling
// 2 → Sommer
// 3 → Herbst
// 4 → Winter

// Bei einer anderen Zahl:

// Ungültige Eingabe

public class jahreszeitSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Tippe eine Zahl von 1-4");
        int jahreszeiten = sc.nextInt();

        switch (jahreszeiten) {
            case 1:
                System.out.println("Frühling");
                break;
            case 2:
                System.out.println("Sommer");
                break;
            case 3:
                System.out.println("Herbst");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
        }
        sc.close();
    }
}
