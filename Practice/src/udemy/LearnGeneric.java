package udemy;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnGeneric {



		public static void main(String[] args) {

			// Earlier to Java 1.5
			
			// Create a List
			//ArrayList<String> mentors = new ArrayList<String>();

			
			//-------------------Method 1: Initialization using Arrays.asList----------------------------------------- 
			
			/*ArrayList<String> obj = new ArrayList<String>(
					Arrays.asList("Pratap", "Peter", "Harsh"));
				  System.out.println("Elements are:"+obj);
			   }*/
			

		
//------------Method 2: Anonymous inner class method to initialize ArrayList----------------------------
			/*
			ArrayList<String> cities = new ArrayList<String>(){{
				   add("Delhi");
				   add("Agra");
				   add("Chennai");
				   }};
			  System.out.println("Content of Array list cities:"+cities);
		   }*/


//---------Method 3: Method3: Normal way of ArrayList initialization--------------------------

		
		  /* ArrayList<String> books = new ArrayList<String>();
		   books.add("Java Book1");
		   books.add("Java Book2");
		   books.add("Java Book3");
		  System.out.println("Books stored in array list are: "+books);
	   }
	}*/
		
		


			

			
			
			/*// Add mentors to the List -- Note the order
			mentors.add("Babu");
			mentors.add("Gopi");
		//	mentors.add(1234);
				
			mentors.add(0, "RK");
			
			//mentors.remove("RK");
			
		
			mentors.set(1, "Ralo");     // For replace
			String posGet = mentors.get(2);
			
			int pos = mentors.indexOf("Ralo");
			int totalSize = mentors.size();
			boolean tF = mentors.contains("Ralo");
			
			
			
			
			System.out.println(mentors+" "+pos+" "+posGet);
			System.out.println(totalSize+" "+tF);
			
			
			mentors.clear();*/
			
			
		}
}
