
import java.util.*;
import java.util.Arrays;
public class Anagram {
	
	static boolean isAnagram(String i, String j)
	{
		char a[]=i.toCharArray();
		char b[]=j.toCharArray();
		
		if(i.length() != j.length())
		{
			System.out.println("Two string are not equal in length");
			return false;
			
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
				
		return (Arrays.equals(a, b));
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="listen";
		String s2="silent";
		
		boolean k = Anagram.isAnagram(s1,s2);
		System.out.println(k);
		

	}

}
