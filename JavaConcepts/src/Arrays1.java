import java.lang.reflect.Array;
import java.util.Arrays;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,8,96,52,11};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for(int k:a)
		{
			System.out.println(k);
		}
		
		

	}

	

}