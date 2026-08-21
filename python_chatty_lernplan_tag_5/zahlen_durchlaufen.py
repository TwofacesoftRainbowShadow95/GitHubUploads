# Aufgabenstellung:

# Nimm:

# zahlen = [4, 7, 12, 3, 18, 5]

# und baue daraus:
# Durchlaufe die Liste → prüfe jede Zahl → bei der ersten Zahl > 10: ausgeben und Schleife beenden.

zahlen = [4, 7, 12, 3, 18, 5]

x = 0

for x in zahlen:
    if x < 10:
        continue#print(x)
    elif x > 10:
        print(x)
        break
    else:
        continue#print(x)