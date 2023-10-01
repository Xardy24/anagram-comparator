# Anagram Comparator Application
The Anagram Comparator Application is a Java program that provides features for checking if two texts are anagrams of each other and finding all anagrams for a given text. An anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once.

## Features

### Feature #1: Check If Two Texts Are Anagrams
This feature allows you to check if two input texts are anagrams of each other. It uses the standard definition of anagrams, which means that if you can rearrange the letters of one text to form the other, they are considered anagrams.

### Feature #2: Find All Anagrams for a Given Text
This feature allows you to find all the anagrams for a given input text. It maintains an internal list of texts that have been added, and it returns a list of texts that are anagrams of the input text. The input text itself is excluded from the list of anagrams.

## Getting Started

1. **Run the JAR file directly:**
   ```bash
   java -jar anagram-comparator.jar
   
2. **Compile the Java Program:**

   You can compile the Java program using your favorite Java compiler. Then run this command:

   ```bash
   java -cp target/classes anagram.AnagramComparatorApplication


# Usage

The Anagram Comparator Application provides a simple command-line interface with the following options:

    1. Check if two texts are anagrams: You can enter two texts, and the application will determine if they are anagrams of each other.
    2. Find all anagrams for a given text: You can enter a text, and the application will return a list of texts that are anagrams of the input text. The input text itself is excluded from the list.
    3. Add a new text: You can add a new text to the internal list of texts.
    4. Exit: You can exit the application.


# Example

Here's an example interaction with the Anagram Comparator Application:

Choose an option:
1. Check if two texts are anagrams
2. Find all anagrams for a given text
3. Add a new text
4. Exit

   1

Enter the first text:

listen

Enter the second text:

silent

The texts are anagrams of each other.

Choose an option:
1. Check if two texts are anagrams
2. Find all anagrams for a given text
3. Add a new text
4. Exit

   2

Enter a text to find its anagrams:

triangle

Anagrams for triangle: []

Choose an option:
1. Check if two texts are anagrams
2. Find all anagrams for a given text
3. Add a new text
4. Exit

   3

Enter a new text to add:

apple

Text added successfully.

Choose an option:
1. Check if two texts are anagrams
2. Find all anagrams for a given text
3. Add a new text
4. Exit

   3

Enter a new text to add:

ppela

Text added successfully.

Choose an option:
1. Check if two texts are anagrams
2. Find all anagrams for a given text
3. Add a new text
4. Exit

   2

Enter a text to find its anagrams:

apple

Anagrams for apple: [ppela]

Choose an option:
1. Check if two texts are anagrams
2. Find all anagrams for a given text
3. Add a new text
4. Exit

   4

Exiting the program.
