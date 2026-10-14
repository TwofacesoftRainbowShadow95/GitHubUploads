# Alles an Code wurde von Chatty produziert

zahl = 2

while zahl < 20:
    zahl += 3

    if zahl >= 11:
        print("Grenze:", zahl)
        break

    if zahl == 8:
        continue

    print("Innen:", zahl)

print("Außen:", zahl)

# Frage 1/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Innen:5 Grenze:11 Außen:11
# zahl hat am Ende den Wert 11, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 2 < 20 = True -> 2 += 3 = 5 -> 5 >= 11 = False -> 5 == 8 = False -> print Innen:5
# Prüfung 5 < 20 = True -> 5 += 3 = 8 -> 8 >= 11 = False -> 8 == 8 = True -> continue
# Prüfung 8 < 20 = True -> 8 += 3 = 11 -> 11 >= 11 = True -> print Grenze:11 -> break
# Außerhalb der Schleife: print Außen:11

zahl = 1

while zahl < 18:
    zahl += 2

    if zahl == 5:
        continue

    print("A:", zahl)

    if zahl > 9:
        print("B:", zahl)
        break

print("C:", zahl)

# Frage 2/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: A:3 A:7 A:9 A:11 B:11 C:11
# zahl hat am Ende den Wert 11, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 1 < 18 = True -> 1 += 2 = 3 -> 3 == 5 = False -> print A:3 -> 3 > 9 = False 
# Prüfung 3 < 18 = True -> 3 += 2 = 5 -> 5 == 5 = True -> continue
# Prüfung 5 < 18 = True -> 5 += 2 = 7 -> 7 == 5 = False -> print A:7 -> 7 > 9 = False 
# Prüfung 7 < 18 = True -> 7 += 2 = 9 -> 9 == 5 = False -> print A:9 -> 9 > 9 = False 
# Prüfung 9 < 18 = True -> 9 += 2 = 11 -> 11 == 5 = False -> print A:11 -> 11 > 9 = True -> print B:11 -> break
# Außerhalb der Schleife: print C:11

zahl = 2

while zahl < 20:
    zahl += 3

    if zahl >= 14:
        print("Stopp:", zahl)
        break

    if zahl == 8:
        continue

    print("Innen:", zahl)

print("Ende:", zahl)

# Frage 3/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Innen:5 Innen:11 Stopp:14 Ende:14
# zahl hat am Ende den Wert 14, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 2 < 20 = True -> 2 += 3 = 5 -> 5 >= 14 = False -> 5 == 8 = False -> print Innen:5
# Prüfung 5 < 20 = True -> 5 += 3 = 8 -> 8 >= 14 = False -> 8 == 8 = True -> continue
# Prüfung 8 < 20 = True -> 8 += 3 = 11 -> 11 >= 14 = False -> 11 == 8 = False -> print Innen:11
# Prüfung 11 < 20 = True -> 11 += 3 = 14 -> 14 >= 14 = True -> print Stopp:14 -> break
# Außerhalb der Schleife: print Ende:14 

zahl = 1

while zahl < 20:
    zahl += 3

    if zahl == 7:
        continue

    if zahl > 10:
        print("Grenze:", zahl)

    print("Innen:", zahl)

    if zahl >= 13:
        break

print("Außen:", zahl)

# Frage 4/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Innen:4 Innen:10 Grenze:13 Innen:13 Außen:13
# zahl hat am Ende den Wert 13, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 1 < 20 = True -> 1 += 3 = 4 -> 4 == 7 = False -> 4 > 10 = False -> print Innen:4 -> 4 >= 13 = False
# Prüfung 4 < 20 = True -> 4 += 3 = 7 -> 7 == 7 = True -> continue
# Prüfung 7 < 20 = True -> 7 += 3 = 10 -> 10 == 7 = False -> 10 > 10 = False -> print Innen:10 -> 10 >= 13 = False
# Prüfung 10 < 20 = True -> 10 += 3 = 13 -> 13 == 7 = False -> 13 > 10 = True -> print Grenze:13 -> print Innen:13 -> 13 >= 13 = True -> break 
# Außerhalb der Schleife: print Außen:13

zahl = 2

while zahl < 20:
    zahl += 3

    if zahl == 8:
        continue

    if zahl >= 14:
        print("A:", zahl)
    else:
        print("B:", zahl)

    if zahl > 14:
        break

print("C:", zahl)

# Frage 5/5 – Finale Runde:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: B:5 B:11 A:14 A:17 C:17
# zahl hat am Ende den Wert 17, was durch den print außerhalb der Schleife ersichtlich wird
# Prüfung 2 < 20 = True -> 2 += 3 = 5 -> 5 == 8 = False -> 5 >= 14 = False -> print B:5 -> 5 > 14 = False
# Prüfung 5 < 20 = True -> 5 += 3 = 8 -> 8 == 8 = True -> continue
# Prüfung 8 < 20 = True -> 8 += 3 = 11 -> 11 == 8 = False -> 11 >= 14 = False -> print B:11 -> 11 > 14 = False
# Prüfung 11 < 20 = True -> 11 += 3 = 14 -> 14 == 8 = False -> 14 >= 14 = True -> print A:14 -> 14 > 14 = False 
# Prüfung 14 < 20 = True -> 14 += 3 = 17 -> 17 == 8 = False -> 17 >= 14 = True -> print A:17 -> 17 > 14 = True -> break
# Außerhalb der Schleife: print C:17




