package javaPrograms;

public class MostRepCharAndInt {

	public static void main(String[] args) {

		
		
		//Integer:
		
		int arr[] = {1,2,3,4,1,5,6,1};
		int element=0;
		int count=0;
		int tempElement;
		int tempCount=0;
		
		for (int i = 0; i < arr.length; i++) {
			 tempElement = arr[i];
			
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[j]==tempElement){
					tempCount++;
					
				if (tempCount>count) {
					element = tempElement;
					count = tempCount;
					System.out.println(element);
					
				}
				
				}
				
			}
			
		
		
			
		}
		
		//String
		/*
		String arr[] = {"Test", "Data", "Test", " App", "Web", "Data"};
		String element=" ";
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			String tempElement = arr[i];
			int tempCount=0;
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[j]==tempElement){
					tempCount++;
					
				if (tempCount>count) {
					element = tempElement;
					count = tempCount;
					System.out.println(element);
				}
			
				}}
		}*/
	}
}
	
