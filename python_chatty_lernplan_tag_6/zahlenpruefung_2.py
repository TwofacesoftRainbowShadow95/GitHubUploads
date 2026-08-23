# Aufgabe:
# Der Benutzer gibt eine Zahl ein.

# Dein Programm soll drei Dinge unabhängig voneinander prüfen:

# 1. Ist die Zahl positiv, negativ oder 0?
# - kleiner als 0 → "negativ"
# - genau 0 → "0"
# - größer als 0 → "positiv"
# 2. Ist die Zahl gerade oder ungerade?
# - gerade → "gerade"
# - ungerade → "ungerade"
# - Ist die Zahl eine große positive Zahl?
# 3. Wenn die Zahl positiv UND größer als 10 ist → "Große positive Zahl"

# Mein Plan:

# 1: variable: zahl = int(input(...)) 
# 2: 3 if-Blöcke 
# if zahl > 0 -> positiv 
# elif zahl == 0 -> 0 
# else -> negativ 
# if zahl %2 == 0 -> gerade 
# else -> ungerade 
# if zahl > 10 -> Große positive Zahl

zahl = int(input("Gib Hier deine Zahl ein: "))

if zahl > 0:
    print("positiv")  
elif zahl == 0:
    print("0") 
else:
    print("negativ")
if zahl %2 == 0:
    print("gerade")
else:
    print("ungerade")
if zahl > 10:
    print("Große positive Zahl")