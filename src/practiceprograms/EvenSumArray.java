package practiceprograms;

public class EvenSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= new int[5];
		arr[0]=54;
		arr[1]=76;
		arr[2]=45;
		arr[3]=97;
		arr[4]=87;
		int sum=0,sum1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				 sum=sum+arr[i];
			}
			
			if(arr[i]%2!=0)
			{
				 sum1=sum1+arr[i];
			}
		}
		
		System.out.println("Sum of all even numbers from array ::" +sum);
		System.out.println("Sum of all odd numbers from array ::" +sum1);


	}

}
