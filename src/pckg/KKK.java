package pckg;

import java.util.ArrayList;

public class KKK {

	public static void main(String[] args) {
		String[] words = {"ape","pea","eat"};
		String[][] stringArray = new String[3][3];
		stringArray [0][0] = "a";
		stringArray [0][1] = "p";
		stringArray [0][2] = "e";
		stringArray [1][0] = "p";
		stringArray [1][1] = "e";
		stringArray [1][2] = "a";
		stringArray [2][0] = "e";
		stringArray [2][1] = "a";
		stringArray [2][2] = "t";
		System.out.println(sort("salam"));
		System.out.println(sort("aalsm"));
		System.out.println(compareStrings("salam","aalsm"));
	}
	
	public static String sort (String string) {
		char temp;
		char[] arr = string.toCharArray();
		for (int i = 0;i<arr.length;i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp = arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return String.valueOf(arr);
	}
	
	public static boolean compareStrings(String string1, String string2) {
		if (sort(string1).equals(sort(string2))) {
			return true;
		} return false;
	}
}
