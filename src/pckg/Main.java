//Name: Mehrad Haghshenas
//This project is all my own work.
//I have not knowingly allowed others to copy my work.

package pckg;

import java.util.Scanner;

public class Main {
	// this is the main method of the program where there is interaction with the
	// user.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("what are the dimensions of your array? (number of rows/columns must be equal)");
		final int DIM = scanner.nextInt();
		String[][] stringArray = new String[DIM][DIM];
		for (int i = 0; i < DIM; i++) {
			for (int j = 0; j < DIM; j++) {
				stringArray[i][j] = " ";
			}
		}
		//test set (you can change it with selecting the first option.)
		stringArray [0][0] = "p";
		stringArray [0][1] = "e";
		stringArray [0][2] = "t";
		stringArray [1][0] = "e";
		stringArray [1][1] = "v";
		stringArray [1][2] = "e";
		stringArray [2][0] = "p";
		stringArray [2][1] = "e";
		stringArray [2][2] = "n";

		// legal list of words.
		String[] words = { "pep", "eve", "ten", "ape", "pea", "eat"};

		// interaction loop.
		boolean interaction = true;
		do {
			// options
			System.out.println("what option do you want to choose? ");
			System.out.println("[1] Enter characters");
			System.out.println("[2] Display character array");
			System.out.println("[3] Columns that are legal words");
			System.out.println("[4] Columns that are palindromes");
			System.out.println("[5] Number of anagrams detected");
			System.out.println("[6] Exit");
			System.out.println("Enter choice [1-6]:");
			int input = scanner.nextInt();

			switch (input) {
			case 1:
				Scanner newInput = new Scanner(System.in);
				System.out.println("which position do you want to fill in? ");
				System.out.println("row: ");
				int row = scanner.nextInt();
				System.out.println("column: ");
				int column = scanner.nextInt();
				System.out.println("with what character? ");
				String string = newInput.nextLine();
				FillingArray.fillingArray(row, column, string, stringArray);
				break;

			case 2:
				Display.printBoard(stringArray);
				break;
			case 3:
				System.out.println(WordCount.wordCount(stringArray, words));
				break;

			case 4:
				System.out.println(Palindrome.palindromeCount(stringArray, words));
				break;

			case 5:
				System.out.println(Anagram.anagramCount(stringArray, words));
				break;

			case 6:
				// breaks the interaction loop.
				interaction = false;
				break;

			case default:
				// if any other keyword was pushed nothing will happen.
				break;
			}
		} while (interaction);

		System.out.println("thank you for joining!");
	}
}
