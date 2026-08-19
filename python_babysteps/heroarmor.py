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