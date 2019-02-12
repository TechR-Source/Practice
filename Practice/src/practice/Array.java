package practice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int cnt = 0;
		
		int array[] = new int[5];
		
		for (int i = 0; i <=5; i++) {
			cnt=cnt+1;
			System.out.print(cnt);
			
		}*/
		
	//-------------------------------------------------------------------------------------------------	
		
		
		/*int array[][] = new int[2][3];
	
		array[0][0]=1;
		array[0][1]=2;
		array[0][2]=3;
		//array[0][3]=4;
		System.out.println(array[0][1]);*/
				
		
//--------------------------------------------------------------------------------------------------------
		
		//int arrayq[] = {1,2,3,4};
		
		String data[] = new String[2];
		
		data[0]="Rajesh";
		data[1]="Kumar";
		

		System.out.println(data[0]);
		
		String datae[] = {"Rajesh", "KUmar"}; 
		System.out.println(datae[1]);
		
	//------------------------------------------------------------------------------------------------------	
		/*
		String[] arrData = {"Rajesh","Kumar","Kamali","Ramanah","Kishore","Monisha"};
		for (int i=0; i < arrData.length; i++){
		System.out.println(""+arrData[i]);
		
		}
		
		
		for (String strData : arrData) {
			System.out.println(strData);
			System.out.println(strData.length()); //To find the length of each and every individually 
			
		}*/
		
		String[] str = {"testing", "data"};
		
		for(String valData:str){
			System.out.println(valData);
			System.out.println(valData.length());
		}
		
	
		
		String strV = "imfindingthelength";
		System.out.println(strV);
		System.out.println(strV.length());
				
		
		
		
	}
}
