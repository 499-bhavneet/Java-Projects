//Write a program that takes as input the size of the array and the 
//elements in the array. The program then asks the user to enter a 
//particular index and prints the element at that index. Index starts 
//from zero. 
//Exception 
//Handling: Trycatch Use 
//multiple catch 
//block
//This program may generate Array Index Out Of Bounds Exception or 
//NumberFormatException . Use exception handling mechanisms to handle 
//this exception. 

package Exception;

import java.util.*;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter the elements in array:");
		try {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

		System.out.println("Enter the index of the array element you want to access");
		int index = sc.nextInt();
		System.out.println("The array element at index " + index + " = " + arr[index]);
		System.out.println("The array element successfully accessed");
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} 
		catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");

		}
sc.close();
	}

}
