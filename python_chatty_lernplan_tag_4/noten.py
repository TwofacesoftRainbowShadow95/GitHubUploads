#Aufgabenstellung:
#Liste: noten = [1, 2, 3, 4, 5, 6]
#1–2 → "Bestanden"
#3–4 → "Durchschnittlich"
#5–6 → "Nicht bestanden"

noten = [1, 2, 3, 4, 5, 6]

for note in noten:
    if note <= 2:
        print(f"{note} -> Bestanden")
    elif note <= 4:
        print(f"{note} -> Durchschnittlich")
    else:
        print(f"{note} -> Nicht bestanden")