package conceptClasses;

public class WrapperClass{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//What is wrapper class/primitive data type:
		
		/*"Wrapper classes are used to convert any data type into an object. The primitive data types are not objects; they do not belong to any class; "
		+ "	they are defined in the language itself. Sometimes,it is required to convert data types into objects in Java language.
			(Java is not 100% of oop because of primitive data types)
			Primitive Data Types:  int, float, char, double, (These are not objects) - so we have a classes for primitive data types we call them as ""Wrapper Class"" 
			(long-Long, boolean-Boolean, char-Character, short-Short, int-Integer)"*/		
	
			int data = 10;
			
			Integer i = new Integer(data);  //This way of converting primitive into object is called as Autoboxing
			//Integer i = new Integer(15);  	  //Even we can pass the values directly 
			System.out.println(i);
				
			int j=i.intValue();				//Getting the primitive value from object is called as Unboxing
			System.out.println(j);			//The intValue() method returns the numeric value represented by this object after conversion to type int.
											
					
		}

}

