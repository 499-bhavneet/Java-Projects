package String;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb);
		System.out.println(sb.append(" Bhavneet Kaur"));
		System.out.println(sb.charAt(8));
		System.out.println(sb.delete(3,7));
		System.out.println(sb.length());
		System.out.println(sb.capacity());//16+length of string
		System.out.println(sb.insert(8,"avj"));
		sb.setCharAt(6,'@');
		System.out.println("setCharAt() : "+sb);
		System.out.println(sb.toString());
		
	}

}
