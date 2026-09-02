# Aufgabe
# - berechne_endpreis(preis, rabatt=0)
# - Sie soll den Preis nach Rabatt zurückgeben.
# Beispiele:
# - berechne_endpreis(100, 20) → 80
# - berechne_endpreis(50) → 50

def berechne_endpreis(preis, rabatt = 0):
    return preis - rabatt

preis = int(input("Gib Hier deinen Preis ein: "))
rabatt = int(input("Gib Hier deinen Rabatt ein: "))

endpreis = berechne_endpreis(preis, rabatt)

print(f"Der Preis nach Rabatt beträgt {endpreis} Euro.")