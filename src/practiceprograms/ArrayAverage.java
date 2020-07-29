package practiceprograms;

public class ArrayAverage {

	public static void main(String[] args) {

		int arr[]= new int[5];
		arr[0]=54;
		arr[1]=76;
		arr[2]=59;
		arr[3]=87;
		arr[4]=87;
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Marks are :"+ arr[i]);
			
		}
		
		int total=0;
		
		for(int i=0;i<arr.length;i++) 
		{
            total=total+arr[i];
		}
		
		System.out.println("Total of marks ::" +total);
		
		float avg;
		
		avg=total/arr.length;
		
		System.out.println("Average og numbers ::"+ avg);
		
	}

}
