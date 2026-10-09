# alles an Code wurde von Chatty erstellt

def pruefe(punkte, grenze=50):
    return punkte >= grenze

ergebnis = pruefe(60, 70)

# Frage 1/5 Default-Parameter:
# Was steht am Ende in ergebnis?
# Und ganz wichtig: Welchen Wert hat grenze bei diesem Funktionsaufruf tatsächlich?

# Meine Antwort:
# In ergebnis steht False da der return von pruefe() einen Boolean ausgibt und hier geprüft wird, ob 60 >= 70 ist, was falsch ist.
# grenze hat zwar einen default-Wert, dieser wurde aber von 70 überschrieben. 60 hat den Parameter punkte überschrieben.

zahl = 10

if zahl > 10:
    print("A")
elif zahl >= 10:
    print("B")
else:
    print("C")

# Frage 2/5 > oder >=:
# Was wird ausgegeben?
# Und warum wird nicht "A" ausgegeben?

# Meine Antwort:
# Es wird B ausgegeben, weil in der if-Bedingung steht zahl, hier 10, und somit geprüft wird ob 10 > 10 ist. Das ist False, 
# weshalb wir ins elif gehen. Dort wird geprüft 10 >= 10, und da sowohl größer Als auch gleich geprüft wird,
# bekommen wir ein True, was die elif-Bedingung beendet und ein B printet.

zahl = 10

while zahl >= 6:
    print(zahl)
    zahl -= 2

# Frage 3/5 while + >=:
# Was wird ausgegeben?
# Und welchen Wert hat zahl nach dem Ende der Schleife?
# Nimm wieder deinen Schritt-für-Schritt-Weg.

# Meine Antwort:
# - Ausgegeben wird untereinander 10 8 6 denn zuerst wird 10 >= 6 geprüft und geprintet und um 2 reduziert. Dann wird 8 >= 6 geprüft, geprintet und um 2 reduziert.
#   Jetz haben wir 6 >= 6 was wegen dem = auch noch geprüft, geprintet und um 2 reduziert wird. Dann haben wir 4 >= 6 was False ergibt und nicht mehr geprintet wird.
# - zahl hat nach dem Ende der Schleife den Wert 4, da dieser noch in zahl mit der letzten Iteration gespeichert wurde und nur die Schleifenprüfung nicht mehr überstanden hat.

wort = "Python"

print(wort[1:6:2])

# Frage 4/5 Slicing:
# Welche Zeichen werden ausgegeben?
# Und welche Indizes werden verwendet?

# Meine Antwort:
# - yhn
# - Es werden Indizes 1, 3 & 5 verwendet, da 1 der Startindex ist, inklusive, 6 der Endindex ist, exklusive, und wir in 2er Schritten durch die Indizes gehen.

def bestanden(punkte, grenze=50):
    return punkte >= grenze

ergebnis = bestanden(50)

# Frage 5/5 – Abschluss-Boss:
# Beantworte:
# - Welchen Wert bekommt grenze?
# - Was ergibt der return?
# - Was steht in ergebnis?
# - Warum?

# Meine Antwort:
# - grenze hat einen gesetzten default-Wert welcher auch nicht in der Methode mit einem 2. Wert überschrieben wird.
# - return ist ein Boolean und gibt True aus, denn 50 >= 50 wird durch das = in >= True
# - in Ergebnis steht True
