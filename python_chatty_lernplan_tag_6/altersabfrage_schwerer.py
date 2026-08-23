# Wir wollen ein Programm bauen, das den Benutzer so lange nach seinem Alter fragt, bis eine gültige Eingabe gemacht wurde.

# Für diese Aufgabe gilt:

# - Alter muss mindestens 0 sein.
# - Wenn das Alter ungültig ist (< 0), soll "Ungültiges Alter" ausgegeben werden.
# - Danach soll erneut gefragt werden.
# - Sobald ein gültiges Alter eingegeben wurde, soll das Programm "Gültiges Alter" ausgeben und beenden.

# Mein Plan:

# 0: Variable = alter mit int(input())
# 1: while, da wir eine Bedingung true/false abprüfen wollen und keinen "vorgegebenen Rahmen" haben wie eine Liste. 
# 2: while alter < 0 or alter > 150: 
# 3: der break sollte nach if alter< 0 print(...) & elif alter > 150 print kommen. 
# 4: die erneute input()-Abfrage kommt dann zwischen der letzten elif-Abfrage und else-Block

alter = int(input("Gib Hier dein Alter ein: "))

while alter < 0 or alter > 150:
    
    if alter < 0 or alter > 150:
        print("Ungültiges Alter")
    alter = int(input("Erneute Eingabe: "))
 
else:
    print("Gültiges Alter")
    