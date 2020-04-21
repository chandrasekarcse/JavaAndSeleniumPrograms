import java.util.Scanner;

public class MaxMin {
	
	static void minmax(int arr[])
	{
		int min=arr[0];
		int max=arr[0];
		int len =arr.length;
		for(int k :arr)
		{
			if(k<min)
			{
				min=k;
			}
			if(k>max)
			{
				max=k;
			}
		}
		System.out.println(min + "**");
		System.out.println(max + "***");
		
	}
	
	public static void main(String[] args)
	
	
	
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int i = scan.nextInt();
		int arr[] = new int[i];
		System.out.println("Enter array values");
		for(int k=0;k<i;k++)
		{
			arr[k]=scan.nextInt();
		}
		for (int j :arr)
		{
			System.out.println(j + " ");
		}
		
		minmax(arr);
		
	}

}
