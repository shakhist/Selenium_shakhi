package pkg1_eg;

public class child_interface implements Interface_eg1,interface_eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child_interface c1=new child_interface();
		c1.add();
		c1.division();
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		System.out.println("inside subtract");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("inside add class");
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("inside division class");
	}

}
