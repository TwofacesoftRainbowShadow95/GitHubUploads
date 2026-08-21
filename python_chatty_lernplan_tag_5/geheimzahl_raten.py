# Diesmal soll gelten:

# - while kontrolliert, ob weitergemacht wird
# - bei jedem Durchlauf wird genau ein Versuch verarbeitet
# - versuche[i] soll der aktuelle Versuch sein
# - i muss sich nach jedem Durchlauf erhöhen
# - bei einem Treffer soll die Schleife aufhören
# - kein for verwenden
#
#Erwartete Ausgabe:

# Zu klein
# Zu groß
# Zu klein
# Treffer!

geheimzahl = 7
versuche = [3, 9, 5, 7]
i = 0

while i < 4:
    
    print(versuche[i])

    if versuche[i] < geheimzahl:
        print("Zu klein!")
    elif versuche[i] > geheimzahl:
        print("Zu groß!")
    elif versuche[i] == geheimzahl:
        print("Treffer!")
        break

    i += 1

# Diese Aufgabe habe ich leider nicht alleine bewältigt an diesem Tag. 