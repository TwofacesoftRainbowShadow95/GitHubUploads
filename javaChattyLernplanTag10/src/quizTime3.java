class Tier {
    String name;

    void essen() {
        System.out.println("Das Tier isst.");
    }
}

class Hund extends Tier {
    void bellen() {
        System.out.println("Wuff!");
    }
}

public class quizTime3 {
    public static void main(String[] args) {
        Hund hund = new Hund();
    }
}

// Frage:
// Was glaubst du, welche Dinge kann hund jetzt benutzen, obwohl wir sie nicht innerhalb von Hund geschrieben haben?
// Und was glaubst du, bedeutet das extends Tier?

// Meine Antwort:
// hund kann jetzt auf jeden Fall die Methoden essen() und bellen benutzen. Wie es mit dem String name aussieht weiß ich jetzt leider nicht. 
// Ich glaube man kann ihn ohne Methode nicht benutzen. 
// extends heißt erweitern Hund ist eine Unterklasse/Kindklasse von Tier

