// Aufgabe 8 – Verschachtelte while
// Wir möchten folgendes ausgeben:

// 1 1
// 1 2
// 1 3

// 2 1
// 2 2
// 2 3

// 3 1
// 3 2
// 3 3

// Dafür brauchst du:
// - eine äußere while
// - eine innere while

// Hinweis: Denk an unseren verschachtelten switch:
// Die äußere Schleife kümmert sich um die erste Zahl.
// Die innere Schleife kümmert sich um die zweite Zahl.

// Und ganz wichtig: Die innere Schleifenvariable muss bei jedem neuen Durchlauf der äußeren Schleife 
// wieder auf ihren Startwert gesetzt werden.

public class whileZahlen2 {
    public static void main(String[] args) {
        
    int zahl = 0;
    
    while (zahl < 3) {
        zahl++;
        int zahl2 = 1;
        
            while (zahl2 < 3) {
                System.out.println(zahl + " " + zahl2);
                zahl2++;
            }
        
        System.out.println(zahl + " " + zahl2);
        System.out.println();
        }
    }
}
