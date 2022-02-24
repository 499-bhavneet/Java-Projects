package Assignment2;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "liveonwildlife";
		System.out.println("String :" + str);
		int subStrCount = 0;
		String substr = "life";
		int index = 0;
		while ((index = str.indexOf(substr, index)) >= 0) {
			subStrCount++;
			index = index + substr.length();
		}
		System.out.println("Substring" + substr + "found" + subStrCount + "times!");
	}

}
