package practiceprograms;

/*
 * Given 2 integers return true(boolean) 
 * if sum of them is 30 or one of them is 30.
 */

public class Sum {
	
	public static boolean summation(int a, int b) {
		
		if (a+b==30||a==30||b==30)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Is sum or one of them is 30 ?"+ summation(20,30));
		System.out.println("Is sum or one of them is  30 ?"+ summation(15,15));
        System.out.println("Is sum or one of them is 30 ?"+ summation(20,20));

	}

}
