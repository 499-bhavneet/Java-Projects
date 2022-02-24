package Array;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myarray[] = {33,55,44,32,86,54,6,76,43,45};
		int max = 0;
		int min = myarray[0];
		for(int i=0;i<myarray.length;i++) {
			if(myarray[i]>max) {
				max = myarray[i];
			}
			if(myarray[i]<min) {
				min = myarray[i];
			}
		}
		System.out.println("maximum value: " +max);
		System.out.println("minimum value: " +min);
	}

}
