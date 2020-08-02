
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rowNumber=5;
		for (int row = 1; row <=rowNumber; row++) {
			for (int sp = 1; sp <=rowNumber-row; sp++) {
			System.out.print(" ");	
				
			}
			for (int st = 1; st <=(2*row-1); st++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
