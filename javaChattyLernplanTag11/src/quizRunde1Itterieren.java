public class quizRunde1Itterieren {
    public static void main(String[] args) {
        int x = 4;

        int a = x++;
        int b = ++x;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);

    }
}

// Runde 1 – ++
// Was wird ausgegeben?
// Und bitte wieder mit deinem Denkweg, nicht nur mit den drei Zahlen. 
// Gerade bei ++ interessiert mich, wann du die Veränderung stattfinden lässt.

// Meine Antwort:
// Ausgabe untereinander: print(a) = 4, print(b) = 6, print(x) = 6
// - am Anfang hat x den Wert 4 dieser wird bei a eingesetzt und dahinter mit ++ versehen, 
//   bedeutet, dass bei der nächsten Verwendung x um 1 hochitteriert wird. a erhält somit den Wert 4
// - dann wird das x in b wieder verwendet, dadurch wird es schon um 1 hochitteriert, 
//   allerdings ist das x in b mit ++ vor dem x versehen, bedeutet, x wird vor der Verwendung nochmal um 1 hochitteriert 
//   deswegen erhält b den Wert 6
// - die letzte Itteration wird in x gespeichert und im letzten print ausgegeben. x hat hier durch b den Wert 6.

// Kleine Korrektur:
// int a = x++; 
// wird nicht erst „bei der nächsten Verwendung“ erhöht. Es passiert direkt:
//      aktuellen Wert verwenden → danach erhöhen

