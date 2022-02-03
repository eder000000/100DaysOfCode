//Implement a function called countUniqueValues,
//which accepts a sorted array, and counts the
//unique values in the array. There can be
//negative numbers in the array, but it will always
//be sorted.


//O(n)
package day004;

import java.util.Arrays;

public class CountUniqueValues {

	static int[] arrayGiven = {-10, -3, -2, -1, 0, 3, 5, 10 };
	static int numOfUniqueValues = 0;
	
	public static void main(String... args) {
		System.out.println(Arrays.toString(arrayGiven));
		System.out.println(countUniqueValues(arrayGiven));
	}
	
	public static int countUniqueValues(int[] array) {
		if(array.length == 0) {
			return numOfUniqueValues;
		}
		//Multiple pointers
		for(int i = 1; i < array.length; i++) {
			if(array[numOfUniqueValues] != array[i]) {
				numOfUniqueValues++;
				array[numOfUniqueValues] = array[i];
			}
		}
		return numOfUniqueValues + 1;
	}
}
