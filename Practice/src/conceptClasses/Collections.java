package conceptClasses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections  {

	public static void main(String[] args) {

		
		//The Java Collections Framework is a collection of interfaces and classes which helps in storing and processing the data efficiently. 
		//This framework has several useful classes which have tons of useful functions which makes a programmer task super easy
	
	
		// Types: Map, Set, List and Queue -These are all interfaces
		
			//1.Map -  Key values concept which is used to retrieve the values
		
			/*HashMap:
				--> It contains values bases on key
				--> Contains unique values
				--> Maintain no order
				--> One null key many null value (it accepts null keys and values)
			 */
	
			/*TreeMap
			
			--> It contains values bases on key
			--> Contains unique values
			--> Maintain ascending order
			--> No null key many null value (it accepts only null values)*/
		
		
		/*LinkedHashMap
		
		--> It contains values bases on key
		--> Contains unique values
		--> Maintain order
		--> One null key many null value (it accepts only null values)*/
		
		
		HashMap hm = new HashMap();
		hm.put(1, "Rajesh");
		hm.put(2, "Vivek");
		hm.put(3, "srini");
		hm.put(4, "Rajesh");
		
		Set st = hm.entrySet();
		Iterator<String> it=st.iterator();
		
		while(it.hasNext()){
			//Map.Entry me = (Map.Entry) it.next();
			
		}
		
	
	}

	public String empName() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void empAge() {
		// TODO Auto-generated method stub
		
	}

	
	public void empAdd() {
		// TODO Auto-generated method stub
		
	}

	
	public void empDomain() {
		// TODO Auto-generated method stub
		
	}

}


//HashSet vs TreeSet
	/*1. HashSet is faster than the treeset
	2. HashSet allows the null object where are Treeset will not the null objects
	3. Hashset user "equals()" method to compare the two objects and deducting duplicates where as Treeset uses "compareTo()" method for same thing
	4. Hashset doesn't maintain the order but Treeset is maintain the order
	
	Similarities:
	1. Both Hashset and Treeset doesn't have the duplicate values
	2. Both are non synchronized that is not thread safe*/



//Set vs Map			HashSet vs HashMap

/*	1. Set stores the elements where as Map stores the keys along with the values
	2. Hashset doesn't allow the duplicate values where as it doesn't allow the duplicate keys but allows to have duplicate values
	3. Hashset permits to have a single null values where as Hashmap allows a single null key and any number of null values
	

	Similarities:
		1. Both are not thread safe */

/*
Int: Diff between Hashmap and Hashtable - 

HashMap - Multiple threads can be accesible the Hashmap where as in Hashtable if one thread is accesing other should wait until first one get finised (Hashtable is threadsafe)
Hashmap allow the null keys and values where are Hashtable will not allow the null values and Keys
Hashmap values are iterated using iterator where as hashtable values are iterated through the enumerator*/

			
/*ArrayList vs LinkedList:
	
	1. ArrayList uses a dynamic array to store the elements where as linkedlist uses a doubly linked list to store the elements.
	2. ArrayList is slow because it internally uses an array where as LinkedList is faster than ArrayList because it uses a doubly linked list
	3. ArrayList class can act as a list only where as LinkedList class can act as a list and queue both because it implements List and Deque interfaces.
	4. ArrayList is better for storing and accessing data where as LinkedList is better for manipulating data.
*/