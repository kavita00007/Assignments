package conditionalStatements;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Result=0;
		
		for(int i=0;i<=15;i++)
		{
			if(i%2==0)
			{
				Result=Result+i;
			}
			
		}
		
		System.out.println("Sum of all even numbers between 0 to 15 is:"+Result);
	}
	
}