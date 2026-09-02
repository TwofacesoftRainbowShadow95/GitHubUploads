
                                                //Hinweise: Du brauchst drei Ebenen:
                                                //while
// Aufgabe 9 – while + Verschachtelung            └── while
// Wir bauen ein kleines Zahlen-Raster.              └── while
// Das Programm soll Folgendes ausgeben:        Dabei:
// 1 1 1                                        zahl1 läuft von 1 bis 1    
// 1 1 2                                        zahl2 läuft von 1 bis 3
// 1 1 3                                        zahl3 läuft von 1 bis 3
// 1 2 1
// 1 2 2
// 1 2 3
// 1 3 1
// 1 3 2
// 1 3 3

public class whileZahlen3 {
    public static void main(String[] args) {
        int zahl1 = 0;

        while (zahl1 < 1) {
            zahl1++;
            int zahl2 = 0;
            while (zahl2 < 3) {
                zahl2++;
                int zahl3 = 0;
                while (zahl3 < 3) {
                    System.out.println(zahl1 + " " + zahl2 + " " + zahl3);
                    zahl3++;
                }
                System.out.println(zahl1 + " " + zahl2 + " " + zahl3);
            }
        }
    }
}
