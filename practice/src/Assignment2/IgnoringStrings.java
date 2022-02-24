package Assignment2;

//1. Write a Java program to compare two strings lexicographically,
//ignoring case differences2.

public class IgnoringStrings {

	public static void main(String[] args) {
		
		String str1 = "bhavneet kaur";
		String str2 = "BHAVNEET KAUR";

		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);

		if (str1.compareToIgnoreCase(str2) < 0) {
			System.out.println("\"" + str1 + "\"" + " is less than " + "\"" + str2 + "\"");
		}
		
		else if (str1.compareToIgnoreCase(str2) == 0) {
			System.out.println("\"" + str1 + "\"" + " is equal to " + "\"" + str2 + "\"");
		}
		else 
		{
			System.out.println("\"" + str1 + "\"" + " is greater than " + "\"" + str2 + "\"");
		}

	}

}
