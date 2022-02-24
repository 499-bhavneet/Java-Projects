package Assignment1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 55;
		int b = 49;
		int c = 35;
		int d = 99;
		boolean e = true;
		boolean f = false;
		int sum= a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int rem= 10%20;
		System.out.println("Airthmetic Operators are :"); 
		System.out.println(" Sum of a and b = "+sum); 
		System.out.println(" Subtraction of a and b = "+sub); 
		System.out.println(" Multiplication of a and b = "+mul); 
		System.out.println(" Division of a and b = "+div); 
		System.out.println(" Modulus of a and b = "+rem); 
		
		System.out.println("Assignment Operators are : ");
		a+=2; 
		b-=2; 
		c*=2;
		d%=4;
		System.out.println(" The Value of a is : " +a); 
		System.out.println(" The Value of b is : " +b); 
		System.out.println(" The Value of c is : " +c); 
		System.out.println(" The Value of d is : " +d); 
		
		System.out.println("Increment Decrement Operators are : ");
		System.out.println("Decrement Operators are : ");
		System.out.println(" Value of --a "+(--a));
		System.out.println(" Value of b-- "+(b--));
		System.out.println(" Value of a "+a);
		System.out.println(" Value of b "+b);
		System.out.println("Increment Operators are : ");
		System.out.println(" Value of ++a "+(++a));
		System.out.println(" Value of b++ "+(b++));
		System.out.println(" Value of a "+a); 
		System.out.println(" Value of b "+b);
		
		System.out.println("Bitwise Operators are : ");
        System.out.println(" Bitwise Operator a&b = " + (a & b)); 
		System.out.println(" Bitwise Operator a|b = " + (a | b)); 
		System.out.println(" Bitwise Operator a^b = " + (a ^ b)); 
		System.out.println(" Bitwise Operator ~a = " + ~a); 
		a &= b; 
		System.out.println(" Bitwise Operator a= " + a); 
		
		System.out.println("Logical Operators are : ");
		 
		System.out.println(" Logical Operator e && f = " + (e&&f)); 
		System.out.println(" Logical Operator e || f = " + (e||f) ); 
		System.out.println(" Logical Operator !(e && f) = " + !(e&&f)); 
		
		System.out.println("Relational Operators are : ");
		System.out.println(" a == b : " + (a == b) ); 
		System.out.println(" a != b : " + (a != b) ); 
		System.out.println(" a > b : " + (a > b) ); 
		System.out.println(" a < b : " + (a < b) ); 
		System.out.println(" b >= a : " + (b >= a) );
		System.out.println(" b <= a : " + (b <= a) ); 
		
		System.out.println("Ternary Operators are : ");
		int min = (a<b)?a:b; 
		System.out.println(min);
	}
	

}
