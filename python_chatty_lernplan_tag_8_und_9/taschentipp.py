
ergebniss = {"Programm beendet", "Summe", "Differenz", "Produkt", "Quotient"}

print("Wähle zwischen folgenden Möglichkeiten:")
print()
print("Für die Summe gib folgende Wahl ein:        1")
print("Für die Differenz gib folgende Wahl ein:    2")
print("Für das Produkt gib folgende Wahl ein:      3")
print("Für den Quotienten gib folgende Wahl ein:   4")
print("Und um das Programm zu beenden die Wahl:    0")
print()
wahl = int(input("Gib Hier deine Wahl ein: "))
print()
a = int(input("Gib Hier deine erste Zahl ein: "))
b = int(input("Gib Hier deine zweite Zahl ein: "))

while wahl != 0:

    if wahl == 1:
        summe = a + b
        print(f"Summe: {a} + {b} = {summe}")
        
    elif wahl == 2:
        differenz = a - b
        print(f"Differenz: {a} - {b} = {differenz}")
        
    elif wahl == 3:
        produkt = a * b
        print(f"Produkt: {a} * {b} = {produkt}")
        
    elif wahl == 4:
        produkt = a / b
        print(f"Quotient: {a} / {b} = {produkt}")

    if wahl == 0:
        print(f"Programm beendet")
        
    if wahl < 0 or wahl > 4:
        print("Ungültige Zahl")
        
    print()
    print("Wähle zwischen folgenden Möglichkeiten:")
    print()
    print("Für die Summe gib folgende Wahl ein:        1")
    print("Für die Differenz gib folgende Wahl ein:    2")
    print("Für das Produkt gib folgende Wahl ein:      3")
    print("Für den Quotienten gib folgende Wahl ein:   4")
    print("Und um das Programm zu beenden die Wahl:    0")
    print()
    wahl = int(input("Gib Hier deine Wahl ein: "))
    print()
    a = int(input("Gib Hier deine erste Zahl ein: "))
    b = int(input("Gib Hier deine zweite Zahl ein: "))
    print()


print("Das hat Spaß gemacht.")