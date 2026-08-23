# Aufgabe: Heldenausrüstung
# Unser Held startet mit einer Grundausrüstung:
# inventory = {
#  "waffe": "Keule",
#  "ruestung": "Lederharnisch",
#  "leben": 100
# }
# Löse folgende Schritte der Reihe nach:
# • Gib den Wert von "waffe" aus.
# • Der Held findet ein Schwert. Ersetze den Wert von "waffe" durch "Schwert".
# • Der Held findet außerdem einen Schild. Füge einen neuen Key "schild" mit Wert "Holzschild" hinzu.
# • Der Held nimmt 20 Schaden. Ziehe 20 von "leben" ab (nicht die Zahl fest eintippen, sondern rechnen:
# inventory["leben"] = ...).
# • Gib am Ende das komplette inventory-Dict aus.
# Zusatz, falls das zu leicht ist:
# Schreib eine Funktion heiltrank(inventory, betrag), die "leben" um betrag (35) erhöht,
# aber nie über 100 steigen lässt.


inventory = {
    "waffe": "Keule",
    "ruestung": "Lederharnisch",
    "leben": 100
}

x = inventory


print(x["waffe"])

x["waffe"] = "Schwert"
x["schild"] = "Holzschild"

print("Du hast - 20 Schaden weil du hingefallen bist.")

x["leben"] = x["leben"] - 20

print("Du hast noch ", x["leben"], "Leben.")

x["heiltrank"] = "plus 35 Leben"

def heiltrank():
    x["leben"] = x["leben"] + 35

    if x["leben"] >= 100:
        print("Du hast jetzt wieder 100 Leben.")
        x["leben"] = 100
    
"heiltrank" == heiltrank()

print(x)