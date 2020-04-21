import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class ArrrayManp {
	
	//int temp[];
	void diff(int a[])
	{
		//int temp[]=new int[10];
		int res;
		TreeSet<Integer> st=new TreeSet<Integer>();
		int count=0;
		int i=0;
		for( i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				  res=a[i]-a[j];
				  st.add(res);
				// System.out.println(temp[count]);
				// count++;
				 
			}
		}
		Iterator<Integer> it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {50,30,90,45};
		Arrays.sort(a);
		for(int c:a)
		{
			System.out.println(c);
		}
		ArrrayManp a1=new ArrrayManp();
		//a1.diff(a);
		
		

	}

}
