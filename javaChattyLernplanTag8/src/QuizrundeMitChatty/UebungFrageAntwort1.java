class Auto {
    String marke;
    int baujahr;

    Auto(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
    }
}
public class UebungFrageAntwort1 {
    public static void main(String[] args) {
        
    Auto auto1 = new Auto("BMW", 2020);
    Auto auto2 = auto1;

    auto2.marke = "Audi";

    // Frage: Was steht anschließend in

    //auto1.marke

    // und warum?
    }
}


// Antwort: 
// auto1 & auto2 sind beides Referenzen auf das selbe Objekt. In auto1.marke steht "Audi" weil auto2.marke es vorgehend gesetzt hat.