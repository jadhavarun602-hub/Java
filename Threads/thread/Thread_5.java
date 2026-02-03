package thread;

// Display the current thread name inside the run() method.

class Temp extends Thread{
	
	public void run() {
		for(int i = 1; i < 50; i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
}

public class Thread_5 {

	public static void main(String[] args) {
		
		Temp t = new Temp();
		
		t.start();
		

	}

}
