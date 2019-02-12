package javaPrograms;

public class NoOfWords {
	
	public static void main(String[] args) {

		
		String str = "Number of Words Found";
		String[] words = str.split(" ");
		System.out.println(words.length);
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
			
		}
		
		System.out.println("*******************************");
		
		String strWor = "This, is, the, alternate, way";
			String[] splWor = strWor.split(",");
			for(int i=0; i<splWor.length; i++){
				System.out.println(splWor[i]);
			}
			
		
	}

}
