package Java_Shakhi;

public class variable_eg {
int a=20;//instance variable
static int b=10;//static variable will be initialized first in a prgm
char c[]= {'a','b','c'};
static String s="Java";
void add (int x)
{
	int c=b+x;//local variable
	int d=a+x;
	System.out.println(c+d);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variable_eg obj=new variable_eg();
		obj.add(30);
		System.out.println(obj.s);
		String s2="abc";
		String s3=new String("happy");
		boolean a=obj.s.equals(s2);
		System.out.println(a);
		System.out.println(s.replace('J', 'A'));
		System.out.println(s2.equals(s3));
		System.out.println(s2.concat(s3));
		System.out.println(s3.compareTo(s2));
		System.out.println(s2.charAt(1));
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(0, 2));
		System.out.println(s3.replace('h', 'p'));
		System.out.println(s3.indexOf('p'));
		System.out.println(s3.toUpperCase());
		System.out.println(s3.length());
	}

}
