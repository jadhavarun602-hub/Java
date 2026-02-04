package runnable;

// Create one Runnable object and run it using multiple Thread objects.

class Runable{
	int num = 0;
	
//	public synchronized void inc() {
//        this.num++;
//    }
	
	public void inc() {
		this.num++;
	}
}

class Run implements Runnable{
	
	Runable num;

	@Override
	public void run() {
		
		for(int i = 0; i < 1000; i++) {
			num.inc();
		}
		
	}
	
	public Run(Runable num) {
		this.num = num;
	}
	
}

public class Runnable_1 {

	public static void main(String[] args) throws InterruptedException {
		Runable runable = new Runable();
		
		Run run = new Run(runable);
		

		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		Thread t4 = new Thread(run);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
		System.out.println(runable.num);

		
	}

}
