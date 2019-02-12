package conceptClasses;

//A class which is having permission to access the properties of another class in called as inheritance using "extends" keyword


class demoClass{ 					
	void demoMethod(){
		System.out.println("demoMethod");
	}
	
	
	void demoMethod2(){
		System.out.println("method2");
	}
}


class practiceClass extends demoClass{
	void practiceDemo(){
		System.out.println("Practice method 1");
	}

	
}


public class InheritanceMultiple extends practiceClass{

	public static void main(String[] args) {
		
		practiceClass dC = new practiceClass();
		dC.demoMethod2();
		dC.practiceDemo();
			
			
			
		
	}

}
