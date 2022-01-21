//Write a function called sumZero which accepts a sorted
//array of integers. The function should find the first pair
//where the sum is 0. Return an array that includes both
//values that sum to zero or undefined if a pair does not exist.

package day003;

import java.util.Arrays;

public class sumZero {
	static int[] arrayOfIntegers = { -10, -5,  -3, -2, -1, 0, 4,  6, 7, 9};
	static int[] result = {0, 0};
	
	public static void main(String[] args) {

		System.out.println(Arrays.toString(getSumZero(arrayOfIntegers)));
	}
//	O(N^2)
//	public static int[] getSumZero(int[] theArray){
//		for(int i = 0; i < theArray.length; i ++ ) {
//			for(int j = i + 1; j < theArray.length; j ++) {
//				if(theArray[i] + theArray[j] == 0) {
//					result[0] =  theArray[i];
//					result[1] =  theArray[j];
//					return result;
//				}
//			}
//		}
//		return result;
//	}
	
// O(N)
	public static int[] getSumZero(int[] theArray) {
		int indexCount = 0;
		int indexLast = theArray.length - 1;
		int sum;		
		while(indexCount < indexLast) {
			sum = theArray[indexCount] + theArray[indexLast];
			if(sum == 0) {
				result[0] = theArray[indexCount];
				result[1] = theArray[indexLast];
				return result;
			} else if(sum > 0) {
				indexLast--;
			} else {
				indexCount++;
			}
		}
		return result;
	}
}
