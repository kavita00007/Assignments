package array_assignment;


/*Write a program to sort an integer array in 
assending order.
array contains - 20, 14, 48, 9, 5, 3, 25, 7
*/
public class AscendingorderArray {

	public static void main(String[] args) {
		int arr[]= new int[8];
		arr[0]=20;
		arr[1]=14;
		arr[2]=48;
		arr[3]=9;
		arr[4]=5;
		arr[5]=3;
		arr[6]=25;
		arr[7]=7;

	
		System.out.println("Array Before Sorting");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\n");
		System.out.println("After sorting array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
