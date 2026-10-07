public class quiz1 {
    public static void main(String[] args) {
        int x = 5;

        int a = ++x;
        int b = x++;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);

        
    }
}

// Frage 1 – ++:
// Was wird ausgegeben?
// Bitte wieder kurz erklären, wann x verändert wird.

// Meine Antwort:
// println(a) = 6, println(b) = 6, println(x) = 7
// bei a wird x durch das vor x stehende ++ um eins erhöht, weshalb a schon den Wert 6 besitzt
// bei b wird ebenfalls der Wert 6 eingesetzt, da x hier das ++ hinter x steht. Aber x wird nachdem es in b eingesetzt wurde um 1 erhöht.
// x selbst besitzt deswegen zum Schluss den Wert 7




