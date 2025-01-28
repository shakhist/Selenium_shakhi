package Java_Shakhi;

public class child_abstract_modifiers extends abstract_eg1 {
	
	public static int rollno=50;//can be accessed from classes outside package
	protected static int rollno1=10;//can be accessed by classes inside the same package
	private static int rollno2=30;//can be accessed from only inside the class.
	 //int mark[]=new int[3];
	static int mark[]= {10,20,30};
	public static void semmarks()
	{
		//int i[]=new int[3];
		int total=0;
		for (int i:mark)
		{
			total=total+i;
			
		}
		System.out.println("total is abstract"+total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static_eg c1=new static_eg();
		child_abstract_modifiers.semmarks();
		child_abstract_modifiers c=new child_abstract_modifiers();
		c.abstract_met();
	}

}
