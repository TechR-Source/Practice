package practice;

public class StringToInteger {

	public static void main(String[] args) {

	/*	  String strTest = "123";
		    //This statement results in a compilation error as you
		    //cannot do arithmetic operation on Strings
		    //System.out.println("Using String:" + (strTest/4));
		    //Convert the String to Integer
		   
		  int iTest = Integer.parseInt(strTest);
		    System.out.println("Actual String:"+ strTest);
		    System.out.println("Converted to Int:" + iTest);
		    //This will now show some arithmetic operation
		  
		    System.out.println("Arithmetic Operation on Int:" + (iTest/4));
		  }
		*/
		
//---------------------------------------------------------------------------------------------------
		String dt = "12345";
		
		int d = Integer.parseInt(dt);
		System.out.println("Actual string is = "+dt);
		System.out.println("After string to integer ="+d);
		
		
		String ad = Integer.toString(d);
		System.out.println("\ninteger is ="+d);
		System.out.println("\nAfter interget to string ="+ad);
//		----------------------------------------------------------------------------------------
		
		/*String data = "Rajesh";
		
		System.out.println(data.intern());
		
		
		
	}*/
}}