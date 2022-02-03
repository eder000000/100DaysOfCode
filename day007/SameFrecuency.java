package day007;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a function called sameFrecuency. Given two positive 
//integers, find out if the two numbers have the same
//frecuency.

public class SameFrecuency {	
	public static void main(String[] args) {
		System.out.println("Change int to String");
		System.out.println(sameFrecuency(182, 821));
		System.out.println(sameFrecuency(34, 14));
		System.out.println(sameFrecuency(3589578, 5879385));
		System.out.println(sameFrecuency(22, 222));
		
		System.out.println("Working with int");
		System.out.println(sameFrecuencyAltern(182, 821));
		System.out.println(sameFrecuencyAltern(34, 14));
		System.out.println(sameFrecuencyAltern(3589578, 5879385));
		System.out.println(sameFrecuencyAltern(22, 222));
	}
	
	public static boolean sameFrecuency(int firstNumber, int secondNumber ) {
		//Chnge int to String
		String firstNumberString = Integer.toString(firstNumber);
		String secondNumberString = Integer.toString(secondNumber);
	    int[] firstScoreBoard = new int[10];
		int[] secondScoreBoard = new int[10];
		
		
		//if numbers lenght are different the return false
		if(firstNumberString.length() != secondNumberString.length()) {
			return false;
		}
		
		//add 1 to index represented by digit
		for(int i = 0; i < firstNumberString.length(); i++) {
			firstScoreBoard[Character.getNumericValue(firstNumberString.charAt(i))] += 1; 
					
		}
		
		for(int j = 0; j < firstNumberString.length(); j++) {
			secondScoreBoard[Character.getNumericValue(secondNumberString.charAt(j))] += 1;
		}
		
		//check if two arrays are equals
		for(int index : firstScoreBoard) {
			if(firstScoreBoard[index] != secondScoreBoard[index]) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static boolean sameFrecuencyAltern(int firstNumber, int secondNumber) {
		int[] firstScoreBoardAltern = new int[10];
		int[] secondScoreBoardAltern = new int[10];
		
		while(firstNumber > 0) {
			firstScoreBoardAltern[firstNumber % 10] += 1; 
			firstNumber /= 10;
		}
		
		while(secondNumber > 0) {
			secondScoreBoardAltern[secondNumber % 10] += 1;
			secondNumber /= 10;
		}
		
		for(int item : firstScoreBoardAltern) {
			if(firstScoreBoardAltern[item] != secondScoreBoardAltern[item]) {
				return false;
			}
		}
		return true;
	}
}
