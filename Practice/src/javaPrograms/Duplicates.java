package javaPrograms;

import java.util.Arrays;

public class Duplicates {

	public static void main(String[] args) {

		
	/*	
		String str = "character";
		  int cnt = 0;
		  char[] inp = str.toCharArray();		//toCharArray() method converts the given string into a sequence of characters
		  
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		    // cnt++;
		     break;
			}
		
	}

}*/	
		
	
System.out.println("***************************************");


 	int[] arrayValue = {5,16,22,28,5,33,37,16,22,10};
	//		String[] arrayValue = {"Rajesh", "Kumar", "Data", "Rajesh"};
			
			Arrays.sort(arrayValue);	
			
			for(int i = 1; i < arrayValue.length; i++) {	
				
				if (arrayValue[i] == arrayValue[i-1]){
					System.out.println("Duplicate Value is = "+arrayValue[i]);
			
				
				}
				
			}	
 
	}}

	