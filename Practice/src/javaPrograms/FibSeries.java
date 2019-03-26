package javaPrograms;

public class FibSeries {

	public static void main(String[] args) {
		
		
		int i=0, n=10, sum=0, t1=0, t2=1;
		
		while(i<=n){
			sum=sum+t1;
			t1=t2;
			t2=sum;
			i++;
			System.out.println(t1);

		}
		
		
	}

}


