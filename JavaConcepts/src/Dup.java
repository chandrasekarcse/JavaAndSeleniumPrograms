import java.util.Arrays;

public class Dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,6,1,25,5,9,6};
		Arrays.sort(a);
		int count;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
				}
				
			}
			if(count>0)
			{
				System.out.println(a[i]+" is repeated "+count+" times");
			}
			
		}

	}

}
