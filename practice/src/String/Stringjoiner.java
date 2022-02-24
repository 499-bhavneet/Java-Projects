package String;

import java.util.StringJoiner;

public class Stringjoiner {

	public static void main(String[] args) {
 
		StringJoiner joinNames = new StringJoiner(",", "[", "]"); // passing comma(,) and squarebrackets as delimiter 
		 
		  
		 joinNames.add("Rahul"); 
		 joinNames.add("Raju"); 
		 joinNames.add("Peter"); 
		 joinNames.add("Raheem"); 
		 
		 System.out.println(joinNames); 
	}

}
