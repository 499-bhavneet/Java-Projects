package Inheritance;

interface Test {
	 int d = 22;

      int area();

	abstract public int volume();
}

interface Test2 {
	 int d = 25;

	 int area2();
}

class B1 {
	public void input()

	{
		System.out.println("This is an input method");

	}

	public void output()

	{
		System.out.println("This is an outputmethod");

	}

}

class CProg extends B1 implements Test, Test2 {
	int i, j;

	public int area() {
		i = 10;
		j = 20;
		return i*j;
		
	}

	public int volume() {
		return (i * j * 22);
	}

	public int area2()

	{
		System.out.println("Area 2 is a method of Test2 interface");
		return i * j;
	}
}

class MultipleInheritance {
	public static void main(String args[]) {
		CProg obj = new CProg();
		obj.input();
		obj.output();
		obj.area();
		obj.volume();
		obj.area2();
	}
}
