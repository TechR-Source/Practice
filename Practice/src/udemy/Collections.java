package udemy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import com.graphbuilder.struc.LinkedList;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//--------------List in collections---------------
		
		/*ArrayList<String> ls = new ArrayList<String>();
		ls.add("rajesh");
		ls.add("kumar");
		System.out.println(ls.contains("rajesh"));
		ls.add(0, "Name");
		System.out.println(ls);
		ls.remove("kumar");
		ls.get(2);
		System.out.println(ls);*/

		
		//---------------------Set in collections ----------------------------
		
		/*HashSet<String> str = new HashSet<String>();
		str.add("rajesh");
		str.add("kumar");
		str.add("data");
		System.out.println(str);
		System.out.println(str.contains("data"));
		str.add("rajesh");
		//str.remove("kumar");
		//System.out.println(str);
		
		Iterator<String> it = str.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());


		while (it.hasNext()) {
			System.out.println(it.next());			
		}*/
	
		
	//------------------------------Map in collections------------------------
		
		
		HashMap<Integer, String> iStr = new HashMap<Integer, String>();
		
		iStr.put(1, "Rajesh");
		iStr.put(2, "Kumar");
		iStr.put(3, "Vivek");
		System.out.println(iStr.get(3));
		System.out.println(iStr);
		
		
		
	}

}
