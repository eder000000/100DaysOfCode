/*
 * You are given an integer array height of length n. 
 * There are n vertical lines drawn such that the two endpoints 
 * of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, 
such that the container contains the most water.

Return the maximum amount of water a container can store.
 */

package day015;

public class ContainerWithMostWater {
	static int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
	static int arraySize = height.length;
	
	public static void main(String[] args) {
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
		int start = 0;
		int end = arraySize - 1;
		int result = Integer.MIN_VALUE;

		
		if(height.length == 1) {
			return 0;
		}
		
		while(start < end) {
			result = Math.max((end - start) * Math.min(height[start], height[end]), result);

//			System.out.println(height[start] + " " + (height[end]));
//			System.out.println("Array size: " + end);
//			System.out.println("Result: " + result);
				
			if(height[start] < height[end]) {
				start++;
			} else {
				end--;
			}
		}
		return result;
	}
}
