package Assignment2;

import java.util.*;

public class BeforeCharacter8 {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		System.out.println("Input the String with special char");
		String stng = s.nextLine();
		int l = stng.length();
		int count = 0;
		
		for (int i = 0; i < l; i++) {
			String tmpString = stng.substring(i, i + 1);
			if (tmpString.equals("#") && i > 0 && i < l - 1) {
			if (stng.charAt(i - 1) == stng.charAt(i + 1)) {
				count = 1;
		}
			else {
			count = 2;
		}
			
			}
				}
		if (count == 1) {
	 	  System.out.println("yes");
				}
		else {
		  System.out.println("no");
				}

			}
		}
	
	
