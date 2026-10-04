import java.util.ArrayList;

public class quizTime {
    public static void main(String[] args) {
        class Hund {
            String name;
            }

            Hund hund1 = new Hund();
            hund1.name = "Bello";

            Hund hund2 = hund1;
            hund2.name = "Rex";

            // Frage 1:
            // Was steht am Ende in: hund1.name

            // Frage2:
            // Erkläre warum hund1 und hund2 beide "Rex" sehen. Und ganz wichtig: 
            // Versuch diesmal auch den Unterschied zwischen Objekt und Referenz ausdrücklich zu benennen.

            // Meine Antwort:
            // 1. hund1.name =  Rex
            // 2. Es steht beide Male Rex in name, da hund1 & hund2 beide auf das selbe Objekt der Klasse Hund referieren.

            int x = 4;

            int a = x++;
            int b = ++x;

            System.out.println(a);
            System.out.println(b);
            System.out.println(x);

            // Frage 2 – ++ / --:
            // Was wird ausgegeben?
            // Und diesmal interessiert mich vor allem die Begründung:
            //   Was passiert bei x++ vor und nach der Zuweisung und was passiert bei ++x?

            // Meine Antwort:
            // Ausgabe untereinander: 4 6 4? Ich glaube, dass die Veränderungen von x in a & b nicht gespeichert werden, aber kann mir nicht mehr herleiten warum.
            // x++ wird erst nach dem print von a raufitteriert, weil das Itterieren hier erst nach Verwendung stattfindet, 
            // bei b wird das x von a genommen, welches durch die Verwendung schon um eins itteriert wird, und durch ++x wird hier noch eine Itteration um eins vorgenommen weshalb in b dann 6 steht.

            // Verbesserung -.- :
            // Ausgabe untereinander: 4 6 6 Weil der Wert von a & b jeweils in x gespeichert werden. Bedeutet x hat den Wert der letzten Itteration.

        class Spieler {
            private int punkte;

            public int getPunkte() {
                return punkte;
            }

            public void setPunkte(int punkte) {
                if (punkte >= 0) {
                    this.punkte = punkte;
                }
            }
        }

            Spieler s = new Spieler();

            s.setPunkte(100);
            s.setPunkte(-20);

            System.out.println(s.getPunkte());

            // Frage 3 - Kapselung:
            // Was wird ausgegeben und warum?
            // Und Bonusfrage: Warum brauchen wir hier this.punkte = punkte und nicht einfach punkte = punkte?

            // Meine Antwort:
            // Es wird 100 ausgegeben, da die if-Bedingung nur Werte >= 0 annimmt. Alles darunter, also der gesamte Minus-Bereich wird bei setPunkte gar nicht angenommen. 
            // Weil this sich auf die punkte des erstellten Objekts bezieht. Hätten wir punkte = punkte würde es auf sich selbst verweisen und zugewiesen werden und Java wüsste nicht,
            // wem/welchem Objekt die Zuordnung punkte jetzt gehört.

            // Präzisierung:
            // setPunkte(-20) wird durchaus aufgerufen – nur die Bedingung verhindert, dass der Wert übernommen wird. Das alte 100 bleibt also erhalten.

            // Letzte Runde – 3 kleine Kurzfragen
            // 1. Array

            int[] zahlen = {10, 20, 30, 40};

            // Was liefern:

            System.out.println(zahlen.length); // das print um zahlen.length habe Ich geschrieben, da ansonsten Fehler angezeigt werden.
            System.out.println(zahlen[0]); // das print um zahlen.length habe Ich geschrieben, da ansonsten Fehler angezeigt werden.
            System.out.println(zahlen[3]); // das print um zahlen.length habe Ich geschrieben, da ansonsten Fehler angezeigt werden.

            // Meine Antwort:
            // zahlen.length liefert die Anzahl aller im Array vorhandenen Elemente, hier 4
            // zahlen[0] liefert das Element an Index 0, hier 10
            // zahlen[3] liefert das Element an Index 3, hier 40

            // 2. ArrayList

            ArrayList<Integer> zahlenEins = new ArrayList<>(); // die Eins bei zahlenEins wurde von mir hinzugefügt um einen Konflickt mit der vorhergehenden Aufgabe zu vermeiden.

            zahlenEins.add(10); 
            zahlenEins.add(20); 
            zahlenEins.add(30); 

            // Was passiert bei:

            zahlenEins.set(1, 99); 

            // und was ist danach der Inhalt der ArrayList?

            // Meine Antwort:
            // Bei zahlenEins.set(1, 99) wird an Index 1 der Wert mit 99 überschrieben.
            // In der ArrayList steht dann 10 99 30

            // 3. Ternärer Operator

            int alter = 17;

            String status = alter >= 18 ? "volljährig" : "minderjährig";

            // Was steht in status und wofür steht der : hier?

            // Meine Antwort:
            // In status steht minderjährig, da 17 >= 18 -> false -> geht auf die rechte Seite des : weil diese die Ausgabe für false ist.
            // Der : steht Hier als Trennung zwischen der Ausgabe, wenn die Bedingung des ternären Operators true, auf der linken seite von :, oder false, auf der rechten Seite von :, ergibt.
    }
}
