package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueValues {

	public static void main(String[] args) {

		
		
		
		String[] str = {"test", "data","test"};
		Set<String> setuni = new HashSet<String>();
		for(String x : str) {
		    setuni.add(x);
		}
		for(String x : setuni) {
		    System.out.println(x);
		}
		
		
		
	/*ArrayList<String> lstValue = new ArrayList<String>();
		lstValue.add("Test");
		lstValue.add("data");
		lstValue.add("Test");
	
		TreeSet<String> sc = new TreeSet<String>(lstValue);
		
		for (String string : sc) {
			System.out.println(string);
			
		}*/	
		
		
		int[] numbers = {1, 1, 2, 1, 3, 4, 5};
		Set<Integer> setUniqueNumbers = new LinkedHashSet<Integer>();
		for(int x : numbers) {
		    setUniqueNumbers.add(x);
		}
		for(Integer x : setUniqueNumbers) {
		    System.out.println(x);
		}
		
	}
}
