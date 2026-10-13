# Alles an Code wurde von Chatty produziert

zahl = 2

while zahl < 18:
    zahl += 3

    if zahl == 8:
        continue

    print("A:", zahl)

    if zahl > 12:
        break

    print("B:", zahl)

print("C:", zahl)

# Frage 1/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: A:5 B:5 A:11 B:11 A:14 C:14
# zahl hat am Ende den Wert 14, was der print außerhalb der Schleife zeigt
# Prüfung 2 < 18 = True -> 2 += 3 = 5 -> 5 == 8 = False -> print A:5 -> 5 > 12 = False -> print B:5
# Prüfung 5 < 18 = True -> 5 += 3 = 8 -> 8 == 8 = True -> continue
# Prüfung 8 < 18 = True -> 8 += 3 = 11 -> 11 == 8 = False -> print A:11 -> 11 > 12 = False -> print B:11
# Prüfung 11 < 18 = True -> 11 += 3 = 14 -> 14 == 8 = False -> print A:14 -> 14 > 12 = True -> break
# Außerhalb der Schleife: print C:14

zahl = 3

while zahl < 20:
    zahl += 2

    if zahl >= 9:
        break

    if zahl == 7:
        continue

    print("X:", zahl)

print("Y:", zahl)

# Frage 2/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort: 
# Ausgabe untereinander: X:5 Y:9 
# zahl hat am Ende den Wert 9, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 3 < 20 = True -> 3 += 2 = 5 -> 5 >= 9 = False -> 5 == 7 = False -> print X:5
# Prüfung 5 < 20 = True -> 5 += 2 = 7 -> 7 >= 9 = False -> 7 == 7 = True -> continue
# Prüfung 7 < 20 = True -> 7 += 2 = 9 -> 9 >= 9 = True -> break
# Außerhalb der Schleife: Y:9

zahl = 1

while zahl < 17:
    zahl += 3

    if zahl == 7:
        continue

    print("A:", zahl)

    if zahl >= 13:
        break

    print("B:", zahl)

print("C:", zahl)

# Frage 3/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: A:4 B:4 A:10 B:10 A:13 C:13
# zahl hat am Ende den Wert 13, was in dem print außerhalb der Schleife ersichtlich ist
# Prüfung 1 < 17 = True -> 1 += 3 = 4 -> 4 == 7 = False -> print A:4 -> 4 >= 13 = False -> B:4
# Prüfung 4 < 17 = True -> 4 += 3 = 7 -> 7 == 7 = True -> continue
# Prüfung 7 < 17 = True -> 7 += 3 = 10 -> 10 == 7 = False -> print A:10 -> 10 >= 13 = False -> B:10
# Prüfung 10 < 17 = True -> 10 += 3 = 13 -> 13 == 7 = False -> print A:13 -> 13 >= 13 = True -> break
# Außerhalb der Schleife: print C:13

zahl = 2

while zahl < 20:
    zahl += 3

    if zahl > 10:
        print("Stopp:", zahl)
        break

    if zahl == 8:
        continue

    print("Weiter:", zahl)

print("Ende:", zahl)

# Frage 4/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Weiter:5 Stopp:11 Ende:11
# zahl hat am Ende den Wert 11, was in dem print außerhalb der Schleife ersichtlich wird
# Prüfung 2 < 20 = True -> 2 += 3 = 5 -> 5 > 10 = False -> 5 == 8 = False -> Weiter:5
# Prüfung 5 < 20 = True -> 5 += 3 = 8 -> 8 > 10 = False -> 8 == 8 = True -> continue
# Prüfung 8 < 20 = True -> 8 += 3 = 11 -> 11 > 10 = True -> print Stopp:11 -> break
# Außerhalb der Schleife: print Ende:11

zahl = 1

while zahl < 20:
    zahl += 3

    if zahl == 7:
        continue

    if zahl >= 13:
        print("Grenze:", zahl)
        break

    print("Innen:", zahl)

print("Außen:", zahl)

# Frage 5/5 – Finale Runde:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Innen:4 Innen:10 Grenze:13 Außen:13
# zahl hat am Ende den Wert 13, was in dem print außerhalb der Schleife ersichtlich wird
# Prüfung 1 < 20 = True -> 1 += 3 = 4 -> 4 == 7 = False -> 4 >= 13 = False -> print Innen:4
# Prüfung 4 < 20 = True -> 4 += 3 = 7 -> 7 == 7 = True -> continue
# Prüfung 7 < 20 = True -> 7 += 3 = 10 -> 10 == 7 = False -> 10 >= 13 = False -> print Innen:10
# Prüfung 10 < 20 = True -> 10 += 3 = 13 -> 13 == 7 = False -> 13 >= 13 = True -> print Grenze:13 -> break
# Außerhalb der Schleife: print Außen:13

