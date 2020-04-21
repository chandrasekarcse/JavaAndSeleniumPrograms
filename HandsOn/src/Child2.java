
public class Child2 {
	
	static int  add(int a,int b) {
	
		return a+b;
	}
	

	static double add(double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p1 = new Parent();
		Child c1= new Child();
		Parent p2=new Child();
		p1.calls();
		c1.calls();
		System.out.println(add(5,5));
		System.out.println(Child2.add(15.25, 15.25));
		p2.calls();
		p2.calls2();
		
		

	}

}
