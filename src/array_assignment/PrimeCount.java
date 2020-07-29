package array_assignment;

//Write a program to find count of prime numbers from following array 
//array contntais - 2, 5, 6, 8, 11, 14, 17, 18, 20

public class PrimeCount {

	public static void main(String[] args) {

		int array[]= new int[9];
		array[0]=2;
		array[1]=5;
		array[2]=6;
		array[3]=8;
		array[4]=11;
		array[5]=14;
		array[6]=17;
        array[7]=18;
		array[8]=20;

        System.out.println("Array elements ara as follows : ");

		for(int i=0;i<array.length;i++) 
		{
		
		System.out.println(array[i]);
		
		}
		
		int count=0;
		for(int i=0;i<array.length;i++) {
			
			if (checkPrime(array[i])) {
				count = count + 1;
			}
			 
		}
		System.out.println("Count of prime numbers : "+count);
	}

	private static boolean checkPrime(int a) {
		if(a>=2) // Prime Number starts from 2
		{	
			int temp = 0;
			for (int i = 2; i < a-1; i++) {
					if(a % i == 0)
					{
						temp = temp + 1;
					}
			}
			if(temp==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else {
			return false;
		}
	}
	}

	


