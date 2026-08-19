import random

stages = [r'''
  +---+
  |   |
  O   |
 /|\  |
 / \  |
      |
=========
''', r'''
  +---+
  |   |
  O   |
 /|\  |
 /    |
      |
=========
''', r'''
  +---+
  |   |
  O   |
 /|\  |
      |
      |
=========
''', '''
  +---+
  |   |
  O   |
 /|   |
      |
      |
=========''', '''
  +---+
  |   |
  O   |
  |   |
      |
      |
=========
''', '''
  +---+
  |   |
  O   |
      |
      |
      |
=========
''', '''
  +---+
  |   |
      |
      |
      |
      |
=========
''']
word_list = ["aardvark", "baboon", "camel"]

chosen_word = random.choice(word_list)
print(chosen_word)

placeholder = ""
word_length = len(chosen_word)

for position in range(word_length):
    placeholder += "_"
print(placeholder)

display = ""

lives = 6
lives = len(stages)

letters_guessed_right = []
while display != chosen_word:

    guess = input("Guess a letter: ").lower()
    display = ""
    for letter in chosen_word:
        if letter == guess:
            display += letter
            letters_guessed_right.append(guess)
            #print(display)
        elif guess != letter:
            lives.pop()
            print(stages[pop])
        elif lives == 0:
            print("You lose.")
        elif letter in letters_guessed_right:
            display += letter
            #print(display)
        
        elif letters_guessed_right == word_length:
            print(chosen_word)
            break
        else:
            display += "_"
    print(letters_guessed_right)
    print(display)
#print(display)
print("Congrats, you have won.")

# TODO-1: - Create a variable called 'lives' to keep track of the number of lives left.
#  Set 'lives' to equal 6.

#guess = input("Guess a letter: ").lower()

# TODO-2: - If guess is not a letter in the chosen_word, Then reduce 'lives' by 1.
#  If lives goes down to 0 then the game should stop and it should print "You lose."

# TODO-3: - print the ASCII art from 'stages'
#  that corresponds to the current number of 'lives' the user has remaining. 