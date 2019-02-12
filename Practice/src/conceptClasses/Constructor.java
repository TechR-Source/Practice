package conceptClasses;

	//Constructor - A constructor is called when an object of the class is created by default
	//A constructor is mostly used for initializing the object


	//Syntax:
		/*class_name(){
			//code
		}*/


	//Points to rememeber:
		/*1. Constructor name and the class name are same
		2. No return type in constructor 
		3. A constructor is no parameter is called as "default constructor"
		
				Eg: class Demo(){
						practice(){								//practice() - () this one is "default constructor"
							//code
						}
					}*/



	//Note: What if i create a class without constructor (eg: without this practice() in above code) complier insert one "default constructor"
		
	//Constructor atleast have the one parameter is called as parameterized constructor (Note: We can't call parameterized constructor in the default constructor)



 class demoCon{
	 
	 void practice(){
		 System.out.println("default constructor");
	 }
	 
	void practice(int a){
		System.out.println("constructor with single parameter");
	}

 
 void practice(int a, String str){
	 System.out.println("constructor with multiple parameter");
 }
}
 
 													//When there is more than one methods are having parameter is called constructor overloading (refer above program)

public class Constructor {

	public static void main(String[] args) {

		demoCon dC =  new demoCon();
		dC.practice();
		System.out.println("**********************************************************");
		demoCon pCon = new demoCon();
		pCon.practice(5, "TestData");
		pCon.practice(55);
	}

}
