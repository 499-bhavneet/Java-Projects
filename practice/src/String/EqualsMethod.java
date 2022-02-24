package String;

public class EqualsMethod {

	public static void main(String[] args) {
		String s1 = "Bhavneet Kaur";
		String s2 = "Bhavneet Kaur";
		String s3 = new String("Bhavneet Kaur");
		String s4 = "Bhavneet";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println("   ");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s2==s3);
		System.out.println(s3==s4);


	}

}
