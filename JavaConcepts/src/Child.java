
public class Child extends Parent {
	
	Child()
	{
		super();
	}
	Child(int num)
	{
		this();
	}
	void disp1()
	{
		System.out.println(super.test);
		super.disp();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c1 = new Child(5);
		c1.disp1();
	}

}
