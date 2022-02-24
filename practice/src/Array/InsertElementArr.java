package Array;

import java.util.*;;

public class InsertElementArr {
// Write a Java program to insert an element (specific position) into an array.
	public static void main(String[] args) {

		int length = 100;
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 4;
		}
		System.out.println("Elements are :");
		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println("Enter index :");
		Scanner indexScan = new Scanner(System.in);
		int index = indexScan.nextInt();
		System.out.println("enter element :");
		int element = indexScan.nextInt();
		arr[index] = element;
		System.out.println("updated array :");
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
