package interview;

public class Variables {

	
	
	static public void main(String[] args){
		
		System.out.println("Test");
	}
}
	

/*
 
 	A variable is a container which holds the value 
 	
 	1. local variable
	2. instance variable
	3. static variable
	
	1) Local Variable
	A variable declared inside the body of the method is called local variable. 
	You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

	A local variable cannot be defined with "static" keyword.
 	
	*************************************************************************************
	
	2) Instance Variable
	A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.

	It is called instance variable because its value is instance specific and is not shared among instances.
		
	*************************************************************************************
	
	3) Static variable
	A variable which is declared as static is called static variable. It cannot be local. 
	You can create a single copy of static variable and share among all the instances of the class.
		
	*************************************************************************************
	
		
	1. What if I write static public void instead of public static void?
		The program compiles and runs correctly because the order of specifiers doesn't matter in Java.

*/