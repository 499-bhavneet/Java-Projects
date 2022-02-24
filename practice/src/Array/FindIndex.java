package Array;


public class FindIndex {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==4) {
				index = i;
			}
		}
		System.out.print("index of the element is: " +index);

	}

}
