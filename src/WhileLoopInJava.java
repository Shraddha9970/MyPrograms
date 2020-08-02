import java.util.Scanner;

public class WhileLoopInJava {
	
	public static void main(String args[]) {
		int i=1;
		//while(i<=10) {
			//System.out.println(i);
		//	i++;
			
		//}
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		
			do {
				
				
				System.out.println(i);
				
				i++;
			}while(i<=number);
		}
	

}
