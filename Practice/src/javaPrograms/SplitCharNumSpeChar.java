package javaPrograms;

public class SplitCharNumSpeChar {

	public static void main(String[] args) {   
    
       String str = "geeZks0#1$$f*or02gee9ks03!@!!"; 
       splitString(str); 

}
		static void splitString(String str) 
	    {
		         
		String alpha="";
		String num = "";	
		String special="";
		
		  for (int i=0; i<str.length(); i++) 
		        { 
		        	char ch = str.charAt(i);
		            if (Character.isDigit(ch)){ 
		               num=num+ch;
		            } else if(Character.isAlphabetic(ch)) {
		        	alpha=alpha+ch;
		            }   else{
		            	special = special+ch;
		        } }
		       
		        System.out.println("Alphabers are = "+alpha); 
		        String strAlp = alpha;
		        int cnt = strAlp.length();
		        String temp=" ";
		        for (int i = 0; i < cnt; i++) {
		        	 temp=temp+strAlp.charAt(i);
		        	 
					
				}
		     
		        
		        
		        String strArray[] = strAlp.split(" ");
		        for (int i = 0; i < strArray.length; i++) {
		        	System.out.println(strArray[i]);
					
				}
		        
		        
		        System.out.println("Numbers are = "+num); 
		    
		        
		        System.out.println("Special Characters are = "+special); 
		    } 
		      
		   
}


