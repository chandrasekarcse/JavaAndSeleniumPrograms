
public class PrimeNumbers {
	
	static boolean  isprime(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	
	static void getprime(int num)
	{
		
		int len=0;
		int i=0;
		System.out.println("The following numbers are prime");
		while(len<=num)
		{
			if(isprime(i))
			{
				System.out.print(" "+i);
				len++;
				
			}
			i++;
			
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getprime(10);
		
		

	}

}
