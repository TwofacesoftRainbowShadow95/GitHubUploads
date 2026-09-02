import java.util.Scanner;

// Aufgabe 1

// Der Benutzer soll sein Alter eingeben.

// Wenn alter >= 18 → "Du bist volljährig."
// Sonst → "Du bist minderjährig."

// Du darfst deinen bekannten Scanner verwenden.

public class altersabfrage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wie alt bist du? ");
        int alter = sc.nextInt();

        if (alter < 18) {
            System.out.println("Du bist minderjährig.");
        } else {
            System.out.println("Du bist volljährig.");
        }
        sc.close();
    }
}
