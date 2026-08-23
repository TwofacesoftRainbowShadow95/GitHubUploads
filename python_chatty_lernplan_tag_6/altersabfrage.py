# Schreibe ein Programm, das den Benutzer nach seinem Alter fragt.

# Danach soll ausgegeben werden:

# unter 13 → "Kind"
# 13 bis 17 → "Jugendlicher"
# 18 bis 64 → "Erwachsener"
# ab 65 → "Senior"

# Mein "Bauplan":
# 1: Alles muss in einer Variable abgespeichert werden. Ich würde hier alter = int(input()) benutzen, debb input() braucht eine int() casting für den Vergleich in dem if-/elif-/else-Block. 
# 2: die if-Bedingung hier muss sein: if alter < 13: print("Kind"), mit entsprechender Einrückung 
# 3: die 1. elif-Bedingung prüft von 13 - 17 also schreiben wir 
# elif alter < 18 print(...) weil 18 als Grenze nicht in der Prüfung dabei ist und bis 12 in if schon "ausgeschlossen" wurde. die 
# 2. elif-Bedingung lautet: elif alter < 65 print(...) 
# 4: ab 65 rutscht Deswegen einfach in die else-Bedingungung, weil wir alle anderen (realistischen) Alterseingaben schon vorher abgeklappert 
# und somit aus der else-Bedingung rausgenommen haben.

alter = int(input("Wie alt bist du? Gib es hier: -> "))

if alter < 13:
    print("Kind")
elif alter < 18:
    print("Jugendlicher")
elif alter < 65:
    print("Erwachsener")
else:
    print("Senior")