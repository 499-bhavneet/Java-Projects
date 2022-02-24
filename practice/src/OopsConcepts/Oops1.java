package OopsConcepts;

public class Oops1 {
	// public protected private default
	int a; // instance variable
	int c;
	int b;
	static String learnerName;

	public void input() {
		a = 45;
		b = 47;
	}

	public void output() {
		System.out.println("value of a = " + a);
		System.out.println("value of b = " + b);
	}

	@Override
	public String toString() {
		return "Oops1 [a=" + a + ", b=" + b + "]";
	}

	
	public static void main(String[] args) {

		Oops1.learnerName = "bhavneet";
		Oops1 obj1 = new Oops1(); 
		System.out.println("obj1  " + obj1);
		obj1.input();

		// static can be declared as below
		Oops1.learnerName = "bhavneet";
		System.out.println("obj1  " + obj1);
		System.out.println(obj1.hashCode());
		obj1.output();

		Oops1 obj2 = new Oops1();
		System.out.println(obj2);
		obj2.output();
		obj2.a = 99;
		obj2.b = 88;
		System.out.println(obj2);
		obj2.output();
		System.out.println(obj2.learnerName); // common memory
		System.out.println(obj2.c);
		System.out.println(obj2.hashCode());
	}

}

// private - inside the class
// public - anywhere
// default - inside the same package same class or different class
// protected - inherit outside the package
