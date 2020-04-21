
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="FIRST";
		String s2="Second";
		String s3="Third";
		String s4=" Largest String";
		
		Exception e;
		
		
		System.out.println("Length of s4 is "+s4.length());
		
		System.out.println("To Upper Case is "+s2.toUpperCase());
		
		System.out.println("To Lower case is "+s2.toLowerCase());
		
		System.out.println("Trim string "+s4.trim());
		
		System.out.println("Substring is "+s4.substring(2));
		
		System.out.println("Begins with "+s3.startsWith("Th"));
		
		System.out.println("Ends with "+s4.endsWith("ing"));
		
		System.out.println(s1.equals(s2));
		
		System.out.println("Char at "+s3.charAt(0));
		
		System.out.println("Is empty "+s4.isEmpty());
		
		System.out.println("Contains "+s4.contains("Str"));
		
		System.out.println("Replace"+s4.replace('r', 'R'));
		
		String latest[] = s4.split(" ");
		System.out.println("Split string");
		for(String s:latest)
		{
			System.out.println(s);
		}

		
		
		

	}

}
