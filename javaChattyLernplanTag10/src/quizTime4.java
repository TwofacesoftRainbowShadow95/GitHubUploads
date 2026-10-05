class Tier {
    public void essen() {
        System.out.println("Tier isst");
    }
}

class Hund extends Tier {
}

public class quizTime4 {
    public static void main(String[] args) {
        Hund hund = new Hund();
        hund.essen();
    }
}

// Was glaubst du, wird ausgegeben und warum?
// Das ist der nächste kleine Baustein: 
// Eine Unterklasse kann eine geerbte Methode benutzen, 
// obwohl die Methode gar nicht in der Unterklasse selbst steht.

// Meine Antwort:
// Klasse Hund erbt die Methoden von Tier, da sie die extended Version ist. 
// Also eine Unterklasse. Somit kann hund.essen durchaus ausgeführt werden.


