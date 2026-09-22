package Tag20;

// 06: Dateiformat verketten
// - Erstelle A06_Datei.java. 
// - Schreibe Datei mit String name und String format. 
// - Der Konstruktor mit nur einem Namen
//       (this(...)) soll den vollstaendigen Konstruktor mit dem Format TXT aufrufen. 
// - Erzeuge notizen und gib beide Werte aus. 
// - Der kurze Konstruktor darf den gemeinsamen Initialisierungscode nicht duplizieren.
// - Erzeuge Berlin und gib beide Werte aus.
// Erwartete Ausgabe:
// Datei: notizen, TXT


class Datei {
    String name;
    String format;

    //Bezeichnung = Datei NICHT Name
    Datei(String name){
        this.name = name;
        this.format = "txt";
        //this(name, "txt") kürzere Fassung für die Zukunft
    }

    Datei(String name, String format){
        this.name = name;
        this.format = format;
    }
}

public class A06_Datei {
    public static void main(String[] args) {
        Datei datei = new Datei("notizen");
        System.out.println("Datei: " + datei.name + "." + datei.format);

        Datei datei2 = new Datei("Berlin", "doc");
        System.out.println("Datei: " + datei2.name + "." + datei2.format);
    }
}
