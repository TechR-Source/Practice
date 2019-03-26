package javaPrograms;

public class NumOfOccurance {

	public static void main(String[] args) {

		
		
		String str="malayalam";
		int cnt = 0;

		char chr = 'a';
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==chr){
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
