boss_hp = int(input("Gib die HP ein. "))

while boss_hp != 0:
    if boss_hp > 0:
        print("Der Boss verliert -10HP! Boss HP: ", boss_hp)    
    elif boss_hp == 0:
        print("Der Boss verliert -10! Boss HP:   0")
    elif boss_hp < 0:
        break  
    boss_hp -= 10
print("Der Boss wurde von dir besiegt!")