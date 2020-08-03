package practiceprograms;

public class searchElementArray {

	public static void main(String[] args) {
      
		int arr[]= new int[5];
		arr[0]=54;
		arr[1]=76;
		arr[2]=45;
		arr[3]=97;
		arr[4]=87;
		
		int search=67;
		boolean b=true;
		for(int i=0;i<arr.length;i++) 
		{
			if(search==arr[i]) 
			{
			   b=false;
			   System.out.println("Element found");
			   break;
			}
		}
		
		 if(b==true) {
			 System.out.println("Element not found");
		 }
	}

}
