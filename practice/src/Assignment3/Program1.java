//Develop a java class with a method saveEvenNumbers(int N) 
//using ArrayList to store even numbers from 2 to N, where N is a 
//integer which is passed as a parameter to the method 
//saveEvenNumbers(). 
//The method should return the ArrayList (A1) created. In the 
//same class create a method printEvenNumbers()which iterates 
//through the arrayList A1 in step 1, and It should multiply 
//each number with 2 and display it in format 4,8,12�.2*N. and 
//add these numbers in a new ArrayList (A2). 
//The new ArrayList (A2) created needs to be returned. Create a 
//method printEvenNumber(int N) parameter is a number N. This 
//method should search the arrayList (A1) for the existence of 
//the number �N� passed. If exists it should return the Number 
//else return zero.Hint: Use instance variable for storing the 
//ArrayList A1 and A2.


package Assignment3;

import java.util.*;

class SaveEvenNumbers {
	List<Integer> arraylist = new ArrayList<Integer>();

	public void saveEvenNum(int N) {
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				arraylist.add(i);
			}
		}
		System.out.println(arraylist);
	}

	public void printEvenNumbers() {
		List<Integer> a2 = new ArrayList<Integer>();

		for (int i = 2; i < arraylist.size(); i++) {
			int y = arraylist.get(i) * 2;
			a2.add(y);
		}
		System.out.println(a2);

	}

}

public class Program1 {

	public static void main(String[] args) {
		SaveEvenNumbers sen = new SaveEvenNumbers();
		sen.saveEvenNum(10);
		sen.printEvenNumbers();
	}
}
