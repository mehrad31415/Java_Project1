package pckg;

public class WordCount {
	// Method 3: Create wordCount Method to count the number of legal words
	public static int wordCount(String[][] stringArray, String[] words) {

		int count = 0;
		for (int i = 0; i < stringArray[0].length; i++) {
			String string = "";
			for (int j = 0; j < stringArray.length; j++) {
				string += stringArray[j][i];
			}
			// after creating each string we compare to see if it exists in the words list or not.
			for (String word : words) {
				if (string.equalsIgnoreCase(word)) {
					count += 1;

				}
			}
		}
		System.out.println("the number of legal words are: ");
		return count;
	}
}