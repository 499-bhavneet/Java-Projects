package Assignment2;

public class SumofnoinString {

	public static void main(String[] args) {
		String str = "hello 20 ende4 hjij 34";
		
        String temp = "0";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch))
                temp += ch;
            
            else {
                sum = sum + Integer.parseInt(temp);
                temp = "0";
            }
        }

      System.out.println( sum + Integer.parseInt(temp));
		
		
	}
	
}
