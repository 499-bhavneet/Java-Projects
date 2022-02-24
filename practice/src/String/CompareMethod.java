
package String;

public class CompareMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Bhavneet"; 
		 String s2="Bhavneet"; 
		 String s3="kaur"; 
		 System.out.println(s1.compareTo(s2)); // 0 
		 System.out.println(s1.compareTo(s3)); // 1(because s1>s3) 
		 System.out.println(s3.compareTo(s1)); // -1(because s3 < s1 )
	}

}
