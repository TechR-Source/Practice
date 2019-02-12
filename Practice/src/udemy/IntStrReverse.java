package udemy;

public class IntStrReverse {

	public static void main(String[] args) {
		
		
		String str = "Malayalam";
		int len = str.length();
		String strDum = "";
		
		for(int i=len-1; i>=0; i--){
			strDum = strDum+str.charAt(i);   //charAt method brings the values/character which is present in the index
			System.out.println(strDum);
		}
		
		if (str.equalsIgnoreCase(strDum)) {
			System.out.println("This is palindrome"+" "+strDum);
		}else {
			System.out.println("This is not palindrome");
		}

	
		  String str2="My Name is John";
		  
	        String[] words = str2.trim().split(" ");
	 
	        System.out.println("Number of words in the string = "+words.length);
	        System.out.println("Words are:");
	        for (int i = 0; i < words.length; i++) {
				System.out.println(words[i]);
			}
	    
	
	        int a = 125, r=0, s=0;
	        
	        while(a!=0){
	        r = a%10;
	        a = a/10;
	        s = s + r*r*r;
	        }
	        if(s==a){
	        System.out.println("Number  is an armstrong number.");
	        }else{
	        System.out.println("Number is not an armstrong number.");
	        
	        
	        }
	        
	        
	
	
	}
	
}