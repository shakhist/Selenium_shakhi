package Java_Shakhi;

public class construct2 {
 static int i;
  void method1(int i)
 {
	 this.i=i;
	 System.out.println("inside public method " +i);
 }

	construct2()
	{
		System.out.println("inside consrtuctor");
	}
	construct2(int i)
	{
		this.i=i;
		System.out.println("inside consrtuctor "+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		construct2 c1=new construct2();
		construct2 c2=new construct2(3);
		System.out.println("value of i is "+i);
		c1.method1(5);
		System.out.println("value if i is "+i);
	}

}
