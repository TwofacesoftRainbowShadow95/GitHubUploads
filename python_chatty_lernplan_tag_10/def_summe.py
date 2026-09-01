# Aufgabe Schreibe eine Funktion:
# berechne_summe(a, b)
# Sie soll zwei Zahlen entgegennehmen und deren Summe zurückgeben.
# Danach soll das Hauptprogramm:
# - den Benutzer nach zwei Zahlen fragen,
# - beide als Integer speichern,
# - die Funktion mit diesen beiden Zahlen aufrufen,
# - das Ergebnis in einer Variable speichern,
# - das Ergebnis ausgeben.

def berechne_summe(a, b):
    return a + b

a = int(input("Gib Hier deine erste Zahl ein: "))
b = int(input("Gib Hier deine zweite Zahl ein: "))

ergebnis = berechne_summe(a, b)

print(f"Das Ergebnis lautet: {ergebnis}")