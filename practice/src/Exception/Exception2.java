//Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index.
// This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the class name of the exception thrown.
//Sample Input and Output 1:
//Enter the number of elements in the array
//3
//Enter the elements in the array
//20
//90
//4
//Enter the index of the array element you want to access
//2
//The array element at index 2 = 4
//The array element successfully accessed
//
// Sample Input and Output 2:
//Enter the number of elements in the array
//3
//Enter the elements in the array
//20
//90
//4
//Enter the index of the array element you want to access
//6
//java.lang.ArrayIndexOutOfBoundsException

package Exception;
import java.util.*;


public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("enter elements you want to add: ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Array elements are:");
		for(int i=0;i<size;i++) {
			int e = sc.nextInt();
			array[i] = e;
		}

		System.out.print("Enter the index: ");
		int index = sc.nextInt();
		try {
			System.out.println(array[index]);
		}
		catch(Exception e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		
		}

}
	