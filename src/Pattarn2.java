
public class Pattarn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalRows=5;
		for (int row = 1; row <= totalRows; row++) {
			
			for (int sp = 1; sp <=(totalRows-row); sp++) {
				System.out.print(" ");
			}
			
			for (int Col = 1; Col <=row; Col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
