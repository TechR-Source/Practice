package conceptClasses;

public class ExceptionHandling {

	public static void main(String[] args) {

		
		//Error - We can't recover it once it's occurred
		//Exception - We can recover it
		
		
		//try - try will find the exception is the program then throw it to the catch 
		//catch -  Catch will handle it
		//Finally - Whatever happened in the try catch block, finally will execute script  
		
		
		try {
			
			int val = 10/0;
			
			
		} catch (ArithmeticException e) {
			System.out.println("divided by 0 = " + e);
			
			
		}
		
		try{
			int a[]= {000};
			
		} catch(Exception e){
			System.out.println(e);
		}
		
		finally{
			System.out.println("I'm executed");
		}

		
	}

}



 //Throw and Throws:

	
