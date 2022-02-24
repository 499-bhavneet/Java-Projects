package ControlStatement;

import java.util.*;

public class NestedIfelse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value1 : ");
		int value1 = sc.nextInt();
		System.out.println("enter value2 : ");
		int value2 = sc.nextInt();
		System.out.println("enter value3 : ");
		int value3 = sc.nextInt();
		
		if(value1>=value2) {
			if(value1>=value3) {
				System.out.println("the greatest value is " +value1);
			}
			else {
				System.out.println("the greatest value is " +value3);
			}
		}
		else {
			if(value2>=value3) {
				System.out.println("the greatest value is " +value2);
			}
			else {
				System.out.println("the greatest value is " +value3);
			}
			
		}
		
	}

}
