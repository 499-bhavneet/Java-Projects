//Implement the assignment 1 using Vector

package Assignment3;

import java.util.*;

class SaveEvenNumber {
	Vector<Integer> vc = new Vector<Integer>();

	public void saveEvenNum(int N) {
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) {
				vc.add(i);
			}
		}
		System.out.println(vc);
	}

	public void printEvenNumbers() {
		Vector<Integer> a2 = new Vector<Integer>();

		for (int i = 2; i < vc.size(); i++) {
			int y = vc.get(i) * 2;
			a2.add(y);
		}
		System.out.println(a2);
	}

}

public class Program7 {

	public static void main(String[] args) {
		SaveEvenNumbers sen = new SaveEvenNumbers();
		sen.saveEvenNum(10);
		sen.printEvenNumbers();
	}
}
