package day012;

public class MaxSubArraySum {

	static int[] givenArray = {1, 4, 2, 10, 23, 3, 1, 0, 20};
	static int range = 4;
	public static void main(String[] args) {
		
		System.out.println(maxSubArraySum(givenArray, range));
		
	}
	
	public static int maxSubArraySum(int[] givenArray, int range) {
		int currentTotal = 0;
		int total = 0;
			
			for(int i = 0; i < range; i++) {
				total += givenArray[i];
			}
			currentTotal = total;
			
			for(int i = range; i < givenArray.length; i ++) {
				currentTotal += givenArray[i] - givenArray[i - range];
				total = Math.max(total, currentTotal);	
			}
		return total;
	}
}
