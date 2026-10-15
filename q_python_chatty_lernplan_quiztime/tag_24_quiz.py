# Alles an Code wurde von Chatty produziert

zahl = 2

while zahl < 18:
    zahl += 3

    if zahl == 8:
        continue

    if zahl >= 14:
        print("Grenze:", zahl)
        break

    print("Innen:", zahl)

print("Außen:", zahl)

# Frage 1/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Innen:5 Innen:11 Grenze:14 Außen:14
# zahl hat am Ende den Wert 14, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 2 < 18 = True -> 2 += 3 = 5 -> 5 == 8 = False -> 5 >= 14 = False -> print Innen:5
# Prüfung 5 < 18 = True -> 5 += 3 = 8 -> 8 == 8 = True -> continue
# Prüfung 8 < 18 = True -> 8 += 3 = 11 -> 11 == 8 = False -> 11 >= 14 = False -> print Innen:11
# Prüfung 11 < 18 = True -> 11 += 3 = 14 -> 14 == 8 = False -> 14 >= 14 = True -> print Grenze:14 -> break 
# Außerhalb der Schleife: print Außen:14

zahl = 1

while zahl < 15:
    zahl += 2

    if zahl > 7:
        print("Stopp:", zahl)
        break

    if zahl % 2 == 0:
        continue

    print("Weiter:", zahl)

print("Ende:", zahl)

# Frage 2/5:
# Deine Aufgaben:
# 1. Wie lautet die vollständige Ausgabe, in der richtigen Reihenfolge?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Weiter:3 Weiter:5 Weiter:7 Stopp:9 Ende:9
# zahl hat am Ende den Wert 9, was außerhalb der Schleife ersichtlich wird
# Prüfung 1 < 15 = True -> 1 += 2 = 3 -> 3 > 7 = False -> 3 % 2 == 0 = False -> print Weiter:3
# Prüfung 3 < 15 = True -> 3 += 2 = 5 -> 5 > 7 = False -> 5 % 2 == 0 = False -> print Weiter:5
# Prüfung 5 < 15 = True -> 5 += 2 = 7 -> 7 > 7 = False -> 7 % 2 == 0 = False -> print Weiter:7
# Prüfung 7 < 15 = True -> 7 += 2 = 9 -> 9 > 7 = True -> print Stopp:9 -> break
# Außerhalb der Schleife: print Ende:9

zahl = 0

while zahl < 12:
    zahl += 2

    if zahl == 6:
        print("Übersprungen:", zahl)
        continue

    if zahl >= 10:
        print("Treffer:", zahl)

    print("Runde:", zahl)

print("Fertig:", zahl)

# Frage 3/5:
# Deine Aufgaben:
# 1. Wie lautet die vollständige Ausgabe, in der richtigen Reihenfolge?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Runde:2 Runde:4 Übersprungen:6 Runde:8 Treffer:10 Runde:10 Treffer:12 Runde:12 Fertig:12
# zahl hat am Ende den Wert 12, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 0 < 12 = True -> 0 += 2 = 2 -> 2 == 6 = False -> 2 >= 10 = False -> print Runde:2
# Prüfung 2 < 12 = True -> 2 += 2 = 4 -> 4 == 6 = False -> 4 >= 10 = False -> print Runde:4 
# Prüfung 4 < 12 = True -> 4 += 2 = 6 -> 6 == 6 = True -> print Übersprungen:6 -> continue
# Prüfung 6 < 12 = True -> 6 += 2 = 8 -> 8 == 6 = False -> 8 >= 10 = False -> print Runde:8
# Prüfung 8 < 12 = True -> 8 += 2 = 10 -> 10 == 8 = False -> 10 >= 10 = True -> print Treffer:10 -> print Runde:10
# Prüfung 10 < 12 = True -> 10 += 2 = 12 -> 12 == 8 = False -> 12 >= 10 = True -> print Treffer:12 -> print Runde:12
# Prüfung 12 < 12 = False -> break
# Außerhalb der Schleife: print Fertig:12

zahl = 3

while zahl < 20:
    zahl += 4

    if zahl > 10:
        print("Prüfung:", zahl)

        if zahl >= 15:
            print("Abbruch:", zahl)
            break

    print("Weiter:", zahl)

print("Endwert:", zahl)

# Frage 4/5:
# Deine Aufgaben:
# 1. Wie lautet die vollständige Ausgabe, in der richtigen Reihenfolge?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Weiter:7 Prüfung:11 Weiter:11 Prüfung:15 Abbruch:15 Endwert:15
# zahl hat am Ende den Wert 15, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 3 < 20 = True -> 2 += 4 = 7 -> 7 > 10 = False -> 7 >= 15 = False -> print Weiter:7
# Prüfung 7 < 20 = True -> 7 += 4 = 11 -> 11 > 10 = True -> print Prüfung:11 -> 11 >= 15 = False -> print Weiter:11
# Prüfung 11 < 20 = True -> 11 += 4 = 15 -> 15 > 10 = True -> print Prüfung:15 -> 15 >= 15 = True -> print Abbruch:15 -> break
# Außerhalb der Schleife: print Endwert:15

zahl = 0

while zahl < 16:
    zahl += 2

    if zahl == 4:
        print("Skip:", zahl)
        continue

    if zahl > 8:
        print("Check:", zahl)

        if zahl >= 12:
            print("Break:", zahl)
            break

    print("Loop:", zahl)

print("Final:", zahl)

# Frage 5/5 – Die finale Überlebensrunde:
# Deine Aufgaben:
# 1. Wie lautet die vollständige Ausgabe, Zeile für Zeile und in der richtigen Reihenfolge?
# 2. Welchen Wert hat zahl am Ende?
# 3. Erkläre deinen Rechenweg wie immer Schritt für Schritt.

# Meine Antwort:
# Ausgabe untereinander: Loop:2 Skip:4 Loop:6 Loop:8 Check:10 Loop:10 Check:12 Break:12 Final:12
# zahl hat am Ende den Wert 12, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 0 < 16 = True -> 0 += 2 = 2 -> 2 == 4 = False -> 2 > 8 = False -> 2 >=12 = False -> print Loop:2
# Prüfung 2 < 16 = True -> 2 += 2 = 4 -> 4 == 4 = True -> print Skip:4 -> continue
# Prüfung 4 < 16 = True -> 4 += 2 = 6 -> 6 == 4 = False -> 6 > 8 = False -> 6 >= 12 = False -> print Loop:6
# Prüfung 6 < 16 = True -> 6 += 2 = 8 -> 8 == 4 = False -> 8 > 8 = False -> 8 >= 12 = False -> print Loop:8
# Prüfung 8 < 16 = True -> 8 += 2 = 10 -> 10 == 4 = False -> 10 > 8 = True -> print Check:10 -> 10 >= 12 = False -> print Loop:10
# Prüfung 10 < 16 = True -> 10 += 2 = 12 -> 12 == 4 = False -> 12 > 8 = True -> print Check:12 -> 12 >= 12 = True -> print Break:12 -> break
# Außerhalb der Schleife: print Final:12

