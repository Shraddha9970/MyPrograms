
public class Pattran3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalRow=5;
		for (int row = 1; row <=totalRow; row++) {
			for (int st = 0; st <(totalRow-row+1); st++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
