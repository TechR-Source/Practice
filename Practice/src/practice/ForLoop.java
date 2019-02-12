package practice;

import java.util.ArrayList;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//For String:
		/*String[] names = {"Rajesh", "Kumar", "Kishore", "Kamali", "Ramanah"}; 
		
		for (String string : names) {
			System.out.println(string);
		}*/
		
//-------------------------------------------------------------------------------------------------------------		
		
		//For integer:
		
		/*int[] val = {1,2,3,4,5};
		int v = val.length;
		System.out.println(v);
		
		for (int i = 0; i <=v; i++) {
			System.out.println(i);
		}
		
		
		for (int i : val) {
			System.out.println(i);
		}*/
	
//-------------------------------------------------------------------------------------------------------------		

		
		//For Collections:
		
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Test");
		lst.add("Data");
		lst.add("Test Data");
		
		for (String string : lst) {
			System.out.println(string);
			
		}

//-------------------------------------------------------------------------------------------------------------		

		
	}

}
