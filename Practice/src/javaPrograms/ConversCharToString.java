package javaPrograms;

import java.util.Arrays;

public class ConversCharToString {

	public static void main(String[] args) {

	//Convert Char To String:
		
	//char myChar = 'g';
		
		//Using toString() method
		//toString method take character parameter and convert string.
		/*String myStr = Character.toString(myChar);

		System.out.println("String is: "+myStr);*/
 
		
		//we can use other method for valueOf()
		 
		/*//valueOf method take character parameter and convert string.
		myStr = String.valueOf(myChar);
		////print string value
		System.out.println("String is: "+myStr);
 */
		
		
		
	
	//Convert String to Char:

		String myStr = "Guru99";

			//find string length using length method.
		int stringLength =myStr.length();

		//for loop start 0 to total length
		for(int i=0; i<stringLength; i++)
		{
	   //chatAt method find Position and convert to character.  
			char myChar1 = myStr.charAt(i);
  
			//print string to character
			System.out.println("Character at "+i+" Position: "+myChar1);
			
			
			}
	
		
		
	}

}
