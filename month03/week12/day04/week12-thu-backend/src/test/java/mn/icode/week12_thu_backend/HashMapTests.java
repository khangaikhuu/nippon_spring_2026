package mn.icode.week12_thu_backend;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;


public class HashMapTests {
	
	
	@Test
	public void testBasicPutAndGet() {
		Map<String, Integer> studentGrades = new HashMap<String, Integer>();
//		Khangaikhuu | 90
//		Nora	    | 100
//		Khishgee	| 100
		Map<String, String> dictionary = new HashMap<String, String>();
		
		studentGrades.put("Alice", 95);
		studentGrades.put("Bob", 82);
		
		
//		retrieving data 
		
		int aliceGrade = studentGrades.get("Alice");
		
		assertEquals(95, aliceGrade, "Alice's grade should be 95");
		assertNull(studentGrades.get("Charlie"), "Charlie's Grade is not included");
	}
	
	@Test
	public void testCheckExistence() {
		Map<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("France", "Paris");
		capitalCities.put("Japan", "Tokyo");
		
//		Assertions for keys
		assertTrue(capitalCities.containsKey("Japan"));
		assertFalse(capitalCities.containsKey("Germany"));
		
//		Assertions for value
		assertTrue(capitalCities.containsValue("Paris"));
	}
	
	@Test
	public void testRemoveItem() {
		Map<Integer, String> employeeNames = new HashMap<Integer, String>();
		
		employeeNames.put(101, "Sarah");
		employeeNames.put(102, "John");
		
//		remove employee 101
		String removeEmployee = employeeNames.remove(101);
//		Assertions
		assertEquals("Sarah", removeEmployee);
		assertFalse(employeeNames.containsKey(101));
		assertEquals(1,  employeeNames.size());
	}
	
	@Test
	public void testUpdateExistingValue() {
		Map<String, Double> productPrices = new HashMap<String, Double>();
		productPrices.put("Coffee", 3.99);
		productPrices.put("Tea", 2.49);
		
//		Coffee prices increase
		productPrices.put("Coffee", 4.50); // overwrites the 3.99
		
		assertEquals(4.50, productPrices.get("Coffee"));
		assertEquals(2, productPrices.size());
	}
	
	@Test
	public void testSizeAndClear() {
		Map<String, Integer> inventory = new HashMap<String, Integer>();
		inventory.put("Apples", 50);
		inventory.put("Oranges", 30);
		inventory.put("Bananas", 20);
		
//		Verify size
		assertEquals(3, inventory.size());
		assertFalse(inventory.isEmpty());
		
//		Clear the map
		inventory.clear();
		
//		Assertions after clearing
		assertEquals(0, inventory.size());
		assertTrue(inventory.isEmpty());
	}
	
	@Test
	public void testLoopingOverValuesToSum() {
		Map<String, Integer> shoppingCart = new HashMap<String, Integer>();
		shoppingCart.put("Apple", 2);
		shoppingCart.put("Bread", 3);
		shoppingCart.put("Milk", 4);
		
		int totalCost = 0;
		for (int price: shoppingCart.values()) {
			totalCost += price;
		}
		
		assertEquals(9, totalCost);
	}
	
	@Test
	public void testLoopingOverKeysToFindMatches() {
		Map<String, String> userRoles = new HashMap<String, String>();
		userRoles.put("alice_smith", "Admin");
		userRoles.put("bob_jones", "User");
		userRoles.put("charlie_smith", "User");
		int smithCount = 0;
//		Loop through just the keys
		for (String username: userRoles.keySet()) {
			if(username.endsWith("_smith")) {
				smithCount++;
			}
		}
		assertEquals(2, smithCount);
	}
	
	@Test
	public void testLoopingOverEntriesToFilterData() {
		Map<String, Integer> studentScores = new HashMap<String, Integer>();
		studentScores.put("Nora", 85);
		studentScores.put("Khishgee", 92);
		studentScores.put("Myangaa", 78);
		
		String topStudent = "";
		int highestScore = 0;
//		Loop through both keys and values at the same time
		for (Map.Entry<String,  Integer> entry: studentScores.entrySet()) {
			if(entry.getValue() > highestScore) {
				highestScore = entry.getValue();
				topStudent = entry.getKey();
			}
		}
		
		assertEquals("Khishgee", topStudent);
		assertEquals(92, highestScore);
	}
	
	
	
	
	
}
