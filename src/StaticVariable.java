
public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.print();
		Student s1=new Student();
		s1.print();
		Student s2=new Student();
		s2.print();
	}

}



class Student{
      int instA=10;
      static int staticB=10;
      
      public void print() {
    	  instA++;
    	  staticB++;
    	  System.out.println("instA="+instA);
    	  System.out.println("staticB="+staticB);
      }
      
      
}

