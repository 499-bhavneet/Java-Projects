package Assignment2;

import java.util.Scanner;

//Write a Java program to print the frequency of each character
//in a string

public class FrequencyofEachChar {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		System.out.println("enter a sentence:");
		String s = m.nextLine();
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<s.length();i++)
			{
			if(ch==s.charAt(i)) {
		    	count++;
				}
			}
			if(count!=0) {
				System.out.println(ch + " " +count);
			}
					
		}
	}

}
