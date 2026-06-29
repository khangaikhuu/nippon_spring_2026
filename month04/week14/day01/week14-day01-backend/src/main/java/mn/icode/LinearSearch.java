package mn.icode;

public class LinearSearch {
	private int[] numbers;

	public LinearSearch(int[] numbers) {
		this.numbers = numbers;
	}

	public int linearSearch(int target) {
		int foundIndex = -1;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == target) {
				return i;
			}
		}
		
		return foundIndex;
	}
}
