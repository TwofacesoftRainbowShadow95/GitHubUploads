// Aufgabe 16 – Verschachtelung
// Hier testen wir, ob du das Prinzip von gestern wirklich übertragen kannst.
// Schreibe zwei verschachtelte for-Schleifen, die folgendes ausgeben:
// 1 1
// 1 2
// 1 3

// 2 1
// 2 2
// 2 3

// 3 1
// 3 2
// 3 3
// Denkstütze
// Du kennst dieses Muster bereits von unserer while-Übung.
// Jetzt musst du es nur mit for bauen:
// äußere for
//     ↓
// innere for
// Aber: Versuch diesmal, 
// die 3 nicht wie bei deiner damaligen while-Lösung separat auszugeben.
// Die innere Schleife soll alle drei Werte selbst erzeugen.

public class forSchleifeVerschachtelt {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            //System.out.print("first" + i);
            for (int j = 1; j <= 3; j++) {
               //System.out.print("second" + j); 
                System.out.print(i + " " + j + "\n");
            }
        }
        
    }
}
