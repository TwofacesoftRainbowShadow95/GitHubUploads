#Aufgabnstellung:

#Schreibe ein Programm, das die Zahlen 1 bis 20 durchläuft 
#und nur die geraden Zahlen ausgibt.
#Einschränkung 😈
#Diesmal sollst du keine Liste dafür erstellen.
#Du brauchst nur:
#for
#range()
#if
#%

for x in range(1, 21):
    if x %2 == 0:
        print(x)
