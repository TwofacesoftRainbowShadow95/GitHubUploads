public class quizRunde2Boolean {
    public static void main(String[] args) {
        int punkte = 100;

        boolean gut = punkte >= 100;
        boolean besser = punkte > 100;

        System.out.println(gut);
        System.out.println(besser);
    }
}

// Runde 2 – Boolean
// Frage:
// Was wird ausgegeben und warum?
// Und achte diesmal besonders darauf, was der Vergleich selbst produziert und was anschließend in gut bzw. besser gespeichert wird.

// MFeine Antwort:
// booleans, weil in z.B. 
// - gut punkte in einen Vergleich gesetzt wird. Hier wird verglichen 100 >= 100 was durch das = ein true ergibt und in gut gespeichert wird
// - besser punkte ebenfalls in einen Vergleich gesetzt wir. Hier wird verglichen 100 > 100 was ein false ergibt und in besser gespeichert wird
// Ausgabe untereinander: true, false 


