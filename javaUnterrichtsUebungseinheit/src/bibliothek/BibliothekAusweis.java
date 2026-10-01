package Tag24.bibliothek;

public class BibliothekAusweis {
    private String nummer;
    private String fach;

    public BibliothekAusweis(String nummer, String fach) {
        this.nummer = nummer;
        this.fach = fach;
    }

    public String getNummer() {
        return nummer;
    }
}
