# Gegeben:

# noten = [1, 4, 2, 5, 3, 6, 2, 4]

# Schreibe ein Programm, das die Liste durchläuft und am Ende ausgibt:

# - Wie viele Noten bestanden sind
# - Wie viele Noten nicht bestanden sind
# - Wie viele Noten insgesamt vorhanden sind

# Dabei gilt:

# - Note 1–4 → bestanden
# - Note 5–6 → nicht bestanden

# Das Ergebnis muss sein:

# - Bestanden: 6
# - Nicht bestanden: 2
# - Insgesamt: 8

# 1: for, weil wir eine abarbeiten müssen, in verschiedenen Abteilen 
# 2: Variablen: insgesamt: Länge mit len(noten), bestanden = 0 & nicht_bestanden = 0 
# 3: if note <= 4 
# 4: muss zu Variable bestanden addiert werden: bestanden += 1
# 5: muss zu Variable nicht_ bestanden addiert werden: else: nicht_bestanden += 1
# 6: Auf Einrückungshöhe for mit jeweils einem eigenem print: print(bestanden), print(nicht_bestanden), print(insgesamt)

noten = [1, 4, 2, 5, 3, 6, 2, 4]

bestanden = 0
nicht_bestanden = 0

for note in noten:
    if note <= 4:
        bestanden += 1
    else:
        nicht_bestanden += 1
print(f"Bestanden {bestanden}")
print(f"Nicht bestanden {nicht_bestanden}")
print(f"Insgesamt {len(noten)}")