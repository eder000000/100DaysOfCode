//Build a function that returns an array of integers from n to 1 where n>0.
package day009;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedSequence {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter integer number ");
		int num = scan.nextInt();
		try {
			if(num < 1) {
				 throw new Exception("Invalid input");
			}
			System.out.println(num);
			System.out.println(Arrays.toString(reverse(num)));
			
		}
			catch (Exception e){
				System.out.println(" Number must be greather than 0.");
			} 
	}
	
	public static int[] reverse(int num) {
		int[] array = new int[num];
//		int counter = 0;
		
//		for(int i = num ; i > 0; i--) {
//			array[counter] = num;
//			counter++;
//			num--;
//		}

		//No need for temp variables
		for(int i = 0; i < array.length; i++) {
			array[i] = array.length - i;
		}
		
		return array;
	}
}
