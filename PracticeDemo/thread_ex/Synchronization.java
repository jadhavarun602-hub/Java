package thread_ex;

class Point{
	int n = 0;
	
	public synchronized void increment() {
		this.n++;
	}
}

class C1 extends Thread{
	
	Point n;
	
	public void run() {
		for(int i = 0; i < 2000; i++) {
			n.increment();
		}
	}
}

class C2 extends Thread{
	
	Point n;
	
	public void run() {
		for(int i = 0; i < 2000; i++) {
			n.increment();
		}
	}
}

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		
		Point p = new Point();
		
		C1 c1 = new C1();
		C2 c2 = new C2();
		
		c1.n = p;
		c2.n = p;
		
		c1.start();
		c2.start();
		
		Thread.sleep(1000);
		
		System.out.println(p.n);
		

	}

}
