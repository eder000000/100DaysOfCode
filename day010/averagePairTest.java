package day010;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class averagePairTest {
	double [] givenArraySetTestOne = {1, 3, 3, 5, 6, 7, 10, 12, 19};
	double targetSetTestOne = 8;
	double [] givenArraySetTestTwo = {1, 2, 3};
	double targetSetTestTwo = 2.5;
	double [] givenArraySetTestThree = {-1, 0, 3, 4, 5, 6};
	double targetSetTestThree = 4.1;
	double [] givenArraySetTestFour = {};
	double targetSetTestFour = 4;

	@Test
	void testIsAveragePairOne() {
		assertEquals(true, averagePair.isAveragePair(givenArraySetTestOne, targetSetTestOne));
		assertEquals(true, averagePair.isAveragePair(givenArraySetTestTwo, targetSetTestTwo));
	}
	
	@Test
	void testIsAveragePairNegative() {
		assertEquals(false, averagePair.isAveragePair(givenArraySetTestThree, targetSetTestThree));
	}
	
	@Test
	void testIsAveragePairNull() {
		assertEquals(false, averagePair.isAveragePair(givenArraySetTestFour, targetSetTestFour));
	}
}
