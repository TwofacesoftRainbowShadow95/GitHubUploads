Aufgabenstellung von Chatty:

1. Deine Aufgabe
Erstelle eine Klasse Spieler mit:
- einem private String name
- einem private int punkte
- einem Konstruktor, der beide Attribute initialisiert
- einer Methode addPunkte(int punkte)
- einer Methode anzeigen(), die Name und Punkte ausgibt
- einer Methode istBesserAls(Spieler andererSpieler), die true zurückgibt, wenn der aktuelle Spieler mehr Punkte hat.

2. Dein main
Erstelle zwei Spieler:
Spieler     Punkte
Tom	        100
Lisa	    150
Danach soll dein Programm:
1. Beide Spieler in einer ArrayList<Spieler> speichern.
2. Mit einer for-each-Schleife alle Spieler anzeigen.
3. Tom über seine Referenz 30 Punkte hinzufügen.
4. Prüfen, ob Tom danach mehr Punkte als Lisa hat.
5. Das Ergebnis mit System.out.println() ausgeben.