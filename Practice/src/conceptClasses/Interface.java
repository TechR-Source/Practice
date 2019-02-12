package conceptClasses;

public interface Interface {
	
	
	//Interface are like TODo list:
	
	//Interface looks like a class but it is not a class.An interface can have methods and variables just like the class but 
	//the methods declared in interface are by default abstract(only method signature, no body, see: Java abstract method).
	
	//Note: We can't create a concrete method(Regular method) in interface
	//Note: We can't create an object of an interface
	//Note: All variables are only static final variables 
	//Note: We can create only abstract method 
	//We can implement the interface class by using "implements className"
		
	int x=20;
	
	
	public String empName();
	
	
	public void empAge();
	
			
	public void empAdd();

	
	public void empDomain();
	String dom = "Testing";
}


	//Implementation Class
	
/*
@Override
public String empName() {
	System.out.println(name);
 return empName();	
	
}

@Override
public void empAge() {
	// TODO Auto-generated method stub
	
}

@Override
public void empAdd() {
	// TODO Auto-generated method stub
	
}

@Override
public void empDomain() {
	// TODO Auto-generated method stub
	
}


public static void main(String args[]){

	WrapperClass cls = new WrapperClass();   //Create an object for that implemented class
	cls.empName();
	
}	*/


