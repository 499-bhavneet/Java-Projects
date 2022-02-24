package MultiThreading;

public class SetPriority extends Thread{
	
	public void run() {
		System.out.println("Thread 1 is running");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Thread 2 is running");
		System.out.println(Thread.currentThread().getPriority());
		SetPriority sp = new SetPriority();
		sp.setPriority(3);
		sp.start();
		

	}

}
