package Inheritance;

class A{
	public void  show() {
		System.out.println("Show A");
	}
}
class B extends A{
	void show1() {
		System.out.println("show B");
		
	}
}
class C extends  B{
	void show2() {
		System.out.println("show C");
	}
}
class D extends  C{
	void show3() {
		System.out.println("show D");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.show();
		d.show1();
		d.show2();
		d.show3();

	}

}

