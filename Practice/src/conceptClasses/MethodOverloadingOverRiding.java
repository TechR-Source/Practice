package conceptClasses;


//Method OverRiding - When there are 2 methods in the same name and also same arguments with the different class is called overriding (Run time polymorphism)

// the method will execute for the object of class b in this program (this is called as dynamic binding in java)

 class A{
	 void display() {
		System.out.println("We are in class A");
	}
}

 
 class B extends A{
	  void display(){
		 System.out.println("We are in class B");
	 }	 
 }
 


public class MethodOverloadingOverRiding {

	public static void main(String[] args) {

		B obj = new B();							//It refers the latest class methods which means inheritated class
		obj.display();
		
		A objA = new A();
		objA.display();
		
		
	}

}


//Method OverLoading - When there are more than one method in a same name with the different argument in a same class is called Method Overloading ( Compile time polymorphism)
class movrload{
	
	void method1(int a){
		
	}
	
	void method1(int a, String str){
		
	}
	
	
	void method1(int a, int b){
		
	}




public static void main(String[] args){
	
	movrload mol = new movrload();
	mol.method1(12);
	mol.method1(1, "test");
	mol.method1(2, 4);
	
}

}
