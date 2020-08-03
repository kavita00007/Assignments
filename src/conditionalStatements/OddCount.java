package conditionalStatements;

public class OddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, count=0;
		
		for(i=0;i<=20;i++)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
          System.out.println("Count of all odd numbers between 0 to 20:"+count);
	}

}
