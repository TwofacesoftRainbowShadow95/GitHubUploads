package tag3und4;

// Aufgabe 14
// Wir bleiben bei einer einfachen for, aber ändern die Logik.
// Schreibe eine Schleife, die nur die geraden Zahlen von 2 bis 20 ausgibt:
// 2
// 4
// 6
// 8
// 10
// 12
// 14
// 16
// 18
// 20
// 💡 Hinweis
// Du hast gestern % kennengelernt.
// Aber: Du musst % diesmal nicht zwingend verwenden.
// Überlege:
// Wenn ich bei 2 starte und bei jedem Durchlauf 2 dazuzähle, 
// brauche ich dann überhaupt eine zusätzliche Prüfung?

public class forSchleifeGerade {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
