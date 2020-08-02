
public class FintLargeNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,10,50,10,10};
		
		int largeNumber=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>largeNumber) {
				largeNumber=array[i];
			}
		
		}

		System.out.println("largeNumber"+largeNumber);		
	}

}
