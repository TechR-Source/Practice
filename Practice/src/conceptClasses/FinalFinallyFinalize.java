package conceptClasses;

public class FinalFinallyFinalize {
	
	
	
	/*
	 
	 1. Final:
	 
	 		Final is a keyword.

			Final is used to apply restrictions on class, method and variable. Final class can't be inherited, 
	   		final method can't be overridden and final variable value can't be changed.
	   
	   		
	   		
	   		class FinalExample{  
			public static void main(String[] args){  
			final int x=100;  
			x=200;//Compile Time Error  
			}}  

	   			
	   		
	  2. finally
	  
	  		Finally is a block.
	  		Finally is used to place important code, it will be executed whether exception is handled or not.
	  		
	  		
	  		
	  		class FinallyExample{  
			public static void main(String[] args){  
			try{  
			int x=300;  
			}catch(Exception e){System.out.println(e);}  
			finally{System.out.println("finally block is executed");}  
			}}  
	  		
	  		
	  3. finalize
	  
	  		Finalize is a method.
	  		Finalize is used to perform clean up processing just before object is garbage collected.
	  			 
	 
	 
	 	class FinalizeExample{  
		public void finalize(){System.out.println("finalize called");}  
		public static void main(String[] args){  
		FinalizeExample f1=new FinalizeExample();  
		FinalizeExample f2=new FinalizeExample();  
		f1=null;  
		f2=null;  
		System.gc();  
		}}  
	 
	 */

	
	
	
}
