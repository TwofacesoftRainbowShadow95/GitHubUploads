# Aufgabe 2 – while + Eingabe
# Schreibe ein Programm, das den Benutzer nach einer Zahl fragt und so lange weiterfragt, wie die Zahl kleiner als 10 ist.
# Sobald der Benutzer eine Zahl eingibt, die mindestens 10 ist, soll ausgegeben werden:
# Zahl akzeptiert!
# Beispiel:
#  Gib eine Zahl ein: 4
#  Zu klein!
#  Gib eine Zahl ein: 12
#  Zahl akzeptiert!

# Mein Plan:
# 1: Wir benötigen einen Integer & den bekommen wir mit: zahl = int(input()) 
# 2: while zahl < 10: 
# 3: x < 10 -> print("Zu klein!")
# 4: zahl = int(input(...))
# 5: Zahl wird akzeptiert, wenn sie >= 10 ist.
# 6: kein break notwendig

zahl = int(input("Gib eine Zahl ein: "))

while zahl < 10:
    zahl = int(input(f"Zahl {zahl} ist zu klein! Erneut: "))
print(f"Zahl {zahl} akzeptiert!")