//Write a function which accepts an array of integers
//and a number called n. The function should calculate 
//the maximum sum of n consecutive elements in the array.

//
package day005;

// O(n^2)
public class MaxSubArraySum {
	
	static int[] givenArray = {4, 2, 1, 6, 2};
	static int numOfElementsToSum = 4;

	
	public static void main(String... args) {
		System.out.println(maxSubArraySum(givenArray));		
	}
	
	public static int maxSubArraySum(int [] array) {
		int maxSum = 0;
		if(array.length == 0) {
			return maxSum;
		}
		for(int i = 0; i < array.length	- numOfElementsToSum + 1; i++) {
			int sum = 0;
			for(int j = 0; j < numOfElementsToSum; j++) {
				sum += array[i + j];
				if(maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}
}
