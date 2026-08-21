# Gegeben:

# preise = [12, 5, 25, 8, 30, 15, 3]

# Schreibe ein Programm, das:

# - alle Preise über 10 € zählt
# - die Summe dieser Preise berechnet
# - den ersten Preis über 25 € findet und ausgibt
# - danach die Suche nach diesem ersten Preis beendet

# Am Ende soll dein Programm ungefähr Folgendes ausgeben:

# Anzahl über 10: 4
# Summe über 10: 82
# Erster Preis über 25: 30

# 1: Variablen: ueber_10 = 0, summe = 0 
# 2: for-Schleife 
# 3: if-/else-Bedingungen: 
# - if preis > 10: ueber_10 += 1, summe += preis 
# - if preis > 25: print() 
# 4: print

preise = [12, 5, 25, 8, 30, 15, 3]

ueber_10 = 0
summe = 0

for preis in preise:
    if preis > 10:
        #print(preis)
        ueber_10 += 1
        summe += preis
    if preis > 25:
        print(f"Erster Preis über 25 Euro: {preis} Euro")
        
print(f"Anzahl über 10 Euro: {ueber_10}")
print(f"Summe über 10 Euro: {summe} Euro")