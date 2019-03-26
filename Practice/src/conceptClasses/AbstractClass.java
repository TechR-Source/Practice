package conceptClasses;

abstract class person{
	int age;
	String name;
	int salary=5000;
	
	public void setData(String name, int age){
		this.name=name;
		this.age=age;
	}

	abstract void display();
	
}


 class teacher extends person{
	 int salary = 4000;
	@Override
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}	
}
 
 class student extends person{
	 int rollNumber=345;	 
	@Override
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollNumber);
	}
	 
	 
 }


public class AbstractClass {
	
	
	//A class that is declared using “abstract” keyword is known as abstract class
	//Abstract keyword can be used with Class and methods.
	//Abstract method has no body
	//We can't create an object of abstract class
	//We can only inherit the abstract class "extends"
	
	//Note: Abstract class can also contain the concrete method(regular method) as well
	//Note: Subclass of an abstract class must override the unimplemented abstract method
	
	//Why we can't create an object of abstract class because of abstract methods are unimplemented that is without definition 
	
	
	
	public static void main(String args[]){
		teacher tea = new teacher();
		student stu = new student();
		tea.setData("Rajesh", 27);
		tea.display();
		stu.setData("kumar", 22);
		stu.display();
	}
	
	
	
	
}
