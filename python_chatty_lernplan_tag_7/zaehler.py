# Aufgabe 3 – while + Zähler

# Schreibe ein Programm, das den Benutzer höchstens 3-mal nach einer Zahl fragt.

# - Wenn die Zahl größer als 10 ist → "Treffer!" und das Programm beendet die Eingabe.
# - Wenn sie 10 oder kleiner ist → "Zu klein!"
# - Nach spätestens 3 Versuchen soll Schluss sein, auch wenn der Benutzer nie eine Zahl > 10 eingibt.

# Mein Plan:
# 1: Variablen: zaehler = 0; versuch = int(input()) wenn versuch false ist, zaehler +=1 
# 2: der Zähler speichert die Versuchanzahl(vllt for-Schleife) 
# 3: die while-Schleife zaehler < 3 
# 4: zaehler += 1 if versuch > 10 break
# 5: else print 
# 6: die Schleife endet automatisch, da die Schleife nach 3 Versuchen endet.

zaehler = 0
versuch = int(input("Gib Hier deine Zahl ein: "))
zaehler += 1

while zaehler < 3:
    
    if versuch > 10:
        print(f"{versuch} = Treffer")
        break
    else:
        versuch= int(input("Zu klein! Erneut: "))
          
    zaehler += 1

    if zaehler == 3:
        if versuch > 10:
            print(f"{versuch} = Treffer")
        else:
            print(f"{versuch} ist zu klein!")

# Ich hatte hier für Sehr viele Durchgänge den One-off-Fehler drin, und nach ettlichen Änderungen habe ich nun 
# Diesen, zwar unsauberen, Aber Funktionierenden Code erzeugt >:D Ich bin Sehr stolz auf mich <3