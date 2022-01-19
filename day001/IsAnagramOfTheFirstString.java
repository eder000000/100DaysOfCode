//Given two strings, write a function to determine if the second string 
//is an anagram of the first. An anagram is a word, phrase or name formed
// by rearranging the letters of another, such as cinema, formed iceman.

package day001;

import java.util.HashMap;

public class IsAnagramOfTheFirstString {
	static String firstWord = "sergio";
	static String secondWord = "riesgo";
	static HashMap <Character, Integer> firstContainer = new HashMap<>();
	static HashMap <Character, Integer> secondContainer= new HashMap<>();
	static HashMap<Character, Integer> container = new HashMap<>();

	public static void main(String[] args) {
		
		char[] firstCharArray = firstWord.toCharArray();
		char[] secondCharArray = secondWord.toCharArray();
		

		firstContainer.putAll(countingFrecuencies(firstCharArray));
		secondContainer.putAll(countingFrecuencies(secondCharArray));
		
		System.out.println(firstContainer);
		System.out.println(secondContainer);

		System.out.println(isAnagram());
	}
	
	public static boolean isAnagram() {
		if(firstContainer.size() != secondContainer.size()) {
			return false;
		} 
		else if((firstContainer == null) || (secondContainer == null)) {
			return false;
		} 
		else {
			for(Character item : firstContainer.keySet()) {
				if(!firstContainer.get(item).equals(secondContainer.get(item))) {
					return false;
				}
			}
			for(Character item : secondContainer.keySet()) {
				if(!secondContainer.get(item).equals(firstContainer.get(item))) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static HashMap<Character, Integer> countingFrecuencies(char[] charArray){
		container.clear();
		for(int i = 0; i < charArray.length; i++) {
			if(container.containsKey(charArray[i])) {
				container.put(charArray[i], container.get(charArray[i]) + 1);
			} else {
				container.put(charArray[i], 1);
			}
		}
		return container;
	}
}
