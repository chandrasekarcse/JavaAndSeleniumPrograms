
public class Obj {
	
	String name;
	int rollno;
	void setValues(String s, int no)
	{
		name=s;
		rollno=no;
	}
	
	void getValues()
	{
		System.out.println("Name is "+name+"Roll no is "+rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Obj o1= new Obj();
		Obj o2= new Obj();
		o1.setValues("First", 101);
		o2.setValues("Second", 102);
		o1.getValues();
		o2.getValues();
		System.out.println(o1.name+" "+o1.rollno);
		

	}

}
