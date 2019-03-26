package conceptClasses;

	//Constructor - A constructor is called when an object of the class is created by default
	//A constructor is mostly used for initializing the object


	/*
	 
	 When is a constructor called
Every time an object is created using new() keyword, at least one constructor is called. It calls a default constructor.

Note: It is called constructor because it constructs the values at the time of object creation. 
It is not necessary to write a constructor for a class. 
It is because java compiler creates a default constructor if your class doesn't have any.


Q) Does constructor return any value?
Yes, it is the current class instance (You cannot use return type yet it returns a value).
	 
	 
Is constructor inherited?
No, The constructor is not inherited.

Can you make a constructor final?
No, the constructor can't be final.

Can we make constructors static?
As we know that the static context (method, block, or variable) belongs to the class, not the object. Since Constructors are invoked only when the object is created, there is no sense to make the constructors static. However, 
if you try to do so, the compiler will show the compiler error.
	 
	 */


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


	//Constructor is a special type of method that is used to initialize the objects. Constructor is invoked at the time of object creation

/*
 public class testDa{


					 testDa(int a, String xy){

					}
				}
 */



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
