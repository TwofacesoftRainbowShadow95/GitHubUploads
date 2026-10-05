zahl = 2

while zahl < 10:
    zahl += 2

    if zahl == 6:
        break

    print(zahl)

print("Fertig")

# Frage 1/5 – while + break:
# Was wird komplett ausgegeben?
# Und welchen Wert hat zahl, wenn die Schleife endet?
# Nimm wieder deinen

# Meine Antwort:
# Ausgabe:
# Prüfung 2 < 10, True -> zahl += 2 =4 -> if-Bedingung wird nicht erfüllt, deswegen print 4
# Prüfung 4 < 10, True -> zahl += 2 = 6 if-Bedingung 6 == 6 erfüllt -> break print Fertig
# Ausgabe untereinander: 4 Fertig
# zahl behält den Wert 6 weil die Itteration welche den break ausgelöst hat trotzdem in zahl gespeichert wurde

for i in range(2, 10, 3):
    print(i)

# Frage 2/5 – range() etwas gemeiner:
# Was wird ausgegeben?
# Und welcher Wert wäre der nächste Schritt nach 8, auch wenn er nicht mehr ausgegeben wird?

# Meine Antwort:
# Ausgabe untereinander: 2 5 8
# Startwert = 2, inklusive, Endwert = 10, exklusive, Schrittweite = 3
# Der nächste Schritt nach 8 wäre 11, allerdings wird allein schon 10 nicht mehr ausgegeben, weshalb die 11 tatsächlich unerreichbar ist 

punkte = 50

if punkte > 50:
    print("A")
elif punkte >= 50:
    print("B")
else:
    print("C")

# Frage 3/5 – if / elif + Vergleich:
# Was wird ausgegeben?
# Und warum wird B ausgegeben, obwohl die erste Bedingung bereits punkte > 50 prüft?

# Meine Antwort:
# Ausgabe: B
# in der if/elif/else-Prüfung wird bei if geprüft ob 50 > 50 True ist, was es nicht ist sondern False. Somit wird A nicht geprintet
# Deswegen wird weiter in die elif Prüfung gegangen. Hier wird geprüft, 
# 50 >= 50 was durch das = True ist und somit wird B geprintet und der Block automatisch beendet

wort = "Programmieren"

print(wort[2:10:2])

# Frage 4/5 – Slicing:
# Welche Zeichen werden ausgegeben und welche Indizes werden verwendet?

# Meine Antwort:
# Ausgabe: ormi (ausgegebene Indizees: 2, 4, 6, 8)
# Wir haben einen Startindex 2, inklusive, und einen Endindex 10, exklusive, mit einer Schrittweite von 2.

zahl = 1

while zahl < 8:
    zahl += 2

    if zahl == 5:
        break

print(zahl)

# Frage 5/5 – Abschluss-Boss:
# Was wird ausgegeben?
# Und welchen Wert hat zahl danach?

# Meine Antwort:
# Prüfung 1 < 8 True -> 1 += 2 = 3 -> 3 == 5 False ->
# Prüfung 3 < 8 True -> 3 += 2 = 5 - > 5 == 5 True -> break -> print(5)
# das print welches außerhalb der while-Schleife liegt gibt den aktuellen Wert 5 aus, 
# weil die Itteration in zahl gespeichert wurde bevor sie die Schleife gebrochen hat. 
