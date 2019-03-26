package conceptClasses;

public class Static {


	
	/*
	 What is the purpose of static methods and variables?
The methods or variables defined as static are shared among all the objects of the class. 

The static is the part of the class and not of the object. The static variables are stored in the class area, and we do not need to create the object to access such variables. Therefore, static is used in the case, 
where we need to define variables or methods which are common to all the objects of the class.

For example, In the class simulating the collection of the students in a college, the name of the college is the common attribute to all the students. Therefore, the college name will be defined as static.

	What is the static variable?
The static variable is used to refer to the common property of all objects (that is not unique for each object), 
e.g., The company name of employees, college name of students, etc. Static variable gets memory only once in the class area at the time of class loading. Using a static variable makes your program more memory efficient (it saves memory). 
Static variable belongs to the class rather than the object
	 
	 */
	
	
	
	/*
	 What is the static method?
A static method belongs to the class rather than the object.
There is no need to create the object to call the static methods.
A static method can access and change the value of the static variable.
	 
	 */
	
	
	
	/*
	 	What are the restrictions that are applied to the Java static methods?
Two main restrictions are applied to the static methods.

The static method can not use non-static data member or call the non-static method directly.
this and super cannot be used in static context as they are non-static.
	 */
	
	
	/*
	 Can we override the static methods?
No, we can't override static methods.

Why is the main method static?
Because the object is not required to call the static method. If we make the main method non-static, 
JVM will have to create its object first and then call main() method which will lead to the extra memory allocation.
	 
	 */
			
		//Program of static variable  
		  
		class Student8{  
		   int rollno;  
		   String name;  
		   static final String college ="ITS";  
		     
		   Student8(int r,String n){  
		   rollno = r;  
		   name = n;  
		   }  
		 void display (){System.out.println(rollno+" "+name+" "+college);}  
		  
		 public void main(String args[]){  
		 Student8 s1 = new Student8(111,"Karan");  
		 Student8 s2 = new Student8(222,"Aryan");  
		   
		 s1.display();  
		 s2.display();  
		 }  
		}  
		
 
		
	}

