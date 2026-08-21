# Gegeben:

# zahlen = [12, 5, 18, 3, 21, 8, 14]

# Schreibe ein Programm, das:

# - die Liste durchläuft,
# - alle Zahlen größer als 10 zählt,
# - diese Zahlen addiert,
# - am Ende beides ausgibt.

# Erwartetes Ergebnis:

# Anzahl: 4, Summe: 65, Denn: 12 + 18 + 21 + 14 = 65

# count = 0                         1: Variablen count & summe, beide mit Wert 0 erstellen
# summe = 0
# for → Liste durchlaufen           2: for-Schleife
# if x > 10                         3: if-Bedingung > 10 stellen
# Bei Treffer:                      
# summe um x erhöhen                4: Variable summe, mit der Zahl > 10 addieren
# count um 1 erhöhen                count mit 1 addieren
#                                   5: unten auf Einrückungshöhe: print(count), print(summe)

zahlen = [12, 5, 18, 3, 21, 8, 14]

summe = 0
count = 0

for i in zahlen:
    if i > 10:
        summe += i
        count += 1
print(summe)
print(count)