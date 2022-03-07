/*
 * Write a function called findLongestSubstring, which accepts a string
 * and returns the length of the longest substring with all distinct characters
 */

package day014;

public class LongestSubString {
	static String word ="rithmschool";
	
	public static void main(String[] args) {
		System.out.println(findLongestSubstring(word));
	}
	
	public static int findLongestSubstring(String word) {
		String test = "";
		int maxLenght = Integer.MIN_VALUE;
		
		if(word.isEmpty()) {
			return 0;
		} else if(word.length() == 1) {
			return 1;
		}
		
		for(char c : word.toCharArray()) {
			String current = String.valueOf(c);
			
			if(test.contains(current)) {
				test = test.substring(test.indexOf(current) + 1);
			}
			
			test = test + String.valueOf(c);
			maxLenght = Math.max(test.length(), maxLenght);
		}
		return maxLenght;
	}	
}
