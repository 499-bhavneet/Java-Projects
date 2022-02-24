package CollectionFramework;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;

public class CollectionFramework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList<String>();
		l.add("c A");
		l.add("A");
		l.add("m");
		l.add(" B");
		l.add("d");
		
		Collections.sort(l);
		System.out.println(l);
	}

}
