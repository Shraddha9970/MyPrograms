
public class ThisForVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s1=new student1();
		s1.setData("ajay",30);
		s1.printData();
		s1.printData();
	}

}



class student1{
	String name;
	int age;
	public  void setData(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void printData() {
		System.out.println("Name="+name+" "+" age"+age);
		this.setData("pari", 40);
	}
}
