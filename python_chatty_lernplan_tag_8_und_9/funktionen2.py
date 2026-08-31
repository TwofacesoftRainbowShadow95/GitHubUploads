# Aufgabe Schreibe eine Funktion:
# - berechne_quadrat(zahl)
# - Sie soll nicht selbst etwas ausgeben, sondern das Quadrat der übergebenen Zahl zurückgeben.
# - Danach soll außerhalb der Funktion:
# -- der Benutzer eine Zahl eingeben,
# -- die Funktion aufgerufen werden,
# -- das zurückgegebene Ergebnis in einer Variable gespeichert werden,
# -- das Ergebnis ausgegeben werden.

def berechne_quadrat(x):
    return x ** 2

zahl = int(input("Gib eine beliebige Zahl zum quadrieren ein: "))

ergebnis = berechne_quadrat(zahl)

print(f"Das Ergebnis lautet {ergebnis}.")