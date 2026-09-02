import java.util.Scanner;

// Aufgabe 6 – Verschachtelter switch
// Wir bauen einen kleinen Getränkeautomaten.
// Der Benutzer gibt zuerst eine Kategorie ein:                             Beispiele:
// - 1 → Heißgetränk                                                        - Kategorie: 1
// - 2 → Kaltgetränk                                                        - Getränk: 2
// Danach soll er innerhalb der Kategorie ein Getränk auswählen.            → Tee
// Heißgetränke                                                             oder:
// - 1 → Kaffee                                                             Kategorie: 2
// - 2 → Tee                                                                - Getränk: 1
// Kaltgetränke                                                             → Cola
// - 1 → Cola                                                               
// - 2 → Wasser                                                             

// Deine Aufgabe Verwende:
// - Scanner
// - einen äußeren switch für die Kategorie
// - darin jeweils einen inneren switch für das Getränk
// - default für ungültige Eingaben
// 💡 Hinweis: Der zweite switch steht innerhalb eines case des ersten switch.

public class getraenkeautomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Wähle eine Kategorie aus: ");
        System.out.println("Wähle 1 für Heißgetränke");
        System.out.println("Wähle 2 für Kaltgetränke");
        int kategorie = sc.nextInt();


        switch (kategorie) {
            
            case 1:
            System.out.println("Wähle ein Getränk aus: ");
            System.out.println("Wähle 1 für Kaffee");
            System.out.println("Wähle 2 für Tee");
            int warmGetraenk = sc.nextInt();
                switch (warmGetraenk) {
                    case 1:
                        System.out.println("Kaffee");
                        break;
                    case 2:
                        System.out.println("Tee");
                        break;
                    default:
                        System.out.println("Ungültige Eingabe");
                        break;
                } 
                break;
            case 2:
            System.out.println("Wähle ein Getränk aus: ");
            System.out.println("Wähle 1 für Cola");
            System.out.println("Wähle 2 für Wasser");
            int kaltGetraenk = sc.nextInt();
                switch (kaltGetraenk) {
                    case 1:
                        System.out.println("Cola");
                        break;
                    case 2:
                        System.out.println("Wasser");    
                        break;
                    default:
                        System.out.println("Ungültige Eingabe");
                        break;
                }            
        sc.close();
        }
    }
}
