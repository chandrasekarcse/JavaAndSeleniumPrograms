import java.util.Iterator;
import java.util.TreeSet;

public class Collec4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(3);
		ts.add(90);
		System.out.println(ts.descendingSet().first());
		System.out.println(ts.pollLast());
		System.out.println(ts);
		Iterator<Integer> itr = ts.descendingIterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
