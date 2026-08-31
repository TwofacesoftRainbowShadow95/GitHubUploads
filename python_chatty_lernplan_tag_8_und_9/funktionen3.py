def ist_gerade(x):
    return x%2 == 0

zahl = int(input("Gib eine beliebige Zahl ein: "))

ergebnis = ist_gerade(zahl)

print(ergebnis)

if ergebnis:
    print("Die Zahl ist gerade.")
else:
    print("Die Zahl ist ungerade.")