package day013;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinSubArrayTest {
	int[] testOneArray = {2, 3, 1, 2, 4, 3};
	int testOneNum = 7;
	
	int[] testTwoArray = {2, 1, 6, 5, 4};
	int testTwoNum = 9;
	
	int[] testThreeArray = {3, 1, 7, 11, 2, 9, 8, 21, 62, 33, 19};
	int testThreeNum = 52;
	
	int[] testFourArray = {1, 4, 16, 22, 5, 7, 8, 9, 10};
	int testFourNum = 39;
	
	int[] testFiveArray = {1, 4, 16, 22, 5, 7, 8, 9, 10};
	int testFiveNum = 55;

	int[] testSixArray = {4, 3, 3, 8, 1, 2, 3};
	int testSixNum = 11;
	
	int[] testSevenArray = {1, 4, 16, 22, 5, 7, 8, 9, 10};
	int testSevenNum = 95;
	
	int[] testEigthArray = {0};
	int testEigthNum = 95;
	
	
	@Test
	void testOneLength() {
		assertEquals(1, MinSubArray.minSubArrayLen(testThreeArray, testThreeNum));
	}
	
	@Test
	void testTwoLength() {
		assertEquals(2, MinSubArray.minSubArrayLen(testOneArray, testOneNum));
		assertEquals(2, MinSubArray.minSubArrayLen(testTwoArray, testTwoNum));
		assertEquals(2, MinSubArray.minSubArrayLen(testSixArray, testSixNum));
	}
	
	@Test
	void testThreeLength(){
		assertEquals(3, MinSubArray.minSubArrayLen(testFourArray, testFourNum));
	}
	
	@Test
	void testFiveLength() {
		assertEquals(5, MinSubArray.minSubArrayLen(testFiveArray, testFiveNum));
	}
	
	@Test
	void testZeroLength() {
		assertEquals(0, MinSubArray.minSubArrayLen(testEigthArray, testEigthNum));
	}
	
	@Test
	void testZeroLen() {
		assertEquals(0, MinSubArray.minSubArrayLen(testSevenArray, testSevenNum));
	}

}
