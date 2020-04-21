
public class StrManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a3b2c4";
		
		char a[]=s.toCharArray();
		int i=0;
		for(char c:a)
		{
			if(Character.isDigit(c))
			{
				
				int res=Character.getNumericValue(c);
				for(int k=1;k<=res;k++)
				{
					System.out.print(a[i-1]);
				}
			}
			i++;
		}
		
			
		

	}

}
