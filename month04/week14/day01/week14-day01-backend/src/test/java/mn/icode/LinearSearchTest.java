package mn.icode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

	@Test
	public void linearSearchTest() {
		int[] numbers = {1, 3, 5, 7, 9, 11, 13};
		LinearSearch linearSearch = new LinearSearch(numbers);
		
		
		Assertions.assertEquals(-1, linearSearch.linearSearch(14));
		Assertions.assertEquals(4, linearSearch.linearSearch(9));
	}

}
