
public class OopsStatic {

	static int count =1;
	int ins=1;
	OopsStatic()
	{
		count++;
				
	}
	
	static void disp()
	{
	  count++;
	  
	}
	
	void nonStatic()
	{
		OopsStatic.count++;
		OopsStatic.disp();
		ins++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OopsStatic o1 = new OopsStatic();
		OopsStatic o2 = new OopsStatic();
		System.out.println(OopsStatic.count);
		o2.nonStatic();
		System.out.println(count);
		System.out.println(o2.ins);
		
		
		
		
		

	}

}
