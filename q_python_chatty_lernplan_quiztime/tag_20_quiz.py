# alles an Code wurde von Chatty erstellt

zahl = 3

while zahl < 14:
    zahl += 2

    if zahl == 7:
        continue

    if zahl >= 11:
        break

    print(zahl)

print("Ergebnis:", zahl)

# Frage 1/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort: 
# 1. Ausgabe untereinander: 5 9 Ergebnis:11
# 2. zahl hat am Ende den Wert 11, was in dem print außerhalb der Schleife ersichtlich wird.
# Prüfung 3 < 14 = True -> 3 += 2 = 5 -> 5 == 7 = False -> 5 >= 11 = False -> print 5
# Prüfung 5 < 14 = True -> 5 += 2 = 7 -> 7 == 7 -> continue
# Prüfung 7 < 14 = True -> 7 += 2 = 9 -> 9 == 7 = False -> 9 >= 11 = False -> print 9
# Prüfung 9 < 14 = True -> 9 += 2 = 11 -> 11 == 7 = False -> 11 >= 11 = True -> break Schleife endet
# Außerhalb der Schleife: print Ergebnis:11

zahl = 4

while zahl < 16:
    zahl += 3

    if zahl > 10:
        continue

    print("Innen:", zahl)

print("Außen:", zahl)

# Frage 2/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# 1. Ausgabe untereinander: Innen:7 Innen:10 Außen:16
# 2. zahl hat am Ende den Wert 16
# Prüfung 4 < 16 = True -> 4 += 3 = 7 -> 7 > 10 = False -> print Innen:7
# Prüfung 7 < 16 = True -> 7 += 3 = 10 -> 10 > 10 = False -> print Innen:10
# Prüfung 10 < 16 = True -> 10 += 3 = 13 -> 13 > 10 = True -> continue
# Prüfung 13 < 16 = True -> 13 += 3 = 16 -> 16 > 10 = True -> continue
# Prüfung 16 < 16 = False -> Schleife beendet
# Außerhalb der Schleife: print Außen:16

zahl = 2

while zahl < 15:
    zahl += 4

    if zahl == 10:
        continue

    if zahl >= 14:
        break

    print("Wert:", zahl)

print("Final:", zahl)

# Frage 3/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# 1. Ausgabe untereinander: Wert:6 Final:14
# 2. zahl hat am Ende den Wert 14, was durch den print auserhalb der Schleife ersichtlich wird
# Prüfung 2 < 15 = True -> 2 += 4 = 6 -> 6 == 10 = False -> 6 >= 14 = False -> print Wert:6
# Prüfung 6 < 15 = True -> 6 += 4 = 10 -> 10 == 10 = True -> continue
# Prüfung 10 < 15 = True -> 10 += 4 = 14 -> 14 == 10 = False -> 14 >= 14 = True -> break
# Außerhalb der Schleife: print Final:14

zahl = 1

while zahl < 18:
    zahl += 3

    if zahl > 10:
        break

    if zahl == 7:
        continue

    print("Innen:", zahl)

print("Außen:", zahl)

# Frage 4/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# 1. Ausgabe untereinander: Innen:4 Innen:10 Außen:13
# 2. zahl hat am Ende den Wert 13, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 1 < 18 = True -> 1 += 3 = 4 -> 4 > 10 = False -> 4 == 7 = False -> print Innen:4
# Prüfung 4 < 18 = True -> 4 += 3 = 7 -> 7 > 10 = False -> 7 == 7 = True -> continue
# Prüfung 7 < 18 = True -> 7 += 3 = 10 -> 10 > 10 = False -> 10 == 7 = False -> print Innen:10
# Prüfung 10 < 18 = True -> 10 += 3 = 13 -> 13 > 10 = True -> break, Schleife beendet
# Außerhalb der Schleife: print Außen:13

zahl = 2

while zahl < 20:
    zahl += 3

    if zahl == 8:
        continue

    print("A:", zahl)

    if zahl >= 14:
        break

print("B:", zahl)

# Frage 5/5 – Endgegner:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# 1. Ausgabe untereinander: A:5 A:11 b:14
# 2. zahl hat am Ende den Wert 14, was im print außerhalb der Schleife ersichtlich wird
# Prüfung 2 < 20 = True -> 2 += 3 = 5 -> 5 == 8 = False -> 5 >= 14 = False -> print A:5
# Prüfung 5 < 20 = True -> 5 += 3 = 8 -> 8 == 8 = True -> continue
# Prüfung 8 < 20 = True -> 8 += 3 = 11 -> 11 == 8 = False -> 11 >= 14 = False -> A:11
# Prüfung 11 < 20 = True -> 11 += 3 = 14 -> 14 == 8 = False -> 14 >= 14 = True -> break, Schleife wird beendet
# Außerhalb der Schleife: print B:14

# Kleine Spielerei von Chatty <3:

        # while gym_geschlossen:
        #     print("Stolz auf den Fortschritt! 🐍💚")
        #     break

        # return "Feierabend"


