package CollectionFramework;
import java.util.*;

public class CollectionFramework2 {

	public static void main(String[] args) {
		
		Vector<String> vc = new Vector<String>();
		
		vc.add("Vector Object 1");
		vc.add("Vector Object 2");
		vc.add("Vector Object 3");
		vc.add("Vector Object 4");
		vc.add("Vector Object 5");
		
		vc.add(4, "Element at fix position");
		System.out.println("Vector Size :" + vc.size());

	}

}
