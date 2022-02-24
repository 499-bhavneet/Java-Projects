package MultiThreading;


class RunnableThread1 implements Runnable{
	public void run() {
		for(int i=1;i<14;i++) {
		System.out.println("thread 1 is running: "+i);
		}
	}
}

class RunnableThread2 implements Runnable{
	public void run() {
		for(int i=1;i<14;i++) {
		System.out.println("thread 2 is running: "+i);
		}
	}
}

public class CrtThreadWithRunnable {

	public static void main(String[] args) {
		RunnableThread1 mt1 = new RunnableThread1();
		Thread t1 = new Thread(mt1);
		RunnableThread2 mt2 = new RunnableThread2();
		Thread t2 = new Thread(mt2);
		t1.start();
		t2.start();
	}
}
