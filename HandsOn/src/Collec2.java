import java.util.Iterator;
import java.util.LinkedList;

public class Collec2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("One");
		ll.add("Two");
		System.out.println(ll);
		ll.addFirst("First");
		ll.addLast("Last");
		Iterator<String> itr=ll.iterator();
		/*
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
		ll.set(1, "Replaced in 1st index");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
