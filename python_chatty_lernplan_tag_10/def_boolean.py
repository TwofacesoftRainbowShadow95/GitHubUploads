# Aufgabe Schreibe eine Funktion:
# ist_groesser_als(zahl, grenze)
# Sie soll True zurückgeben, wenn zahl größer als grenze ist, sonst False.
# Danach soll der Benutzer beide Werte eingeben können und dein Programm soll den Rückgabewert ausgeben.
# Plan:
# - Welche zwei Parameter braucht die Funktion?
# - Was muss sie zurückgeben?
# - Wie bekommen wir zahl vom User?
# - Wie bekommen wir grenze?
# - Wo speichern wir den Rückgabewert?
# - Wo kommt der print() hin?

def ist_groesser_als(a, b):
    return a > b

zahl = int(input("Gib Hier deine Zahl ein: "))
grenze = int(input("Gib Hier deine Grenze ein: "))

ergebniss = ist_groesser_als(zahl, grenze)

print(f"Die Zahl {zahl} ist größer als die Grenze {grenze}: {ergebniss}")