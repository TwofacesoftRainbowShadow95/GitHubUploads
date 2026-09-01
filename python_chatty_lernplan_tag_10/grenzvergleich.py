# Aufgabe 
# bewerte_zahl(zahl, grenze=10)
# Die Funktion soll:
# - "zu klein" zurückgeben, wenn zahl < grenze
# - "genau richtig" zurückgeben, wenn zahl == grenze
# - "zu groß" zurückgeben, wenn zahl > grenze
# Der Standardwert der Grenze soll 10 sein.
# Danach soll dein Hauptprogramm:
# - eine Zahl vom User einlesen,
# - die Funktion aufrufen,
# - das Ergebnis speichern,
# - das Ergebnis ausgeben.

def bewerte_zahl(a, grenze = 10):
    if a < grenze:
        return "zu klein"
    if a == grenze:
        return "genau richtig"
    if a > grenze:
        return "zu groß"

zahl = int(input("Gib Hier deine Zahl ein: "))

grenzwert = bewerte_zahl(zahl)
print(f"Die Zahl im Vergleich zur Grenze ist {grenzwert}.")