package mn.icode;

public class BinarySearch {
	private int[] numbers;

	public BinarySearch(int[] numbers) {
		this.numbers = numbers;
	}

	public int binarySearch(int target) {

		int left = 0;
		int right = numbers.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (numbers[mid] == target) {
				return mid;
			} else if (numbers[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
}
