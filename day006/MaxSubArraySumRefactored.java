//Write a function which accepts an array of integers
//and a number called n. The function should calculate 
//the maximum sum of n consecutive elements in the array.

//sliding window pattern
//0(n)
package day006;

public class MaxSubArraySumRefactored {

	static int[] givenArray =  {4, 2, 1, 6, 2};
	static int subArrayItems = 2;
	
	public static void main(String[] args) {
		System.out.println(getMaxSubArraySum(givenArray, subArrayItems));
	}
	
	public static int getMaxSubArraySum(int[]givenArray, int subArrayItems) {
		int tempSum = 0;
		int sumMax = 0;
		
		if(givenArray.length == 0) {
			return sumMax;
		}
		
		for(int i = 0; i < subArrayItems; i++) {
			sumMax += givenArray[i];
		}
		tempSum = sumMax;
		
		for(int i = subArrayItems; i < givenArray.length; i++) {
		tempSum =  tempSum  + givenArray[i] - givenArray[i -subArrayItems];
		sumMax = Math.max(tempSum, sumMax);
		}
		return sumMax;
	}
}
