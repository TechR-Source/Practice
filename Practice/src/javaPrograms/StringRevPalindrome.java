package javaPrograms;

public class StringRevPalindrome {

	public static void main(String[] args) {

		String str = "Malayalam";
		int cnt = str.length();
		String strDemo ="";
		
		for(int i=cnt-1; i>=0; i--){
		strDemo = strDemo+str.charAt(i);		//charAt(int index) method returns the character at the specified index 
		System.out.println(strDemo);
		}

		if (str.equalsIgnoreCase(strDemo)){
		System.out.println("Given string is palindrome");
		} else {
		System.out.println("Given string is not palindrome");
	
		
		
		}
		
	}
}


//Reverse Integer:

/*
		int n=12345, reverse=0;
		
		 while(n != 0)
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	          System.out.println(reverse);
	      }
*/