zahl = 2

while zahl <= 10:
    zahl += 2

    if zahl == 8:
        break

    print(zahl)

print("Fertig")

# Frage 1/5 – while + if + break:
# Was wird komplett ausgegeben?
# Und welchen Wert hat zahl, wenn die Schleife beendet ist?

# Meine Antwort:
# Ausgabe untereinander: 4 6 Fertig
# zahl hat den Wert 8 weil 8 itteriert und in zahl gespeichert wurde 
# Prüfung 2 <= 10 = True -> 2 += 2 = 4 -> if-Bedingung nicht erfüllt -> print 4
# Prüfung 4 <= 10 = True -> 4 += 2 = 6 -> if-Bedingung nicht erfüllt -> print 6
# Prüfung 6 <= 10 = True -> 6 += 2 = 8 -> 8== 8 = True -> Schleife bricht -> print Fertig

wort = "Programmieren"

for i in range(1, 10, 2):
    print(wort[i])

# Frage 2/5 – range() + String:
# Welche Buchstaben werden ausgegeben?
# Und welche Indizes verwendet range()?

# Meine Antwort:
# Ausgabe untereinander: r g a m e
# Startindex 1, inklusive, Endindex 10, exklusive, Schrittweite 2
# Verwendete Indizes: 1, 3, 5, 7, 9

def bestanden(punkte, grenze=50):
    return punkte >= grenze

a = bestanden(49)
b = bestanden(50, 60)
c = bestanden(70)

# Frage 3/5 – Default-Parameter + Vergleich:
# Was steht am Ende in a, b und c?
# Und erklär kurz, wann der Default-Wert 50 verwendet wird und wann nicht.

# Meine Antwort:
# a = False, b = False, c = True
# Der Default-Wert von grenze wird verwendet wenn wir ihn nicht mit einem 2. Wert in dieser Methode überschreiben. 
# in a & c haben wir nur einen Wert, welcher in den Parameter ohne Wert eingesetzt wird, hier punkte.
# in b haben wir 2 Werte und diese werden von links nach rechts in die Parameter eingesetzt. Der 1. Wert wird punkte zugewiesen, der 2. grenze.

wort = "Python"

a = wort[:4]
b = wort[2:]
c = wort[::2]

# Frage 4/5 – Slicing:
# Was steht am Ende in a, b und c?
# Und erklär kurz, was es bedeutet, wenn beim Slicing Start oder Ende weggelassen werden.

# Meine Antwort:
# a = Pyth
# b = thon
# c = Pto
# Wenn man wie in a den Start weglässt und nur den Endindex, exklusive, angegeben haben, geht man automatisch von Index 0 los
# Wenn man den Endindex weglässt und nur den Startindex, inklusive, gegeben hat, dann geht man vom Startindex los und geht automatisch bis zum Endindex, inklusive hier
# und in c haben wir weder Start- noch Endindex gegeben hat sondern nur eine Schrittweite, dann startet man automatisch von Index 0 und geht in 2er Schritten durch den String, bis dieser zuende ist.

# Korrektur:
# Das Ende ist auch hier exklusiv — nur wurde es eben nicht angegeben, weshalb Python automatisch bis zum Ende des Strings geht.

zahl = 3

while zahl < 10:
    zahl += 2

    if zahl > 7:
        break

print(zahl)

# Frage 5/5 – Abschluss-Boss:
# Was wird ausgegeben?
# Und welchen Wert hat zahl nach der Schleife?

# Meine Antwort:
# Ausgabe untereinander: 5 7
# zahl hat nach der Schleife den Wert 9, da dieser Wert zwar den break verursacht hat, aber trotzdem in zahl gespeichert wurde

# Korrektur, weil ich übersehen habe, dass der print kein Teil der Schleife ist:
# Ausgabe: 9 was auch der Wert nach der Schleife ist
# innerhalb der Schleife wird einmal zahl auf 5, im nächsten Durchlauf auf 7 und im letzten Durchlauf auf 9 itteriert.


