package practiceprograms;


/*
 * Given 2 integers 
 * return 
 *  a. twice their sum if both are same
 *  b. otherwise return their sum
 *  
 */

public class IntegerAddition {
	
	
	public static int addition(int a, int b) {
		
		if (a==b)
		{
			return 2*(a+b);
		}
		else
		{
			return a+b;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Addition of two numbers:"+addition(10,20));
		System.out.println("Addition of two numbers:"+addition(10,10));


	}

}
