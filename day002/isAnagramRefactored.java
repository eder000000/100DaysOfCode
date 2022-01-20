package day002;

import java.util.Arrays;
import java.util.HashMap;

public class isAnagramRefactored {
	static String firstWord = "texttwisttimetime";
	static String secondWord = "timetwisttext";
	static char[] firstCharArray;
	static char[] secondCharArray;
	static HashMap<Character, Integer> container = new HashMap<>();
	
	public static void main(String[] args) {
		
		

		firstCharArray = firstWord.toCharArray();
		secondCharArray=  secondWord.toCharArray();

		System.out.println(isAnagram());
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
	
	
	public static boolean isAnagram() {
		if(firstCharArray.length != secondCharArray.length) {
			return false;
		}
		else {
			 container.putAll(countFrecuencies(firstCharArray));
			 System.out.println(container);
			 for(int i = 0; i < secondCharArray.length; i++) {
					if(!container.containsKey(secondCharArray[i])) {
						return false;
					}
					else
						container.put(secondCharArray[i], container.get(secondCharArray[i]) - 1);
						if(container.get(secondCharArray[i]) < 0){
							return false;
						}
				}
		}
		return true;
	}
}
