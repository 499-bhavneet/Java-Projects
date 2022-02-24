package ControlStatement;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		
		switch(age){
		case 18:
			System.out.println("you are an adult now!");
			break;
		case 28:
			System.out.println("your age is 28.");
			break;
		default:
			System.out.println("your age is" + age);
	
		}
			
			
	}

}
