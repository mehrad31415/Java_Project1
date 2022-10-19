package pckg;

import java.util.ArrayList;

public class Anagram {

	// Method 5: Create anagramCount method to count the number of valid anagrams
	public static int anagramCount(String[][] stringArray, String[] words) {

		// initial value.
		int count = 0;
		// initial list
		ArrayList<String> list = allWords(stringArray);

		// checks if the array has three legal words first.
		if (threeLegalWordArray(stringArray, words)) {

			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = i + 1; j < list.size(); j++) {
					if (compareStrings(list.get(i), list.get(j))) {
						count += 1;
					}
				}
			}

		}
		System.out.println("the number of anagram words are: ");
		return count;
	}

	// method for checking if an array has three legal words.
	public static boolean threeLegalWordArray(String[][] stringArray, String[] words) {
		for (int i = 0; i < stringArray[0].length; i++) {
			String string = "";

			for (int j = 0; j < stringArray.length; j++) {
				string += stringArray[j][i];
			}
			loop: {
				for (String word : words) {
					if (word.equalsIgnoreCase(string)) {
						break loop;
					}
				}
				return false;
			}
		}
		return true;
	}

	// method for creating all the strings inside a Array
	public static ArrayList<String> allWords(String[][] stringArray) {
		ArrayList<String> listString = new ArrayList<>();
		for (int i = 0; i < stringArray[0].length; i++) {
			String string = "";
			for (int j = 0; j < stringArray.length; j++) {
				string += stringArray[j][i];
			}
			listString.add(string);
		}
		return listString;
	}

	// method for sorting a a string. this will be useful when finding out anagrams
	// given that the sorted strings of two anagrams must be equal.
	public static String sort(String string) {
		char temp;
		char[] arr = string.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return String.valueOf(arr);
	}
	
	// method for comparing to strings.
	public static boolean compareStrings(String string1, String string2) {
		if (sort(string1).equals(sort(string2))) {
			return true;
		}
		return false;
	}
}
