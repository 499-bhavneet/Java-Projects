package MultiThreading;

class MyThread1 extends Thread{
	public void run() {
		for(int i=1;i<7;i++) {
		System.out.println("thread 1 is running");
		}
	}
}

class MyThread2 extends Thread{
	public void run() {
		for(int i=1;i<7;i++) {
		System.out.println("thread 2 is running");
		}
	}
}

public class CrtThreadWithExtend {

	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1();
		MyThread2 mt2 = new MyThread2();
		mt1.start();
		mt2.start();
	}
}
