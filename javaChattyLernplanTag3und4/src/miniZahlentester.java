import java.util.Scanner;

public class miniZahlentester {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Wie heißt du? ");
        String name = sc.next();

        System.out.print("Gib eine Zahl zwischen 1 und 100 ein: ");
        int zahl = sc.nextInt();

        if (zahl < 50) {
            System.err.println("Die Zahl ist kleiner als 50.");
        } else if (zahl < 100) {
            if (zahl %2 == 0) {
                System.out.println("Die Zahl ist gerade UND größer als 50.");
            }
            System.out.println("Die Zahl ist mindestens 50.");
        } else if (zahl == 100) {
            System.out.println("Du hast die 100 erreicht!");
        } else {
            System.out.println("Ungültige Zahl");
        }

        System.out.println();
        System.out.println("Hier wählst du deine Kategorie: ");
        System.out.println("Für Anfänger wähle die          1");
        System.out.println("Für Fortgeschritten wähle die   2");
        System.out.println("Für Profi wähle die             3");
        System.out.println();
        int kategorie = sc.nextInt();
        switch (kategorie) {
            case 1:
                System.out.println("Anfänger");
                break;
            case 2:
                System.out.println("Fortgeschritten");
                break;
            case 3:
                System.out.println("Profi");
                break;
            default:
                System.out.println("Ungültige Kategorie");
                break;
        }

        System.out.println("Hallo " + name);
        System.out.println("Deine Zahl war: " + zahl);
        System.out.println("Deine Kategorie: " + kategorie);
        
        sc.close();
    }
}
