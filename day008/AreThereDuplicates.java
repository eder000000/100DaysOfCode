//Implement a function code which accepts a variable number of integer arguments
//and checks  there are any duplicates among the arguments passed in.


package day008;

public class AreThereDuplicates {

	public static void main(String[] args) {

		System.out.println(areThereDuplicates(3, 3, 1, 0, 9));
	
	}
	
	public static boolean areThereDuplicates(Integer... args) {		
		for(int i = 0; i <= args.length; i++) {
			int pointer = 1;
			if(args[i] == args[pointer]) {
				return true;
			}
			pointer++;
		}
		return false;
	}
}
