class Zaehler {
    int wert = 5;

    public int erhoehen() {
        return wert++;
    }
}

public class quizTime2 {
    public static void main(String[] args) {
        Zaehler z = new Zaehler();

        int a = z.erhoehen();
        int b = z.erhoehen();
    }
}

// Runde 2 – und jetzt wirklich unser ++
// - Was steht am Ende in a, b und z.wert?
// - Und bitte diesmal ganz mechanisch vorgehen:
//   - Was passiert beim ersten Aufruf?
//   - Was passiert beim zweiten Aufruf?
//   - Was bleibt schließlich in wert?

// Meine Antwort:
// - in a steht noch 5, in b schon 6, in z.wert steht folgendermaßen 7 und zwar weil bei b & z jeweils das ++ greift
// -   beim 1. Aufruf sagen wir, nimm den aktuellen Wert, 5, der sich beim nächsten Aufruf um eins erhöht
// -   beim 2. Aufruf sagen wir, nimm den um eins erhöhten Wert, 6, der sich beim nächsten Aufruf um eins erhöht
// -   in z steht dann der um wieder um eins erhöhte Wert 7.




