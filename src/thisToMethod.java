
public class thisToMethod {

	int i=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisToMethod b =new thisToMethod();
		b.print();
	//	b.print(this);

	}
	public void print() {
		B b = new B();
		b.print(this);
		System.out.println("Print from main ");
	}

}




class B{
 public void print(thisToMethod a) {
	 System.out.println("this is print method B and "+a.i);
 }
}