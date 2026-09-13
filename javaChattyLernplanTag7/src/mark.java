import java.util.ArrayList;
import java.util.Scanner;

// Aufgabe: Notendurchschnitt-Rechner
// Schreib ein Java-Programm und Python-Progamm, das:
// Den Nutzer nach drei Noten fragt
// Den Durchschnitt berechnen
// Abhängig vom Ergebnis eine passende Nachricht ausgibt, z. B.:
// Durchschnitt <= 2.0 → "Respekt, du bist offenbar kein Mensch."
// Durchschnitt <= 4.0 → "Durchschnitt. Wie das Leben."
// Durchschnitt > 4.0 → "Nun ja. Wenigstens kannst du jetzt Java."

// Bonus: Lass den Nutzer selbst entscheiden, wie viele Noten er eingeben will, und nutze dafür eine Schleife.

public class mark {

public static double average(int a, int b) {
    return (double) a / b;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();
        System.out.print("How many marks do you want to enter: ");
        int customerChoice = sc.nextInt();
        int allTogether = 0;

        for (int i = 0; i < customerChoice; i++) {
            System.out.print("Mark: ");
            int mark = sc.nextInt();
            marks.add(mark);
            allTogether += mark;
        }

        double averageMark = average(allTogether, marks.size());

        if (averageMark <= 2.0) {
            System.out.println(averageMark + ", Respekt, du bist offenbar kein Mensch.");
        } else if (averageMark <= 4.0) {
            System.out.println(averageMark + ", Durchschnitt. Wie das Leben.");
        } else {
            System.out.println(averageMark + ", Nun ja. Wenigstens kannst du jetzt Java.");
        }

        sc.close();
    }
}
