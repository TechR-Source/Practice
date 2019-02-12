package conceptClasses;

//When the class is going to obtain the properties of another class in called as inheritance using "extends" keyword


class demoCl{ 					
	void demoMethod(){
		System.out.println("demoMethod");
	}
	
	
	void demoMethod2(){
		System.out.println("method2");
	}
}



public class InheritanceSingle extends demoCl{

	public static void main(String[] args) {
		
			demoClass dC = new demoClass();
			dC.demoMethod();
			dC.demoMethod2();
			
		
	}

}
