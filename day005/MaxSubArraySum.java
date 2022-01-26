//Write a function which accepts an array of integers
//and a number called n. The function should calculate 
//the maximum sum of n consecutive elements in the array.

package day005;

import java.util.Arrays;

public class MaxSubArraySum {
	
	static int[] givenArray = {1, 2, 5, 2, 8, 1, 5};
	static int numOfElementsToSum = 2;

	
	public static void main(String... args) {
//		System.out.println(maxSubArraySum(givenArray));
		maxSubArraySum(givenArray);
		
	}
	
	public static int maxSubArraySum(int [] array) {
		int maxSum = 0;
		for(int i = 0; i < array.length	- numOfElementsToSum + 1; i++) {
			int sum = 0;
			for(int j = 0; j < numOfElementsToSum; j++) {
				
				sum += array[i + j];
				System.out.println(sum);
				if(maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}
	

}
