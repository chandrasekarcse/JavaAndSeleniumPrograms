
public class LargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,8,96,52,1};
		int max=a[0];
		int less=a[1];
		
		
		for(int k:a)
		{
			if(max<k)
			{
				max=k;
			}
			if(k<less)
			{
				less=k;
			}
			
		}
		
		
		System.out.println(max);
		System.out.println(less);
		

	}

}
