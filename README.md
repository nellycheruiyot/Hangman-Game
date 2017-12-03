# Hangman-Game
This is a command line program that allows users to play a version of the game commonly known as "Hangman". The user is prompted to guess letters that makes up a word within a certain number of guesses.

## Description and Features

  * The program allows the user up to a maximum of 7 wrong guesses
  * For each wrong guess, the program prints an image of the hangman. The image is built with each wrong guess until it's complete
  * The game is over when:
      * A player correctly guesses the letters making up a word before the hangman image is complete
      * The hangman image is complete before a player guesses all the correct letters making up a word

## Setup/Installation Requirements

### Prerequisites
  * Install Homebrew using command, /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
  * Install gradle using the following command "brew install gradle"
  * Install java in your machine

To clone the repo,
  * git clone https://github.com/nellycheruiyot/Hangman-Game.git

## Build

  * Navigate to the top of the project directory
  * Run "gradle compileJava" to compile

## Running the program

  * Navigate to build/classes/java/main
  * Run "java App"

## Known Bugs

No known bugs

## Technologies Used
  * Java
  * Gradle
  * JUnit

## License

MIT (c) 2017 **[Nelly Cheruiyot](https://github.com/nellycheruiyot)**
