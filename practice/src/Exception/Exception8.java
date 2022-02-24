package Exception;

import java.util.Scanner;

public class Exception8 extends Exception {
	
	public Exception8(String msg) {
		super(msg);
	}
		
		public static void main(String[] args) throws Exception{
			
			Scanner sc = new Scanner(System.in);
		    System.out.println("Enter your name:");
		    String name = sc.nextLine();
		    System.out.println("Enter your age:");
		    int age = sc.nextInt();
		    
		    if(age>=18 && age<60) {
		    	System.out.println(age);
		    }
		    else {
		    	throw new Exception8("age is not valid" );
		    }
		    
	}

}
