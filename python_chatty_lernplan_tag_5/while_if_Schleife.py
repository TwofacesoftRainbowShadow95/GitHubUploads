# Aufgabenstellung:
# Wir wollen ein kleines Zahlensuchprogramm bauen.
# Gegeben:
# geheimzahl = 7
# versuch = 0

# Dein Programm soll:
# - so lange laufen, bis versuch gleich geheimzahl ist
# - bei jedem Durchlauf einen neuen Wert für versuch setzen
# - wenn versuch kleiner als geheimzahl ist → "Zu klein"
# - wenn versuch größer ist → "Zu groß"
# - wenn er richtig ist → "Treffer!"

# Einschränkung
# - Wir machen es heute noch ohne input().
# - Du kannst die Versuche deshalb beispielsweise aus einer Liste nehmen:

#   versuche = [3, 9, 5, 7]

# Das Programm soll diese Werte der Reihe nach verwenden.

# Erwartete Ausgabe:

# Zu klein
# Zu groß
# Zu klein
# Treffer!

# Ein Hinweis
# Du hast gerade gelernt, dass while eine Bedingung braucht.
# Du musst also überlegen:
# Wann soll die Schleife weiterlaufen?
# Und innerhalb der Schleife musst du den nächsten Wert aus versuche holen.
# Du darfst dafür wieder range() verwenden.

geheimzahl = 7
versuch = 0
versuche = [3, 9, 5, 7]

while versuch != geheimzahl:
    for i in range(len(versuche)):
    
        #versuch = versuche[i] + 1
        #print(versuche[i])
        
        if versuche[i] < geheimzahl:
            print("Zu klein")
        elif versuche[i] > geheimzahl:
            print("Zu groß")
        elif versuche[i] == geheimzahl:
            print("Treffer!")
            break
    break
#print("done")