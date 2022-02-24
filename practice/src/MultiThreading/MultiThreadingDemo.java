package MultiThreading;

class BookSeats {
     static 	int total_seats = 13;

	synchronized  void bookseat(int seats) {
		if (total_seats >= seats) {
			System.out.println(seats + " seats are booked.");
			total_seats = total_seats - seats;
			System.out.println("remaining seats are " + total_seats);
		} 
		else {
			System.out.println("Sorry! seats cannot be booked");
			System.out.println("remaining seats are " + total_seats);
		}
	}

}
public class MultiThreadingDemo extends Thread {
	static BookSeats b ;
	int seats;

	public void run() {
		b.bookseat(seats);
	}
		
public static void main(String[] args) {
			b = new BookSeats();
			MultiThreadingDemo per1 = new MultiThreadingDemo();
			per1.seats=2;
			per1.start();
			
			MultiThreadingDemo per2 = new MultiThreadingDemo();
			per2.seats=13;
			per2.start();

		}

	}

