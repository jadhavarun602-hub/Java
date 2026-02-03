package thread;

// Use Thread.sleep() to pause a thread for 1 second between prints.

class Th1 extends Thread{
	
	public void run() {
		
		for(int i = 1; i < 100; i++) {
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println("ABC");
		}
	}
}

class Th2 extends Thread{
	
	public void run() {
		for(int i = 1; i < 100; i++) {
			
			try {
				
				Thread.sleep(1000);
				
			}catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
			System.out.println("XYZ");
		}
	}
}

public class Thread_4 {

	public static void main(String[] args) {
		
		Th1 t1 = new Th1();
		
		Th2 t2 = new Th2();
		
		t1.start();
		t2.start();
		
	}

}
