package scenarios;

public class DynamicallyChangingID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
Option 1 : Look for any other attribute which Is not changing every time In that div node like name, class etc. So If this div node has class attribute then we can write xpath as bellow.
//div[@class='post-body entry-content']/div[1]/form[1]/input[1]
 
 
Option 2 : We can use absolute xpath (full xpath) where you not need to give any attribute names In xpath.
/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/form[1]/input[1]
 
Option 3 : We can use starts-with function. In this xpath's ID attribute, "post-body-" part remain same every time.
 //div[starts-with(@id,'post-body-')]/div[1]/form[1]/input[1] 
  
  Option 4 : We can use contains function. Same way you can use contains function as bellow.
 div[contains(@id,'post-body-')]/div[1]/form[1]/input[1]
*/