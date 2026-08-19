import random
import hangman_words
import hangman_art
print(hangman_art.logo)

hangman_words.word_list

chosen_word = random.choice(hangman_words.word_list)
print(chosen_word)

hangman_art.stages

placeholder = ""
word_length = len(chosen_word)
for position in range(word_length):
    placeholder += "_"
print(placeholder)

display = ""
letters_guessed_right = []
letters_guessed_wrong = []

lives = 6

print("Welcome to Hangman.\n"
      "Just a few hints for this game:\n"
      "If you type anything else than a letter out of the alphabet,\n"
      "it will be counted as false and cost you a live.")

while display != chosen_word:


    print(hangman_art.stages[lives])
    print("****************************", lives, "/ 6 LIVES LEFT****************************")
    guess = input("Guess a letter: ").lower()
    display = ""

    if guess in letters_guessed_wrong:
        print("You've already guessed a ", guess)

    elif guess not in chosen_word:
        lives -= 1
        letters_guessed_wrong.append(guess)
        print("You guessed ", "'", guess, "'", " , that's not in the word. You lose a life.")


    if lives == 0:
        print(hangman_art.stages[0])
        print("IT WAS ", chosen_word, "! YOU LOSE")
        break

    for letter in chosen_word:

        if letter == guess:
            display += letter
            letters_guessed_right.append(guess)
        elif letter in letters_guessed_right:
            display += letter
        else:
            display += "_"

    print("Here are all the wrong letters: ", letters_guessed_wrong)
    print("Here is written: ", display)

    if display == chosen_word:
        print("Congrats!")

print("This Game is done. It was fun.")
