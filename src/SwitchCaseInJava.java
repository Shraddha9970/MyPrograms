import java.util.Scanner;

public class SwitchCaseInJava {
	 int b[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] a=new int[20];
		//a[0]=12;
		SwitchCaseInJava  s=new SwitchCaseInJava();
		s.printArray();
		
	}
	
	
	 void printArray() {
		//int b[]= {20,30,40};
		//b[3]=40;
		 
		 // c=new int [3][3];
		
		  int[][]  c= {{10,20,30},{12,13,14},{98,99,100}};
		 
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.println(c[i][j]);
			}
		}
		
		//System.out.println(b[0]);
	}
}
