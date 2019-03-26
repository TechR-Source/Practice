package interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintArrayListValues {

	 
		
	public static void main(String[] args){
	
	
	
	List<String> list = new ArrayList<String>();
    list.add("First");
    list.add("Second");
    list.add("Third");
    list.add("Fourth");
    // Print the list in console
    System.out.println(list);
    
    Collections.sort(list);
    for (String string : list) {
    	System.out.println(string);
    	
  
    	
		
	}
	
}
	 
	 
}
