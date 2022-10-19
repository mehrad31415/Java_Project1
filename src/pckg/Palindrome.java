package pckg;

public class Palindrome {
	// Method 4: a palindromeCount method which counts the number of legal words
	// which are palindrome.
	public static int palindromeCount(String[][] stringArray, String[] words) {
		int count = 0;
		for (int i = 0; i < stringArray[0].length; i++) {
			String string = "";
			for (int j = 0; j < stringArray.length; j++) {
				string += stringArray[j][i];
			}
			for (String word : words) {
				// it is like method 3 but with an extra condition of palindrome. (Could have been encapsulated in one method)
				if (word.equalsIgnoreCase(string) && palindrome(string)) {
					count += 1;
				}
			}
		}
		System.out.println("the number of palindrome legal words are: ");
		return count;

	}

	// extra method checks whether a string is palindrome.
	public static boolean palindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
