package javaPrograms;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

	
		int[] array={1,2,4,6,5,3,0};
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		

		
		/*String[] strArr = {"a", "b", "d", "f","c" };
		Arrays.sort(strArr);
		for (String string : strArr) {
			System.out.println(string);
			
		}*/
		
	
				
		System.out.println("*******************************");
		
		String[] str = {"a", "b", "d", "f","c" };
		Arrays.sort(str);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
			
		}		
		
		}	
	}

