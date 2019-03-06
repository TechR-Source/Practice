package udemy;

public class Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  
		 //Find the mininmum number
		  
		int arr[][] = {{3,4,5}, {5,2,7}, {7,8,9}};
		
		int min = arr[2][0];
		
		for (int i = 0; i < min; i++) {
			for (int j = 0; j < min; j++) {
				if (arr[i][j]<min) {
					
					min=arr[i][j];
					System.out.println(min);
					
				}
				
			}
			
		}
		
		
			
		}
}