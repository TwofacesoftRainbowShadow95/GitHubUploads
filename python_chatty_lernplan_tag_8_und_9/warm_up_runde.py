# Warm-up – Runde 2: Dein Plan-Schema

# - Der Benutzer soll eine Zahl eingeben.
# - Solange die Zahl kleiner als 10 ist, soll erneut nach einer Zahl gefragt werden.
# - Sobald die Zahl 10 oder größer ist, soll "Akzeptiert!" ausgegeben werden.

zahl = int(input("Gib Hier eine Zahl ein: "))

while zahl < 10:
    zahl = int(input("Gib erneut eine Zahl ein: "))
print("Akzeptiert!")