package javaPrograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the required input =");
		int num = inp.nextInt();
		
		//int i=11;
		
		if (num%2==0) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is odd");
			
		}
		
	}

}
