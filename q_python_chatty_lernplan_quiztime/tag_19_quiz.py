zahl = 2

while zahl < 12:
    zahl += 3

    if zahl == 8:
        continue

    print(zahl)

print("Ende")

# Frage 1/5:
# Was wird komplett und in der richtigen Reihenfolge ausgegeben?
# Und welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: 5 11 14 Ende
# zahl hat am Ende den wert 14
# Prüfung 2 < 12 = True -> 2 += 3 = 5 -> 5 == 8 = False -> print 5
# Prüfung 5 < 12 = True -> 5 += 3 = 8 -> 8 == 8 = True -> continue
# Prüfung 8 < 12 = True -> 8 += 3 = 11 -> 11 == 8 = False -> print 11
# Prüfung 11 < 12 = True -> 11 += 3 = 14 -> 14 == 8 = False -> print 14
# Prüfung 14 < 12 = False -> Schleife beendet
# print Ende 

zahl = 4

while zahl <= 15:
    zahl += 2

    if zahl == 10:
        continue

    if zahl > 12:
        break

    print(zahl)

print(zahl)

# Frage 2/5:
# Was wird komplett und in der richtigen Reihenfolge ausgegeben?
# Und welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: 6 8 12 14
# zahl hat am Ende den Wert 14, deswegen ist die letzte Ausgabe auch 14, weil print(zahl) außerhalb der Schleife steht und somit den aktuellen Wert der Schleife ausgibt.
# Prüfung 4 <= 15 = True -> 4 += 2 = 6 -> 6 == 10 = False -> 6 > 12 = False -> print 6
# Prüfung 6 <= 15 = True -> 6 += 2 = 8 -> 8 == 10 = False -> 8 > 12 = False -> print 8
# Prüfung 8 <= 15 = True -> 8 += 2 = 10 -> 10 == 10 = True -> continue
# Prüfung 10 <= 15 = True -> 10 += 2 = 12 -> 12 == 10 = False -> 12 > 12 = False -> print 12
# Prüfung 12 <= 15 = True -> 12 += 2 = 14 -> 14 == 10 = False -> 14 > 12 = True -> break, Schleife beendet
# Außerhalb der Schleife print zahl/14

zahl = 1

while zahl < 13:
    zahl += 4

    if zahl == 5:
        continue

    print(zahl)

print("Fertig:", zahl)

# Frage 3/5:
# Was wird komplett und in der richtigen Reihenfolge ausgegeben?
# Und welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: 9 13 Fertig:13
# zahl hat am Ende den Wert 13
# Prüfung 1 < 13 = True -> 1 += 4 = 5 -> 5 == 5 = True -> continue
# Prüfung 5 < 13 = True -> 5 += 4 = 9 -> 9 == 5 = False -> print 9
# Prüfung 9 < 13 = True -> 9 += 4 = 13 -> 13 == 5 -> False -> print 13
# Prüfung 13 < 13 = False -> Schleife beendet
# Außerhalb der Schleife print Fertig:13

zahl = 3

while zahl < 14:
    zahl += 2

    if zahl == 7:
        continue

    if zahl >= 11:
        break

    print("Innen:", zahl)

print("Außen:", zahl)

# Frage 4/5:
# Was wird komplett und in der richtigen Reihenfolge ausgegeben?
# Und welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Innen:5 Innen:9 Außen:11
# zahl hat am Ende den Wert 11
# Prüfung 3 < 14 = True -> 3 += 2 = 5 -> 5 == 7 = False -> 5 >= 11 = False -> print Innen:5
# Prüfung 5 < 14 = True -> 5 += 2 = 7 -> 7 == 7 = True -> continue
# Prüfung 7 < 14 = True -> 7 += 2 = 9 -> 9 == 7 = False -> 9 >= 11 = False -> print Innen:9
# Prüfung 9 < 14 = True -> 9 += 2 = 11 -> 11 == 7 = False -> 11 >= 11 = True -> break, Schleife beendet 
# Außerhalb der Schleife: print Außen:11

zahl = 2

while zahl < 15:
    zahl += 3

    if zahl == 8:
        continue

    if zahl > 10:
        break

    print("Innen:", zahl)

print("Ende:", zahl)

# Frage 5/5 – Endgegner:
# Was wird komplett und in der richtigen Reihenfolge ausgegeben?
# Und welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Innen:5 Ende:11
# zahl hat am Ende den Wert 11
# Prüfung 2 < 15 = True -> 2 += 3 = 5 -> 5 == 8 = False -> 5 > 10 = False -> print Innen:5
# Prüfung 5 < 15 = True -> 5 += 3 = 8 -> 8 == 8 = True -> continue
# Prüfung 8 < 15 = True -> 8 += 3 = 11 -> 11 == 8 = False -> 11 > 10 = True -> break, Schleife beendet
# Außerhalb der Schleife: print Ende:11




