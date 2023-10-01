package anagram;

import anagram.service.AnagramComparator;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class AnagramComparatorApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AnagramComparator anagramChecker = new AnagramComparator();

		while (true) {
			System.out.println("Choose an option:");
			System.out.println("1. Check if two strings are anagrams");
			System.out.println("2. Find all anagrams for a given string");
			System.out.println("3. Add a new string");
			System.out.println("4. Exit");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume the newline character

			switch (choice) {
				case 1:
					System.out.println("Enter the first string:");
					String text1 = scanner.nextLine();
					System.out.println("Enter the second string:");
					String text2 = scanner.nextLine();
					if (anagramChecker.areAnagrams(text1, text2)) {
						System.out.println("The strings are anagrams of each other.");
					} else {
						System.out.println("The strings are not anagrams.");
					}
					break;
				case 2:
					System.out.println("Enter a string to find its anagrams:");
					String searchString = scanner.nextLine();
					List<String> anagrams = anagramChecker.findAllAnagrams(searchString);
					System.out.println("Anagrams for " + searchString + ": " + anagrams);
					break;
				case 3:
					System.out.println("Enter a new string to add:");
					String newString = scanner.nextLine();
					anagramChecker.addString(newString);
					System.out.println("String added successfully.");
					break;
				case 4:
					System.out.println("Exiting the program.");
					System.exit(0);
				default:
					System.out.println("Invalid choice. Please enter a valid option.");
			}
		}
	}

}
