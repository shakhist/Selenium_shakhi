package Java_Shakhi;

public class student {
int age,class1,total;
public void marks(String j,int a,int b)
{
	age=10;
	class1=3;
	System.out.println("age and class are" +age +","+class1);
	
	total=a+b;
	System.out.println("marks for the student"+ j +"is"+total);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("student details");
student sh=new student();
sh.marks("shakhi",35,40);
	}

}
