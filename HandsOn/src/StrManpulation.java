import java.util.Scanner;

public class StrManpulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("To print only even words in string");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String s=scan.nextLine();
		String test[]=s.split(" ");
		for(String s2:test)
		{
			int len=s2.length();
			if((len%2)==0) {
				System.out.println(s2);
			}
		}
	}

}
