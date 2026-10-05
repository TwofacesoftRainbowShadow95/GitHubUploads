import java.util.ArrayList;

class Tier{
    private String name;
    private int alter;

    public Tier(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        if (alter >= 0) {
            this.alter = alter;
        }
    }

    public void vorstellen(String name, int alter) {
        System.out.println("Das Tier heißt " + name + " und ist " + alter + " alt.");
    }

    public boolean istAelterAls(Tier anderesTier) {
        return this.getAlter() > anderesTier.getAlter();
    }
}

class Hund extends Tier{
    private String rasse;

    public Hund(String name, int alter, String rasse) {
        super(name, alter);
        this.rasse = rasse;
    }

    @Override 
    public void vorstellen(String name, int alter) {
        System.out.println("Der Hund heißt " + name + " und ist " + alter + " alt. Die Rasse ist: " + rasse);
    }
}

class Katze extends Tier{
    private String rasse;
    private String farbe;

    public Katze(String name, int alter, String rasse, String farbe) {
        super(name, alter);
        this.rasse = rasse;
        this.farbe = farbe;
    }

    @Override 
    public void vorstellen(String name, int alter) {
        System.out.println("Die Katze heißt " + name + " und ist " + alter + " alt. Die Rasse ist: " + rasse + " und ihre Farbe ist " + farbe);
    }
}

public class praxisTierverwaltung {
    public static void main(String[] args) {
        Hund hund = new Hund("Wollknäul", 1, "Rottweiler");
        Katze katze = new Katze("Nami",2, "Siamkatze", "rotbraun");

        ArrayList<Tier> tiere = new ArrayList<>();

        tiere.add(hund);
        tiere.add(katze);

        for (Tier tier : tiere) {
            tier.vorstellen(tier.getName(), tier.getAlter());
        }

        System.out.println("Wollknäul ist älter als Nami: " + hund.istAelterAls(katze));
        System.out.println("Nami ist älter als Wollknäul: " + katze.istAelterAls(hund));
    }
}
