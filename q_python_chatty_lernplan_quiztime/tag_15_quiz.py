# alles an Code wurde von Chatty erstellt

zahl = 3

while zahl <= 8:
    zahl += 2
    print(zahl)

# Frage 1/5 – while + +=:
# Was wird ausgegeben?
# Und welchen Wert hat zahl nach der Schleife?
# Bitte wieder Schritt für Schritt.

# Meine Antwort:
# Ausgabe untereinander: 5 7 9
# zahl hat den Wert 9 nach beenden der Schleife, denn die Itteration die noch stattgefunden hat  bevor der Wert die Schleife beendet hat, wurde in zahl gespeichert.
# Schritt für Schritt: 
# zahl = 3 -> Prüfung 3 <= 8 True -> 3 += 2 = 5 -> print 5, Prüfung 5 <= 8 True -> 5 += 2 = 7 -> print 7, Prüfung 7 <= 8 True -> 7 += 2 = 9 -> print 9, Prüfung 9 <=8 False  -> Schleife beendet.

wort = "Python"

for i in range(0, 6, 2):
    print(wort[i])

# Frage 2/5 – range() + Index:
# Was wird ausgegeben?
# Und welche Indizes werden von range() geliefert?

# Meine Antwort:
# Ausgabe untereinander: Pto
# Es werden die Indizees 0, 2, 4 ausgegeben, da wir einen Startindex 0, inklusive, einen Endindex 6, exklusive, und eine Schrittweite von 2 haben.

def pruefe(punkte, grenze=50):
    return punkte >= grenze

a = pruefe(50)
b = pruefe(50, 60)
c = pruefe(70, 60)

# Frage 3/5 – Funktionen & Default-Parameter:
# Was steht am Ende in:
# - a
# - b
# - c
# Und warum?

# Meine Antwort:
# a = True, b = False, c = True
# wir haben in der Methode pruefe() zwei Parameter. Einmal punkte, ohne default-Wert, und einmal grenze, Mit default-Wert den man aber überschreiben Kann.
# - In a geben wir nur einen Integer ein, welcher dann automatisch in den Parameter ohne default-Wert gesetzt wird. Hier punkte. Im nächsten Schritt wird geprüft 50 >= 50
#   was True ergibt durch das =.
# - In b haben wir 2 Integer angegeben, welche der Reihenfolge nach in die Parameter eingesetzt werden. 50 wird in punkte eingesetzt und 60 überschreibt den default-Wert von Grenze
#   somit wird geprüft 50 >= 60 -> False
# - In C haben wir auch 2 Integer angegeben, folgt nach dem selben Prinzip. Geprüft wird 70 >= 60 -> True

punkte = 75

if punkte >= 90:
    print("Sehr gut")
elif punkte >= 50:
    print("Bestanden")
else:
    print("Nicht bestanden")

# Frage 4/5 – if / elif / else:
# Was wird ausgegeben?
# Und warum wird else nicht mehr geprüft, obwohl punkte >= 50 natürlich nicht die erste Bedingung war?

# Meine Antwort:
# Ausgegeben wird Bestanden, weil wir bei einem if-Block nur ins else gehen, wenn wir in vorhergehenden Blöcken nicht schon einen Teil haben bei dem alles erfüllt wurde. 
# Hier wurde die if-Bedingung nicht erfüllt weshalb weiter gegangen wird in die elif-Bedingung 75 >= 50, 
# was eine Weiterführung der if-Bedingung ist, erfüllt, und somit ist die Prüfung in Diesem Block beendet. 

# Präzesierung:
# elif ist nicht wirklich eine „Weiterführung“ der vorherigen Bedingung, sondern eine weitere Bedingung derselben if-Kette.

zahl = 5

while zahl < 10:
    if zahl == 7:
        break
    print(zahl)
    zahl += 1

print("Fertig")

# Frage 5/5 – Abschluss-Boss:
# Was wird komplett ausgegeben?
# Und erkläre mir bitte besonders:
# Warum wird die 7 nicht ausgegeben, obwohl zahl den Wert 7 erreicht?

# Meine Antwort:
# Ausgabe untereinander: 5 6 Fertig
# Die 7 wird nicht ausgegeben, denn es wird in zahl += 1 auf 7 itteriert, in die while-Prüfung gegeben, und aber von der if-Bedingung abgefangen. Diese sagt, sobald 7 == 7
# break, bedeutet die Schleife wird unterbrochen, alles was nach dem break steht wurde also nicht mehr durchgeführtbedeutet und das Programm geht weiter in den print Fertig.