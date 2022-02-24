package String;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Welcome home";
		String s1 ="Welcome";
		String str[]= s.split(" ");
		for(int i=0;i<str.length;i++)
		{
		System.out.println(str[i]);
		}
		System.out.println(s.concat(" home"));
		
		if(s1.equals(s)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		System.out.println(s.length());
		System.out.println(s.replace("Welcome","WELCOME"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.endsWith("me"));
		System.out.println(s.startsWith("wel"));
		System.out.println(s.substring(2,4));
		System.out.println(s.indexOf("m"));
		System.out.println(s.lastIndexOf("w"));
	}

}