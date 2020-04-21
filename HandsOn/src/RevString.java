
public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="mom";
		/*
		 * int i =s1.length(); for(int j=i-1;j>=0;j--) { System.out.print(s1.charAt(j));
		 * }
		 * 
		 * System.out.println();
		 * 
		 
		 */ 
		StringBuffer s2= new StringBuffer(s1);
		String s3=s2.reverse().toString();
		
		if(s1.equals(s3))
		{
			System.out.println("The given string palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
