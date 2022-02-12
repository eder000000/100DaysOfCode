//Write a function called isSubsequence which takes in two strings and checks whether the
//characters in the first string form a subsequence of the characters in the second string.
//In other words, the function should check whether the characters in the first string appear
//in the second string, without the order changing.

package day011;

import java.util.InputMismatchException;

public class Subsequence {
	static String firstString = "";
	static String secondString = "abracadabra";

	public static void main(String[] args) {
		
			System.out.println(isSubsequence(firstString, secondString));
			
	
		
	}
	
	public static boolean isSubsequence(String firstString, String secondString) {
		int firstPointer = 0;
		int secondPointer = 0;
		int counter = 0;
		
		if(firstString.length() == 0 || secondString.length() == 0) {
			return false;
		}
		
		while(firstPointer < secondString.length()) {
			if(secondString.charAt(firstPointer) == firstString.charAt(secondPointer)) {
				counter ++;
				firstPointer ++;
				secondPointer ++;
			} else {
				firstPointer ++;
				counter --;
			}
			if(counter > 1) {
				return true;
			}
		}
		return false;
	}
}
