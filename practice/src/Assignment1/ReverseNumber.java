package Assignment1;

public class ReverseNumber {
	public static void main(String[] args) {
	
		int rem,rev=0,number=35679;
		while(number!=0) {
			rem = number%10;
			rev = rev*10+rem;
			number = number/10;
		}
		System.out.println("rev :" +rev);
	}
}
