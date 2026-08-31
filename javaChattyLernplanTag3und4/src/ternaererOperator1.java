package tag3und4;

import java.util.Scanner;

// Aufgabe 18 – Ternär
// Der Benutzer gibt eine Zahl ein:
// Gib eine Zahl ein: 7
// Dein Programm soll mit einem ternären Operator feststellen:
// - Zahl größer oder gleich 0 → "Positiv"
// - Zahl kleiner als 0 → "Negativ"
// Beispiel:
// - Gib eine Zahl ein: -4
// - Negativ
// Regeln
// ❌ kein if
// ❌ kein else
// ❌ kein switch
// ✅ Scanner
// ✅ int
// ✅ ternärer Operator
// Und diesmal musst du selbst entscheiden:
// Was kommt links vom ?, was zwischen ? und :, und was danach?

public class ternaererOperator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib eine positive oder negative Zahl ein: ");
        int zahl = sc.nextInt();

        String status = zahl >= 0 ? "Positiv" : "Negativ";
        System.out.println(status);

        sc.close();
    }
}
