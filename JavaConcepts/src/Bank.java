
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interest s=new SBI();
		Interest i=new ICICI();
		s.rate();
		i.rate();
		System.out.println(Interest.i);

	}

}
