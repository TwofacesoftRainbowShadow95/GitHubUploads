# Aufgabe kleiner Zahlenprüfer
# Schreibe eine Funktion:

# pruefe_zahl(zahl)

# Sie soll:
# - "positiv" zurückgeben, wenn zahl > 0
# - "null" zurückgeben, wenn zahl == 0
# -"negativ" zurückgeben, wenn zahl < 0
# Danach soll dein Hauptprogramm den Benutzer 5 Zahlen eingeben lassen.
# Für jede eingegebene Zahl soll:
# - die Funktion aufgerufen werden
# - das Ergebnis gespeichert werden
# - das Ergebnis ausgegeben werden

def pruefe_zahl(zahl):
    if zahl > 0:
        return "positiv"
    elif zahl == 0:
        return "null"
    else:
        return "negativ"

#zahl = int(input("Gib eine beliebige Zahl ein: "))
ergebnis = 0

for i in range (5):
    zahl = int(input("Gib einen beliebigen Integer ein: "))
    ergebnis = pruefe_zahl(zahl)
    print(f"Ergebnis = {ergebnis}")
    
