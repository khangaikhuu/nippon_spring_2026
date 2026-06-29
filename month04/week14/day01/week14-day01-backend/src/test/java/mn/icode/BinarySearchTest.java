package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	@Test
	public void binarSearchTest() {
		int[] sortedList = {1, 3, 5, 7, 9, 11, 13, 15};
		BinarySearch binarySearch = new BinarySearch(sortedList);
		
		Assertions.assertEquals(4, binarySearch.binarySearch(9));
		Assertions.assertEquals(-1, binarySearch.binarySearch(16));
	}
}
