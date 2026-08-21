# Aufgabenstellung

# Schreibe ein Programm, das:

# - alle Zahlen durchläuft,
# - nur die geraden Zahlen berücksichtigt,
# - diese geraden Zahlen addiert,
# - am Ende die Summe ausgibt.

# Das Ergebnis muss sein:
# 36

# Einschränkung

# - Du darfst keine eingebaute sum()-Funktion verwenden.
# - Du brauchst dafür wahrscheinlich eine Variable, die als Zwischenspeicher dient.
# - Ich gebe dir diesmal nicht die komplette Struktur vor. 😈

# Überleg dir selbst:
# Wo muss die Variable für die Summe erstellt werden, und wo muss sie verändert werden?


zahlen = [4, 7, 12, 15, 20]
summe = 0

for i in range(len(zahlen)):
    
    if zahlen[i] %2 == 0:
        summe = summe + zahlen[i]
print(f"Summe ist {summe}")
        
        