#Aufgabenstellung:
#Listen: zahlen = [2, 7, 10, 13, 18]
#Schreibe eine Schleife, die für jede Zahl prüft:
# Wenn sie gerade ist → "X ist gerade"
# Wenn sie ungerade ist → "X ist ungerade"
#Eine Zahl ist gerade, wenn:
#zahl % 2 == 0

zahlen = [2, 7, 10, 13, 18]

for zahl in zahlen:
    if zahl %2 == 0:
        print(f"{zahl} ist gerade")
    else:
        print(f"{zahl} ist ungerade")