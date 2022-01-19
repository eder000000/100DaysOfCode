package day002;

import java.util.Arrays;
import java.util.HashMap;

public class isAnagramRefactored {
	static String firstWord = "texttwisttime";
	static String secondWord = "timetwisttext";
	static HashMap<Character, Integer> container = new HashMap<>();
	
	public static void main(String[] args) {
		char[] firstCharArray = firstWord.toCharArray();
		char[] secondCharArray = secondWord.toCharArray();
		
		container.putAll(countFrecuencies(firstCharArray));
		System.out.println(container);
		System.out.println(isAnagram(secondCharArray));
		System.out.println(container);
	}
	
	public static HashMap<Character, Integer> countFrecuencies(char[] array){
		container.clear();
		for(int i = 0; i < array.length; i++) {
			if(container.containsKey(array[i])) {
				container.put(array[i], container.get(array[i]) + 1);
			}
			else {
				container.put(array[i], 1);
			}
		}
		return container;
	}
	
	public static boolean isAnagram(char[] array) {
		for(int i = 0; i < array.length; i++) {
			if(!container.containsKey(array[i])) {
				return false;
			}
			else
				container.put(array[i], container.get(array[i]) - 1);
				if(container.get(array[i]) < 0){
					return false;
				}
		}
		return true;
	}
}
