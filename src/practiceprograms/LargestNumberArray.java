package practiceprograms;

public class LargestNumberArray {

	public static void main(String[] args) {
int arr[]= new int[5];
		
		arr[0]=54;
		arr[1]=76;
		arr[2]=59;
		arr[3]=97;
		arr[4]=87;
		
		 int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println("Elements are :"+ arr[i]);
			
			if(largest<arr[i])
			{
				largest=arr[i];
			}
		
		}
		
	     System.out.println("Largest number is ::"+ largest);

	}

}
