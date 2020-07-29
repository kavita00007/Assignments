package practiceprograms;

public class SmallestNumberArray {

	public static void main(String[] args) {
      
		int arr[]= new int[5];
		arr[0]=54;
		arr[1]=76;
		arr[2]=45;
		arr[3]=97;
		arr[4]=87;
		int index=0;
		
		 int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(smallest>arr[i])
			{
				smallest=arr[i];
				index=i;
			}
		
		}
		
		System.out.println("Smallest element "+ smallest +" is available @ "+ index);

	}
	}


