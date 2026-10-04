Erstelle eine Klasse Spieler.

Sie soll folgende Attribute besitzen:

    name    → String
    punkte  → int

Anforderungen

1. Kapselung
Beide Attribute sollen private sein.

2. Konstruktor
Erstelle einen Konstruktor, mit dem du name und punkte beim Erzeugen festlegen kannst.
Beispiel:
    Spieler s1 = new Spieler("Tom", 100);
Verwende im Konstruktor this.

3. Getter & Setter
Erstelle:
    getName()
    setName()
    getPunkte()
    setPunkte()
Beim setPunkte() soll gelten:
    Punkte dürfen nicht negativ sein.
Wenn jemand versucht:
s1.setPunkte(-50);
soll sich der Punktestand nicht verändern.

4. Methode addPunkte()
Erstelle zusätzlich:
    public void addPunkte(int punkte)
Sie soll die übergebenen Punkte zum aktuellen Punktestand addieren.
Beispiel:
    s1.addPunkte(25);
Aus 100 werden 125.
 