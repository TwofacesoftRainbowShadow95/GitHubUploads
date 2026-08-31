def pruefe_gerade(x):
    if x %2 == 0:
        print(f"Die Zahl {x} ist gerade.")
    else:
        print(f"Die Zahl {x} ist ungerade.")


zahl = int(input("Gib eine beliebige Zahl ein: "))

pruefe_gerade(zahl)