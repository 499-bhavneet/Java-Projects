package Inheritance;

import java.util.Scanner;

class MO{
	int a=2;
	MO(){
		
		 System.out.println("consturctor 21 "); 
	 }
	public void add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of num1: ");
		int num1 = sc.nextInt();
		System.out.println("enter the value of num2: ");
		int num2 = sc.nextInt();
		int num3 = num1+num2;
		System.out.println("result: "+num3);
		
		
	}
	
}
class MO2 extends MO{
	MO2(){
		super();
		 System.out.println("consturctor 2 "); 
	 }
	public void add(){
		//super.add();
		//System.out.println(super.a);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n1: ");
		int n1 = sc.nextInt();
		System.out.println("enter the value of n2: ");
		int n2 = sc.nextInt();
		System.out.println("enter the value of n3: ");
		int n3 = sc.nextInt();
		int n4 = n1+n2+n3;
		System.out.println("result: "+n4);
		
		
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MO2 obj = new MO2();
		obj.add();

	}

}
