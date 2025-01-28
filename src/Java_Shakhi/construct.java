package Java_Shakhi;

public class construct {
	static int i;
	
	construct(int i)
	{
		this.i=i;
		System.out.println("in constructor 2 " +i);
	}
	construct()
	{
		
		i=10;
		System.out.println("in constructor 1 "+i );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

construct c1=new construct(30);
construct c2=new construct(40);
construct c=new construct();
System.out.println("i is " +i);

	}

}
