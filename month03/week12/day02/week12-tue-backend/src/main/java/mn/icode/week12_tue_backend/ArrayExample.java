package mn.icode.week12_tue_backend;

public class ArrayExample {
	
	private int[] myNumbers;
	private int currentIndex;
	
	public ArrayExample() {
		myNumbers = new int[5];
		currentIndex = 0;
	}
	
	public int getLength() {
		return myNumbers.length;
	}
	
	public int getCurrentIndex() {
		return currentIndex;
	}
	
	public void addNumber(int a) {
		if(currentIndex < getLength()) {
			myNumbers[currentIndex] = a;
			currentIndex++;
		}
//		myNumbers = new int[getLength()+1];
	}
	
	// addNumber(5)
	// addNumber(6)
	// [5, 6, ...]
	

}
