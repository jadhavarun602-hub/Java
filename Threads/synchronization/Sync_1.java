package synchronization;

// Create a program where two threads access the same method without synchronization and observe incorrect output.

class Boss {
	
	int num = 0;
	
	public void Increse() {
		this.num++;
	}
}

class S1 extends Thread{
	
	Boss num;
	
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			num.Increse();
		}
	}
	
}

class S2 extends Thread{
	
   Boss num;
	
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			num.Increse();
		}
	}
}

public class Sync_1 {

	public static void main(String[] args) throws InterruptedException {
		
		Boss b = new Boss();
		
		S1 s1 = new S1();
		S2 s2 = new S2();
		
		s1.num = b;
		s2.num = b;
		
		s1.start();
		
		s2.start();
		
		s1.join();
		s2.join();
		
		System.out.println(b.num);

	}

}
