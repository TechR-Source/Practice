package javaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class PrintUniqueValues {

	public static void main(String[] args) {

		
		
	ArrayList<String> lstValue = new ArrayList<String>();
		lstValue.add("Test");
		lstValue.add("data");
		lstValue.add("Test");
	
		TreeSet<String> sc = new TreeSet<String>(lstValue);
		
		for (String string : sc) {
			System.out.println(string);
			
		}	
	}
}
