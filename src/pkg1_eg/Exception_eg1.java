package pkg1_eg;

public class Exception_eg1 {

	public static void main(String[] args) {
		try
		{
			int a=40;
			int b=0;
			float c=a/b;
			System.out.println("c is " +c);
		}
catch(Exception e)
		{
	e.printStackTrace();
		}
System.out.println("done...");
	}

}
