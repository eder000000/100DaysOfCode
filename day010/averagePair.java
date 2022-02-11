//Write a function called averagePair. Given a sorted array of integers and target average,
//determine if there is a pair of values in the array where the average of
//the pair equals the target average. There may be more than one pair that matched the average target.

package day010;

public class averagePair {
	
	public static void main(String[] args) {
		double [] givenArray = {1, 3, 3, 5, 6, 7, 10, 12, 19};
		double target = 8;
		
		System.out.println(isAveragePair(givenArray, target));
	}
	
	public static boolean isAveragePair(double[] givenArray, double target) {
		int start = 0;
		int end = givenArray.length -1;
		while(start < end) {
			double avg = (givenArray[start] + givenArray[end]) / 2;
			if(avg == target) {
				return true;
			} else if(avg < target){
				start++;
			}else {
				end--;
			}
		}
		return false;
	}
}
