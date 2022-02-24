package OopsConcepts;

public class Constructors {

	int a, b;// instance variable

	Constructors() {
		System.out.println("Default constructor");
	}

	Constructors(int a, int b) 
	{
		System.out.println("Parameterized constructor");
		this.a = a;
		this.b = b;
		System.out.println("The area of the rectangle is " + a * b);
	}

	Constructors(double pi, double r)
	{
		System.out.println("The area of circle is :" + pi * r * r);
	}

	public static void main(String[] args) {
		Constructors obj1 = new Constructors();
		Constructors obj2 = new Constructors(3, 4);
		Constructors obj3 = new Constructors(3.14, 7.5);

	}

}
