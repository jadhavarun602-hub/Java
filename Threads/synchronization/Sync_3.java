package synchronization;

// Use a synchronized block instead of synchronized method

class C {
	int count = 0;
	
	public void inc() {
		
		synchronized (this) {
			this.count++;
		}
		
//		this.count++;
	}
}

class C1 extends Thread{
	
	C count;
	
	public void run() {
		for(int i = 0; i < 1000;i++) {
			count.inc();
		}
	}
	
}

class C2 extends Thread{
	
	C count;
	
	public void run() {
		for(int i = 0; i < 1000;i++) {
			count.inc();
		}
	}
}

public class Sync_3 {

	public static void main(String[] args) throws InterruptedException {
		

		C c = new C();
		
		C1 c1 = new C1();
		C2 c2 = new C2();
		
		c1.count = c;
		c2.count = c;
		
		c1.start();
		c2.start();
		
//		Thread.sleep(1000);
		
		c1.join();
		c2.join();
		
		System.out.println(c.count);
		
	}

}
