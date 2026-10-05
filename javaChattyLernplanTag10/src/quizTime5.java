class Tier {
    public void essen() {
        System.out.println("Tier isst");
    }
}

class Hund extends Tier {

    // @Override
    // public void essen() {
    //     System.out.println("Hund isst");
    // }

    @Override
    public void essen() {
        super.essen();
        System.out.println("Hund isst");
    }
}

public class quizTime5 {
    public static void main(String[] args) {
        
    }
}

// Frage: Was erwartest du, wird jetzt ausgegeben?
// Und vor allem: Was glaubst du, bedeutet super im Gegensatz zu unserem bekannten this?

// Meine Antwort:
// wenn Statt dem ersten @Override Nur das zweite dort steht, dann werden beide male .essen geprintet. 
// Super ruft die Klassenmethode über der Kindklasse auf und somit wird einmal geprintet Tier isst
// und einmal Hund isst da die @Override  Methode essen beides ausgibt.

