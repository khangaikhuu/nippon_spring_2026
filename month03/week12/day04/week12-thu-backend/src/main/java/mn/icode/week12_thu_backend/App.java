package mn.icode.week12_thu_backend;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Integer> numbersArrayList = new ArrayList<Integer>();
    	
//    	Add 5 numbers into the array list
    	numbersArrayList.add(1);
    	numbersArrayList.add(1);
    	numbersArrayList.add(1);
    	numbersArrayList.add(1);
    	numbersArrayList.add(1);
    	
//    	replace the number of 0-th index element with -100
    	
    	numbersArrayList.set(0, -100);
    	
    	
//    	Add 10 to index 3 of the array list
    	numbersArrayList.add(2, 10);
    	
    	
//    	Delete the last element of the array list
    	numbersArrayList.remove(numbersArrayList.size()-1);
    	
    	
//    	using loops to print out all the elements of the array list
    	for (int i = 0; i < numbersArrayList.size(); i++) {
			System.out.println(numbersArrayList.get(i));
		}
    }
}
