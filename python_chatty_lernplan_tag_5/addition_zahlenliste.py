# Gegeben:

# zahlen = [4, 7, 12, 3, 18, 5]

# Diesmal soll dein Programm:

# - alle Zahlen durchlaufen
# - nur Zahlen größer als 10 berücksichtigen
# - diese Zahlen addieren
# - am Ende die Summe ausgeben

# Erwartetes Ergebnis:

# 30 Denn: 12 + 18 = 30

# Du brauchst:

# for, if, eine Akkumulator-Variable, +

# Mein Plan:
#  
# for → jede Zahl durchlaufen
# if x > 10 → nur passende Zahlen berücksichtigen
# Eine Variable für die bisherige Summe → Startwert 0
# Bei jedem Treffer → aktuelle Zahl zur Summe addieren
# Nach der Schleife → Summe ausgeben

zahlen = [4, 7, 12, 3, 18, 5]

# Ziel ist 30

summe = 0

for x in zahlen:
    if x > 10:
        summe += x
print(summe)