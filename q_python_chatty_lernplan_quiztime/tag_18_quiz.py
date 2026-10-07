zahl = 4

while zahl < 12:
    zahl += 2

    if zahl == 10:
        break

print(zahl)

# Frage 1/5 – while + break:
# Was wird ausgegeben?
# Und welchen Wert hat zahl nach der Schleife?

# Meine Antwort:
# Ausgegeben wird nur eins, da der print außerhalb der Schleife steht. Er printet auch den Endwert von zahl, was 10 ist.
# Vorgang: 
# Prüfung 4 < 12 = True -> 4 += 2 = 6 -> 6 == 10 = False
# Prüfung 6 < 12 = True -> 6 += 2 = 8 -> 8 == 10 = False
# Prüfung 8 < 12 = True -> 8 += 2 = 10 -> 10 == 10 = True -> break -> print zahl/10

zahl = 5

while zahl <= 12:
    zahl += 3

    if zahl > 10:
        break

print(zahl)

# Frage 2/5:
# Was wird ausgegeben und warum?

# Meine Antwort: 
# Ausgabe ist 11, da der print außerhalb der Schleife steht
# Prüfung 5 <= 12 = True -> 5 += 3 = 8 -> 8 > 10 = False
# Prüfung 8 <= 12 = True -> 8 += 3 = 11 -> 11 > 10 = True -> break -> print zahl/11

zahl = 2

while zahl < 10:
    zahl += 2

    if zahl == 6:
        continue

    print(zahl)

# Frage 3/5:
# Was wird komplett ausgegeben? Und welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: 4 6 8 10
# zahl hat am Ende den Wert 10, da diese Itteration gespeichert wurde vor dem break der Schleife.
# Prüfung 2 < 10 = True -> 2 += 2 = 4 -> 4 == 6 = False -> print 4
# Prüfung 4 < 10 = True -> 4 += 2 = 6 -> 6 == 6 = True -> continue -> print 6
# Prüfung 6 < 10 = True -> 6 += 2 = 8 -> 8 == 6 = False -> print 8
# Prüfung 8 < 10 = True -> 8 += 2 = 10 -> 10 == 6 -> False -> print 10
# Prüfung 10 < 10 = False -> Schleife False = Schleife beendet

# Korrektur:
# Der Teil mit dem Integer 6 wird wegen dem continue nicht ausgeführt print entspricht somit 4 8 10 untereinander

zahl = 3

while zahl < 11:
    zahl += 2

    if zahl == 7:
        continue

    print(zahl)

print("Fertig")

# Frage 4/5:
# Was wird komplett und in der richtigen Reihenfolge ausgegeben?

# Meine Antwort:
# Ausgabe untereinander: 5 9 11 Fertig
# Der Wert von zahl ist zum Schluss 11
# Prüfung 3 < 11 = True -> 3 += 2 = 5 -> 5 == 7 = False -> print 5
# Prüfung 5 < 11 = True -> 5 += 2 = 7 -> 7 == 7 = True -> continue
# Prüfung 7 < 11 = True -> 7 += 2 = 9 -> 9 == 7 = False -> print 9
# Prüfung 9 < 11 = True -> 9 += 2 = 11 -> 11 == 7 = False -> print 11
# Prüfung 11 < 11 = False -> Schleife beendet -> print Fertig

zahl = 1

while zahl < 10:
    zahl += 2

    if zahl == 5:
        continue

    if zahl > 7:
        break

    print(zahl)

print(zahl)

# Frage 5/5 – Endgegner:
# Was wird komplett ausgegeben und welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: 3 7 9
# zahl hat am Ende den Wert 9
# Prüfung 1 < 10 = True -> 1 += 2 = 3 -> 3 ==5 = False -> 3 > 7 = False -> print 3
# Prüfung 3 < 10 = True -> 3 += 2 = 5 -> 5 == 5 = True -> continue
# Prüfung 5 < 10 = True -> 5 += 2 = 7 -> 7 == 5 = False -> 7 > 7 = False -> print 7
# Prüfung 7 < 10 = True -> 7 += 2 = 9 -> 9 == 5 = False -> 9 > 7 = True -> break 
# Danach außerhalb der Schleife print 9