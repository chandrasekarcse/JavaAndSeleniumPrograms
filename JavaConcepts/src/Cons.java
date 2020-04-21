
public class Cons {
	
	int rollno;
	
	Cons()
	{
		System.out.println("This is default constructor");
	}
	
	Cons(int r)
	{
		rollno=r;
		System.out.println("This is Parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cons c1=new Cons();
		Cons c2=new Cons(5);
		

	}

}
