# Alles was hier an Code zu sehen ist wurde von Chatty produziert

zahl = 1

while zahl < 16:
    zahl += 3

    if zahl == 7:
        continue

    print("A:", zahl)

    if zahl >= 10:
        break

print("B:", zahl)

# Frage 1/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: A:4 A:10 B:10
# zahl hat am Ende den Wert 10, da der Wert 10 in zahl vor dem break gespeichert wurde
# Prüfung 1 < 16 = True -> 1 += 3 = 4 -> 4 == 7 = False -> print A:4 -> 4 >= 10 = False 
# Prüfung 4 < 16 = True -> 4 += 3 = 7 -> 7 == 7 = True -> continue
# Prüfung 7 < 16 = True -> 7 += 3 = 10 -> 10 == 7 = False -> print A:10 -> 10 >= 10 = True (wegen dem =) -> break
# Außerhalb der Schleife: print B:10

zahl = 2

while zahl < 18:
    zahl += 4

    if zahl > 10:
        continue

    print("Innen:", zahl)

    if zahl == 10:
        break

print("Außen:", zahl)

# Frage 2/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Innen:6 Innen:10 Außen:10
# zahl hat am Ende den Wert 10, da der Wert 10 in zahl vor dem break gespeichert wurde
# Prüfung 2 < 18 = True -> 2 += 4 = 6 -> 6 > 10 = False -> print Innen:6 -> 6 == 10 = False
# Prüfung 6 < 18 = True -> 6 += 4 = 10 -> 10 > 10 = False -> print Innen:10 -> 10 == 10 = True -> break
# Außerhalb der Schleife: print Außen:10

zahl = 1

while zahl < 20:
    zahl += 3

    if zahl == 4:
        continue

    if zahl >= 13:
        break

    print("Wert:", zahl)

print("Ende:", zahl)

# Frage 3/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: Wert:7 Wert:10 Ende:13
# zahl hat am Ende den Wert 13, da der Wert 13 in zahl vor dem break gespeichert wurde
# Prüfung 1 < 20 = True -> 1 += 3 = 4 -> 4 == 4 = True -> continue
# Prüfung 4 < 20 = True -> 4 += 3 = 7 -> 7 == 4 = False -> 7 >= 13 = False -> print Wert:7
# Prüfung 7 < 20 = True -> 7 += 3 = 10 -> 10 == 4 = False -> 10 >= 13 = False -> print Wert:10
# Prüfung 10 < 20 = True -> 10 += 3 = 13 -> 13 == 4 = False -> 13 >= 13 = True -> break
# Außerhalb der Schleife: print Ende:13

zahl = 3

while zahl < 19:
    zahl += 2

    if zahl > 9:
        break

    if zahl == 7:
        continue

    print("Innen:", zahl)

print("Außen:", zahl)

# Frage 4/5:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Anwort:
# Ausgabe untereinander: Innen:5 Innen:9 Außen:11
# zahl hat am Ende den Wert 11, da der Wert 11 in zahl vor dem break gespeichert wurde
# Prüfung 3 < 19 = True -> 3 += 2 = 5 -> 5 > 9 = False -> 5 == 7 = False -> Innen:5
# Prüfung 5 < 19 = True -> 5 += 2 = 7 -> 7 > 9 = False -> 7 == 7 = True -> continue
# Prüfung 7 < 19 = True -> 7 += 2 = 9 -> 9 > 9 = False -> 9 == 7 = False -> Innen:9
# Prüfung 9 < 19 = True -> 9 += 2 = 11 -> 11 > 9 = True -> break
# Außerhalb der Schleife: print Außen:11

zahl = 2

while zahl < 20:
    zahl += 3

    if zahl == 8:
        continue

    print("A:", zahl)

    if zahl >= 14:
        break

    print("B:", zahl)

print("C:", zahl)

# Frage 5/5 – Finale Runde:
# Deine Aufgaben:
# 1. Was wird vollständig und in der richtigen Reihenfolge ausgegeben?
# 2. Welchen Wert hat zahl am Ende?

# Meine Antwort:
# Ausgabe untereinander: A:5 B:5 A:11 B:11 A:14 C:14
# zahl hat am Ende den Wert 14, da der Wert 14 in zahl vor dem break gespeichert wurde
# Prüfung 2 < 20 = True -> 2 += 3 = 5 -> 5 == 8 = False -> print A:5 -> if 5 >= 14 = False -> print B:5
# Prüfung 5 < 20 = True -> 5 += 3 = 8 -> 8 == 8 = True -> continue
# Prüfung 8 < 20 = True -> 8 += 3 = 11 -> 11 == 8 = True -> print A:11 -> if 11 >= 14 = False -> print B:11
# Prüfung 11 < 20 = True -> 11 += 3 = 14 -> 14 == 8 = True -> print A:14 -> if 14 >= 14 = True -> break
# Außerhalb der Schleife: print C:14
