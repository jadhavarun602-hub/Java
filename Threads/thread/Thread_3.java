package thread;

// Create two threads and show that they run concurrently.

class Thread1 extends Thread{
	
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println("Hello");
		}
	}
}

class Thread2 extends Thread{
	
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println("Bye");
		}
	}
}

public class Thread_3 {

	public static void main(String[] args) {
		
		Thread1 th1 = new Thread1();
		Thread2 th2 = new Thread2();
		
		th2.start();
		th1.start();

	}

}
