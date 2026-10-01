package Tag24.bibliothek;

public class Mitglied {
    private String name;
    private BibliothekAusweis ausweis;

    public Mitglied(String name, BibliothekAusweis ausweis) {
        this.name = name;
        this.ausweis = ausweis;
    }

    public String getName() {
        return name;
    }

    public BibliothekAusweis getAusweis() {
        return ausweis;
    }

}
