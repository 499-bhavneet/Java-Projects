package Inheritance;

class M {
	int a = 23, b = 43;
}

class S extends M {
	void sum() {
		int add = a + b;
		System.out.println("addition: " + add);
	}
}

class P extends M {
	void product() {
		int prod = a * b;
		System.out.println("product: "+prod);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		S s = new S();
		P p = new P();
		s.sum();
		p.product();
	}

}