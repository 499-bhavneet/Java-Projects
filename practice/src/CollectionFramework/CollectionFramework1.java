package CollectionFramework;

import java.util.LinkedList;

public class CollectionFramework1 {

	public static void main(String[] args) {
		
		LinkedList<String> alist = new LinkedList<String>( );
		alist.add("One");
		alist.add("Two");
		alist.add("Three");
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
	}

}
