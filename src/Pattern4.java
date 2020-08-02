
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalNumber=5;
		for (int row = 1; row <=totalNumber; row++) {
			for (int sp = 1; sp <=row-1; sp++) {
				System.out.print(" ");
			}

			for (int st = 1; st <= totalNumber-row+1; st++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
