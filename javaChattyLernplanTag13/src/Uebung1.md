
Aufgabe 1 – Auswertung

Schreibe eine kleine Java-Anwendung mit einer Klasse Spieler.
Die Klasse soll:
- ein private Attribut name besitzen
- ein private Attribut punkte besitzen
- einen Konstruktor besitzen, der beide Werte setzt
- eine Methode addPunkte(int punkte) besitzen
- eine Methode anzeigen() besitzen, die Name und Punkte ausgibt
Im main sollst du:
1. Einen Spieler a mit "Tom" und 100 Punkten erstellen.
2. Eine zweite Referenz b anlegen, die auf dasselbe Objekt wie a zeigt.
3. Über b 50 Punkte hinzufügen.
4. a.anzeigen() aufrufen.
5. Eine dritte Referenz c vom Typ Spieler mit null erstellen.
6. Teste selbst, was passiert, wenn du c.anzeigen() aufrufst.
Das Entscheidende:

Versuch dabei selbst zu erkennen:

a ─────┐
       ├──► Spieler-Objekt
b ─────┘

c ─────► null

Und denk an unsere heutige Erkenntnis:

null ist kein leeres Spieler-Objekt.
Kleine Hilfestellung, falls du hängst:
Überlege zuerst, welche Variablen du im main brauchst und welche davon Referenzen sind.



Aufgabe 2 – Auswertung
Wir wollen eine Methode schreiben, mit der ein Spieler die Punkte eines anderen Spielers vergleichen kann.

Die Methode soll heißen:

istBesserAls(...)

und einen boolean zurückgeben.

Anforderungen

Deine Methode soll:

1. einen anderen Spieler als Parameter bekommen.
2. true zurückgeben, wenn der aktuelle Spieler mehr Punkte hat als der übergebene Spieler.
3. sonst false zurückgeben.

Danach soll dein main ungefähr dieses Szenario testen:

Tom → 150 Punkte
Lisa → 120 Punkte

Tom ist besser als Lisa: true
Lisa ist besser als Tom: false





Aufgabe 3 – Objekt-Arrays

Wir bleiben bei unserer Spieler-Klasse, damit wir nichts Neues gleichzeitig lernen müssen.

Du hast bereits:

Spieler a = new Spieler("Tom", 100);
Spieler lisa = new Spieler("Lisa", 120);

Jetzt sollst du daraus ein Array von Spieler-Objekten machen.

Deine Aufgabe

Erstelle im main ein Array für 3 Spieler.

Fülle es mit:

Tom → 150 Punkte
Lisa → 120 Punkte
Max → 200 Punkte

Danach soll eine Schleife jeden Spieler anzeigen.

Das Ergebnis soll ungefähr so aussehen:

Tom hat 150 Punkte.
Lisa hat 120 Punkte.
Max hat 200 Punkte.



Aufgabe 4 - Kombination aus allem heute angewendeten
- Erstelle 4 Spieler und speichere sie gemeinsam.
- Gib alle Spieler aus.
- Finde anschließend heraus, ob der erste Spieler mehr Punkte als der letzte  Spieler hat und gib das Ergebnis aus.




