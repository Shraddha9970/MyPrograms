
public class StaticBlock {
	
	
	int x;
    static int y;
	
	{
		 int a;
		int i=0;
		x=10;
		//y=20;
		System.out.println("This is ststic block"+ ++i);
		//public void print() {
			
		//}
		
		
	}
	
	
   static {
	   int a=30;
	   StaticBlock sb=new StaticBlock();
	   sb.x=10;
	   y=30;
	   System.out.println("this ststic block");
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticBlock sb=new StaticBlock();
		StaticBlock sb2=new StaticBlock();

	}

}
