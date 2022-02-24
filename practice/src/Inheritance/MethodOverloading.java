package Inheritance;

class Add {
	static int add(int a, int b)
	{
		return a + b;
	}
	
	static int add(int a, int b, int c)
	{
		return a + b + c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add.add(13, 43));
		System.out.println(Add.add(51, 93, 41));
	}

}
