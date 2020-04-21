
public class Amstrong {
	
	static void ams(int num)
	{
		double sum=0;
		int temp=num;
		while(num>0)
		{
			int res=num%10;
			sum=sum+Math.pow(res, 3);
			num=num/10;
		}
		
		
		if(temp==(int) sum)
		{
			System.out.println("Number is amstrong");
		}
		else
		{
			System.out.println("Number is not amstrong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ams(153);

	}

}
