package day007;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a function called sameFrecuency. Given two positive 
//integers, find out if the two numbers have the same
//frecuency.

public class SameFrecuency {
	
	public static void main(String[] args) {
		
		System.out.println(sameFrecuency(182, 281));
		System.out.println(sameFrecuency(34, 14));
		System.out.println(sameFrecuency(3589578, 5879385));
		System.out.println(sameFrecuency(22, 222));
		}
	
	public static boolean sameFrecuency(int num1, int num2) {
		//change int type to string type
		String numOneToString = Integer.toString(num1);
		String numTwoToString = Integer.toString(num2);
		//declare two arrays that will hold counts for each digit
	    int[] counterOne = new int[10];
	    int[] counterTwo = new int[10];
		
		System.out.println(numOneToString);
		System.out.println(numTwoToString);
		
		//if numbers are different length then is false
		if(numOneToString.length() != numTwoToString.length()) {
			return false;
		}
	
		//add 1 to each digit represented as index in the array (scoreboard)
		for(int i = 0; i < numOneToString.length(); i++) {
			//change from String to int
			counterOne[Character.getNumericValue(numOneToString.charAt(i))] += 1;
		}
		
		for(int j = 0; j < numOneToString.length(); j++) {
			counterTwo[Character.getNumericValue(numTwoToString.charAt(j))] += 1;
		}
		
//		System.out.println(Arrays.toString(counterOne));
//		System.out.println(Arrays.toString(counterTwo));
		
		//check if both arrays have the same values
		for(int key : counterOne) {
			if(counterOne[key] != counterTwo[key]) {
				return false;
			}
		}
		return true;
	}
}
