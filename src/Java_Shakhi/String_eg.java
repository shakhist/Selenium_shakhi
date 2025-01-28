package Java_Shakhi;

public class String_eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="shakhistephen";
String s1=new String("Shakhiabraham");
System.out.println(s1.charAt(0));
System.out.println(s.charAt(3));
System.out.println(s1.substring(2,12));
System.out.println(s1.length());
System.out.println(s1.substring(4));
System.out.println(s1.indexOf("S"));
Boolean a=s1.equals("shakhiabraham");
System.out.println(a);
int i=s1.compareTo("shakhi");
System.out.println(i);
System.out.println(s1.replace('S', 'b'));
System.out.println(s1.hashCode());
boolean j=s1.equalsIgnoreCase("shakhiabraham");
System.out.println(j);
System.out.println(s1.replaceAll("abraham","stephen"));}

}
