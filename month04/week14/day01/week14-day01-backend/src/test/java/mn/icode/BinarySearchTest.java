package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	@Test
	public void binarSearchTest() {
		int[] sortedList = {1, 3, 5, 7, 9, 11, 13, 15};
		BinarySearch binarySearch = new BinarySearch(sortedList);
		
		Assertions.assertEquals(4, binarySearch.binarySearch(9));
		Assertions.assertEquals(7, binarySearch.binarySearch(15));
		Assertions.assertEquals(-1, binarySearch.binarySearch(0));
		// step 1, target = 16
		// left =0, right = 7
		// left <= right => true
		// mid = 0 + (7 - 0)/2 = 4
		// numbers[4]= 9 
		// 9 < 16
		// left = 4 + 1 = 5, right = 7, mid = 4
		// 4 < 7
		// mid = 4 + (7 - 4)/2 = 5
		// numbers[5] = 11
		// 11 < 16
		// left = 5 + 1 = 6, right = 7, mid = 5
		// mid = 6 + (7 - 6)/ 2 = 6
		// 13 < 16
		// mid = 6 + (7 - 6)/2 = 7
		// 15 == 15 => 7
	}
}
