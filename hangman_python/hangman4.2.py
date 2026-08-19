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


letters_guessed_right = []
#letters_guessed_wrong = []

stages_length = len(stages)

lives = 6

display = ""


print("Welcome to Hangman.\n"
      "Just a few hints for this game:\n"
      "If you type anything else than a letter out of the alphabet,\n"
      "it will be counted as false and cost you a live.")

while display != chosen_word:

    print(stages[lives])
    print("Your lives are equal to ", lives)
    guess = input("Guess a letter: ").lower()
    #print("Here are your right guesses:\n", letters_guessed_right)
    #print("Here are your wrong guesses:\n", letters_guessed_wrong)
    #print(display)
    display = ""

    if guess not in chosen_word:
        lives -= 1
    if lives == 0:
        print(stages[0])
        print("Your lives equal to 0. You lose.")
        break

    for letter in chosen_word:

        if letter == guess:
            display += letter
            letters_guessed_right.append(guess)
        elif letter in letters_guessed_right:
            display += letter
        else:
            display += "_"

    print(display)

print("This Game is done. It was fun.")

