package OopsConcepts;
 
public  class StaticDemo {
	 int a ;
	 int b ;
	public  void  show(int a, int b) {
		this.a=a;
		this.b =b;
		
		System.out.println(+a);
        System.out.println(+b);	
	}
	public void output(){
		System.out.println("Hello !");
		System.out.println(+a);
        System.out.println(+b);	
	}

	public static void main(String[] args) {
	
		StaticDemo o = new StaticDemo();
		o.show(10, 29);
		o.output();
	
		

	}

}
