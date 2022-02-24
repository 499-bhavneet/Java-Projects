package Assignment2;

public class WordEndingmorn {
//9.Write a Java program to count the number of words ending in 'm' or 'n'
// in a given text.
	public static void main(String[] args) {
	
		String s = "mam is in the room NBN MNM ";
		String str[]= s.split(" ");
		int count =0;
		System.out.println("spliting a String:");
		
		for(int i=0;i<str.length;i++)
		 {
		  System.out.println(str[i]);
		 }
		System.out.println("words end with only m and n:");
		for(int i=0;i<str.length;i++) {
			
		 if(str[i].endsWith("m") || str[i].endsWith("n") || str[i].endsWith("M") || str[i].endsWith("N")) {
		 System.out.println(str[i]);	
		 count++;
		}
		}
		System.out.println(count++);
	}
}