package ControlStatement;
import java.util.*;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Take two values from user and print greatest among them
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value : ");
		int value1 = sc.nextInt();
		System.out.println("enter value : ");
		int value2 = sc.nextInt();
		
		if(value1<=value2) {
			System.out.println("the greatest value is " +value2);
		}
		else {
			System.out.println("the greatest value is " +value1);
		}
	}

}
