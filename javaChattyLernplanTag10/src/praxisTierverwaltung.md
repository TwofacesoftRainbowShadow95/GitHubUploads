1. Oberklasse Tier
Erstelle eine Klasse Tier mit:
- private String name
- private int alter
Dazu:
- einen Konstruktor, der name und alter übernimmt
- Getter für beide Attribute
- einen Setter für name
- einen Setter für alter, der nur Werte >= 0 akzeptiert
- eine Methode:
    public void vorstellen()
    Die soll beispielsweise Name und Alter ausgeben.

2. Unterklasse Hund
Erstelle:
- class Hund extends Tier
Der Hund soll zusätzlich haben:
- String rasse
- Mach auch dafür einen passenden Konstruktor.
Wichtig: 
- Nutze dabei super(...), um die Attribute der Oberklasse zu initialisieren.
- Außerdem soll Hund die Methode vorstellen() überschreiben.
- Verwende dabei @Override.
- Die Hund-Version soll zusätzlich zur normalen Vorstellung auch die Rasse ausgeben.

3. Unterklasse Katze
Jetzt dasselbe für:
- class Katze extends Tier
Zusätzlich:
- String farbe
Auch hier:
- Konstruktor
- super(...)
- vorstellen() überschreiben
- @Override

4. main
Erstelle:
- Hund hund = new Hund(...);
- Katze katze = new Katze(...);
Setze sinnvolle Werte ein.
Danach erstellst du:
- ArrayList<Tier> tiere = new ArrayList<>();
und fügst beide Objekte hinzu:
- hund
- katze
- Anschließend gehst du mit einer for-each-Schleife durch die ArrayList und rufst bei jedem Tier:
- tier.vorstellen();
auf.

5. Optionales Extra – nur wenn du noch Bock hast
Baue in Tier zusätzlich:
- public boolean istAelterAls(Tier anderesTier)
Die Methode soll true liefern, wenn das aktuelle Tier älter ist als anderesTier.
Damit kombinierst du nochmal:
- Methode + Objekt als Parameter + Getter + Vergleich + boolean + return