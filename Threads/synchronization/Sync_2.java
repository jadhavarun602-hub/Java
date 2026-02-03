package synchronization;

// Use a synchronized method to fix the above problem.

class H {
	int count = 0;
	
	public synchronized void increse() {
		this.count++;
	}
}

class H1 extends Thread{
	
	H count;
	
	public void run() {
		
	for(int i = 1; i <= 2000; i++) {
		count.increse();
	}
  }
}

class H2 extends Thread{
	
	H count;
	
	public void run() {
		
	for(int i = 1; i <= 2000;i++) {
		count.increse();
	}
 }
	
}


public class Sync_2 {
	public static void main(String []args) throws InterruptedException {
		
		H h = new H();
		
		H1 h1 = new H1();
		H2 h2 = new H2();
		
		h1.count = h;
		h2.count = h;
		
		h1.start();
		h2.start();
		
		h1.join();
		h2.join();
		
		System.out.println(h.count);
	}

}
