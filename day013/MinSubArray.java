/*
 * Write a function called minSubArrayLen which accepts two parameters
 * an array of integers and a positive integer.
 * This function should return the minimal length of a contiguous subarray
 * of which the sum is greater than or equal to the integer passed
 * to the function. If there is not one, return 0 instead. 
 * 
 */

//O(n)
package day013;

public class MinSubArray {
	
	static int[] givenArray = {1, 4, 16, 22, 5, 7, 8, 9, 10};
	static int num = 95;
	
	public static void main(String[] args) {
		System.out.println(givenArray.length);
		System.out.println(minSubArrayLen(givenArray, num));
		
	}
	
	public static int minSubArrayLen(int[] givenArray, int num) {
		
		if((givenArray.length == 0) || (num == 0)) {
			return 0;
		}
		
		int start = 0;
		int end = 0;
		int total = 0;
		double min = Double.POSITIVE_INFINITY;
		
		while(start < givenArray.length) {
			if((total < num) && (end < givenArray.length)) {
				total += givenArray[end];
				end++;
				
				} else if(total >= num){
					min = Math.min(min, (end - start));
					total -= givenArray[start];
					start++;
					
			} else {
				break;
			}
		}
		if(min == Double.POSITIVE_INFINITY) {
			return 0;
		} 
		return (int) min ;
	}
}
