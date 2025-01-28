package pkg1_eg;

public class poly_eg2 extends poly_eg1 {//inheritance

	public void login()
	{
		System.out.println("inside child login fn1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		poly_eg2 e1=new poly_eg2();
		e1.login();//method overriding
		e1.login(2, 3);
		e1.login("abc", "bcv");
		poly_eg1 e2=new poly_eg1();
		e2.login();
	}

}
