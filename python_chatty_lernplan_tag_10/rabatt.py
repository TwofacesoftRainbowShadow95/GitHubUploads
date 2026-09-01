# Aufgabe Schreibe eine Funktion:
# berechne_preis(preis, rabatt=0)
# Sie soll den Endpreis nach Rabatt zurückgeben.
# Beispiele:
# - berechne_preis(100)
#   → 100
# - berechne_preis(100, 20)
#   → 80
# Dabei ist rabatt eine Prozentangabe.
# Dein Plan
# - Welche zwei Parameter hat die Funktion?
# - Welcher Parameter bekommt den Default-Wert?
# - Wie berechnest du aus preis und rabatt den Endpreis?
# - Was muss die Funktion zurückgeben?
# - Wie würdest du testen, ob berechne_preis(100) wirklich 100 ergibt?

def berechne_preis(a, b = 0):
    return a - (a / 100 * b)

preis = int(input("Gib Hier den Preis ein: "))
rabatt = int(input("Gib Hier den Rabatt ein: "))

endpreis = int(berechne_preis(preis, rabatt))

print(f"Der Endpreis lautet: {endpreis}")