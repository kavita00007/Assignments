package practiceprograms;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[5];
		arr[0]=54;
		arr[1]=76;
		arr[2]=45;
		arr[3]=97;
		arr[4]=87;
	
		System.out.println("Array Before Sorting ::");
		
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
