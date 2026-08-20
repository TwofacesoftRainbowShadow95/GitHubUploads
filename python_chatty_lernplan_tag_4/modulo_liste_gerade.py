#Aufgabenstellung:
#Liste: zahlen = [2, 7, 10, 13, 18]
#Schreibe eine Schleife, die nur die geraden Zahlen ausgibt.

zahlen = [2, 7, 10, 13, 18]

for zahl in zahlen:
    if zahl %2 == 0:
        print(zahl)