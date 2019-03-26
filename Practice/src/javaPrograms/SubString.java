package javaPrograms;

import org.testng.annotations.Test;

public class SubString {
	
	

	public static void main(String[] args) {

		String str = "www.google.com/manual/Automation";
		System.out.println(str.substring(str.lastIndexOf("/")));  //To print after the last slash 
		System.out.println(str.substring(str.indexOf("/")));  		//To print after the first slash
	
		
	}
	
	

}


	//How does all annotations work in TestNg without main() method?
		
		/*----> This is a valid doubt many testers have. Because the main() method is needed to run the Java program and while writing tests in TestNg 
			we don't use main() method, and we use Annotations instead. Annotations in TestNG are lines of code that can control how the method below them will be executed. So, 
			in short you don't need to write main() method, TestNg do that by itself.*/