import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//int[] arr=new int[5];
		
		int i = scan.nextInt();
		int sec=i;
		System.out.println("Reverse of integer is ");
		int rev=0;
		int sum=0;
		int rem;
		boolean k = true;
		while(i>0)
		{
			rem=i%10;
							
			System.out.println("Value of rem is "+rem);
			
			rev=(rev*10)+rem;
			System.out.println(rev);
			i=i/10;
			System.out.println("Value of int is "+i);
			
		}
		System.out.println(rev);
		
		System.out.println("The sum of integer is ");
		
		while(sec>0)
		{
			rem=sec%10;
			sum=sum+rem;
			sec=sec/10;
			
		}
		System.out.println(sum);
		

	}

}
