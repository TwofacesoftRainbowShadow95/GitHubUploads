# Aufgabe:
# Der Benutzer soll eine Zahl eingeben.

# Das Programm soll feststellen:

# Zahl < 0 → "Negativ"
# Zahl = 0 → "Null"
# Zahl > 0 → "Positiv"

# Danach soll zusätzlich geprüft werden:

# gerade → "Gerade"
# ungerade → "Ungerade"

# Mein Plan:

# 1: Variable: zahl = int(input()) 
# 2: für negativ/Null/positiv 
# - 1. if-Block: if zahl < 0 print("negativ") 
# - elif zahl == 0 print("Null") 
# - else print("positiv") 
# für gerade/ungerade: 
# - if zahl %2 ==0 print("gerade") 
# - else print("ungerade") 
# 3: ich brauche 2 if-Blöcke (falls damit die Entscheidungsstruckturen gemeint waren), da ich 2 verschiedene Sachen abprüfe. 
# 4: wenn ich nur unten ein print stehen haben möchte kann ich sie rein unten angeben, 
# und kann durch probieren gucken ob man es in den if-Blöcken umgehen kann, 
# aber aktuell stehen die prints jeweils in den if-Blöcken.

zahl = int(input("\nBitte gib eine Zahl deiner Wahl ein.\nWir definieren dir, ob sie:\n\npositiv / negativ\neine 0\ngerade / ungerade ist: "))

if zahl < 0:
    print(f"\nDeine Zahl {zahl} ist negativ")
elif zahl == 0:
    print(f"\nDeine Zahl {zahl} ist 0")
else:
    print(f"\nDeine Zahl {zahl} ist positiv")
if zahl %2 == 0:
    print("und gerade.\n")
else:
    print(" und ungerade.\n")
