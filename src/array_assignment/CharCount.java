package array_assignment;

//Find the total count of char "A" (small as well as capital)
//from the below array - I, a, m, A, j, a, v, a, Q, A


public class CharCount {

	public static void main(String[] args) {

		char[] CharArray = new char[10];
		CharArray[0] = 'I';
		CharArray[1] = 'a';
		CharArray[2] = 'm';
		CharArray[3] = 'A';
		CharArray[4] = 'j';
		CharArray[5] = 'a';
		CharArray[6] = 'v';
		CharArray[7] = 'a';
		CharArray[8] = 'Q';
		CharArray[9] = 'A';
		
		for (char array:CharArray) 
		{
			System.out.println(array);
		}
		
		int count=0;
		for(int i=0;i<CharArray.length;i++) 
		{
			if(CharArray[i]=='A'|| CharArray[i]=='a')
			{
				count++;
			}
		}
        System.out.println("Occurances of A and a :: "+count);
	}

}
