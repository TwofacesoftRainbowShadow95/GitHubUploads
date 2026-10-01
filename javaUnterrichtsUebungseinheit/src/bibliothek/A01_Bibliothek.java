package Tag24.bibliothek;

// 01: Bibliothek und Ausweis
// - Erstelle in src eine Klasse A01_Bibliothek mit einer main-Methode.
// - Definiere eine Klasse Bibliotheksausweis mit den Attributen nummer und fach.
// - Definiere eine Klasse Mitglied mit den Attributen name und ausweis.
// - Erzeuge einen Ausweis mit der Nummer B-204 und dem Fach Sachbuch.
// - Erzeuge das Mitglied Mira, das auf diesen Ausweis verweist.
// Gib genau diese Zeilen aus:
// Mira
// B-204

public class A01_Bibliothek {
    public static void main(String[] args) {
        BibliothekAusweis ausweis = new BibliothekAusweis("B-204", "Sachbuch");
        Mitglied mira = new Mitglied("Mira", ausweis);

        System.out.println(mira.getName());
        System.out.println(mira.getAusweis().getNummer());
    }
}
