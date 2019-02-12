package javaPrograms;

public class PrimeOrNot {

	public static void main(String[] args) {

		int remainder;
		  boolean isPrime=true;
		  int numberToCheck=19; 
		        
		  
		  for(int i=2;i<=numberToCheck/2;i++)
		  {
		            remainder=numberToCheck%i;
		            System.out.println(numberToCheck+" Divided by "+ i + " gives a remainder "+remainder);
		       
		     if(remainder==0)
		     {
		        isPrime=false;
		        break;
		     }
		  }
		  
		  if(isPrime)
		     System.out.println(numberToCheck + " is a Prime numberToCheckber");
		  else
		     System.out.println(numberToCheck + " is not a Prime numberToCheckber");
		    
		 }

}
