package Array;

public class TwoDimensionalArr {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] =  {{33,55,44},{32,86,54},{6,76,43}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println("array elements are arr["+i+"]["+j+"]: " +arr[i][j]);
	
			}
		}
	}
	
}
