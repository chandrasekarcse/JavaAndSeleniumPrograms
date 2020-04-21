
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="tree";
		String s2="";
		
		int k =s1.length();
		for(int i=k-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		if(s1.equals(s2)) {
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}

	}

}
