Hauptprogramm

Erzeuge zwei Spieler:
    Tom   → 100 Punkte
    Lisa  → 150 Punkte
Speichere beide in einer ArrayList.

Danach soll dein Programm:

1. alle Spieler mit einer for-each-Schleife durchgehen
2. Namen und Punktestand ausgeben
3. Tom 50 Punkte hinzufügen
4. versuchen, Lisa -100 Punkte zu geben
5. anschließend die Punktestände erneut ausgeben

Damit hast du in einer Aufgabe:

- Klasse
- Objekte
- Attribute
- private
- Konstruktor
- this
- Getter
- Setter
- return
- void
- if
- Methoden mit Parametern
- ArrayList
- add()
- for-each
- Referenzen
- Objektverwendung

Alles Zeug, das wir bereits gemacht haben. 

🟡 Optionale Erweiterung
Nur wenn du nach der Hauptaufgabe noch Lust hast:
Füge eine Methode hinzu:
    public boolean hatMehrPunkteAls(Spieler anderer)
Sie soll true zurückgeben, wenn der aktuelle Spieler mehr Punkte hat als der übergebene Spieler.

Dann könntest du beispielsweise schreiben:
    if (s1.hatMehrPunkteAls(s2)) {
    System.out.println(s1.getName() + " hat mehr Punkte.");
    }
Das verbindet nochmal Objekte als Parameter + boolean + if + Getter.

Zusatz aufgrund kleiner Hilfestellung bei der Methode hatMehrPunkteAls():
Schreib nur die Methode selbst in deinen Code und überlege danach, was bei diesen beiden Aufrufen passiert:

    tom.hatMehrPunkteAls(lisa)

und

    lisa.hatMehrPunkteAls(tom)

Welche liefern true, welche false – und warum?
Wenn du das richtig hast, hast du die Extra-Aufgabe eigentlich geknackt. 