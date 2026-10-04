// Frage:
// Was würdest du sagen, ist der Unterschied zwischen diesen beiden Methoden?

class Marke {
    private String marke; // class der private String wurden persönlich hinzu gefügt, weil sonst alles als Fehler wahrgenommen werden würde.
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }
}

// Welche liest aus und welche verändert?
    
public class UebungFrageAntwort3 {
    public static void main(String[] args) {
   }     

}


// getMarke() liest aus das returtn gibt uns den ausgelesenen Wert wieder um ihn in einer Variable speichern zu können.
// setMarke() verändert den Wert / setzt ihn