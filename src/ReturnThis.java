
public class ReturnThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	B1 b =new B1();
	b.print().print2();

	}
	
	
	
	

}


class B1{
	public B1 print() {
		System.out.println("Print 1");
		return this;
	}
	public void print2() {
	System.out.println("Print2");	
	}
}
