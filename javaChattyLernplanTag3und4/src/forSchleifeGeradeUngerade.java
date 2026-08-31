package tag3und4;

// Aufgabe 15 – for + Bedingung
// Schreibe eine Schleife von 1 bis 20, die:
// - gerade Zahlen → Gerade: X
// - ungerade Zahlen → Ungerade: X
// ausgibt. Also:
// Gerade: 2
// Ungerade: 3
// Gerade: 4
// Ungerade: 5
// ...
// Gerade: 20
// Hinweis
// Hier ist % tatsächlich sinnvoll. 
// Du brauchst nur eine for-Schleife und eine if/else-Bedingung.
// Keine Verschachtelung diesmal.

public class forSchleifeGeradeUngerade {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i %2 == 0) {
                System.out.println("Gerade: " + i);
            } else{
                System.out.println("Ungerade: " + i);
            }
        }
    }
}
