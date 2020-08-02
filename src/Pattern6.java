
public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int toatlRow=5;
		for (int row = 1; row <=toatlRow; row++) {
			for (int sp = 1; sp <= row-1; sp++) {
				System.out.print(" ");
			}
			for (int st = 1; st <=(2*toatlRow)-(2*row)+1; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
