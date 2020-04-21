import java.util.HashSet;
import java.util.Iterator;

public class Collec3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("One");
		hs.add("One");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("One"));
	}

}
