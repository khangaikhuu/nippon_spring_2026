package mn.icode.week12_tue_backend;

import java.util.ArrayList;

public class ArrayListExample {
	
	private ArrayList<String> fruits = new ArrayList<String>();
	
	public void addFruits() {
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Kiwi");
		fruits.add("Orange");
		fruits.add(0, "Melon");
	}
	
	public int getListLength() {
		return fruits.size();
	}
	
	public String getFruitByIndex(int index) {
		return fruits.get(index);
	}
	
	public boolean isFruitExists(String fruitName) {
		return fruits.contains(fruitName);
	}
	
	public boolean isListEmpty() {
		return fruits.isEmpty();
	}
	
	public void changeFruit(String newFruit, int index) {
		fruits.set(index, newFruit);
	}
	
	public void deleteFruitByIndex(int index) {
		fruits.remove(index);
	}
}
