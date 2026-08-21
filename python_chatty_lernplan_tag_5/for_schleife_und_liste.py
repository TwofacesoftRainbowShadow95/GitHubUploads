#Aufgabenstellung

#Schreibe ein Programm, das die Liste durchläuft und für jedes Element ausgibt:
#gerade → "X ist gerade"
#ungerade → "X ist ungerade"
#ABER: Diesmal darfst du nicht direkt über die Elemente iterieren:

#for zahl in zahlen:

#Stattdessen sollst du über die Indizes gehen:
#for i in range(len(zahlen)):
#Und innerhalb der Schleife holst du dir das aktuelle Element über:
#zahlen[i]


zahlen = [4, 7, 12, 15, 20]

for i in range(len(zahlen)):
    if zahlen[i] %2 == 0:
        print(f"{zahlen[i]} ist gerade")
    else:
        print(f"{zahlen[i]} ist ungerade")