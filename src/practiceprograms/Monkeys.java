package practiceprograms;

/*
 * There are 2 monkeys, if both the monkeys are smiling then we are in trouble, 
 * if both the monkeys are not smiling then also we are in trouble, 
 * Return true if we are in trouble
 */

public class Monkeys {
	
	
	static boolean trouble(boolean a, boolean b) 
	{
		
		if(a==true && b==true)
		{
			return true;
		}
		
		else if(a!=true && b!=true)
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
		
		System.out.println("Result is:" +Monkeys.trouble(true, true)); 
		System.out.println("Result is:" +Monkeys.trouble(false, false)); 
		System.out.println("Result is:" +Monkeys.trouble(true, false)); 
		System.out.println("Result is:" +Monkeys.trouble(false, true));
      
		
	}

}
